import java.util.Random;
import  java.util.Scanner;


public class OddsAndEvens {

    public static void main(String[] args) {

        /**inicializacion*/
        
        Scanner in = new Scanner(System.in);

        System.out.println("Juguemos un juego llamado “Pares e impares");
        System.out.println("Cual es tu nombre?");
        String name = in.next();
        System.out.println("Hola "+ name + " Que elijes: pares o impares? (P o I)");

        String ladoDelJugador = in.next();

        if(ladoDelJugador.equals("P"))
            System.out.println("Se eligio Pares, la computadora sera Impar");
        else
            System.out.println("Se eligio Impares, la computadora sera Pares");
        System.out.println("************************************************");

        jugar(ladoDelJugador,in);

    }

    private static void jugar(String ladoDelJugador, Scanner in) {

        System.out.println("Cuantos dedos mostraras?");
        int dedosJugador = in.nextInt();

        Random rand = new Random();
        int dedosComputadora = rand.nextInt(6);         //Genera random 0-5

        System.out.println("la computadora elijio: " + dedosComputadora);
        System.out.println("************************************************");

        int res = dedosComputadora + dedosJugador;

        boolean parImpar = res%2 == 0;      //par: True, impar: False
        if(parImpar) {
            if(ladoDelJugador.equals("P"))
                System.out.println("Ganaste!");
            else
                System.out.println("Perdiste!");
        }
        else
        {
            if(ladoDelJugador.equals("I"))
                System.out.println("Ganaste!");
            else
                System.out.println("Perdiste!");
        }
        System.out.println("************************************************");


    }
}
