/* Construya un algoritmo que solicite al usuario una hora valida y muestre
un mensaje segun la hora introducida corresponda a la mañana, la tarde o la noche.
El algoritmo debe terminar cunado se introduzca el numero 100.*/

import java.util.Scanner;

public class HoraValida {
    public static void main(String[] args) throws Exception {
        //variables
        int horaIngresada;

        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        //pedimos que se ingrese la hora
        System.out.println("\n");
        System.out.println("Ingrese una hora válida: (0 a 24 Hs)");
        horaIngresada = entrada.nextInt();

        while(horaIngresada!=100 && horaIngresada>=0 && horaIngresada <= 24){ //verificamos valor diferente de 100 y que esté en un rango válido
            
            if(horaIngresada > 6 && horaIngresada <= 12) { //mañana
                System.out.println("Hora de mañana.");
            } else if(horaIngresada > 12 && horaIngresada <= 19) { //tarde
                System.out.println("Hora de tarde.");
            } else if(horaIngresada > 19 && horaIngresada <= 24) { //noche
                System.out.println("Hora de noche.");
            } else { //madrugada
                System.out.println("Hora de madrugada.");
            }
        System.out.println("Ingrese una hora válida: (0 a 24 Hs)");
        horaIngresada = entrada.nextInt();
        }
        System.out.println("Fin de programa.");
        entrada.close(); //cerramos el scanner

    }
}

