import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.println("문자열도 Switch에서 쓸수 있다 입력해보자 :");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        switch (str) {
            case "hi":
                System.out.println("안녕");
                break;
            default:
                System.out.println("아무것도아니야");
                break;
        }
   }

}

