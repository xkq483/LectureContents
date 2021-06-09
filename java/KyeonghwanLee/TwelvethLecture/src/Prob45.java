import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
// 1. 나와 컴퓨터 모두 1000만원을 가지고 있다.
// 2. 판돈을 걸 수 있고 배팅 비율은 Scanner를 통해 입력한다.
// 3. 둘중 1000만원 값이 0이 되는 경우에 게임이 종료된다.//or 연산을 통해 0값이 발생하면 게임종료
// 4. 주사위는 2개를 사용한다.
// 5. 숫자가 높은 사람이 이긴다.
// 6. 첫번째 주사위가 짝수가 나온경우에만 두 번째 주사위를 굴릴 수 있다.
// 7. 두번째 주사위는 1이나오면 +3이된다./ 3이나오면 상대방 주사위값을 -2 할 수 있다.
//    숫자 4가 나오면 내 주사위 값이 0이 된다.
//    숫자 6이 나오면 각자 만든 주사위값을 2배로 갖는다.(두배 적용의 경우  첫번째+두번째 주사위 모두 합산)
class Casino {
    final int myMoney = 1000;
    final int comMoney = 1000;
    int comDice1;
    int myDice1;
    int comDice2;
    int myDice2;

    Scanner scan;

    public Casino() {
        comDice1 = getRanDice();
        comDice2 = getRanDice();
        myDice1 = getRanDice();
        myDice2 = getRanDice();
    }

    public int getRanDice() {
        return (int) (Math.random() * 6 + 1);
    }
    public void Dicegame(){
        if(myDice1 % 2 != 0 && comDice1 % 2 != 0){
            if(myDice1 > comDice1) {
                System.out.println("당신의 승리입니다");
            }else if(myDice1 < comDice1) {
                System.out.println("패배 하였습니다.");
            }else{
                System.out.println("비겼습니다.");
            }
        }

    }
}






public class Prob45 {
    public static void main(String[] args) {
        Casino cn = new Casino();
    }
}
