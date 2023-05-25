/* Realizar un algoritmo que calcule el promedio de las cinco calificaciones
de un alumno. */

import java.util.Scanner;

public class PromedioCal{
    public static void main(String[] args) throws Exception {
        //variables
        int num=0;
        int cantidadInicial=0,cantidad=5;
        float promedio=0,suma=0;

        System.out.println("\n");
        Scanner entrada = new Scanner(System.in); //inciamos el scanner
        System.out.println("Ingrese 5 numeros para promediar: ");

        while(cantidadInicial<cantidad){
            num = entrada.nextInt();
            suma += num; //a suma le agregamos el numero ingresado
            cantidadInicial++;
            System.out.println("Ingrese otro numero: ");
         }
        entrada.close(); //cerramos el scanner
        promedio = suma/cantidad;
        System.out.println("El promedio de los "+cantidad+" numeros ingresados es: "+promedio);
    }
}
