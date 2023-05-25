/*Realice un algoritmo que solicite dos numeros cualesquiera, luego debe pedirse un numero
que seleccionara alguna operacion aritmetica.
1-suma
2-resta
3-multiplicacion
4-division

Mostrar resultado. */

import java.util.Scanner;

public class OpNumeros {
    public static void main(String[] args) throws Exception {
        //variables
        float num1,num2,resultado;
        int selector;
        
        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        //pedimos el ingreso de 2 valores
        System.out.println("\n");
        System.out.println("A continuacion ingrese 2 numeros cualquiera: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        entrada.nextLine();
        System.out.println("A continuacion seleccione la operacion a realizar:  ");
        System.out.println(" 1 --> Suma.  ");
        System.out.println(" 2 --> Resta.  ");
        System.out.println(" 3 --> Multiplicacion.  ");
        System.out.println(" 4 --> Division.  ");
        System.out.println("\n");
        selector = entrada.nextInt();

        entrada.close(); //cerramos el scanner
        //System.out.println(" num1: "+num1+" num2: "+num2+" selector: "+selector);
        switch(selector){
            case 1 :
            resultado = num1+num2; //relizamos la suma
            System.out.println("El resultado de la suma es: "+resultado);
            break;

            case 2 :
            resultado = num1-num2; //relizamos la resta
            System.out.println("El resultado de la resta es: "+resultado);
            break;

            case 3 :
            resultado = num1*num2; //relizamos la multiplicacion
            System.out.println("El resultado de la multiplicacion es: "+resultado);
            break;

            case 4 :
            if(num2<=0){
                System.out.println("No se puede dividir por cero!");
                break;
            }
            resultado = num1/num2; //relizamos la division
            System.out.println("El resultado de la division es: "+resultado);
            break;

            default : 
            System.out.println("No se seleccionó ninguna operación a realizar ");
        }
    }
}
