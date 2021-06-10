import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {

        System.out.print("문자열도 switch 처리가 되나요 ? 일단 입력해봅시다: ");
        Scanner scan = new Scanner(System.in);   // 스캐너 클래스로 문자를 입력하기 위해 준비한다.

        String str = scan.nextLine();       // 문자열을 쓸수 있도록하는 문법 "String"

        // 주의점: 앞선 예에서도 적었지만 switch에 사용되는 데이터타입과
        // case에서 사용하는 데이터타입을 일치시킬 필요가 있다.
        switch (str) {
            case "hi":
                System.out.println("안녕");
                break;
            default:       //case에 없는 상황을 고려하여 default도 만들어 준다.
                System.out.println("으아앜");
                break;
        }
    }
}               // 스위치 문을 통해서 케이스에 맞는 입력을 넣을경우 해당 케이스의 입력값이 출력이 되고,
                // 없을경우 default로 이동하여 출력됨
