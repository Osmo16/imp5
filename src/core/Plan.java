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
public class Plan extends Producto {

    private float valorMaximoCurso;
    private ArrayList<Plan> planes;

    public Plan(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, float valorMaximoCurso) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = new ArrayList<>();

    }

    public float getValorMaximoCurso() {
        return valorMaximoCurso;
    }
    
    

}
