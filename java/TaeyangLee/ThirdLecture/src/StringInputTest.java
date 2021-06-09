import java.util.Scanner;

public class StringInputTest {
    //문자열 입력사용법 !
    public static void main(String[] args) {
        System.out.println("문장 입력 : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("아무거나 해보아라 ");
        String str = sc.nextLine();
        System.out.println("내가 입력한 문장은 = "+str);

    }
}
