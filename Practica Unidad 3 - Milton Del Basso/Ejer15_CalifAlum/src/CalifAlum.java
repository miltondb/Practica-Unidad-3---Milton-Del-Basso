/*Construya un algoritmo que pida que se introduzca un numero correspondiente a la
nota de un alumno en una determinada asignatura y muestre un texto con la calificacion
 equivalente de la siguiente forma:
 
 - si la nota es menor que 5 muestra "Insuficiente"
 - si la nota es mayor o igual que 5 y menor que 6 muestra "Suficiente"
 - si la nota es mayor o igual que 6 y menor que 7 muestra "Bien"
 - si la nota es mayor o igual que 7 y menor que 9 muestra "Muy bien"
 - si la nota es mayor o igual que 9 y menor que 10 muestra "Notable"
 - si la nota es igual a 10 muestra "Sobresaliente"
 - si la nota es menor que 0 o mayor que 10 muestra "No válida"

 */

import java.util.Scanner;

public class CalifAlum {
    public static void main(String[] args) throws Exception {
        //variables
        int notaIngresada;

        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        //pedimos que se ingrese la nota
        System.out.println("\n");
        System.out.println("Ingrese la nota del alumno: ");
        notaIngresada = entrada.nextInt();
        entrada.close(); //cerramos el scanner

        if(notaIngresada>=0 && notaIngresada<5){ //Insuficiente
            System.out.println("Insuficiente.");
        } else if(notaIngresada>=5 && notaIngresada<6){ //Suficiente
            System.out.println("Suficiente.");
        } else if(notaIngresada>=6 && notaIngresada<7){ //Bien
            System.out.println("Bien.");
        } else if(notaIngresada>=7 && notaIngresada<9){ //Muy bien
            System.out.println("Muy bien.");
        } else if(notaIngresada>=9 && notaIngresada<10){ //Notable
            System.out.println("Notable.");
        } else if(notaIngresada==10){ //Sobresaliente
            System.out.println("Sobresaliente.");
        }       
        else{ //Nota no válida
            System.out.println("Nota no válida.");
        }
    }
}
