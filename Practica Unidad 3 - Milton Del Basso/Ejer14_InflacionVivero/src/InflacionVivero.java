/*Un vivero actualiza cada 6 meses los precios de las planta que vende
en funcion de los valores oficiales de inflación mensual. Desean desarrollar
un programa que proporcione el precio actualizado a partir del precio anterior 
y los valores de inflacion. Consideremos que una vez transcurre el mes 
el nuevo precio es:
    
Precio=Preciox(inflacion mes/100)+Precio
    Precio=Preciox(1+(inflacion mes/100))

*/

import java.util.Scanner;

public class InflacionVivero {
    public static void main(String[] args) throws Exception {
        //variables
        float precioInicial=0,precioFinal=0;
        float inflacionMensual=0;
        int periodo=6;

        //leemos el precio inicial
        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        System.out.print("Ingrese el precio de la planta: \n $");
        precioInicial = entrada.nextFloat(); //leemos el precio inicial
        System.out.println("Ingrese el indice de inflacion mensual: /formato --> 4,6 (4,6% mensual)/ ");
        inflacionMensual = entrada.nextFloat(); //leemos el precio inicial

        entrada.close(); //cerramos el scanner
        System.out.println("\n");
        System.out.println("//////////////////////////////");

        //calculamos el precio final
        inflacionMensual=(1+(inflacionMensual/100)); //inflacion mensual
        precioFinal=precioInicial*inflacionMensual; //inflacion del primer mes

        //mostramos el precio final para cada mes en el lapso de 6 meses
        for(int i =1;i<=periodo;i++){
        System.out.println("Precio Mes "+i+" : $ "+precioFinal);
        precioFinal=precioFinal*inflacionMensual;
        }
        System.out.println("//////////////////////////////");
    }
}
