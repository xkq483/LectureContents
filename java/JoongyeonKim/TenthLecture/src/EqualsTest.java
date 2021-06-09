import java.util.Scanner;
//문자열 비교시에는 equals를 사용하자
public class EqualsTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        if (str.equals("네")) {
            System.out.println("오 그래");
        } else if (str.equals("아니오")) {
            System.out.println("맞는말");
        } else {
            System.out.println("무조건 동의하세요!");
        }
    }
}