import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.print("문자열도 switch 처리가 되나요? 일단 입력해봅시다: ");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        switch (str) {
            case "hi":
                System.out.println("안녕");
                break;
            default :
                System.out.println("으아아악");
                break;
        }
    }
}
