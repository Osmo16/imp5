/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author osman
 */
public class Instructor extends Persona{
    private ArrayList<Curso> cursos;

    public Instructor(String nombre, String cédula, String telefono, String email) {
        super(nombre, cédula, telefono, email);
        this.cursos = new ArrayList<>();
    }

    
    
    
    
}
