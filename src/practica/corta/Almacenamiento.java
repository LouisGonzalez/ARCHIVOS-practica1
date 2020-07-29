/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.corta;

import java.util.ArrayList;

/**
 *
 * @author luisitopapurey
 */
public class Almacenamiento {
    
    public ArrayList<Datos> ordenamientoDatos(String texto, ArrayList<Datos> listDatos){
        listDatos = new ArrayList<>();
        String lineas[] = texto.split("\\n");
        for (int i = 0; i < lineas.length; i++) {
            String[] datos = lineas[i].split("\\|");
            Datos dato = new Datos(datos[0], datos[1], datos[2], datos[3]);
            listDatos.add(dato);
        }
        return listDatos;
    }
    
}
