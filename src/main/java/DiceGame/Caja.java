package DiceGame;

public class Caja {
    public int rondaEntrada;

    public Caja(int rondaEntrada){
        this.rondaEntrada = rondaEntrada;
    }

    public int getRondaEntrada(){
        return rondaEntrada;
    }

    @Override
    public String toString(){
        return "Caja{ entró en ronda" + rondaEntrada + '}';
    }
}
