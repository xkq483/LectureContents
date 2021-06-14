import java.util.Scanner;

public class Prob45try {
    public static void main(String[] args) {
        int myMoney = 1000;
        int comMOney = 1000;

        Scanner scan = new Scanner(System.in);
        System.out.println("배팅금을 입력해주세요. (1 ~ 1000)");
        int betting = scan.nextInt();
        if(betting > 1000) {
            System.out.println("배팅금 초과");
        }else if(betting < 1){
            System.out.println("0 보다 큰 수를 입력하시오.");
        }else{
            System.out.println("게임을 시작합니다.");
            int myDice = (int)(Math.random()*6+1);
            int comDice = (int)(Math.random()*6+1);
            System.out.printf("컴퓨터 : %d , 내 주사위 : %d\n", myDice,comDice);

            if(myDice%2 == 0){
                System.out.println("내가 2번째 주사위를 굴립니다.");
                int myDice2 = (int)(Math.random()*6+1);
                switch (myDice2){
                    case 1 : myDice = myDice + 3;
                    break;
                    case 2 : myDice = myDice + myDice2;
                    break;
                    case 3 : comDice = comDice - 2;
                    break;
                    case 4 : myDice = 0;
                    break;
                    case 5 : myDice = myDice + myDice2;
                    break;
                    case 6 : myDice *= 2; comDice *=2;
                    break;
                }
            }else if(comDice%2 == 0){

            }
        }
    }
}
