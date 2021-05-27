import java.util.Scanner;

class DeathDiceGame {

    final int MAX_PLAYER = 2;
    final int DICE_IDX = MAX_PLAYER + 1;
    final int STRART_MONEY = 1000;

    final int FIRST_IDX = 0;
    final int SECOND_IDX = 1;
    final int TOTAL_IDX = 2;

    final int DICE_RANGE = 6;
    final int DICE_START_OFFSET = 1;

    int comMoney;
    int userMoney;
    int betMoney;

    int roundNum;

    Boolean isAlive;
    Scanner sc;

    int[] comDice;
    int[] userDice;

    public DeathDiceGame() {
        roundNum = 0;

        comDice = new int[DICE_IDX];
        userDice = new int[DICE_IDX];

        isAlive = true;
        sc = new Scanner(System.in);

        comMoney = STRART_MONEY;
        userMoney = STRART_MONEY;
    }

    private void bettingMoney() {
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);
        System.out.printf("이게임을 시작한 당신은 끝을 봐야합니다.\n 판돈을 입력하시오 : \n");
        betMoney = sc.nextInt();
    }

    public void gameStart() { //게임 시작 메서드
        do {
            bettingMoney();
            runDice();
            checkMagicDiceSkill();
            whoGetbetMoney();
            checkEachMoney();
            canWeplay();
        }while(true);
    }

    private void checkEachMoney() {
        System.out.printf("사용자의 잔액 : %d, 컴퓨터의 잔액 : %d \n", userMoney, comMoney);
    }

    private void canWeplay() {
        if (comMoney <= 0 || userMoney <= 0) {
            isAlive = false;
        }
    }

    private void whoGetbetMoney() {
        int userToDice = userDice[TOTAL_IDX];
        int comToDice = comDice[TOTAL_IDX];

        if (userToDice > comToDice) {
            System.out.printf("이번판은 사용자가 이겼습니다! %d  %d T : %d(사용자) VS  %d %d T : %d(컴퓨터)\n",
                    userDice[FIRST_IDX],userDice[SECOND_IDX],userToDice,comDice[FIRST_IDX],comDice[SECOND_IDX], comToDice);
        } else if (comToDice > userToDice) {
            System.out.printf("이번판은 컴퓨터가 이겼습니다! %d %d T : %d(컴퓨터) VS %d  %d T : %d(사용자)\n",
                    comDice[FIRST_IDX],comDice[SECOND_IDX], comToDice, userDice[FIRST_IDX],userDice[SECOND_IDX],userToDice);
        } else {
            System.out.printf("무승부 %d(사용자) VS %d(컴퓨터)",
                    userToDice, comToDice);
        }
    }

    private void checkSkill(int[] curDice, int[] targetDice) {
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
                targetDice[TOTAL_IDX] = (targetDice[FIRST_IDX] + targetDice[SECOND_IDX])*2;
                break;
            default:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + curDice[SECOND_IDX];
                break;
        }
    }

    private void checkMagicDiceSkill() {
        checkSkill(userDice, comDice);
        checkSkill(comDice, userDice);
    }

    private void runSecondDice(int[] dice) {
        if (dice[FIRST_IDX] % 2 == 0) {
            dice[SECOND_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
        }
    }

    private void runFirstDice(int[] dice) {
        dice[FIRST_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
    }

    private void runDice() {
        runFirstDice(userDice);
        runFirstDice(comDice);

        runSecondDice(userDice);
        runSecondDice(comDice);
    }
    public int getRandomValue (int range, int starOffset) {
        return (int) (Math.random() * range + starOffset);
    }

}

public class Quiz {
    public static void main(String[] args) {
        DeathDiceGame dg = new DeathDiceGame();
        dg.gameStart();
    }




}