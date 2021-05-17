import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.println("문자열도 Switch에서 가능하다! :");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        switch (str) {
            case "hi":
                System.out.println("안녕 반가웡");
                break;
            default:
                System.out.println("아무것도아니야");
                break;
        }
   }

}

