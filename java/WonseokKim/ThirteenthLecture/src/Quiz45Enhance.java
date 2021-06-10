import java.util.Scanner;

class RandomDiceGame2 {
    Scanner scan;
    int comBudget;
    int userBudget;
    int bettingMoney;
    int[] comDiceArr;
    int comScore;
    int[] userDiceArr;
    int userScore;


    public RandomDiceGame2() {
        scan = new Scanner(System.in);
        comBudget = 1000;
        userBudget = 1000;
    }

    public int inputBettingMoney() {
        System.out.print("배팅할 금액을 입력하세요. /(만원) : ");
        bettingMoney = scan.nextInt();
        return bettingMoney;
    }
    public void limitBettingMoney() {
        for(;bettingMoney > userBudget || bettingMoney > comBudget;) {
            System.out.println("정해진 금액을 벗어났습니다. 다시 배팅하세요. ");
            inputBettingMoney();
        }
    }

    public void runMultiDice (int[] diceArr) {
        for (int i = 0; i < diceArr.length; i++) {
            diceArr[i] = (int)(Math.random() * 6 + 1);
        }
        if (diceArr[0] % 2 == 1) {
            diceArr[1] = 0;
        }
    }

    public void comRandDice() {
        comDiceArr = new int[2];
        /*
        for (int i = 0; i < 2; i++) {
            comDiceArr[i] = (int)(Math.random() * 6 + 1);
        }
        if(comDiceArr[0] % 2 == 1) {
            comDiceArr[1] = 0;
        }
         */
        runMultiDice(comDiceArr);
        comScore = comDiceArr[0] + comDiceArr[1];
    }

    public void userRandDice() {
        userDiceArr = new int[2];
        /*
        for (int i = 0; i < 2; i++) {
            userDiceArr[i] = (int)(Math.random() * 6 + 1);
        }
        if(userDiceArr[0] % 2 == 1) {
            userDiceArr[1] = 0;
        }

         */
        runMultiDice(userDiceArr);
        userScore = userDiceArr[0] + userDiceArr[1];
    }

    public void comDice2Option() {
        switch (comDiceArr[1]){
            case 1 :
                comScore += 3;
                break;
            case 3 :
                userScore -= 2;
                break;
            case 4 :
                comScore = 0;
                break;
            case 6 :
                comScore = comScore * 2;
                userScore = userScore * 2;
                break;
            default :
                break;
        }
    }

    public void userDice2Option() {
        switch (userDiceArr[1]){
            case 1 :
                userScore += 3;
                break;
            case 3 :
                comScore -= 2;
                break;
            case 4 :
                userScore = 0;
                break;
            case 6 :
                comScore = comScore * 2;
                userScore = userScore * 2;
                break;
            default :
                break;
        }
    }

    public void printResult() {

        if (comScore > userScore) {
            comBudget += bettingMoney;
            userBudget -= bettingMoney;
            System.out.printf("컴퓨터 승! (사용자) %d vs (컴퓨터) %d 사용자는 배팅금액 %d (만원)을 잃습니다. 현재 남은 금액 = %d(만원)\n", userScore,comScore, bettingMoney, userBudget);
        } else if(comScore < userScore) {
            comBudget -= bettingMoney;
            userBudget += bettingMoney;
            System.out.printf("사용자 승! (사용자) %d vs (컴퓨터) %d 사용자는 배팅금액 %d (만원)을 얻습니다. 현재 남은 금액 = %d(만원)\n", userScore,comScore, bettingMoney, userBudget);
        } else {
            System.out.println( "비겼습니다. 다음 게임을 시작합니다. ");
        }
    }

    public void printLastResult() {

        if (userBudget == 0) {
            System.out.println("사용자는 모든 예산을 다 탕진했습니다. 게임을 자동 종료합니다. ");

        } else if (comBudget == 0) {
            System.out.println("축하합니다! 사용자는 게임에서 승리하여 상대방 배팅액 1000만원을 모두 획득했습니다. ");
        }

    }

    public int[] getComDiceArr() {
        return comDiceArr;
    }

    public int[] getUserDiceArr() {
        return userDiceArr;
    }

    public int getComBudget() {
        return comBudget;
    }

    public int getUserBudget() {
        return userBudget;
    }

}


public class Quiz45Enhance {
    public static void main(String[] args) {

        RandomDiceGame2 rdg = new RandomDiceGame2();
        int i = 0;

        // OR 연산의 특징 앞에서 참이면 뒤는 보지도 않는다.
        // AND는 하나가 참이라도 뒤에것도 참이어야하므로 모두 살펴보게 된다는 부분을 참고!
        while (rdg.getUserBudget() != 0 && rdg.getComBudget() != 0) {
            rdg.inputBettingMoney();
            rdg.limitBettingMoney();

            rdg.userRandDice();
            rdg.comRandDice();

            i++;
            System.out.printf("%d 라운드 랜덤 주사위 게임 결과 : 사용자 %d : %d / 컴퓨터 %d : %d \n",
                    i, rdg.getUserDiceArr()[0], rdg.getUserDiceArr()[1], rdg.getComDiceArr()[0], rdg.getComDiceArr()[1]);

            rdg.userDice2Option();
            rdg.comDice2Option();

            rdg.printResult();
        }
        rdg.printLastResult();
    }
}