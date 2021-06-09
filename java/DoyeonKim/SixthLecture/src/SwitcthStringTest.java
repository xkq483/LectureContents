import java.util.Scanner;

public class SwitcthStringTest {
    public static void main(String[] args) {
        System.out.println("문자열도 스위치 처리가 되나요? 일단 입력해봄");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        switch (str) {
            case "hi":
                System.out.println("안녕");
                break;
            default:
                System.out.println("으악");
                break;

        }
    }
}
