/* Escribir un programa que almacene las asignaturas de un curso (por ejemplo
Matematicas, Fisica, Quimica, Historia y Lengua), pregunte al usuario la nota
que ha sacado en cada asignatura, y despues las muestre por pantalla con el 
mensaje "En <asignatura> has sacado <nota>", donde <asignatura> es cada una de 
las asignaturas de la lista y <nota> cada una de las correspondientes notas
introducidas por el usuario.
 */


import java.util.Scanner;

public class Asignaturas {
    public static void main(String[] args) throws Exception {
        //variables
        String asignatura [] = {"Matematicas","Fisica","Quimica","Historia","Lengua"}; //definimos el array asignaturas
        int longitud = asignatura.length; //tomamos la longitud del array asignatura
        int notas [] = new int [longitud]; //creamos un array de notas

        Scanner entrada = new Scanner(System.in); //iniciamos scanner
        //pedimos la nota correspondiente a cada asignatura
        for(int i=0;i<longitud;i++){
            System.out.print("Ingrese la nota de la asignatura "+asignatura[i]+" : ");
            notas[i] = entrada.nextInt();
        }
        entrada.close(); //cerramos el scanner
        //mostramos la asignatura con cada nota correspondiente
        System.out.println("\n");
        for(int i=0;i<longitud;i++){
            System.out.println("En "+asignatura[i]+" has sacado: "+notas[i]);
        }
    }
}
