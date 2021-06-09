import java.util.Scanner;

public class EqualsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("동의 네 or 아니오");
        String str = sc.nextLine();

        if (str.equals("네")) {
            System.out.println("오");
        } else if (str.equals("아니오")) {
            System.out.println("긍정만");
        }

    }
}
