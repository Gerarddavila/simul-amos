
package Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase carga las configuraciones de los archivos guardados
 * @author Emerson
 */


public class CargarConfiguraciones{
        private Properties pro;
        /**
         *CargarConfiguraciones: En este constructor se definen
         * las propiedades de los archivos.
         * 
         */
        public CargarConfiguraciones() {
            pro=new Properties();
            try {
                File file= new File("config.properties");

           //     System.out.println(file.getAbsolutePath().toString());
                InputStream is = new FileInputStream(file);
           //     pro.load(this.getClass().
              //          getResource("config.properties").
                //                                    openStream());
                pro.load(is);

            } catch (IOException ex) { }
        }

        /**
         * getValor: Este metodo devuelve las propiedades del archivo.
         *
         * @param key: Este parametro es la ruta del archivo o la extension de este.
         * 
         */
        public String getValor(String key) {
        return pro.getProperty(key);
        }

        /**
         * setValor: Este metodo establece las propiedades de un nuevo archivo.
         * @param key: Es la extension del archivo
         * @param value: Contiene el numero correspondiente al correlativ de la extension del archivo.
         * 
         */
        public void setValor(String key, String value) throws URISyntaxException {
        
        try {
            pro.setProperty(key, value);
           
            String url="config.properties";
            FileOutputStream fos = new FileOutputStream(url);
            pro.store(fos, null);
            fos.close();

            
        } catch (IOException ex) {
            Logger.getLogger(CargarConfiguraciones.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           
        }
    }
}