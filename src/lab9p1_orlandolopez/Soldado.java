/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_orlandolopez;

import javax.swing.JOptionPane; 
/**
 *
 * @author Home
 */
public class Soldado {
    String nombre;
    String clase;
    String habilidad;
    public Soldado(){
}
public Soldado(String nombre,String clase,String habilidad) {
        this.nombre = nombre;
        this.clase = clase;
        this.habilidad = habilidad;       
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public String Impresion() {
        String mensaje=nombre + "-" + clase + "-" + habilidad;
        return mensaje;
    }
    @Override
    public String toString() {
        return nombre + "-" + clase + "-" + habilidad;
    }

}
