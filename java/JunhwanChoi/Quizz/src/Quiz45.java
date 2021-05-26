// 아주 특수한 카지노에 왔다.
//현재 내 수중엔 1000만원이 있다.
//카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
//상대방이 파산하면 이기는 게임이다.
//주사위 2개를 사용하는 게임이다.
//숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
//첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
//두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
//숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
//숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
//숫자 4가 나오면 내 주사위 값이 0이 된다.
//숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
//(2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
//누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!

/*--------구상--------

    카지노 class{

    -변수 선언 및 초기화 부분

    1.생성자 : 컴퓨터와 사용자의 주사위값 초기화 (랜덤 메소드 필요)
    2.랜덤 메소드 : 주사위값 받아오기
    3.배팅메소드 : Scanner사용
    4.승패결정 메소드 (if( 컴퓨터 < 사용자)  {"사용자 승"}
    5.두번째 주사위굴리는 여부 판정
      while문으로 짝수판정해서 짝수이면 i++하는식으로?
    6.switch-case 메소드로 두번째 주사위 굴리는거
        ex) switch(두번째주사위값)
            case 1: userdice +1; break;
            csse 3: comdice -2 ; break;
            ....


    }
    void 메인
    {

     2. 주사위를 2번던짐 = for(i=0; i<2; i++)

    }


*/

import java.util.Scanner;

class Casino
{
     int user_dice;
     int com_dice;

     int user_betting;
     int com_betting;

     public  Casino()
     {
         user_dice = getRandDice();
         com_dice = getRandDice();
     }

     public  int getRandDice()
     {
         return (int)(Math.random()*6+1);
     }

     public void user_betting_scanner()
     {
         Scanner scan= new Scanner(System.in);

         System.out.print("사용자 배팅금액: ");
         user_betting= scan.nextInt();
         System.out.println(user_betting);
     }

    public void com_betting_scanner()
    {
        Scanner scan= new Scanner(System.in);

        System.out.print("컴퓨터 배팅금액: ");
        com_betting= scan.nextInt();
        System.out.println(com_betting);
    }

}


public class Quiz45 {
    public static void main(String[] args) {

        Casino cn= new Casino();

        cn.user_betting_scanner();
        cn.com_betting_scanner();

    }
}
