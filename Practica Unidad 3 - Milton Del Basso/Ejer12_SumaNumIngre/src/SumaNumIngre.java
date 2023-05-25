/*Construya un algoritmo que solicite numeros al usuario y haga la suma de todos
ellos. El algoritmo debe solicitar numeros siempre y cuando el numero ingresado
sea positivo, si el usuario ingresa un numero no positivo el algoritmo debe
terminar e imprimir la suma de los numeros positivos. */

import java.util.Scanner;

public class SumaNumIngre {
    public static void main(String[] args) throws Exception {
        //variables
        int num,suma=0;
        int cantidad=0;

        System.out.println("\n");
        Scanner entrada = new Scanner(System.in); //inciamos el scanner
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        while(num>=0){
            suma += num; //a suma le agregamos el numero ingresado
            cantidad++;
            System.out.println("Ingrese otro numero: ");
            num = entrada.nextInt();
            //if(num<0){
                //break;
            //} 
        }
        if(cantidad==0){
            System.out.println("Ingrese un numero distinto de cero. "); 
        }
        else{
            System.out.println("La suma de los "+cantidad+" de numeros ingresados es: "+suma);
        }
        entrada.close(); //cerramos el scanner
    }
}
