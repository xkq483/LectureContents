import java.util.Scanner;

public class _1st_SwitchStringTest {
    public static void main(String[] args) {

        System.out.println("문자열(String) 입력: ");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        // 주의점: switch에 사용되는 DataType과
        // case에서 사용하는 DataType을 일치시켜야 한다.
        switch (str){
            case "hi":
                System.out.println("안녕");
                break;
            case "what":
                System.out.println("뭐");
                break;
            default:
                System.out.println("???");
                break;
        }
    }
}
