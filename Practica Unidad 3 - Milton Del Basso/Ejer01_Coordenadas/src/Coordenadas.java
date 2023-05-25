/* Realizar un algoritmo que calcule la distancia entre dos puntos, tomando como
datos de entrada las coordenadas de los puntos P1 y P2. La distancia entre ellos
se puede calcular de la siguiente manera: distancia = raiz cuadrada de [(x2-x1)2]+[(y2-y1)2] */

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) throws Exception {
        //variables
        float x1,x2,y1,y2;
        double d;
        
        Scanner entrada = new Scanner (System.in); //iniciamos scanner

        //pedimos datos de entrada
        System.out.println("\n");
        System.out.println("Ingrese a continuacion las coordenadas: x1,x2,y1,y2 ");
        x1 = entrada.nextFloat();
        x2 = entrada.nextFloat();
        y1 = entrada.nextFloat();
        y2 = entrada.nextFloat();

        entrada.close(); //cerramos el scanner

        //calculamos la distancia d
        d = Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((x1-x2),2)));
        System.out.println("La distancia entre los puntos ["+x1+","+x2+"] ; ["+y1+","+y2+"] es: "+d);
    }
}
