package DiceMan;

public class DiceMan {
    public String name;
    public int numberOfActivity;

    // konstruktør
    public DiceMan(String name, int numberOfActivity) {
        this.name = name;
        this.numberOfActivity = numberOfActivity;
    }
    public void rollDice(){
        int roll = 0;
        Dice dice = new Dice();
        roll = dice.rollDice();

        if(roll == numberOfActivity){

        }
    }


}
