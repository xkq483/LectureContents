/*
class DiceGame {
    private int comDice;
    private int userDice;

    public DiceGame () {
        comDice = getRandDice();
        userDice = getRandDice();
    }
    private int getRandDice () {
        return (int)(Math.random() * 6 + 1);
    }
    public void checkWinner () {
        if (comDice > userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승", userDice, comDice);
        } else if (comDice < userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자 승", userDice, comDice);
        } else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부", userDice, comDice);
        }
    }
}

public class DiceGameTest {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        //dg.comDice = 3;

        dg.checkWinner();
    }
}
*/
class Dice {
    private int comDice;
    private int userDice;

    public Dice() {
        comDice = getRndDice();
        userDice = getRndDice();

    }

    public int getRndDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public void checkDice() {
        if (comDice > userDice) {
            System.out.printf("%d(컴퓨터) vs %d(사용자) = 컴퓨터 승!\n", comDice, userDice);
        } else if (comDice < userDice) {
            System.out.printf("%d(컴퓨터) vs %d(사용자) = 사용자 승!\n", comDice, userDice);
        } else {
            System.out.printf("값이 동일 합니다. 비겼습니다..");
        }
    }

}
public class DiceGameTest {
    public static void main(String[] args) {
    Dice rna = new Dice();

    rna.checkDice();
    }
}