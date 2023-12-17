package snake_ladder;

import java.util.Random;

public class Dice {
    public static int rollDice(){
        Random random  =  new Random();
        return random.nextInt(6)+1;
    }
}
