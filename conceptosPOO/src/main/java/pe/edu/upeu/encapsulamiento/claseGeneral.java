package pe.edu.upeu.encapsulamiento;

public class claseGeneral {
    public static void main( String[] args ) {
        persona p = new persona(); // p=objeto
       // p.nombre = "Kassandra";
       // p.edad = 25;

         p.setNombre("Kassandra"); //encapsulamiento
         p.setEdad(25);// encapsulamiento
         p.apellido=""; // nose esta aplicando encapsulamiento

         p.saludo();


         trabajador t = new trabajador();// =odjeto
         t.setNombre("Kassandra");
         t.setApellido("Pradoc");
         t.setEdad(25);
         t.setArea("Sistemas");
         t.setGenero('F');
         System.out.println(t);




    }
}
