package DiceGame;

import java.util.Random;

public class Dado {
    public final int CARAS = 6;

    public Dado(){
    }

    public int Tirar(Random random, int lados){
        return random.nextInt(lados)+1;
    }

    public int Multi(Random random, int numDado, int lados){
        int sum = 0;
        for(int i = 0; i< numDado; i++){
            sum += Tirar(random, lados);
        }
        return sum;
    }

}
