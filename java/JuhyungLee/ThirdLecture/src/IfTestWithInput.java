import java.util.Scanner;

public class IfTestWithInput {
    public static void main(String[] args) {
        System.out.println("두 개 숫자를 입력 받아 비교해봅니다.");
        Scanner scan = new Scanner(System.in);

        System.out.println("첫 번쨰 숫자를 입력하세요: ");
        int num1 = scan.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = scan.nextInt();

        // 문제: 같은 숫자를 넣으면 7<7 이런 식으로 나옴. if 문에 대한 답이 참이 아니니까 else의 것이 출력됨.
        // 현재 조건은 둘 중 하나가 무조건 큰 경우만 보고 있음.
        // 즉, 두 숫자가 같은 경우를 전혀 고려하지 않고 있다.
        // 그러므로 이 부분에 대한 대응이 필요함.
        if(num1 > num2){
            System.out.printf("%d > %d\n", num1, num2);
        } else {
            System.out.printf("%d < %d\n", num1, num2);
        }

    }
}
