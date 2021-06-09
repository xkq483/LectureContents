import java.util.Arrays;
import java.util.Scanner;

class RandomDiceGame2 {

    final int START_MONEY = 1000;
    final int FIRST_IDX = 0;
    final int SECOND_IDX = 1;
    final int TOTAL_IDX = 2;

    Scanner scan;
    int comBudget;
    int userBudget;
    int bettingMoney;
    int[] comDiceArr;
    int[] userDiceArr;

    Boolean isAlive;


    public RandomDiceGame2() {
        scan = new Scanner(System.in);
        comBudget = START_MONEY;
        userBudget = START_MONEY;

        comDiceArr = new int[3];
        userDiceArr = new int[3];

        isAlive = true;

    }

    public void gameStart() {
        do {
            inputBettingMoney();
            limitBettingMoney();
            runMultiRandomDice();
            System.out.printf("comDice = %d : %d userDice = %d : %d \n", comDiceArr[FIRST_IDX], comDiceArr[SECOND_IDX], userDiceArr[FIRST_IDX], userDiceArr[SECOND_IDX]);
            runDice2Option();
            printResult();
            printLastResult();
        } while (isAlive);
    }

    private int inputBettingMoney() {
        System.out.print("배팅할 금액을 입력하세요. /(만원) : ");
        bettingMoney = scan.nextInt();
        return bettingMoney;
    }
    private void limitBettingMoney() {
        for(;bettingMoney > userBudget || bettingMoney > comBudget;) {
            System.out.println("정해진 금액을 벗어났습니다. 다시 배팅하세요. ");
            inputBettingMoney();
        }
    }

    private void multiRandomDice(int[] diceArr, int totalScore) {
        for (int i = 0; i < diceArr.length; i++) {
            diceArr[i] = (int)(Math.random() * 6 + 1);
        }
        if (diceArr[FIRST_IDX] % 2 == 1) {
            diceArr[SECOND_IDX] = 0;
        }
        diceArr[TOTAL_IDX] = diceArr[FIRST_IDX] + diceArr[SECOND_IDX];
    }

    private void runMultiRandomDice() {
        multiRandomDice(userDiceArr, userDiceArr[TOTAL_IDX]);
        multiRandomDice(comDiceArr, comDiceArr[TOTAL_IDX]);
    }

    private void multiDice2Option(int[] curDice, int[] targetDice) {
        switch (curDice[SECOND_IDX]){
            case 1 :
                 curDice[TOTAL_IDX] += 3;
                break;
            case 3 :
                 targetDice[TOTAL_IDX] -= 2;
                break;
            case 4 :
                curDice[TOTAL_IDX] = 0;
                break;
            case 6 :
                curDice[TOTAL_IDX] = curDice[TOTAL_IDX] * 2;
                targetDice[TOTAL_IDX] = targetDice[TOTAL_IDX] * 2;
                break;
            default :
                break;
        }

    }

    private void runDice2Option() {
        multiDice2Option(userDiceArr, comDiceArr);
        multiDice2Option(comDiceArr, userDiceArr);

    }

    private void printResult() {

        if (comDiceArr[TOTAL_IDX] > userDiceArr[TOTAL_IDX]) {
            comBudget += bettingMoney;
            userBudget -= bettingMoney;
            System.out.printf("컴퓨터 승! (사용자) %d vs (컴퓨터) %d 사용자는 배팅금액 %d (만원)을 잃습니다. 현재 남은 금액 = %d(만원)\n", userDiceArr[2],comDiceArr[2], bettingMoney, userBudget);
        } else if(comDiceArr[TOTAL_IDX] < userDiceArr[TOTAL_IDX]) {
            comBudget -= bettingMoney;
            userBudget += bettingMoney;
            System.out.printf("사용자 승! (사용자) %d vs (컴퓨터) %d 사용자는 배팅금액 %d (만원)을 얻습니다. 현재 남은 금액 = %d(만원)\n", userDiceArr[2],comDiceArr[2], bettingMoney, userBudget);
        } else {
            System.out.println( "비겼습니다. 다음 게임을 시작합니다. ");
        }
    }

    public void printLastResult() {

        if (userBudget == 0) {
            System.out.println("사용자는 모든 예산을 다 탕진했습니다. 게임을 자동 종료합니다. ");
            isAlive = false;

        } else if (comBudget == 0) {
            System.out.println("축하합니다! 사용자는 게임에서 승리하여 상대방 배팅액 1000만원을 모두 획득했습니다. ");
            isAlive = false;
        }

    }

}


public class QuizTest45Enhance {
    public static void main(String[] args) {

        RandomDiceGame2 rdg2 = new RandomDiceGame2();

        rdg2.gameStart();


    }
}

