import java.util.Scanner;

public class EqualsTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
       //문자열을 비교할 때는 equals를 사용한다고 한다.
        // 그럼 string 변수 두 개를 비교할 때에는
        //(str.equals(str2) 이런식으로 사용하면 될지도??
        if (str.equals("네")) {
            System.out.println("오 그래");
        } else if (str.equals("아니오")) {
            System.out.println("맞는말");
        } else {
            System.out.println("무조건 동의하세요!");
        }
    }
}