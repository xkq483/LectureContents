class Dice2 {
    int comDice2;
    int userDice2;

    Dice2() {
        comDice2 = randomdice();
        userDice2 = randomdice();
    }

    int randomdice() {
        return (int) (Math.random() * 6 + 1);
    }


}

public class Day8_Quiz35 {
    public static void main(String[] args) {
        Dice2 t = new Dice2();

    }
}

