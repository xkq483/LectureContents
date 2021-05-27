import java.util.Scanner;

/*
1. 각자 지갑에는 1000만원이 있다.
2. 판돈은 scanner를 통해 입력받는다.
3. 주사위 2개가 필요하며
4. 첫번째 주사위 조건 : 짝수가 나온 경우만 두번째 주사위를 굴릴 수 있다
5. 두번째 주사위 조건 : 1이 나오면 내 주사위 값 +3
                     3이 나오면 상대방 주사위 값 -2
                     4가 나오면 내 주사위 값 0
                     6이 나오면 상대와 나 모두, 두 주사위 합산값 *2


                     사용자 지갑, 컴퓨터 지갑, 베팅입력기, 주사위 2개,
                     배팅입력,두 주사위의 조건,컴퓨터 턴, 사용자 턴, 승부에 따른 금액변동

 */
class DiceGame{

    int[] comDice;
    int[] userDice;
    int comPay;
    int userPay;
    int betMoney;
    int comTotalDice;
    int userTotalDice;
    boolean isTure;
    Scanner scan;

    //    초기값
    public DiceGame(){
        scan = new Scanner(System.in);
        comDice = new int[2]; //첫번째 주사위
        userDice = new int[2];
        comPay = 1000;
        userPay = 1000;
    }
    public void raceStart(){
        isTure = true;
        System.out.println("컴퓨터와 사용자의 주사위 게임을 시작합니다.");

        while (isTure) {
            inputBetNum();
            turnComDice();
            turnUserDice();
            whoIsWin();
            wallet();
        }
    }
    //   승부에 따른 금액변동
    public void whoIsWin(){
        if(comTotalDice  > userTotalDice){
            userPay -= betMoney;
            comPay += betMoney;
            System.out.printf("컴퓨터의 승리입니다. %d(컴퓨터) VS %d(사용자)\n", comTotalDice, userTotalDice);
        } else if( comTotalDice < userTotalDice) {
            userPay += betMoney;
            comPay -= betMoney;
            System.out.printf("사용자의 승리입니다. %d(컴퓨터) VS %d(사용자)\n",comTotalDice, userTotalDice);
        } else {
            System.out.printf("무승부입니다. %d(컴퓨터) VS %d(사용자)\n",comTotalDice, userTotalDice);
        }
        if(comPay <= 0 || userPay <= 0 ){
            System.out.print("게이머의 파산으로 게임을 종료합니다.");
            isTure = false;
        }
    }
    // 컴퓨터 주사위
    public void turnComDice(){
        System.out.println("==컴퓨터 차례입니다.==");
        for(int i = 0; i < 2; i++) {
            comDice[i] = (int) (Math.random() * 6 + 1);
            System.out.printf("%d번째 주사위의 값은 =%d\n", i + 1, comDice[i]);

            if (comDice[0] % 2 != 0) {
                System.out.println("첫번째 주사위 값이 홀수임으로 차례를 끝냅니다.");
                comTotalDice = comDice[0];
                break;
            }
            if (i == 1) {
                switch (comDice[1]) {
                    case 1:
                        System.out.println("두번째 주사위 효과로 +3");
                        comTotalDice = comDice[0] + 3;
                        break;
                    case 3:
                        System.out.println("두번째 주사위 효과로 상대방 주사위 값 -2");
                        userTotalDice = userDice[0] - 2;
                        break;
                    case 4:
                        System.out.println("두번째 주사위 효과로 모든 값은 0이 됩니다.");
                        comTotalDice = 0;
                        break;
                    case 6:
                        System.out.println("두번째 주사위 효과로 두 주사위 값의 합이 두배가 됩니다.");
                        comTotalDice = (comDice[0] + comDice[1]) * 2;
                        break;
                    default:
                        comTotalDice = comDice[0] + comDice[1];
                        System.out.printf("%d(첫번째) + %d(두번째) = %d\n", comDice[0], comDice[1], comTotalDice);
                        break;
                }
            }
        }
    }

    public void turnUserDice(){
        System.out.println("==사용자 차례입니다.==");

        for(int i = 0; i < 2; i++){
            userDice[i] = (int)(Math.random() * 6 + 1);
            System.out.printf("%d번째 주사위의 값은 =%d\n",i+1, userDice[i]);

            if(userDice[0] % 2 !=0){
                System.out.println("첫번째 주사위 값이 홀수임으로 차례를 끝냅니다.");
                userTotalDice = userDice[0];
                break;
            }
            if(i==1) {
                switch (userDice[1]) {
                    case 1:
                        System.out.println("두번째 주사위 효과로 +3");
                        userTotalDice = userDice[0] + 3;
                        break;
                    case 3:
                        System.out.println("두번째 주사위 효과로 상대방 주사위 값 -2");
                        comTotalDice = comDice[0] - 2;
                        break;
                    case 4:
                        System.out.println("두번째 주사위 효과로 모든 값은 0이 됩니다.");
                        userTotalDice = 0;
                        break;
                    case 6:
                        System.out.println("두번째 주사위 효과로 두 주사위 값의 합이 두배가 됩니다.");
                        userTotalDice = (userDice[0] + userDice[1]) * 2;
                        break;
                    default:
                        userTotalDice = userDice[0] + userDice[1];
                        System.out.printf("%d(첫번째) + %d(두번째) = %d\n", userDice[0], userDice[1], userTotalDice);
                        break;
                }
            }
        }
    }
    //    베팅값
    public void inputBetNum(){
        System.out.print("얼마를 베팅하시겠습니까? : ");
        betMoney = scan.nextInt();
    }
    public void wallet(){
        System.out.printf("현재 잔액은 컴퓨터 %d만원, 사용자 %d만원입니다.\n",comPay,userPay);
    }
}
public class Quiz45_Re {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();
        dg.raceStart();
    }
}

