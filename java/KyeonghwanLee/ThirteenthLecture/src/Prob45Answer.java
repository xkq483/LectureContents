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
    final int MAX_PLAYER = 2;//플레이어 수
    final int DICE_IDX = MAX_PLAYER + 1;//다이스 인덱스 - 왜 플레이어 수에 +1을 한걸까요?
    final int START_MONEY = 1000;// 초기 보유하고 있는 돈 설정

    final int FIRST_IDX = 0; // 첫번째 인덱스
    final int SECOND_IDX = 1;// 두번째 인덱스
    final int TOTAL_IDX = 2;// 합친 값 인덱스

    final int DICE_RANGE = 6; //주사위 범위
    final int DICE_START_OFFSET = 1; // 주사위 시작값

    int comMoney; // 컴퓨터 돈 변수
    int usrMoney; // 사용자 돈 변수
    int betMoney; // 베팅 돈 변수

    int roundNum; // 라운드 변수

    Boolean isAlive; //While 루프 사용을 위한 Boolean
    Scanner scan;// 입력을 받기 위한 Scanner

    int[] comDice; // 컴퓨터 주사위 배열 선언
    int[] usrDice; // 사용자 주사위 배열 선언

    public DiceDeathGame () {// 생성자 초기값 설정
        roundNum = 0;

        comDice = new int[DICE_IDX];
        usrDice = new int[DICE_IDX];

        isAlive = true;
        scan = new Scanner(System.in);

        comMoney = START_MONEY;
        usrMoney = START_MONEY;
    }
    private void bettingMoney () {//배팅값 숫자 입력
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);
        System.out.printf("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다.\n" +
                "돈이 부족하면 손모가지나 장기로 대체 가능합니다.\n" +
                "판돈을 입력하시오: ");
        betMoney = scan.nextInt();
    }
    public void gameStart () {//메인에서 메서드로 정리하지않고 실행 메서드로 메인을 깔끔하게 정리함
        do {
            bettingMoney();
            runDice();
            checkMagicDiceSkill();
            whoGetBetMoney();
            checkEachMoney();
            canWePlay();//게임 지속 여부 메서드를 마지막으로 옮겨도 실행에 이상은 없다.
            //해당 메서드들을 우선 실행시키고  while로 종료
        } while (isAlive);
    }
    private void checkEachMoney () { //잔액 점검을위한 메서드
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", usrMoney, comMoney);
    }
    private void canWePlay () { //사용자 혹은 컴퓨터의 돈이 0아래로 내려갈시 게임은 종료된다.
        if (usrMoney <= 0 || comMoney <= 0) {
            isAlive = false;
        }
    }
    private void whoGetBetMoney () {//승패에 따른 베팅 머니를 누가 가질지에 대한 메서드
        int usrTotDice = usrDice[TOTAL_IDX];
        int comTotDice = comDice[TOTAL_IDX];

        if (usrTotDice > comTotDice) {
            System.out.printf("이번판은 사용자가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney += betMoney;//유저가 이길 경우 기존 보유 돈에 베팅머니 플러스(유저)
            comMoney -= betMoney;//유저가 이길 경우 기존 보유 돈에 베팅머니 마이너스(컴)
        } else if (usrTotDice < comTotDice) {
            System.out.printf("이번판은 컴퓨터가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney -= betMoney;//유저가 질 경우 기존 보유 돈에 베팅머니 마이너스(유저)
            comMoney += betMoney;//유저가 질 경우 기존 보유 돈에 배팅머니 플러스(컴)
        } else {
            System.out.printf("승부가 나지 않았습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);//무승부의 경우 값은 변동하지 않는다.
        }
    }
    private void checkSkill (int[] curDice, int[] targetDice) {//두번쨰 주사위의 값에 따른 경우의 수 설정
        switch (curDice[SECOND_IDX]) {
            case 1://1이 나온경우 내 주사의 값에 + 3이 된다.
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + 3;//
                break;
            case 3://3이 나온경우 상대방 주사위 값이 -2 가 된다.
                targetDice[TOTAL_IDX] = targetDice[FIRST_IDX] - 2;
                break;
            case 4://4가 나온경우 내 다이스의 총값이 0이 된다.
                curDice[TOTAL_IDX] = 0;
                break;
            case 6://6이 나올 경우 첫번째 다이스 값과 두번째 다이스 합의 2배가 적용된다
                curDice[TOTAL_IDX] = (curDice[FIRST_IDX] + curDice[SECOND_IDX]) * 2;
                targetDice[TOTAL_IDX] = (targetDice[FIRST_IDX] + targetDice[SECOND_IDX]) * 2;
                break;
            default://특수 스킬 숫자에 해당하지 않는 디폴트 값 (2,5가 나올경우)
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + curDice[SECOND_IDX];
                break;
        }
    }
    private void checkMagicDiceSkill () {//checkSkill 매서드에 두번쨰 주사위의 사용자관점과 컴퓨터 관점에서의 주사위를 대입하는 정리 메서드
        // 사용자 관점에서의 2번째 주사위 스킬 발동
        checkSkill(usrDice, comDice);
        // 컴퓨터 관점에서의 2번째 주사위 스킬 발동
        checkSkill(comDice, usrDice);
    }
    private void runSecondDice (int[] dice) {//두번쨰 주사위를 굴리는것
        if (dice[FIRST_IDX] % 2 == 0) {
            dice[SECOND_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
        }
    }
    private void runFirstDice (int[] dice) {//첫번쨰 주사위를 굴리는것
        dice[FIRST_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
    }
    private void runDice () { //첫번째 두번째주사위 굴리는것을 하나의 메서드로  합쳤다.
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
    public int getRandomValue (int range, int startOffset) {//1~6의 값이 나오는 주사위 값 설정
        return (int)(Math.random() * range + startOffset);// 주사위값 반환
    }
}

public class Prob45Answer {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();

        ddg.gameStart();//실행 메서드를 이용한 메인 간소화
    }
}

// 코딩 작성시에 데이터, 기능을 구현할 메서드를 분류하는 작업을 하여 순차적으로 코딩을 진행을 해야 되는데 아직까지 너무 어렵네요....