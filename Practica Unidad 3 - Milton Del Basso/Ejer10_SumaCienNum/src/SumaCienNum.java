public class SumaCienNum {
    public static void main(String[] args) throws Exception {
        //variables
        int num=0,suma=0,cantidad=100;

        while(num<=cantidad){
            suma+=num++;
        }
        //mostramos el resultado
        System.out.println("La suma de los 100 primeros numeros es:  "+suma);
    }
}
