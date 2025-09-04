package pe.edu.upeu.encapsulamiento;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

 // @Getter
 // @Setter
public class trabajador {
     private String nombre;
     private int edad;
     private String apellido;
     private String area;
     private char genero;

     @Override
     public String toString() {
         return "Tiene las siguientes caracteriscas:\n"+
                 "Nombre:"+nombre+"\n"+
                 "apellido:"+apellido+ "\n"
                 ;


     }

}
