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

// 질문 : switch문이 사용된 checkSkill과 checkMagicDiceSkill 영역의 전체적인 역할은 알겠는데
//       각 변수의 역할과 어떤 동작순서로 작동되는건지 구체적으로 이해하고 싶습니다


import java.util.Scanner;

class DiceDeathGame2 {
    final int MAX_PLAYER = 2; // 플레이어 2명
    final int DICE_IDX = MAX_PLAYER + 1; // 주사위 인덱스 : 첫,두번째 값과 합한 값까지 3개 들어가야해서 MAX_PLAYER + 1
    final int START_MONEY = 1000; // 시작금액

    // 주사위배열의 인덱스지정
    final int FIRST_IDX = 0;
    final int SECOND_IDX = 1;
    final int TOTAL_IDX = 2;

    // 주사위굴려서 나올 최소,최대값
    final int DICE_RANGE = 6;
    final int DICE_START_OFFSET = 1;

    int comMoney; // 보유머니
    int usrMoney;
    int betMoney; // 배팅머니

    int roundNum; // 현재 라운드 담을 변수

    Boolean isAlive; // isAlive 변수를 true 해주기 위함
    Scanner scan;

    // 두번 굴린 주사위를 배열로 담을 변수
    int[] comDice;
    int[] usrDice;


    // 생성자 영역
    public DiceDeathGame2 () {
        roundNum = 0; // 라운드 초기화

        comDice = new int[DICE_IDX];
        usrDice = new int[DICE_IDX];

        isAlive = true;
        scan = new Scanner(System.in);

        comMoney = START_MONEY; // 보유금액을 시작금액(1000)으로 초기화
        usrMoney = START_MONEY;
    }

    // 배팅머니 입력
    private void bettingMoney () {
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);
        System.out.printf("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다.\n" +
                "돈이 부족하면 손모가지나 장기로 대체 가능합니다.\n" +
                "판돈을 입력하시오: ");
        betMoney = scan.nextInt();
    }

    // do while 반복문 : do {} 안의 코드는 무조건 한번은 실행한 후에 조건식(while)보고 반복한다
    // isAlive = true;를 선언했던 isAlive가 false 될 때까지 반복한다
    public void gameStart () {
        do {
            bettingMoney();
            runDice();
            checkMagicDiceSkill();
            whoGetBetMoney();
            canWePlay();
            checkEachMoney();
        } while (isAlive);
    }

    // 라운드끝날때마다 출력될 현재 보유머니 메소드
    private void checkEachMoney () {
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", usrMoney, comMoney);
    }

    // 보유머니 0이하일때 isAlive를 true -> false로 바꾸는 메소드
    private void canWePlay () {
        if (usrMoney <= 0 || comMoney <= 0) {
            isAlive = false;
        }
    }

    // 주사위 합 비교, 승패자 출력, 배팅머니 분배 메소드
    private void whoGetBetMoney () {
        int usrTotDice = usrDice[TOTAL_IDX];
        int comTotDice = comDice[TOTAL_IDX];

        if (usrTotDice > comTotDice) {
            System.out.printf("이번판은 사용자가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney += betMoney;
            comMoney -= betMoney;
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

    // 특수능력 주사위 메소드
   private void checkSkill (int[] curDice, int[] targetDice) { // 매개변수 curDice,targetDice에 값을 입력받아 내보낼 준비
        switch (curDice[SECOND_IDX]) {
            case 1:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + 3; // 1이 나오면 내 첫번째 주사위 값 + 3
                break;
            case 3:
                targetDice[TOTAL_IDX] = targetDice[FIRST_IDX] - 2; // 3이 나오면 상대방 첫번째 주사위 값 - 2
                break;
            case 4:
                curDice[TOTAL_IDX] = 0; // 4가 나오면 내 주사위 값 0
                break;
            case 6:
                curDice[TOTAL_IDX] = (curDice[FIRST_IDX] + curDice[SECOND_IDX]) * 2; // 6이 나오면 각자 첫,두번째 주사위 합 * 2
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
        // 컴퓨터 관점에서의 2번째 주사위 스킬 발동
        checkSkill(comDice, usrDice);
    }

    // 두번째 주사위
    private void runSecondDice (int[] dice) {
        if (dice[FIRST_IDX] % 2 == 0) {
            dice[SECOND_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
        }
    }

    // 첫번째 주사위
    private void runFirstDice (int[] dice) {
        dice[FIRST_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
    }

    // ↑에서 나온 첫,두번째 주사위 값을 배열에 담을거임
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

    // 주사위 1 ~ 6 나오기 위함
    public int getRandomValue (int range, int startOffset) {
        return (int)(Math.random() * range + startOffset);
    }
}

public class review_Prob45 {
    public static void main(String[] args) {
        DiceDeathGame2 ddg = new DiceDeathGame2();

        ddg.gameStart();
    }
}