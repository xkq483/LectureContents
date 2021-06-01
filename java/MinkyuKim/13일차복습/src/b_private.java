import java.util.Scanner;

class DiceDeathGame {
    final int MAX_DICE = 2;
    // 주사위 갯수를 의미,
    final int DICE_IDX = MAX_DICE + 1;
    // 배열의 시작은 0부터니까 +1 . total_idx를 사용하려면 +1을 해줘야함.
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
        //주사위 1, 2,3 (배열상 0, 1, 2 인덱스)
        // 즉, comDice, userDice에 대한 공간을 3칸 생성하라. 2칸이하일시에는 에러가 발생(공간부족) 따라서 TOTAL_IDX가 들어갈 수없음
        // 무조건 4개 이상의 공간이 있어야, 첫번째 주사위, 두번재 주사위, 주사위의 합산값이 출력될 수 있음.

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
    private void checkEachMoney () {
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", usrMoney, comMoney);
    }
    private void canWePlay () {
        if (usrMoney <= 0 || comMoney <= 0) {
            isAlive = false;
        }
    }
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
        // 컴퓨터 관점에서의 2번째 주사위 스킬 발동
        checkSkill(comDice, usrDice);
    }
    private void runSecondDice (int[] dice) {
        if (dice[FIRST_IDX] % 2 == 0) {
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
public class b_private {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();
        ddg.gameStart();
    }
}