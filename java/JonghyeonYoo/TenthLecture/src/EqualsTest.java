import java.util.Scanner;

public class EqualsTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문장을 입력하세요");
        System.out.println("네 / 아니오  입력만 가능합니다.");
        System.out.println("---------------");
        String str = scan.nextLine();

        if (str.equals("네")) {            // 문자열 비교는 equals() 를 사용한다.
            System.out.println("오 그래");
        } else if (str.equals("아니오")) {
            System.out.println("맞는말");
        } else {
            System.out.println("네 / 아니오  만 가능!");
        }
    }
}
