public class Index {
    public static void main(String[] args) {
        System.out.println("\n--- Creación de Objeto Municipalidad ---");

        String nombre = Lectura.leerString("Ingrese el nombre de la municipalidad: ");
        String alcalde = Lectura.leerString("Ingrese el nombre del alcalde: ");
        int poblacion = Lectura.leerInt("Ingrese la población: ");
        double presupuestoAnual = Lectura.leerDouble("Ingrese el presupuesto anual: ");
        String direccion = Lectura.leerString("Ingrese la dirección: ");
        String telefonoContacto = Lectura.leerString("Ingrese el teléfono de contacto: ");
        String fechaFundacion = Lectura.leerString("Ingrese la fecha de fundación (DD/MM/AAAA): ");

        Municipalidad miMunicipalidad = new Municipalidad(nombre, alcalde, poblacion, presupuestoAnual, direccion, telefonoContacto, fechaFundacion);

        System.out.println("--- Valores Asignados a la Municipalidad ---");
        System.out.println("Nombre: " + miMunicipalidad.getNombre());
        System.out.println("Alcalde: " + miMunicipalidad.getAlcalde());
        System.out.println("Población: " + miMunicipalidad.getPoblacion());
        System.out.println("Presupuesto Anual: " + miMunicipalidad.getPresupuestoAnual());
        System.out.println("Dirección: " + miMunicipalidad.getDireccion());
        System.out.println("Teléfono de Contacto: " + miMunicipalidad.getTelefonoContacto());
        System.out.println("Fecha de Fundación: " + miMunicipalidad.getFechaFundacion());

        Lectura.cerrarScanner();
    }
}