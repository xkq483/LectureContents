import java.util.Scanner;

class DiceGame {
    private int comDice;
    private int userDice;
    Scanner scan;

    public DiceGame() {

        comDice = (int)(Math.random() * 6 + 1);
        userDice = (int)(Math.random() * 6 + 1);
        scan = new Scanner(System.in);
    }
    public void checkWinner () {
        System.out.print("주사의 게임을 시작하겠습니다.^^ 엔터를 눌러 게임을 시작하세요. ");
        scan.nextLine();
        System.out.println("==========================");

        if (comDice > userDice) {
            System.out.printf("컴퓨터 승! %d (컴퓨터) vs %d (시용자)\n", comDice, userDice);
        } else if (comDice < userDice) {
            System.out.printf("사용자 승! %d (컴퓨터) vs %d (시용자)\n", comDice, userDice);
        } else {
            System.out.printf("비겼습니다! %d (컴퓨터) vs %d (시용자)\n", comDice, userDice);
        }

    }

}


public class QuizTest39 {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        dg.checkWinner();
    }

}
