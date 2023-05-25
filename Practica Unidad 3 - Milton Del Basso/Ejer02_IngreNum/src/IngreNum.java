/*Realizar un algoritmo que solicite un numero al usuario y determine si este numero
es positivi, negativo o cero. */

import java.util.Scanner;

public class IngreNum {
    public static void main(String[] args) throws Exception {
                
        Scanner entrada = new Scanner(System.in); //abrimos scanner
        System.out.println("\n");
        System.out.println("Ingrese un numero entero cualquiera:");
        int numero = entrada.nextInt();

        if(numero>0){
            System.out.println("El numero ingresado es positivo.");
        } else if(numero<0){
            System.out.println("El numero ingresado es negativo.");
        } else{
            System.out.println("El numero ingresado es cero.");
        }
        entrada.close(); //cerramos el scanner
    }
}
