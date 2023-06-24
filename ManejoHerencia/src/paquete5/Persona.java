/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author busta
 */
public class Persona {
private String nombre;
    private String apellido;
    private String username;

    public Persona(String nom, String ape, String usern) {
        nombre = nom;
        apellido = ape;
        username = usern;
        
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public String obtenerUsername() {
        return username;
    }

    public void establecerUsername(String x) {
        username = x;
    }
    
    
}
