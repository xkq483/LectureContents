import java.util.Scanner;

class DiceDeathGame {
    final int MAX_PLAYER = 2;
    final int START_MONEY = 1000;

    int comMoney;
    int usrMoney;
    int betMoney;

    Boolean isDeath;
    Scanner scan;

    int[] comDice;
    int[] usrDice;

    public DiceDeathGame () {
        comDice = new int[MAX_PLAYER];
        usrDice = new int[MAX_PLAYER];

        isDeath = true;
        scan = new Scanner(System.in);

        comMoney = START_MONEY;
        usrMoney = START_MONEY;
    }
    private void bettingMoney () {
        System.out.print("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다. 판돈을 입력하시오: ");
        betMoney = scan.nextInt();
    }
    public void gameStart () {
        do {
            bettingMoney();
            runDice();
        } while (isDeath);
    }
    private void runSecondDice() {

    }
    private void runFirstDice(int[] dice) {
        dice[0] = getRandomValue(6, 1);
    }
    private void runDice () {
        usrDice[0] = getRandomValue(6, 1);
        comDice[0] = getRandomValue(6, 1);

        if(usrDice[0] % 2 == 0) {
            usrDice[1] = getRandomValue(6, 1);
        }
        if(comDice[0] % 2 == 0) {
            comDice[1] = getRandomValue(6, 1);
        }



    }
    public int getRandomValue (int range, int startOffset) {
        return (int)(Math.random() * range + startOffset);
    }
}

public class Prob45Answer {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();

        ddg.gameStart();
    }
}