/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author osman
 */
public class Curso extends Producto {

    private ArrayList<Instructor> instructores;
    private ArrayList<ProductoCliente> productosCliente;

    public Curso(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, Instructor instructor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.instructores = new ArrayList<>();
        this.productosCliente = new ArrayList<>();

        this.instructores.add(instructor);
    }

   

}
