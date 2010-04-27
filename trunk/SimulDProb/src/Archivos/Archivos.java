/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivos;

import Utilidades.CargarConfiguraciones;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Emerson
 */
public class Archivos {

    public int guardarObservaciones(double []observaciones, String tipoDis){
        int codigoRetorno=0;
        try{
        CargarConfiguraciones cc= new CargarConfiguraciones();
        String ruta = cc.getValor("RUTA");
        String aux=cc.getValor("EXT.POI");
        System.out.println(aux);
        aux=StringUtils.isEmpty(aux)?"0":aux;
     //   System.out.println(aux);
        int corr=new Integer(aux);
        corr++;
        String extensionArch="POI."+StringUtils.leftPad(String.valueOf(corr), 3, '0');
        File dir= new File(ruta);

        if(!dir.exists()){
            dir.mkdirs();
        }
        
        File file= new File(ruta+extensionArch);
        FileOutputStream fos= new FileOutputStream(file);

        for (int i=0;i<observaciones.length;i++){
        String texto = Integer.toString(i+1) + "\t" +  Double.toString(observaciones[i])+ " @\n";
       // System.out.println(texto);
        fos.write( texto.getBytes());

        }
        fos.close();
      //  System.out.println(file.getAbsolutePath());
      //  System.out.println(String.valueOf(corr));
        cc.setValor("EXT.POI", String.valueOf(corr));
        }catch (Exception e){
        e.printStackTrace();
        }
    return codigoRetorno;
    }

    public class Filtro implements FilenameFilter{
        String dist;

        public Filtro(String tipoDis) {
            this.dist=tipoDis;
        }
        public boolean accept(File directorio, String name){
        return name.contains(dist);
        }

    }

    public String [] listarArchivos(String tipoDis){
        CargarConfiguraciones cc= new CargarConfiguraciones();
        String ruta = cc.getValor("RUTA");
        File directorio= new File(ruta);
        
        String [] archivos = directorio.list(new Filtro(tipoDis));
        if (archivos == null || archivos.length<=0){
        System.out.println("NO HAY FICHEROS EN EL DIRECTORIO PARA LA DISTRIBUCION ESPECIFICADA");
        }else{
        for (int m=0;m<archivos.length;m++)
             System.out.println(archivos[m]);
        }
       
        return archivos;

    }

    public void saveFile(File archivo, String ruta){

    }
    public void leerArchivo(String nombreArchivo) throws IOException{
        try {
        CargarConfiguraciones cc= new CargarConfiguraciones();
        String ruta = cc.getValor("RUTA");
        File archivo= new File(ruta+nombreArchivo);
        FileInputStream fis = new FileInputStream(archivo);
        byte [] b= new byte[20000];
        fis.read(b);
        
        String cadena= new String (b);
        fis.close();
        b=null;
        String [] observaciones=cadena.split("@");
        System.out.println(cadena);

        System.out.println(observaciones.length);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
