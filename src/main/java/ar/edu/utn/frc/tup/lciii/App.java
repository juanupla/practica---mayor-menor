package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Hello to Practica Parcial 1 - MAYOR/MENOR
 *
 */
public class App 
{

    /**
     * This is the main program
     * 
     */
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Practica Parcial 1 - MAYOR/MENOR.");
        // Mensaje de Bienvenida

        System.out.println("Bienvenido a mayor/menor");

        boolean flag = false;
        do {

            boolean flag2 = false;
            int contador = 0;
            do {

                Mazo mazo = new Mazo();
                mazo.mesclarCartas();
                System.out.println("Carta nro: "+ mazo.getCartas().get(0+contador).getNumero()+" Palo: " +mazo.getCartas().get(0+contador).getPalo());
                int nro = mazo.getCartas().get(0+contador).getNumero();
                System.out.println("la siguiente es mayor o menor? mayor/menor");
                String decision = scan.nextLine();
                String decisionMin = decision.toLowerCase();
                if (decisionMin.equals("mayor")){
                    contador++;
                    if(mazo.getCartas().get(0+contador).getNumero() > nro){
                        flag2 = true;
                        System.out.println("Correcto");
                    }
                    else {
                        flag2 = false;
                        System.out.println("Incorrecto");
                    }

                } else if (decisionMin.equals("menor")) {
                    contador++;
                    if(mazo.getCartas().get(0+contador).getNumero() < nro){
                        flag2 = true;
                        System.out.println("Correcto");
                    }
                    else {
                        flag2 = false;
                        System.out.println("Incorrecto");
                    }
                }

                if(flag2 == true){
                    if (contador == mazo.getCartas().get(0+contador).getNumero()){
                        flag2 = false;
                        System.out.println("el mazo se ha terminado!!");
                    }
                }

            }
            while (flag2);
            System.out.println("Desea volver a jugar? yes/no");
            if(scan.nextLine().equals("yes")){
                flag = true;
            }
            else {
                flag = false;
            }
        }
        while (flag);
        // Inicio un bucle para empezar a Jugar
            //Inicio otro bucle para empezar un juego de solitario
                // Creo el Mazo y lo mesclo
                // Muestro la primera carta del mazo
                // Pregunto por la decicion del jugador si la siguiente es mayor o menor
                // Recojo la respuesta
                // Muestro la siguiente carta
                // Valido la respuesta
                    // Si es correcta veo si quedan cartas en el mazo.
                        // Si no quedan cartas, el jugador ganó el juego.
                        // Si quedan cartas muestro info del juego y hago otra iteración
                    // Si no es correcta, termina el juego como perdido para el jugador
                        // Pregunto para volver a jugar
                            // Si quiere volver a jugar, retomo el bucle principal
    }
}
