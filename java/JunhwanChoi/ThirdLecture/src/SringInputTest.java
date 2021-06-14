import java.util.Scanner;

public class SringInputTest {

    public static void main(String[] args) {
        System.out.println("문장도 입력이 된다는데요???");

        Scanner scan = new Scanner(System.in);

        System.out.print("아무 문장 입력: ");
        String str = scan.nextLine();
        //String은 클래스임.
        //그러나 우선은 문장을 표현 할 수 있는 데이터타입이라 생각하자
        //또한 scan.nextLine()은 문장 입력을 받을 수 있음
        //결국 키보드로 입력된 문장을 str변수에 저장하는 역할을 한다.

        //결론: 문장입력 받을 때 = nextLine();

        System.out.println("입력하신 문장: "+str);
    }
}
