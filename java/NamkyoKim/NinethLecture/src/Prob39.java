import java.util.Scanner;

class DiceGame {
    // private 는 접근제한자 int는 데이터타입 반드시필요
    // public같은 접근제한자
    private int comDice;
    private int userDice;

    public DiceGame() {
        comDice = getRandDice();
        userDice = getRandDice();
    }

    private int getRandDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public void checkWinner() {
        if (comDice > userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터승", userDice, comDice);
        } else if (comDice < userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자승", userDice, comDice);
        } else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부", userDice, comDice);
        }
    }

}

public class Prob39 {
    public static void main(String[] args) {
        // 주사위굴리기게임을 ACL을 적용하여 풀어보자 .
        DiceGame dg = new DiceGame();

        // 요런식으로 코드에서 막는게 캡슐화에서 말하는 보안이다 private!!
        // dg.comDice = 3;

        dg.checkWinner();
    }
}
