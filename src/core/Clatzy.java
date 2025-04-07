/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author osman
 */
public class Clatzy {

    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }

    public String getClienteMayorIngreso() {
        ArrayList<Float> ingresos = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            ingresos.add(cliente.getIngresos());
        }
        int index = ingresos.indexOf(Collections.max(ingresos));
        return this.clientes.get(index).getNombre();
    }

    public boolean comprarPlan(Cliente cliente, Plan plan, LocalDate date) {
        if (cliente.hasPlanActivo()) {
            System.out.println("El cliente " + cliente.getNombre() + " ya tiene un plan activo.");
            return false;
        }
        PlanCliente planCliente = new PlanCliente(0, plan.getNombre(), date, date.plusYears(1), true, plan.getValor(), cliente, plan);
        System.out.println("El cliente " + cliente.getNombre() + " compró el plan " + plan.getNombre());
        return true;
    }

    public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate date) {
        if (cliente.hasCurso(curso)) {
            System.out.println("El cliente" + cliente.getNombre() + "ya había registrado el curso " + curso.getNombre());
            return false;
        } else {
            if (cliente.hasPlanActivo()) {
                if (curso.getValor() > cliente.getPlanActivo().getPlan().getValorMaximoCurso()) {
                    System.out.println("El plan del cliente " + cliente.getNombre() + " no cubre el curso " + curso.getNombre());
                    return false;
                }
                ProductoCliente productoCliente = new ProductoCliente(0, curso.getNombre(), date, null, true, 0, true, 0, cliente, curso);
                System.out.println("El cliente " + cliente.getNombre() + " compró exitosamente el curso " + curso.getNombre());
                return true;
            }
            System.out.println("El cliente no cuenta con plan activo.");
            return false;
        }
    }

    public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate date, float valor) {
        if (cliente.hasCurso(curso)) {
            System.out.println("El cliente" + cliente.getNombre() + "ya había comprado el curso " + curso.getNombre());
            return false;
        } else {
            if (cliente.hasPlanActivo()) {
                if (curso.getValor() <= cliente.getPlanActivo().getPlan().getValorMaximoCurso()) {
                    System.out.println("El curso esta incluido en el plan del cliente" + cliente.getNombre() + ", por lo tanto no debe pagar. Se procede a registrar el curso " + curso.getNombre() + " con costo $0");
                    ProductoCliente productoCliente = new ProductoCliente(0, curso.getNombre(), date, null, true, 0, true, 0, cliente, curso);
                    return true;
                }
            }
            if (valor != curso.getValor()) {
                System.out.println("El cliente " + cliente.getNombre() + " no pagó el valor correcto por el curso " + curso.getNombre());
                return false;
            }
            ProductoCliente productoCliente = new ProductoCliente(0, curso.getNombre(), date, null, true, valor, true, 0, cliente, curso);
            System.out.println("El cliente " + cliente.getNombre() + " compró exitosamente el curso " + curso.getNombre());
            return true;

        }
    }

    public boolean addInstructor(String nombre, String cédula, String telefono, String email) {
        this.instructores.add(new Instructor(nombre, cédula, telefono, email));
        return true;
    }

    public boolean addCliente(String nombre, String cédula, String telefono, String email) {
        this.clientes.add(new Cliente(nombre, cédula, telefono, email));
        return true;
    }

    public boolean addCurso(int id, String nombre, LocalDate fechaInicio, float valor, Instructor instructor) {
        this.cursos.add(new Curso(id, nombre, fechaInicio, null, true, valor, instructor));
        return true;
    }

    public boolean addPlan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso) {
        this.planes.add(new Plan(0, nombre, fechaInicio, null, true, valor, valorMaximoCurso));
        return true;
    }

    public Instructor getInstructor(int index) {
        return this.instructores.get(index);
    }

    public Plan getPlan(int index) {
        return this.planes.get(index);
    }

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public Curso getCurso(int index) {
        return this.cursos.get(index);
    }

    public void listAll() {
        System.out.println("Lista de clientes con sus compras:\n"
                + "----------------------------------------");
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente.getNombre() + "\nPlanes:");
            cliente.getPlanes();
            System.out.println("\nCursos:");
            cliente.getCursos();
            System.out.println("----------------------------------------");
        }
    }

}
