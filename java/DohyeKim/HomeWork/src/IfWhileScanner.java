import java.util.Scanner;

public class IfWhileScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.print("1 ~ n까지 숫자중 3의 배수를 찾아봅시다(n을 입력하세요): ");
    int num1 = scan.nextInt();
    int i = 1;

        while (i <= num1) {
        if (i % 3 == 0) {
            System.out.println("1 ~ " + num1 + " 까지 3의 배수를 출력합니다: " + i);
        }
        i++;
    }
}
}

