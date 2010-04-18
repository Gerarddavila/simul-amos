/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
 *
 * @author Emerson
 */

public class CargarConfiguraciones{
        private Properties pro;
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

        public String getValor(String key) {
        return pro.getProperty(key);
        }

        public void setValor(String key, String value) throws URISyntaxException {
        
        try {
            pro.setProperty(key, value);
            //String url=this.getClass().getResource("config.properties").getPath().toString();
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