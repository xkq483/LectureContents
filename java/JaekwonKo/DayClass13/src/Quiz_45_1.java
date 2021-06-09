import java.util.Scanner;

class DiceDeathGame {
    final int MAX_PLAYER = 2;
    final int DICE_IXD = MAX_PLAYER + 1;
    final int START_MONEY = 1000;

    final int FIRST_IDX = 0;
    final int SECIND_IDX = 1;
    final int TOTAL_IDX = 2;

    final int DICE_RANGE = 6;
    final int DICE_OFFSET = 1;

    int comMooney;
    int userMoney;
    int betMoney;

    int roundNum;

    Boolean isAlive;
    Scanner scan;


    //한번에 몰아서 처리하려는 뜻!
    int[] comDice;
    int[] userDice;

    // 초기화로써의 역할
    public DiceDeathGame() {
        roundNum = 0;

        comDice = new int[DICE_IXD];
        userDice = new int[DICE_IXD];

        isAlive = true;
        scan = new Scanner(System.in);

        comMooney = START_MONEY;
        userMoney = START_MONEY;
    }

    private void bettingMoney() {
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);
        System.out.print("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다.\n" + "돈이 모자르면 손모가지나 장기로 대체 가능합니다.\n" + "판돈을 입력하시오: ");
        betMoney = scan.nextInt();
    }

    // 중재자의 역할
    public void gameStart() {
        do {
            bettingMoney();
            runDice();
            checkMagicDiceSkill();
            whoGetBetMoney();
            canWePlay();
            checkEachMoney();
        } while (isAlive);
    }
    private void checkEachMoney() {
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", userMoney,comMooney);
    }
    private void canWePlay () {
        if(userMoney <= 0 || comMooney <= 0) {
            isAlive = false;
        }
    }
    private  void whoGetBetMoney () {
        int userTotDice = userDice[TOTAL_IDX];
        int comTotDice = comDice[TOTAL_IDX];

        if (userTotDice > comTotDice) {
            System.out.printf("이번판은 사용자가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n", userTotDice,comTotDice);
            userMoney += betMoney;
            comMooney -= betMoney;
        }else if (userTotDice < comTotDice) {
            System.out.printf("이번판은 컴퓨터가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n", userTotDice,comTotDice);
            userMoney -= betMoney;
            comMooney += betMoney;
        }else {
            System.out.printf("승부가 나지 않았습니다! %d(사용자) vs %d(컴퓨터)\n", userTotDice,comTotDice);
        }
    }

    private void checkSkill(int[] curDice, int[] targetDice) {
        switch (curDice[SECIND_IDX]) {
            case 1 :
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + 3;
                break;
            case 3 :
                targetDice[TOTAL_IDX] = targetDice[FIRST_IDX] - 2;
                break;
            case 4:
                curDice[TOTAL_IDX] = 0;
                break;
            case 6 :
                curDice[TOTAL_IDX] = (curDice[FIRST_IDX] + curDice[SECIND_IDX]) * 2;
                targetDice[TOTAL_IDX] = (targetDice[FIRST_IDX] + targetDice[SECIND_IDX]) * 2;
                break;
            default:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + curDice[SECIND_IDX];
                break;
        }
    }
    private void checkMagicDiceSkill() {
        // 사용자 관점에서의 2번째 주사위 스킬 발공
        checkSkill(userDice, comDice);
        // 컴퓨터 관점에서의 2번째 주사위 스킬 발동
        checkSkill(comDice, userDice);
        }

    private void runSecondDice(int[] dice) {
        if (dice[0] % 2 == 0 ){
            dice[1] = getRandomValue(DICE_RANGE,DICE_OFFSET);
        }
    }
    private void runFirstDice(int[] dice) {
        dice[0] = getRandomValue(DICE_RANGE,DICE_OFFSET);
    }

    private void runDice () {
       runFirstDice(userDice);
       runFirstDice(comDice);
       runSecondDice(userDice);
       runSecondDice(comDice);
    }
    public int getRandomValue(int range, int starOffset) {
        return (int)(Math.random() * range + starOffset);
    }
}




public class Quiz_45_1 {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();

        ddg.gameStart();
    }
}
