import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        // 키보드 입력이 0이 들어오기 전까지 계속 무한 반복하도록 프로그램을 작성합니다.
        // 입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
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
