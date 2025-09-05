package DiceMan;

import java.util.Random;

public class Dice {
    private Random rand = new Random();

    int Dice = rand.nextInt(6) + 1;
    Dice dice = new Dice();
}

