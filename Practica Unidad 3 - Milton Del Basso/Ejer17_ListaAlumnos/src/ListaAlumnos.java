/* Ejercicio 17: Escribir un algoritmo que almacene la lista de alumnos de una comision
y los muestre por pantalla */


import java.util.Scanner;

public class ListaAlumnos {
    public static void main(String[] args) throws Exception {
        //variables
        int nAlumnos,valor=0;
        String enesimoAlum;
        Scanner entrada = new Scanner(System.in); //iniciamos el scanner

        System.out.println("\n");
        System.out.println("Ingrese la cantidad de alumnos de la comision: ");
        nAlumnos = entrada.nextInt(); //leemos el valor entero
        entrada.nextLine(); //limpiamos el buffer

        //creamos el array de nAlumnos
        String [] miArray = new String [nAlumnos];

        //lo llenamos con los strings
        System.out.println("Ingrese el Nombre y Apellido de cada estudiante: ");
        while(valor<nAlumnos){
            enesimoAlum = entrada.nextLine(); //leemos el enesimoAlum valor ingresado
            miArray [valor] = enesimoAlum;
            valor++; //incrementamos en 1 valor
        }
        entrada.close(); //cerramos el scanner

        //mostramos el array creado     
        System.out.println("Listado de "+nAlumnos+" alumnos de la Comision 2: ");
        for(int i=0;i<nAlumnos;i++){
            System.out.println("Alumno "+(i+1)+" : "+miArray[i]); //mostramos cada uno de los elementos del array
        }
    }
}
