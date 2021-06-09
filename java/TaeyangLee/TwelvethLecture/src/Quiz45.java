import java.util.Scanner;

class Casino{

    final float PERCENT = 0.01f;
    int comDice;
    int userDice;
    int dice1;
    int dice2;
    int usercoin;
    int comcoin ;

    public Casino(){

    }

    public void RollDice() {
        comDice = getRandomDice();
        userDice = getRandomDice();

        if(comDice % 2 != 0 && userDice % 2 != 0 ){
            if(comDice>userDice){
                System.out.println("컴퓨터의 승리! 바로 다음게임으로 갑니다!");
            }else if(userDice>comDice){
                System.out.println("유저의 승리 ! 바로 다음 게임으로 갑니다!");
            }else{
                System.out.println("비겼습니다 주사위를 다시 굴립니다");
                RollDice();
            }
        }

        if(comDice % 2 == 0){
            dice1 = getRandomDice();
            if(dice1 == 1){
                comDice = comDice +3;
            }else if(dice1 == 3){
                userDice = userDice -3;
            }else if(dice1 == 4){
                comDice = 0;
            }else if(dice1 == 6){
                comDice = comDice*2;
            }
        }

        if(userDice % 2 == 0){
            dice2 = getRandomDice();
            if(dice2 == 1){
                userDice = userDice +3;
            }else if(dice2 == 3){
                comDice = comDice -3;
            }else if(dice2 == 4){
                userDice = 0;
            }else if(dice2 == 6){
                userDice = userDice*2;
            }
        }



    }
    public void CalcMoney() {
        int usercoin = 1000;
        int comcoin = 1000;
        int combat;
        int userbat;
        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("컴퓨터가 배팅할 금액을 입력해주세요 :");
            combat = sc.nextInt();
            System.out.println("유저가 배팅할 금액을 입력해주세요 :");
            userbat = sc.nextInt();

            if (userDice > comDice) {
                System.out.println("유저 : "+userDice + " 컴퓨터 : " + comDice);
                comcoin = comcoin - combat;
                usercoin = usercoin + userbat;
                System.out.println("유저가 이겼습니다! 유저의 잔액은 : " + usercoin + "컴퓨터의 잔액은 : " + comcoin);


            }
            if (comDice > userDice) {
                System.out.println("유저 : "+userDice + " 컴퓨터 : " + comDice);
                usercoin = usercoin - userbat;
                comcoin = comcoin + combat;
                System.out.println("컴퓨터가 이겼습니다! 유저의 잔액은 : " + usercoin + "유저의 잔액은 : " + comcoin);

            }

            if(comcoin <=0){
                System.out.println("컴퓨터가 파산했습니다 ! 유저의 승리 입니다 !");
                break;
            }
            if(usercoin <=0){
                System.out.println("유저가 파산했습니다 ! 컴퓨터의 승리 입니다");
                break;
            }
            RollDice();
        }

    }

    int getRandomDice() {
        return (int)(Math.random() * 6 + 1);
    }

}


public class Quiz45 {


    public static void main(String[] args) {

            Casino ca = new Casino();
            ca.RollDice();
            ca.CalcMoney();

    }
}
