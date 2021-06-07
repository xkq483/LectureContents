import java.util.Scanner;

public class ExamDoc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        System.out.println(str.length());
//문자열이면 equals써주기
        if (str.equals("exit")) {
            System.out.println("이제 틀리지맙시다 ㅠㅠ");
        }
    }
}