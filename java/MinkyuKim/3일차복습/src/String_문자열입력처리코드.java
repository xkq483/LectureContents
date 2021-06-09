import java.util.Scanner;

public class String_문자열입력처리코드 {
    public static void main(String[] args) {
        System.out.println("문장도 입력이 된다는데요 ?");
        Scanner scan = new Scanner(System.in);
        System.out.print("아무 문장이나 입력하시오: ");

        String str = scan.nextLine();
        System.out.println("당신이 입력한 문장은 = " + str);

    }
}
