/*Realizar un algoritmo que lea N numeros, calcule y escriba la suma de los numeros pares y el producto de los impares */

import java.util.Scanner;

public class NumSumaProd {
    public static void main(String[] args) throws Exception {
        //variables
        int num,suma=0,producto=1;

        System.out.println("\n");
        Scanner entrada = new Scanner(System.in); //inciamos el scanner
        System.out.println("A continuacion se ingresaran valores indefinidamente hasta que se ingrese un valor negativo: ");
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        while(num>=0){
            if(num%2 == 0){ //si es par realiza la suma
                suma += num; //a suma le agregamos el numero ingresado
                System.out.println("Ingrese otro numero: ");
                num = entrada.nextInt();
            } else { //si es impar realiza el producto
                producto *= num; //al producto le multiplicamos el nuevo valor ingresado
                System.out.println("Ingrese otro numero: ");
                num = entrada.nextInt();
            }
        }
        
        System.out.println("El suma de los numeros pares ingresados es: "+suma);
        System.out.println("El producto de los numeros impares ingresados es: "+producto);
        entrada.close(); //cerramos el scanner
    }
}
