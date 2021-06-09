class DiceGame {
    private int comDice;
    private int userDice;

    public DiceGame () {
        comDice = getRandDice();
        userDice = getRandDice();
    }
    private int getRandDice () {
        return (int)(Math.random() * 6 + 1); //랜덤한 주사위 값을 getRandomDice에 반환하고 getRandomDice를  comDice에 대입한다
    }
    public void checkWinner () {  //주사위 게임을 하는 메소드를 만들고 메인에서 출력만 하게하면 간단하다!
        if (comDice > userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승", userDice, comDice);
        } else if (comDice < userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자 승", userDice, comDice);
        } else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부", userDice, comDice);
        }
    }
}

public class DiceGameTest {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        //dg.comDice = 3;

        dg.checkWinner(); //checkWinner메소드를 호출한다
    }
}