import java.util.Scanner;

class Dice {
    Scanner sc;
    int com_Dice[] = new int[3];
    int user_Dice[] = new int[3];
    int comMoney = 1000;
    int userMoney = 1000;
    int bet;

    Dice() {
        while (true) {
            if (comMoney <= 0 || userMoney <= 0) {
                break;
            }
            System.out.printf("베팅 금액 : ");
            sc = new Scanner(System.in);
            bet = sc.nextInt();
            calDice();
            System.out.println("컴퓨터");
            FistDice(com_Dice);
            System.out.println("유저");
            FistDice(user_Dice);
            Case6();
            case3();
            System.out.printf("컴퓨터의 총합 %d  Vs 유저의 총합 %d\n", com_Dice[0], user_Dice[0]);
            CalMoney();
        }
    }

    //돈 계산
    void CalMoney() {
        if (com_Dice[0] > user_Dice[0]) {
            comMoney += bet;
            userMoney -= bet;
        } else if (user_Dice[0] > com_Dice[0]) {
            comMoney -= bet;
            userMoney += bet;
        }
        System.out.printf("남은 금액 : %d\n", userMoney);
    }

    //주사위 한번에 계산
    void calDice() {
        for (int i = 0; i < 2; i++) {
            com_Dice[i] = R_Num();
            user_Dice[i] = R_Num();
        }
    }
    //랜덤 수
    int R_Num() {
        int r_Num = (int) (Math.random() * 6 + 1);
        return r_Num;
    }
    //첫번째 주사위
    void FistDice(int[] inputarr) {
        inputarr[0] = R_Num();
        System.out.println(inputarr[0]+" 주사위 값");
            if (inputarr[0] % 2 == 0) {
                SecondDice(inputarr);
                return;
            } else {
                return;
            }
    }
    //두번째 주사위
    void SecondDice(int[] inputarr) {
        inputarr[1] = R_Num();
        System.out.println(inputarr[1]+" 주사위 값");
        switch (inputarr[1]) {
            case 1:
                inputarr[0] = inputarr[0] + 3; //1은 더하기
                break;
            case 2:
                inputarr[0] = inputarr[0] + 2 ;
                break;
            case 3:
                inputarr[2] = 8;// 상대방 -2
                break;
            case 4:
                inputarr[0] = 0; // 나오면 0됨
                break;
            case 5:
                inputarr[0] = inputarr[0] + 5;
                break;
            case 6:
                inputarr[1] = 7; //2배 한번에하기위한 표시
                break;
        }
    }

    //두번째 주사위 6값 처리
    void Case6() {
        if (com_Dice[1] == 7) {
            com_Dice[0] = com_Dice[0]*2;
            user_Dice[0] = user_Dice[0]*2;
        }
        if (user_Dice[1] == 7) {
            com_Dice[0] = com_Dice[0]*2;
            user_Dice[0] = user_Dice[0]*2;
        }
    }

    //두번째 주사위 3값 처리
    void case3() {
        if (com_Dice[2] == 8) {
            user_Dice[0] = user_Dice[0]-2;
        }
        if (user_Dice[2] == 8) {
            com_Dice[0] = com_Dice[0]-2;
        }
    }
}

public class CasinoGame {
    public static void main(String[] args) {
        Dice dc = new Dice();

    }

}
