import java.util.Scanner;

class dicegame {
    private int comdice;
    private int userdice;

    public dicegame() {
        comdice = getRandDice();
        userdice = getRandDice();
    }

    private int getRandDice() {
        return (int) (Math.random() * 6 + 1);
    }
    public void checkWinner() {
        if (comdice > userdice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승 ", userdice, comdice);
        } else if(comdice < userdice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자 승", userdice, comdice);
        } else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부 ", userdice, comdice);
        }
    }
}

public class d_Quiz39_ACL을이용한주사위문제 {
    public static void main(String[] args) {
        dicegame dg = new dicegame();

        // dg.comdice=3; 을막아주는 것이 private의 역할.
        // 즉 보안, 숨기는 것이 아닌, 특정 문제가 생기는 것을 막아줌.
        // 문법, 값 등이 변하여 다른곳에 문제를 일으키는 것, 여파를 주는것을 막아주는 방어체계로 사용됨.

        dg.checkWinner();

    }
}
