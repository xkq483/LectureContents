import java.util.Scanner;

public class Prob27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("입력하는 n번쨰에 해당하는 값을 출력합니다");

        int a = 0;
        int b = 1;
        int sum;


        for (int i = 0; i < 100; i++) {
            sum = scan.nextInt();

            sum = a + b;



            System.out.println("해당값은? " + sum);
        }


    }
}