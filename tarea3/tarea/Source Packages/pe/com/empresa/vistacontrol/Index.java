package pe.com.empresa.vistacontrol;

import pe.com.empresa.modelo.Municipalidad;
import pe.com.empresa.utils.Lectura;

public class Index {
    public static void main(String[] args) {
        System.out.println("\n--- Creación de Objeto Municipalidad ---");

        String nombre = Lectura.leerString("Ingrese el nombre de la Municipalidad: ");
        String direccion = Lectura.leerString("Ingrese la dirección: ");
        String ruc = Lectura.leerString("Ingrese el RUC: ");
        String alcalde = Lectura.leerString("Ingrese el nombre del Alcalde: ");
        int numeroEmpleados = Lectura.leerInt("Ingrese el número de empleados: ");
        double presupuestoAnual = Lectura.leerDouble("Ingrese el presupuesto anual: ");
        String tipoGobierno = Lectura.leerString("Ingrese el tipo de gobierno (Ej: Local, Provincial): ");

        Municipalidad miMunicipalidad = new Municipalidad(nombre, direccion, ruc, alcalde, numeroEmpleados, presupuestoAnual, tipoGobierno);

        System.out.println("\n--- Datos de la Municipalidad Registrada ---");
        System.out.println("Nombre: " + miMunicipalidad.getNombre());
        System.out.println("Dirección: " + miMunicipalidad.getDireccion());
        System.out.println("RUC: " + miMunicipalidad.getRuc());
        System.out.println("Alcalde: " + miMunicipalidad.getAlcalde());
        System.out.println("Número de Empleados: " + miMunicipalidad.getNumeroEmpleados());
        System.out.println("Presupuesto Anual: " + miMunicipalidad.getPresupuestoAnual());
        System.out.println("Tipo de Gobierno: " + miMunicipalidad.getTipoGobierno());
    }
}

