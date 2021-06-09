
class Dice {
    private int comDice;
    private int userDice;

    public Dice() {
        comDice = getRandomDice();
        userDice = getRandomDice();

    }

    private int getRandomDice() {
        return (int) (Math.random() * 6 + 1);

    }

    public void checkWinner() {
        if (comDice > userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승", userDice, comDice);
        } else if (comDice < userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자 승", userDice, comDice);
        } else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부", userDice, comDice);

        }
    }
}
public class Quiz_39 {
    public static void main(String[] args) {
        Dice dg = new Dice();

        dg.checkWinner();


    }
}
