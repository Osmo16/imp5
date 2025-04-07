/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;

/**
 *
 * @author osman
 */
public class ProductoCliente extends Producto {

    private boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;

    public ProductoCliente(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, boolean estadoAprobado, int nivelAvance, Cliente cliente, Curso curso) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.estadoAprobado = estadoAprobado;
        this.cliente = cliente;
        this.curso = curso;
        this.nivelAvance = nivelAvance;

        this.cliente.addProducto(this);

    }
     public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public Curso getCurso() {
        return curso;
    }

}
