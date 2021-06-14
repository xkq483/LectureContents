import java.util.Scanner;


// 앞에 클래스를 만들어놔서 이렇게 클래스 자체를 불러와 객체로 만들어 실행가능
// 한번 만들때 역할과 책임을 잘 생각해서 클래스 생성자 매서드 들을 잘 쪼개서 만들면 좋을듯
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