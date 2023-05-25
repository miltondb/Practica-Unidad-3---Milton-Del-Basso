import java.util.Scanner;

public class AlgoCon {
    public static void main(String[] args) throws Exception {
        
                /*
                * Escribir un algoritmo que almacene la cadena de caracteres contraseña
                y pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta
                */

                System.out.println("\n");
                System.out.println("Este es un programa validador.");

                //variables
                String contrasenia = "contrasenia"; //[ESTA ES LA PALABRA CONTRASEÑA]
              
                //pedimos ingresar la contraseña
                System.out.println("\n");
                System.out.println("Ingrese la contraseña:  ");
                Scanner entrada = new Scanner(System.in); //abrimos el scanner
                String contraIn = entrada.nextLine(); //leo un string
                //entrada.nextLine(); //limpio el buffer

                while (!(contraIn.equals(contrasenia))){
                    System.out.println("La contraseña es incorrecta. Vuelva a intentar..");
                    contraIn = entrada.nextLine(); //leo un string
                    }
                entrada.close(); //cerramos el scanner
                System.out.println("La contraseña es correcta! ");
                
    }
}
