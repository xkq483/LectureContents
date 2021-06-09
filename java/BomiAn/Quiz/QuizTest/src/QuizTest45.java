
// 아주 특수한 카지노에 왔다. 현재 내 수중엔 1000만원이 있다.
// 카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
// 상대방이 파산하면 이기는 게임이다.
// 주사위 2개를 사용하는 게임이다. 숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
// 첫 번째 주사위가 짝수가 나온다면 두 번째 주사위를 굴릴 수 있다.
// 두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
// 숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
// 숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
// 숫자 4가 나오면 내 주사위 값이 0이 된다.
// 숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
// (2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
// 누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!

// 1. 상대방 예산 변수/내 예산 변수/ 배팅금 변수 설정/ 사용자와 컴퓨터 다이스  변수
// 2. 스캐너를 이용해서 변수 배팅금에 대입? ++ 2000만원을 초과하면 안되기 때문에 제한 조건 메소드도 만듬
// 3. 합산 결과가 다 나와야 하기 때문에 각각의 다이스슬 만들어 준다
// 4. 2번째 다이스는 특수한 조건이 있기 때문에 조건에 따른 실행 메소드를 만들어 준다
// 5. 결과값을 프린트할 메소드를 만듬
// 6. 메인에서 while 활용하여 게임을 플레이할 메소드를 만듬
// 7. 예산을 다 탕진하거나 1000만원을 획득한다면 while문을 빠져나와 게임을 종료한다.

//?? : while 문에서 if 안쓰고 while(rdg.getcomBudget !=0 || rdg.getuserBudget !=0)라는 조건을 달아
//     자동으로 빠져 나가게 하려고 했는데 안됩니다. 이유좀 설명해주실 수 있을까요?



import java.util.Arrays;
import java.util.Scanner;

class RandomDiceGame {
    Scanner scan;
    int comBudget;
    int userBudget;
    int bettingMoney;
    int[] comDiceArr;
    int comScore;
    int[] userDiceArr;
    int userScore;


   public RandomDiceGame() {
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

    public void comRandDice() {
        comDiceArr = new int[2];
       for (int i = 0; i < 2; i++) {
           comDiceArr[i] = (int)(Math.random() * 6 + 1);
       }
        if(comDiceArr[0] % 2 == 1) {
            comDiceArr[1] = 0;
        }
       comScore = comDiceArr[0] + comDiceArr[1];
    }

    public void userRandDice() {
        userDiceArr = new int[2];
       for (int i = 0; i < 2; i++) {
            userDiceArr[i] = (int)(Math.random() * 6 + 1);
        }
        if(userDiceArr[0] % 2 == 1) {
            userDiceArr[1] = 0;
        }
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


public class QuizTest45 {
    public static void main(String[] args) {

        RandomDiceGame rdg = new RandomDiceGame();
        int i = 0;

        while (true) {
            rdg.inputBettingMoney();
            rdg.limitBettingMoney();

            rdg.userRandDice();
            rdg.comRandDice();

            i++;
            System.out.printf("%d 라운드 랜덤 주사위 게임 결과 : 사용자 %d : %d / 컴퓨터 %d : %d \n", i, rdg.getUserDiceArr()[0], rdg.getUserDiceArr()[1], rdg.getComDiceArr()[0], rdg.getComDiceArr()[1]);

            rdg.userDice2Option();
            rdg.comDice2Option();

            rdg.printResult();

            if(rdg.getComBudget() == 0 || rdg.getUserBudget() == 0) {
                break;
            }
        }
         rdg.printLastResult();
        }
    }

