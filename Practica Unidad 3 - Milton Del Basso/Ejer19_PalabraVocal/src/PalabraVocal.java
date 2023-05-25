/* Escribir un programa que pida al usuario una palabra y muestre por pantalla
el numero de veces que contiene cada vocal. Si una vocal está mas de 2 veces deja
de contar esa vocal y continúa con la siguiente */

import java.util.Scanner;

public class PalabraVocal {
    public static void main(String[] args) throws Exception {
        //variables
        int cant_a=0,cant_e=0,cant_i=0,cant_o=0,cant_u=0; //cantidades de vocales

        //pedimos ingresar la palabra        
        System.out.println("\n");
        System.out.println("Ingrese una palabra: ");
        
        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        String palabra = entrada.nextLine(); //leo un string
        char [] palabraIn = palabra.toCharArray(); // convierto el string leido a array de caracteres
        entrada.close(); //cerramos el scanner
        
        //comprueba caracter por caracter si hay alguna vocal
        System.out.println("\n");
        for(int i=0;i<palabraIn.length;i++){
            char letra = palabraIn[i];
            switch(letra){
                case 'a':
                    cant_a++;
                    break;
                case 'A':
                    cant_a++;
                    break;
                case 'e':
                    cant_e++;
                    break;
                case 'E':
                    cant_e++;
                    break;
                case 'i':
                    cant_i++;
                    break;
                case 'I':
                    cant_i++;
                    break;
                case 'o':
                    cant_o++;
                    break;
                case 'O':
                    cant_o++;
                    break;
                case 'u':
                    cant_u++;
                    break;
                case 'U':
                    cant_u++;
                    break;
                default:
                    //System.out.println("No hay vocales");
            }
        }
        System.out.println("Cantidad de 'a': "+cant_a);
        System.out.println("Cantidad de 'e': "+cant_e);
        System.out.println("Cantidad de 'i': "+cant_i);
        System.out.println("Cantidad de 'o': "+cant_o);
        System.out.println("Cantidad de 'u': "+cant_u);
    }
}
