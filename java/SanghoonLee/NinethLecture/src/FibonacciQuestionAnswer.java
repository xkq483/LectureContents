import java.util.Scanner;

public class FibonacciQuestionAnswer {
    public static void main(String[] args) {
        System.out.print("구하고자 하는 피보나치 수열의 n 항을 입력하세요: ");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("그런 항은 없습니다.");
            return;
        } else if (num < 3) {
            System.out.println("당신이 찾는 항은 1입니다.");
            return;
        }

        int fibArr[] = new int[num];

        fibArr[0] = 1;
        fibArr[1] = 1;

        for (int i = 2; i < num; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }

        System.out.println("당신이 찾은 피보나치 수열의 n항은: " + fibArr[num - 1]);
    }
}
