import java.util.Scanner;

public class IfTestWithInputEnhance {
    public static void main(String[] args) {
        System.out.println("문장도 입력이 된다는데요?");
        Scanner sc = new Scanner(System.in);

        System.out.print("아무 문장 입력하시오");

        String str = sc.nextLine();

        System.out.print("당신의 문장 : " + str);

    }

}
