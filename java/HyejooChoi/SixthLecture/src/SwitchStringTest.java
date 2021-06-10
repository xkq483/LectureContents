import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.print("문자열도 switch 처리가 되는지 일단 입력해보자 :");
        Scanner scan = new Scanner((System.in));

        String str = scan.nextLine();

        // 주의점 : switch에 사용되는 데이터타입과
        // case에 사용되는 데이터타입을 일치시켜야 함

        switch (str) {
            case "hi":
                System.out.println("안뇽");
                break;
            default:
                System.out.println("???z");
                break;
        }
    }
}
