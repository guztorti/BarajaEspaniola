package barajaespaniola.entities;

import barajaespaniola.enums.Numero;
import barajaespaniola.enums.Palo;

public class Carta {

    private Palo palo;

    private Numero numero;

    public Carta() {
    }

    public Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero.getValor() + "}\n";
    }
}
