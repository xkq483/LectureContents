/*
아주 특수한 카지노에 왔다.
현재 내 수중엔 1000만원이 있다.
카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
상대방이 파산하면 이기는 게임이다.
주사위 2개를 사용하는 게임이다.
숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
숫자 4가 나오면 내 주사위 값이 0이 된다.
숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
(2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!

컴퓨터 돈, 내 돈, 판돈, 뽕빨 났는지 여부, 키보드 입력, 주사위 2개 사용
첫번째 주사위가 짝수가 아니면 두번째 주사위 사용 불가
두번째 주사위는 특수 스킬이 존재함
승패 판정은 두 개의 주사위 값의 합산으로 판정
 */

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
    private void runDice () {



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
