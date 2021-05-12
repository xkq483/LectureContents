import java.util.Scanner;

public class StringInputTest  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("아무 문장이나 입력하세요 : ");
        //String은 클래스다/
        //그러나 우선은 문장을 표현할 수 있는 데이터타입이라고 기억하도록 하자!
        //또한 scan.nextLine()은 문장입력을 받을수 있다.
        String str = scan.nextLine();

        System.out.println("당신이 입력한 문장은 : "+str);

    }
}
