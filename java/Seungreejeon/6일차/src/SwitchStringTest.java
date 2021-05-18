import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.println("문자열 switch 처리하기");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        switch (str) {
            case "hi":
                System.out.println("안녕");
                break;
            default:
                System.out.println("바이");
                break;
        }

    }
}
