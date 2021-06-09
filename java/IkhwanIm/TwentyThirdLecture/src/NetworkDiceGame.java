public class NetworkDiceGame {
    int myDice;
    int targetDice;
    
    public NetworkDiceGame (){
        myDice = (int)(Math.random()*6+1);
        targetDice = 0;
    }

    public void createServer() {
    }
}

class GameResultThread extends NetworkDiceGame implements Runnable {

    @Override
    public void run() {
        if(targetDice != 0) {
            if(myDice > targetDice) {
                System.out.println("나의 승리");
            }else if (myDice < targetDice) {
                System.out.println("상대편의 승리");
            }else {
                System.out.println("무승부");
            }
        }
    }
}
