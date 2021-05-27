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
    final int MAX_PLAYER = 2; //플레이어 수
    final int DICE_IDX = MAX_PLAYER + 1;
    final int START_MONEY = 1000;

    final int FIRST_IDX = 0; //첫번째 주사위값
    final int SECOND_IDX = 1;//두번째 주사위값
    final int TOTAL_IDX = 2;//두 주사위값의 합

    final int DICE_RANGE = 6;
    final int DICE_START_OFFSET = 1;

    int comMoney;
    int usrMoney;
    int betMoney;

    int roundNum;

    Boolean isAlive;
    Scanner scan;

    int[] comDice;
    int[] usrDice;

    public DiceDeathGame () { //초기화의 역할
        roundNum = 0;

        comDice = new int[DICE_IDX];
        usrDice = new int[DICE_IDX];

        isAlive = true;
        scan = new Scanner(System.in);

        comMoney = START_MONEY;
        usrMoney = START_MONEY;
    }
    private void bettingMoney () {
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);
        System.out.printf("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다.\n" +
                "돈이 부족하면 손모가지나 장기로 대체 가능합니다.\n" +
                "판돈을 입력하시오: ");
        betMoney = scan.nextInt();
    }
    public void gameStart () { //메서드 호출에 대한 중재를 함
        do {
            bettingMoney();//이순서대로 가야함
            runDice(); //생성자에 넣어도 되지만 각각의 목적이 중복됨 그래서 나눠줌
            checkMagicDiceSkill();
            whoGetBetMoney();
            canWePlay();
            checkEachMoney();
        } while (isAlive); //false
    }
    private void checkEachMoney () { //현재 돈을 알려줌
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", usrMoney, comMoney);
    }
    private void canWePlay () { //돈이 0보다 같거나 작아지면 플레이 끝
        if (usrMoney <= 0 || comMoney <= 0) {
            isAlive = false;
        }
    }
    private void whoGetBetMoney () {
        int usrTotDice = usrDice[TOTAL_IDX];
        int comTotDice = comDice[TOTAL_IDX];

        if (usrTotDice > comTotDice) { //유저 합(숫자)이 더크면 이김
            System.out.printf("이번판은 사용자가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney += betMoney; //배팅한돈 유저돈에 합산
            comMoney -= betMoney; //컴터에서 배팅머니 빼감
        } else if (usrTotDice < comTotDice) {
            System.out.printf("이번판은 컴퓨터가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney -= betMoney;
            comMoney += betMoney;
        } else {
            System.out.printf("승부가 나지 않았습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
        }
    }
    private void checkSkill (int[] curDice, int[] targetDice) {
        switch (curDice[SECOND_IDX]) {
            case 1:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + 3;//1+3을 총합에 넣어줌
                break;
            case 3:
                targetDice[TOTAL_IDX] = targetDice[FIRST_IDX] - 2; //컴터 첫 주사위 굴린 값에 -2
                break;
            case 4:
                curDice[TOTAL_IDX] = 0;//내주사위값이 0
                break;
            case 6: //각자 만든 주사위 값을 2배로 뻥튀기
                curDice[TOTAL_IDX] = (curDice[FIRST_IDX] + curDice[SECOND_IDX]) * 2;
                targetDice[TOTAL_IDX] = (targetDice[FIRST_IDX] + targetDice[SECOND_IDX]) * 2;
                break;
            default:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + curDice[SECOND_IDX];//첫번째와 두번째 굴린 주사위값의 합
                break;
        }
    }
    private void checkMagicDiceSkill () {
        // 사용자 관점에서의 2번째 주사위 스킬 발동
        checkSkill(usrDice, comDice);
        // 컴퓨터 관점에서의 2번째 주사위 스킬 발동
        checkSkill(comDice, usrDice);
    }
    private void runSecondDice (int[] dice) {
        if (dice[FIRST_IDX] % 2 == 0) {//두번째 주사위를 실행하기 위한 조건
            dice[SECOND_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
        }
    }
    private void runFirstDice (int[] dice) {
        dice[FIRST_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
    }
    private void runDice () {
        //usrDice[0] = getRandomValue(6, 1);
        //comDice[0] = getRandomValue(6, 1);
        runFirstDice(usrDice);
        runFirstDice(comDice);

        /*
        if (usrDice[0] % 2 == 0) {
            usrDice[1] = getRandomValue(6, 1);
        }
        if (comDice[0] % 2 == 0) {
            comDice[1] = getRandomValue(6, 1);
        }
         */
        runSecondDice(usrDice);
        runSecondDice(comDice);
    }
    public int getRandomValue (int range, int startOffset) {
        return (int)(Math.random() * range + startOffset);
    }
}

public class Quiz45Answer {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();

        ddg.gameStart();
    }
}

//여러개가 있으니 헷갈린다 어떻게 한번에 위치를 기억하고 코드를 짤 수 있는지
//많이 복습해서 구조를 많이 익혀야겠다