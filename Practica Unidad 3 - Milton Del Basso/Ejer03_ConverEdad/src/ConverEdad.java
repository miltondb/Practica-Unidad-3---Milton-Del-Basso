
/* Realizar un algoiritmo que convierta la edad de una persona en segundos. El 
algoritmo debe recibir como datos de entrada año, mes y dia de nacimiento y calculas
la cantidad de segundos que corresponde a su edad considerando que todos los años
tienen 365 dias.*/

import java.util.Scanner;

public class ConverEdad {
    public static void main(String[] args) throws Exception {
        //variables
        int anio,mes,dia=0;
        int anioActual,mesActual,diaActual;
        float difAnios=0,difMeses=0,difDias=0;
        float cantidadAnios=0,cantidadMeses=0,cantidadDias=0;
        float sumaTotalDias=0,totalSegundos=0;

        Scanner entrada = new Scanner(System.in); //iniciamos el scanner
        //pedimos los datos de entrada
        //ingresamos primero la fecha actual
        System.out.println("\n");      
        System.out.println("Ingrese dia de hoy: (formato numero: dd)");
        diaActual = entrada.nextInt();
        System.out.println("Ingrese mes actual: (formato numero: mm)");
        mesActual = entrada.nextInt();
        System.out.println("Ingrese año actual: (formato numero: aaaa)");
        anioActual = entrada.nextInt();

        //ingresamos ahora la fecha de nacimiento
        System.out.println("Ingrese dia de nacimiento: (formato numero: dd)");
        dia = entrada.nextInt();
        System.out.println("Ingrese mes de nacimiento: (formato numero: mm)");
        mes = entrada.nextInt();
        System.out.println("Ingrese año de nacimiento: (formato numero: aaaa)");
        anio = entrada.nextInt();
        
        entrada.close(); //cerramos el scanner

        //calculamos las diferencias entre fecha de nacimiento y la fecha actual
        difAnios = anioActual - anio;
        difMeses = mesActual - mes;
        difDias = diaActual - dia;

        if(difAnios<0){ //calculamos la cantidad de años
            cantidadAnios = anioActual; 
        }else if (difAnios>=0){
            cantidadAnios = (difAnios-1);
        }      
        
        if(difMeses<=0){ //calculamos la cantidad de meses
            cantidadMeses = mesActual; 
        } else{
            cantidadMeses = difMeses;
        }

        if(difDias<0){ //calculamos la cantidad de dias
            cantidadDias = diaActual; 
        }else if (difDias>=0){
            cantidadDias = (difDias);
        } 
        //convertimos todas las cantidades a dias
        cantidadAnios = (cantidadAnios*365); //conversion de años a dias
        cantidadMeses = ((cantidadMeses*365)/12); //conversion de meses a dias
        sumaTotalDias = cantidadAnios+cantidadMeses+cantidadDias; //sumamos la cantidad total de dias

        //convertimos los dias a segundos
        totalSegundos = ((sumaTotalDias*24)*3600); // 1dia-24hs-3600seg

        //mostramos las fechas y el resultado
        System.out.println("\n"); 
        System.out.println("Fecha actual: "+diaActual+"/"+mesActual+"/"+anioActual+".");
        System.out.println("Fecha de nacimiento: "+dia+"/"+mes+"/"+anio+".");
        System.out.println("\n"); 
        System.out.println("Cantidad de Dias: "+sumaTotalDias+" Cantidad de Segundos: "+totalSegundos);
    }
}

