/* Mostrar los numeros pares hasta el 20*/

public class NumPares {
    public static void main(String[] args) throws Exception {
        //variables
        int numIni=0;
        int [] numPar = new int [21]; //definimos el tamaño del array
        System.out.println("\n");
        System.out.println("A continuacion se muestran los numeros pares del 0 al 20:");
        //llenamos el array
        for(int i=0;i<numPar.length;i++){
            numPar[i] = numIni;
            numIni++;
        }
        //mostramos solo los numeros pares
        for(int i=0;i<numPar.length;i+=2){
            System.out.println(numPar[i]);
        }
    }
}
