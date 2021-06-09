import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 이렇게 작성하면 콘솔에 글씨를 출력할 수 있데
        System.out.println("안녕");

        // 이렇게 두 줄을 작성하면 다이스 게임이 동작한데
        // 해보자!
        DiceDeathGame ddg = new DiceDeathGame();
        ddg.gameStart();
    }
}



