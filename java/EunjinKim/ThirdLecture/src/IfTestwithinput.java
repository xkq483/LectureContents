import java.util.Scanner;

public class IfTestwithinput {
    public static void main(String[] args) {
        System.out.println("두 개의 숫자를 입력 받아 비교해봅니다.");
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요: ");
        int num1 = scan.nextInt();

        System.out.println("두번째 숫자를 입력하세요: ");
        int num2 = scan.nextInt();

        //문제: 같은 숫자를 넣으면 원하는 동작을 하지 않는다
        //원인: 현재 조건은 둘중 하나가 무조건 큰 경우만 보고있음
        //즉 두 숫자가 같은 경우를 고려하지 않음으로 이 부분에 대한 대응이 필요

        //ex) num1 = 7, num2 = 7인 경우 num > num2 조건이 만족되지 않음
        // 거짓이므로 무조건 else로 가서 else쪽 print가 동작해 잘못된 결과를 양산

    if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        } else {
                System.out.printf("%d < %d\n", num1, num2);
        }
    }
}
