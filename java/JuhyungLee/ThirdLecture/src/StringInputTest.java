import java.util.Scanner;

public class StringInputTest {
    public static void main(String[] args) {
        System.out.println("문장도 입력을 해보자");
        Scanner scan = new Scanner(System.in);

        System.out.print("아무 문장이나 입력: ");
        // String은 Class 중 하나.
        // 그러나 우선은 문장을 표현할 수 있는 datatype이라고 기억.
        // 또한 scan.nextLine()은 문장을 입력 받을 수 있다.
        // 결국 키보드로 입력된 문장을 str 변수에 저장하는 역할을 한다.
        String str = scan.nextLine();

        System.out.println("내가 입력한 문장: "+ str);
    }
}
