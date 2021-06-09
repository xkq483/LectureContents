import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.println("문자열 switch 처리");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        // 주의점 : 앞선 예에서도 적었지만 switch에 사용되는 데이터타입과 case에서 사용되는 데이터 타입을 일치시켜야한다.
        switch (str){
            case "hi":
                System.out.println("안녕");
                break;
            default:
                System.out.println("으아악");
                break;
        }
    }
}
