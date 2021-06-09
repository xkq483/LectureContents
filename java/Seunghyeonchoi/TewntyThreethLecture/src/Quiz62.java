
class NetworkDiceGame {
    int myDice;
    int targetDice;

    public NetworkDiceGame() {
        myDice = (int) (Math.random() * 6 + 1);
        targetDice = 0;
    }

}


///////// 서류 요청 ////////// ///////// ///////

/////// // / / //





class GameResultThread extends NetworkDiceGame implements Runnable {

    @Override
    public void run() {
        if (targetDice != 0)    {
            if (myDice > targetDice)    {
                System.out.println("내 승리");
            }else if (myDice < targetDice)  {
                System.out.println("상대편의 승리");
            }else {
                System.out.println("무승부");
            }
        }
    }
}

public class Quiz62 {
    public static void main(String[] args) {
        ////62. 주사위 대전 게임
        //주사위를 굴린다.
        //굴린 주사위의 숫자가 높으면 이기게 만든다.
        //서버와 클라이언트가 상호간에 붙어서
        //주사위를 돌리고 승패를 판가름할 수 있게 만들어보자!







    }
}
