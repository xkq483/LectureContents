import java.util.Scanner;
public class _99th_Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("물어보고싶은것은?: ");
        String str = scan.nextLine();


        if (str.equals("이름")) {
            System.out.println("이주형");
        } else if (str.equals("성별")) {
            System.out.println("남자");
        } else {
            System.out.println("그건 비밀");
        }
    }
}