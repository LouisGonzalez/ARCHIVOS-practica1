/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.corta;

/**
 *
 * @author luisGonzalez
 */
public class Datos {
    
    private String nombre;
    private String numero;
    private String redSocial1;
    private String redSocial2;

    public Datos(String nombre, String numero, String redSocial1, String redSocial2) {
        this.nombre = nombre;
        this.numero = numero;
        this.redSocial1 = redSocial1;
        this.redSocial2 = redSocial2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRedSocial1() {
        return redSocial1;
    }

    public void setRedSocial1(String redSocial1) {
        this.redSocial1 = redSocial1;
    }

    public String getRedSocial2() {
        return redSocial2;
    }

    public void setRedSocial2(String redSocial2) {
        this.redSocial2 = redSocial2;
    }
    
    
}
