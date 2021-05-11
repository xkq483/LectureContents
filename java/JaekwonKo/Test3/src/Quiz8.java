import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;

        while (i != 0) {
            System.out.print("짝수인지 홀수인지 판별해보자: ");
            i = scan.nextInt();

            if (i % 2 == 0) {
                System.out.println(i + " 는 짝수!");
            }else {
                System.out.println(i + " 는 홀수!");
            }
        }
    }
}
