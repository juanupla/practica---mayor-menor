package ar.edu.utn.frc.tup.lciii;

public class Carta {
    int numero;

    Palo palo;

    public Carta(int numero, Palo palo){
        this.numero = numero;
        this.palo = palo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }
}
