class DiceGame {
    private int comDice;
    private int userDice;

    public DiceGame () {
         comDice = getRandDice();
         userDice = getRandDice();
    }
    private int getRandDice () {
        return (int)(Math.random() * 6 + 1);
        // (int)(Math.random() * 6 + 1)에서 나온 값을 생성자의 comDice의 값으로 return한다..?
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
public class _2nd_Quiz39 {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        dg.checkWinner();
    }
}