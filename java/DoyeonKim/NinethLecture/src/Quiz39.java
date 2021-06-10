import java.util.Scanner;

class DiceGame {
   private int comDice; //pricvate는 접근 제한자고 int는 데이터 타입이라서 반드시 필요하다
   private int userDice;

   public DiceGame () {
       comDice = getRandDice();
       userDice = getRandDice();
   }
   private int getRandDice () {
       return (int)(Math.random() * 6 + 1);
   }//주사위 돌리기

   public void checkWinner () {
       if (comDice > userDice) { //전부comdice에서 생성됨
           System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승", userDice, comDice);
       }else if (comDice < userDice) {
           System.out.printf("%d(사용자) vs %d(컴퓨터) - 유저 승", userDice, comDice);
       } else {
           System.out.printf("%d(사용자) vs %d(컴퓨토) - 무승부", userDice, comDice);
       }
   }
}



public class Quiz39 {
    public static void main(String[] args) {
        // 우리가 이전에 Random과 제어문을 활용해서 주사위 게임을 만들었던적이 있다.
        // 이 주사위 게임을 class 방식으로 다시 만들어보자!
        // 컴퓨터도 주사위를 굴리고 사용자도 주사위를 굴려서 누가 더 큰 숫자를 얻었는지 확인해보자!
        DiceGame dg = new DiceGame();//클래스 정의해줌

        //dg.comDice = 3; 캡슐화의 보안

        dg.checkWinner();//위에 불러와줘서 출력됨


    }
}


