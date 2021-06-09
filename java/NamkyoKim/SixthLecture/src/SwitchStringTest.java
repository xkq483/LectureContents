import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.println("문자열도 switch 처리가 되나요? 일단 해보자  : ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // 주의점: 앞선 예에서도 적었지만 switch에 사용되는 데이터타입과 case에서
        // 사용하는 데이터타입을 일치시킬 필요가 있다.
        // String도 사용할수있다. 하지만 별로 쓸일이 없을거같다 .
        switch (str){
            case "hi":
                System.out.println("안녕");
                break;
            default:
                System.out.println("으아");
                break;

        }
    }
}
