public class TablaDelCinco {
    public static void main(String[] args) throws Exception {
        //variables
        int numIni=0;
        int array [];
        array = new int [10];
        
        //llenamos el array
        System.out.println("/n");
        System.out.println("Tabla del 5: ");
        for(int i=0;i<=array.length;i++){
            numIni = i*5;
            System.out.println(""+i+ " = "+numIni); //mostramos la tabla
        }
        
    }
}
