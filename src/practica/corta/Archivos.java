/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.corta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luisGonzalez
 */
public class Archivos implements Serializable {

    public void guardarArchivo2(String texto, String titulo) {
        try {
            ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(titulo));
            objetoArchivo.writeObject(texto);
            objetoArchivo.flush();
            objetoArchivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String leerArchivo(String titulo) {
        String ab = "";
        try {
            try (ObjectInputStream salidaArchivo = new ObjectInputStream(new FileInputStream(titulo))) {
                ab = salidaArchivo.readObject().toString();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "No hay archivos por el momento");
        }
        return ab;
    }

}
