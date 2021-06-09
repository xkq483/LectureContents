import java.util.Scanner;

public class StringInputTest {
    public static void main(String[] args) {
        System.out.println("문장도 입력이 된다는데요 ?");
        Scanner scan = new Scanner(System.in);

        System.out.print("아무 문장이나 입력하시오: ");
        // String은 클래스다.
        // 그러나 우선은 문장을 표현할 수 있는 데이터타입이라고 기억하도록 하자!
        // 또한 scan.nextLine()은 문장 입력을 받을 수 있다.
        // 결국 키보드로 입력된 문장을 str 변수에 저장하는 역할을 한다.

        // 결론: 문장 입력을 받고 싶다면 scan.nextLine()을 사용하자!
        String str = scan.nextLine();

        System.out.println("당신이 입력한 문장은 = " + str);
    }
}
