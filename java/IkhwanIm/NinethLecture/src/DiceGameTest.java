class DiceGame {
    private int comDice;//dg.comDice 방지용
    private int userDice;

    public DiceGame () {//이 부분도 private로 해도되지 않나요?
        comDice = getRandomDice();
        userDice = getRandomDice();
    }//getrandomdice를 private로 설정해둔다.
    private int getRandomDice () {
        return (int)(Math.random()*6+1);
    }
    public void checkWinner() {//승자 확인을위해 아래에서 불러올것이기 때문에
        if (comDice > userDice) {//if문을 public으로 만든다.
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승",userDice,comDice);
        }else if (comDice < userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자 승",userDice,comDice);
        }else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부",userDice,comDice);
        }
    }
}

public class DiceGameTest {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        //dg.comDice = 3 <<이렇게 밑에서 설정하는걸 방지하고자
        //private를 사용한다.

        dg.checkWinner();

    }
}
