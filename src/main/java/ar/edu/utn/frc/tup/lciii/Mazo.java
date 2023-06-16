package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {

    private List<Carta> cartas;

    public Mazo() {
        this.cartas = inicializarMazo();
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    /**
     * Este metodo mescla las cartas del mazo para jugar
     *
     * Ver Clase Collections
     */
    public void mesclarCartas() {
        Collections.shuffle(cartas);
    }

    /**
     * Este metodo crea cada carta y la agrega al mazo, como resultado retorna un mazo de 40 cartas españolas
     * @return
     */
    private List<Carta> inicializarMazo() {
        List<Carta> mazo = new ArrayList<>();

        for (int j = 1; j < 11; j++) {

            if (8 == j){
                Carta car = new Carta(10,Palo.ESPADA);
                Carta car1 = new Carta(10,Palo.COPA);
                Carta car2 = new Carta(10,Palo.BASTO);
                Carta car3 = new Carta(10,Palo.ORO);
                mazo.add(car);
                mazo.add(car1);
                mazo.add(car2);
                mazo.add(car3);
            }
            if (9 == j){
                Carta car = new Carta(11,Palo.ESPADA);
                Carta car1 = new Carta(11,Palo.COPA);
                Carta car2 = new Carta(11,Palo.BASTO);
                Carta car3 = new Carta(11,Palo.ORO);
                mazo.add(car);
                mazo.add(car1);
                mazo.add(car2);
                mazo.add(car3);
            }
            if (10 == j){
                Carta car = new Carta(12,Palo.ESPADA);
                Carta car1 = new Carta(12,Palo.COPA);
                Carta car2 = new Carta(12,Palo.BASTO);
                Carta car3 = new Carta(12,Palo.ORO);
                mazo.add(car);
                mazo.add(car1);
                mazo.add(car2);
                mazo.add(car3);
            }
            if (j<=7){
                Carta car = new Carta(j,Palo.ESPADA);
                Carta car1 = new Carta(j,Palo.COPA);
                Carta car2 = new Carta(j,Palo.BASTO);
                Carta car3 = new Carta(j,Palo.ORO);
                mazo.add(car);
                mazo.add(car1);
                mazo.add(car2);
                mazo.add(car3);

            }
        }


        return mazo;
    }
    /* otra opcion es:

    private List<Carta> inicializarMazo1() {
        String[] palos = {Palo.ORO.name(), Palo.BASTO.name(),Palo.ESPADA.name(), Palo.COPA.name()};
        Integer[] valores = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (String palo : palos) {
            for (int valor: valores) {

                Carta carta = new Carta(valor,Palo.valueOf(palo));
                cartas.add(carta);
            }
        }

        return cartas;
    }*/

    public String finJuego(){
        return "el mazo se ha terminado!!";
    }

}
