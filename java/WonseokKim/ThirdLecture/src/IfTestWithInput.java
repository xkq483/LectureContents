import java.util.Scanner;

public class IfTestWithInput {
    public static void main(String[] args) {
        System.out.println("두개 숫자를 입력 받아 비교해봅니다.");
        Scanner scan = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요:");
        int num1 = scan.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        int num2 = scan.nextInt();


        // 문제: 같은 숫자를 넣으면 원하는 동작을 하지 않는다.
        // 원인: 현재 조건은 둘 중 하나가 무조건 큰 경우만 보고 있음
        // 즉 두 숫자가 같은 경우를 전혀 고려하고 있지 않다.
        // 그러므로 이 부분에 대한 대응이 필요하다!

        // ex) num1 = 7, num2 = 7인 경우
        //     num1 > num2는 조건이 만족되지 않는다.
        //     거짓이므로 무조건 else로 가서 else 쪽 print가 동작해 잘못된 결과를 양산하게 됨
        if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        } else {
            System.out.printf("%d < %d\n", num1, num2);
        }
    }
}
