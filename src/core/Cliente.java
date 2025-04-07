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
public class Cliente extends Persona {

    private ArrayList<PlanCliente> planes;
    private ArrayList<ProductoCliente> productos;

    public Cliente(String nombre, String cédula, String telefono, String email) {
        super(nombre, cédula, telefono, email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();

    }

    public boolean hasPlanActivo() {
        for (PlanCliente plan : this.planes) {
            if (plan.isEstadoActivo()) {
                return true;
            }
        }
        return false;
    }

    public void getPlanes() {
        for (PlanCliente plan : this.planes) {
            System.out.println(plan.getNombre() + " " + plan.getFechaInicio() + " " + plan.getValor() + " " + plan.isEstadoActivo());
        }
    }
    public void getCursos() {
        for (ProductoCliente curso : this.productos) {
            System.out.println(curso.getNombre() + " " + curso.getFechaInicio() + " " + curso.getValor() + " " + curso.isEstadoActivo());
        }
    }

    public boolean hasCurso(Curso curso) {
        for (ProductoCliente producto : this.productos) {
            if (producto.getNombre().equals(curso.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public PlanCliente getPlanActivo() {
        for (PlanCliente plan : this.planes) {
            if (plan.isEstadoActivo()) {
                return plan;
            }
        }
        return null;
    }

    public PlanCliente getPlan(int index) {
        return this.planes.get(index);
    }

    public Float getIngresos() {
        Float cont = 0f;
        for (ProductoCliente producto : this.productos) {
            cont += producto.getValor();
        }
        return cont;
    }

    public boolean addPlan(PlanCliente plan) {
        if (!this.planes.contains(plan)) {
            this.planes.add(plan);
            return true;
        }
        return false;
    }

    public boolean addProducto(ProductoCliente producto) {
        if (!this.productos.contains(producto)) {
            this.productos.add(producto);
            return true;
        }
        return false;
    }

}
