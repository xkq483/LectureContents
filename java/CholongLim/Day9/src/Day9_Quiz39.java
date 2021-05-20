import jdk.swing.interop.SwingInterOpUtils;

class DiceGame {
    private int comDice;
    private int userDice;

    public DiceGame() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }

    private int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    }

//    class 내부에서 만들어지는 코드들은 어떤 식으로 사용이던
//    생성자이기때문에 그 방식으로 만들어지는듯 하다.
//    따라서 조건문이나 추가문이 붙더라도 checkWinner()와 같은 형식으로 시작해야한다.

    public void checkWinner() {
        if (comDice > userDice) {
            System.out.printf("%d(컴퓨터) VS %d(사용자), 컴퓨터 승리", comDice, userDice);
        } else if (comDice < userDice) {
            System.out.printf("%d(컴퓨터) VS %d(사용자), 사용자 승리", comDice, userDice);
        } else {
            System.out.printf("%d(컴퓨터) VS %d(사용자), 무승부", comDice, userDice);
        }

    }
}
public class Day9_Quiz39 {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        dg.checkWinner();

    }
}
