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
public class PlanCliente extends Producto {

    private Cliente cliente;
    private Plan plan;

    public PlanCliente(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, Cliente cliente, Plan plan) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.cliente = cliente;
        this.plan = plan;
        
        this.cliente.addPlan(this);
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public Plan getPlan() {
        return plan;
    }

    public boolean setEstadoActivo(boolean estado) {
        if (this.estadoActivo != estado) {
            this.estadoActivo = estado;
            return true;
        }
        return false;
    }

}
