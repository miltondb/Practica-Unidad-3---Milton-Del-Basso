/*Realizar un algoritmo que lea una hora (numero entero) y muestre un mensaje segun la hora introducida
corresponda a la mañana, la tarde o la noche */

import java.util.Scanner;

public class HoraDia {
    public static void main(String[] args) throws Exception {
        //variables
        int horaIngresada;

        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        //pedimos que se ingrese la hora
        System.out.println("\n");
        System.out.println("Ingrese una hora: (0 a 24 Hs)");
        horaIngresada = entrada.nextInt();
        entrada.close(); //cerramos el scanner

        if(horaIngresada > 6 && horaIngresada <= 12){ //mañana
            System.out.println("Hora de mañana.");
        } else if(horaIngresada > 12 && horaIngresada <= 19){ //tarde
            System.out.println("Hora de tarde.");
        } else if(horaIngresada > 19 && horaIngresada <= 24){ //noche
            System.out.println("Hora de noche.");
        } else{ //madrugada
            System.out.println("Hora de madrugada.");
        }

    }
}
