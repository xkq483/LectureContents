import java.util.Scanner;

public class Prob29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.print("n값 입력 : ");
        int num = sc.nextInt();

        int array[] = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = (int) Math.pow(3, i); // * pow는 제곱이란 뜻이다!, 소괄호 안 숫자를 제곱한다. *
 //           System.out.println(array[i]);

            if (num - 1 == i) {
                System.out.printf("3의 %d제곱은 %d\n", i, array[i]);
            }
        }


        }

    }
}
