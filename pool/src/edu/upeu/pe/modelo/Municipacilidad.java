package edu.upeu.pe.modelo;

public class Municipacilidad {
    private String nombre;
    private String direccion;
    private String ruc;
    private String alcalde;
    private int numeroEmpleados;
    private double presupuestoAnual;
    private String tipoGobierno;

    public Municipacilidad(String nombre, String direccion, String ruc, String alcalde, int numeroEmpleados, double presupuestoAnual, String tipoGobierno) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
        this.alcalde = alcalde;
        this.numeroEmpleados = numeroEmpleados;
        this.presupuestoAnual = presupuestoAnual;
        this.tipoGobierno = tipoGobierno;
    }

    // Métodos accesores (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public String getTipoGobierno() {
        return tipoGobierno;
    }

    public void setTipoGobierno(String tipoGobierno) {
        this.tipoGobierno = tipoGobierno;
    }
}

