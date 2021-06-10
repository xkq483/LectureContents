import java.util.Scanner;

public class StringInputTest {
    public static void main(String[] args) {
        System.out.println("문장 입력");
        Scanner scan = new Scanner(System.in);

        System.out.println("아무 문장이나 입력하셈 : ");
        // String은 클래스다.
        // 그러나 우선은 문장을 표현할 수 있는 데이터타입이라고 기억
        // scan.nextLine() : 문장 입력을 받음
        // 키보드로 입력된 문장을 str변수에 저장하는 역할

        String str = scan.nextLine();

        System.out.println("입력하신 문장은 = " + str + " 입니다.");
    }
}
