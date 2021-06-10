import java.util.Scanner;

class DiceDeathGame {
    final int MAX_PLAYER = 2;
    final int DICE_IDX = MAX_PLAYER + 1;
    final int START_MONEY = 1000;

    final int FIRST_IDX = 0;
    final int SECOND_IDX = 1;
    final int TOTAL_IDX = 2;

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

    public DiceDeathGame () {
        roundNum = 0;

        comDice = new int[DICE_IDX];
        usrDice = new int[DICE_IDX];
        // 각각 다이스방을 3개만든건
        // 퍼스트인덱스 세컨 인덱스 토탈인덱스를 넣게끔 할려고 만든 방이다 그래서 각 정수도 0 ,1 ,2로 표현하신거같다.
        isAlive = true;
        scan = new Scanner(System.in);

        comMoney = START_MONEY;
        usrMoney = START_MONEY;
        // 스타트 머니는 각각1000만원씩
        // 생성자는 초기값만 설정해주는 로직밖에없다.
    }
    private void bettingMoney () {
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);
        System.out.printf("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다.\n" +
                "돈이 부족하면 손모가지나 장기로 대체 가능합니다.\n" +
                "판돈을 입력하시오: ");
        betMoney = scan.nextInt();
    }
    public void gameStart () {
        do {
            bettingMoney();
            runDice();
            checkMagicDiceSkill();
            whoGetBetMoney();
            canWePlay();
            checkEachMoney();
        } while (isAlive);
        // do 한번 실행시키고, while 에 충족되면 계속돌린다 while이 false가 되면 중단한다.
    }
    private void checkEachMoney () {
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", usrMoney, comMoney);
        //마지막으로 뽑는로직 사용자와 컴퓨터간에 현재 돈을  표시해준다.
    }
    private void canWePlay () {
        if (usrMoney <= 0 || comMoney <= 0) {
            isAlive = false;
            // or연산을통해 둘중 한명이 ,돈이 0원이되는순간
            // 게임은 false 가 되어 게임은 중단된다.
        }
    }
    private void whoGetBetMoney () {
        int usrTotDice = usrDice[TOTAL_IDX];
        int comTotDice = comDice[TOTAL_IDX];
        // user의 토탈 인덱스 를 변수 usrTotDice 치환시켜주고,
        // 승부를 가리는 로직이다.
        if (usrTotDice > comTotDice) {
            System.out.printf("이번판은 사용자가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney += betMoney;
            comMoney -= betMoney;
            // 승부났을때 배팅값을 넘겨 주고받는 로직.
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
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + 3;
                break;
            case 3:
                targetDice[TOTAL_IDX] = targetDice[FIRST_IDX] - 2;
                break;
            case 4:
                curDice[TOTAL_IDX] = 0;
                break;
            case 6:
                curDice[TOTAL_IDX] = (curDice[FIRST_IDX] + curDice[SECOND_IDX]) * 2;
                targetDice[TOTAL_IDX] = (targetDice[FIRST_IDX] + targetDice[SECOND_IDX]) * 2;
                break;
            default:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + curDice[SECOND_IDX];
                break;
        }
    }
    private void checkMagicDiceSkill () {
        // 사용자 관점에서의 2번째 주사위 스킬 발동
        checkSkill(usrDice, comDice);
        //  여기서 인자값 userDice와 comDice가있다.
        // 컴퓨터 관점에서의 2번째 주사위 스킬 발동
        checkSkill(comDice, usrDice);
        // 이 인자값 매개변수로 서로 이름만 스위칭 해줬음에,
        // 중복되는 매소드 하나를 지운셈이나 다름없는 깔끔한 매소드활용이다.
    }
    private void runSecondDice (int[] dice) {
        if (dice[FIRST_IDX] % 2 == 0) {
            dice[SECOND_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
        }
    }
    private void runFirstDice (int[] dice) {
        dice[FIRST_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
        //인덱스 0칸에    겟랜덤밸류 를 넣을것이다. 그안에인자값 값을 getRandomvalue에 넣어준다면,
        // getRandomValue는 난수의 주사위하나를 뽑아서. 유저다이스, 컴다이스각각인덱스 0에다가 난수하나를투척한다.
    }
    private void runDice () {
        //usrDice[0] = getRandomValue(6, 1);
        //comDice[0] = getRandomValue(6, 1);
        runFirstDice(usrDice);
        runFirstDice(comDice);
        //런다이스에서는 인자값인 userDice와 comDice를 runFirstDice의 매개변수안에 넣어주려한다.
        //결국 런다이스를 돌리면, userDice [0]과 comDice[0]에 1~6까지의 난수하나를 각각넣는다.


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
        // 여기서 넘겨받는 range는 6 //startOffset은 1결국 랜덤한 주사위를 돌리는 로직
    }
}

public class Prob45Answer {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();

        ddg.gameStart();
    }
}