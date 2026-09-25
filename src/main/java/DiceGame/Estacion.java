package DiceGame;

import java.util.Random;

public class Estacion {
    private int numDado;
    private int capacidadUltimoTiro;
    private Dado dado = new Dado();


    public Estacion(int numDado){
        this.numDado = numDado;
        this.capacidadUltimoTiro = 0;
    }

    public void agregarDado(int cantidad){
        this.numDado += cantidad;
    }

    public boolean removerDado(int cantidad){
        if(cantidad < 0 || cantidad > numDado){
            return false;
        }
        this.numDado -= cantidad;
        return true;
    }

    public int getNumDado() {
        return numDado;
    }

    public int getUltimoTiro() {
        return capacidadUltimoTiro;
    }

    public int tiroEstacion(Random random){
        capacidadUltimoTiro = dado.Multi(random, numDado, dado.CARAS);
        return capacidadUltimoTiro;
    }
}
