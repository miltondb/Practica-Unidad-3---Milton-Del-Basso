
import java.util.Scanner;
import java.util.ArrayList;

public class ListaAlum2 {
    public static void main(String[] args) throws Exception {
        //creamos un arrayList (dinamico) de alumnos
        ArrayList <String> listaAlumnos = new ArrayList <String> ();

        //llenamos el arrayList listaAlumnos
        String literal = "salir";
        String alumno;
        System.out.println("Ingrese Nombre y Apellido del alumno: (para salir escriba: salir)");
        Scanner nombre = new Scanner (System.in); //abrimos scanner
        
        alumno = nombre.nextLine(); //ingresamos el primer alumno
        if(alumno.equals(literal)){ //si la palabra ingresada es la literal sale del ciclo
            System.out.println("No se ingresó registro. "); //y se muestra que no se ingresó nada
       } else {
            do { //se ingresan alumnos hasta que se ingresa el literal "salir"
                listaAlumnos.add(alumno);
                alumno = nombre.nextLine();
            } while(!(alumno.equals(literal)));
       }            
       
        nombre.close(); //cerramos el scanner
        
        System.out.println("\n");
        System.out.println("Alumnos de la Comision 2: \n");
        for(String i : listaAlumnos){
        System.out.println("Nombre y Apellido: "+i);
        }
    }
}
