package DiceMan;

import java.util.Random;

public class Dice {
    public int rollDice(){
    Random rand = new Random();

    int nr = rand.nextInt(6) + 1;
    return nr;
    }

}

