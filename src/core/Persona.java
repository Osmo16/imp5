/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author osman
 */
public abstract class Persona {
    protected String nombre;
    protected String cédula;
    protected String telefono;
    protected String email;

    public Persona(String nombre, String cédula, String telefono, String email) {
        this.nombre = nombre;
        this.cédula = cédula;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    
    
}
