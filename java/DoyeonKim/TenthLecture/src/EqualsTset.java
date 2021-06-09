import java.util.Scanner;

public class EqualsTset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        if (str.equals("네")) {
            System.out.println("오그래");
        }else if (str.equals("아니오")) {
            System.out.println("");
        }else {
            System.out.println("");
        }
    }
}
