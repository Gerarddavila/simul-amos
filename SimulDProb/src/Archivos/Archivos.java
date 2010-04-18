/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivos;

import Utilidades.CargarConfiguraciones;
import java.io.File;
import java.io.FileOutputStream;
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
        System.out.println(aux);
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
        String texto = Integer.toString(i+1) + "\t" +  Double.toString(observaciones[i])+ " \n";
        System.out.println(texto);
        fos.write( texto.getBytes());

        }
        fos.close();
        System.out.println(file.getAbsolutePath());
        System.out.println(String.valueOf(corr));
        cc.setValor("EXT.POI", String.valueOf(corr));
        }catch (Exception e){
        e.printStackTrace();
        }
    return codigoRetorno;
    }

    public void saveFile(File archivo, String ruta){

    }
    public void openFile(File archivo, String ruta){

    }

}
