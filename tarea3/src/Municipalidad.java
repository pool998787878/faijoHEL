public class Municipalidad {
    private String nombre;
    private String alcalde;
    private int poblacion;
    private double presupuestoAnual;
    private String direccion;
    private String telefonoContacto;
    private String fechaFundacion;

    public Municipalidad(String nombre, String alcalde, int poblacion, double presupuestoAnual, String direccion, String telefonoContacto, String fechaFundacion) {
        this.nombre = nombre;
        this.alcalde = alcalde;
        this.poblacion = poblacion;
        this.presupuestoAnual = presupuestoAnual;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.fechaFundacion = fechaFundacion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }
}