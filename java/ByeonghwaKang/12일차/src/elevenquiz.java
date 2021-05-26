import java.net.PortUnreachableException;
import java.util.Scanner;

class Casino {
    String name;
    int[] money;   //판돈
    int[] dice;
    int[] dice2;  // 특수한 주사위?


    public Casino (String name, int pay){
        this.name = name;

        money = new int[pay];

        money[0] =  (int)(Math.random() * 1001 + 1);   // 1   ~ 천만원  금액 설정


    }
    public int gamemoney() {

        System.out.print("배팅할 금액을 입력 하세요: ");

        return scan.nextint();   //scan 인식이 되질않는다 ㅠ
    }
    public void casinogame () {
        Boolean isWin = false;
        int num;

        do {
            System.out.println();
        }


    }

    public int gamedice () {
        dice[0] = (int)(Math.random() * 6 + 1);  // 주사위 설정?
    }

    public int gamedice2 () {
        dice2[0] = (int)(Math.random() * 6 + 1);

    }


    public int[] getranDice() {
        return dice;
    }








}

//아주 특수한 카지노에 왔다.
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




public class elevenquiz {

    Scanner scan = new Scanner(System.in)

    int money = scan.nextInt();
}
