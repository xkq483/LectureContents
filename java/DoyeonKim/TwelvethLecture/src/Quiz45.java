//서로 맨처음 배팅비 천만원 정해주기
// 스캐너로 배팅 비율을 입력받는다

//숫자가 높으면 이김
//첫번째는 짝수 나온 후 두번째를 굴릴 수 있다
//컴터의 돈이 0이되면 사용자가 이겼습니다 출력
//유저의 돈이 0이 되면 컴퓨터가 이겼습니다 출력

import java.util.Scanner;

class Casino {
    int comDice;
    int userDice;
    int comMoney = 1000;
    int userMoney = 1000;
    int betting;



    public void betting() { //베팅을 어떻게 먼저 실행시키는지 모르겠다..
        Scanner scan = new Scanner(System.in);
        int comBetting;


        int uesrBetting;
        System.out.println("1000만원에서 원하는 만큼 배팅해주세요");
        uesrBetting = scan.nextInt();
        userMoney = userMoney - uesrBetting;
        System.out.printf("현재 남은 돈은 %d만원 입니다.\n", userMoney);



        comBetting = scan.nextInt();
    }

    public int comDice () {
        return (int)(Math.random() * 6 + 1);
    }

    public int userDice () {
        return (int)(Math.random() * 6 + 1);
    }

    public void userTotal () {
        int userTotal;
    }

    public Casino() {

        Boolean isTrue = true;
        int num;

        int i = 0;



        int comTotal = 0;
        int userTotal = 0;
        System.out.println("유저가 주사위를 굴립니다.");
        for (i = 0; i < 1; i++)
            userTotal += (int)(Math.random() * 6 + 1);

        System.out.printf("결과는 %d 입니다\n", userTotal);
        if (userTotal % 2 == 0) {
            userTotal = userDice;

            System.out.printf("한번 더 주사위를 굴립니다.\n", userTotal);
            userTotal += (int)(Math.random() * 6 + 1); //여기에 userDice를 넣으면 결과가 0이 뜨는데 이유를 잘 모르겠따
            System.out.printf("결과는 %d 입니다\n", userTotal);
        }

        else if (userTotal % 1 == 0) {
            System.out.printf("결과는 %d, 홀수 이므로 컴퓨터의 차례입니다\n",userTotal);
        }

    }



    }






public class Quiz45 {
    public static void main(String[] args) {
        Casino ca = new Casino();

        ca.betting();

        ca.userDice();
        ca.userTotal();




        //특수주사위 능력을 넣어주는게 어렵다..
        //여러개를 넣을때 어떤식으로 넣고 연결하는지 잘모르겠다
        //일단 열심히 해봤으나..많이 미완성이다



    }

}