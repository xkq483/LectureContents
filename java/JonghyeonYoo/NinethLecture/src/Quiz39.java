class DiceGame {
    private int comDice;
    private int userDice;

    public DiceGame() {
        comDice = getRandDice();
        userDice = getRandDice();
    }
    private int getRandDice() {
        return (int)(Math.random() * 6 + 1);
    }
    public void checkWinner() {
        if(comDice > userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승", userDice, comDice);
        } else if(comDice<userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자 승", userDice, comDice);
        } else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부", userDice, comDice);
        }
    }
}
public class Quiz39 {
    public static void main(String[] args) {
    DiceGame dg = new DiceGame();

    dg.checkWinner();
    }
}
