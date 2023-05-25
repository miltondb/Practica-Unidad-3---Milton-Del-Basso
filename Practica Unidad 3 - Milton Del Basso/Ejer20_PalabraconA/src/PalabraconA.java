/* Escribir un programa que pida al usuario una palabra y muestre por pantalla
el numero de veces que contiene cada vocal. Si una vocal está mas de 2 veces deja
de contar esa vocal y continúa con la siguiente */

import java.util.Scanner;

public class PalabraconA {
    public static void main(String[] args) throws Exception {
        //variables
        int cant_a=0; //cantidades letras A

        //pedimos ingresar la palabra        
        System.out.println("\n");
        System.out.println("Ingrese una palabra: ");
        
        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        String palabra = entrada.nextLine(); //leo un string
        char [] palabraIn = palabra.toCharArray(); // convierto el string leido a array de caracteres
        entrada.close(); //cerramos el scanner
        
        //comprueba caracter por caracter si hay una A en la palabra
        System.out.println("\n");
        for(int i=0;i<palabraIn.length;i++){
            char letra = palabraIn[i];
            if (letra=='a' || letra=='A' && cant_a <= 2){ //si hay incrementa el contador de a|A en 1
                cant_a++;                
            } //si no hay, no hace nada
        }
        if(cant_a > 2) { //si la cantidad es mayor a 2
            System.out.println("Palabra con más de 2 letras A ");
        } else if(cant_a > 0 && cant_a <= 2){ //si la cantidad es menor a 2
            System.out.println("Hay "+cant_a+" letras A");
        } else{
            System.out.println("No hay letras A"); //si hay 0 letras a|A
        }
    }
}
