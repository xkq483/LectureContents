import java.util.Scanner;

class DiceDeathGame {
    final int MAX_PLAYER = 2;       ////게임인원수 설정
    final int DICE_IDX = MAX_PLAYER + 1;       //// 배열 3개   <<< Q. 굳이 3이 아니라 이렇게 + 1 로 표현한 이유가 무엇인가요?
    final int START_MONEY = 1000;     ////종잣돈 설정

    final int FIRST_IDX = 0;
    final int SECOND_IDX = 1;
    final int TOTAL_IDX = 2;

    final int DICE_RANGE = 6;       //// 주사위 범위 설정
    final int DICE_START_OFFSET = 1;       //// 주사위 값이 정수로 나오게 설정

    int comMoney;
    int usrMoney;
    int betMoney;       ////변수 선언

    int roundNum;                //// ?

    Boolean isAlive;
    Scanner scan;       //// 스캔 준비

    int[] comDice;
    int[] usrDice;       //// 주사위 값을 배열에 넣기로 했다. 여기까지가 초기값 설정

    public DiceDeathGame () { // 생성자는 new 연산자를 통해 객체를 생성할 때 반드시 호출이 되고 제일 먼저 실행되는 일종의 메서드라고 생각하면 편하다.
                              // (메서드와 비슷하지 그 의미가 같은 것은 아니다)
                              // 생성자는 멤버 변수를 초기화하는 역할을 한다.
        roundNum = 0;

        comDice = new int[DICE_IDX];
        usrDice = new int[DICE_IDX];        //// 배열 3개 (주사위1값, 2값, 최종값)

        isAlive = true;
        scan = new Scanner(System.in);       //// 스캔 준비

        comMoney = START_MONEY;
        usrMoney = START_MONEY;
    }
    private void bettingMoney () {
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);       //// 라운드수가 증가
        System.out.printf("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다.\n" +
                "돈이 부족하면 손모가지나 장기로 대체 가능합니다.\n" +
                "판돈을 입력하시오: ");
        betMoney = scan.nextInt();       //// 판돈 입력받아 저장하는 매서드
    }
    public void gameStart () {       //// 중재용 매서드
        do {
            bettingMoney();        //// 판돈 받아다가
            runDice();             //// 주사위 돌려
            checkMagicDiceSkill(); //// 스킬 발동
            whoGetBetMoney();      //// 판돈 계산
            canWePlay();           //// 게임 종료 여부 확인
            checkEachMoney();      //// 최종 소지금액 확인
        } while (isAlive);         ////  canWePlay 에서 false 값이 나오면 반복문 종료
    }
    private void checkEachMoney () {       //// 소지금액 확인 매서드
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", usrMoney, comMoney);
    }
    private void canWePlay () {       //// 게임 종료 여부 확인 매서드
        if (usrMoney <= 0 || comMoney <= 0) {
            isAlive = false;       //// 둘 중 하나라도 0 아래면 false 값을 줘서 나감
        }
    }
    private void whoGetBetMoney () {       //// 판돈 계산 매서드
        int usrTotDice = usrDice[TOTAL_IDX];       //// 2번 배열값(최종값) 불러오기
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
    private void checkSkill (int[] curDice, int[] targetDice) {       //// 특수능력 판정 매서드
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
            default:       //// default 넣는 거 주의
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
    private void runSecondDice (int[] dice) {       //// 두 번째 주사위를 돌릴지 말지 정하는 매서드
        if (dice[FIRST_IDX] % 2 == 0) {
            dice[SECOND_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
        }
    }
    private void runFirstDice (int[] dice) {       //// 첫 번재 주사위 돌리는 매서드 실행
        dice[FIRST_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);        //// 아까 초기값 받아왔네
    }
    private void runDice () {
        //usrDice[0] = getRandomValue(6, 1);
        //comDice[0] = getRandomValue(6, 1);
        runFirstDice(usrDice);
        runFirstDice(comDice);
        /*if (usrDice[0] % 2 == 0) {
            usrDice[1] = getRandomValue(6, 1);
        } if (comDice[0] % 2 == 0) {
            comDice[1] = getRandomValue(6, 1);
        }*/
        runSecondDice(usrDice);
        runSecondDice(comDice);
    }
    public int getRandomValue (int range, int startOffset) {       //// 주사위 돌리는 매서드 만들기
        return (int)(Math.random() * range + startOffset);
    }
}

public class Review13_1 {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();
        ddg.gameStart();
    }
}