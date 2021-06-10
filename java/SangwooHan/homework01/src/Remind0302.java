import java.util.Scanner;

public class Remind0302 {
    public static void main(String[] args) {
        System.out.println("두 개 숫자를 입력 받아 비교해봅니다.");
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scan.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scan.nextInt();

        // 문제: 같은 숫자를 넣으면 원하는 동작을 하지 않는다.
        // 원인: 현재 조건은 둘 중 하나가 무조건 큰 경우만 보고 있음
        // 즉 두 숫자가 같은 경우를 전혀 고려하고 있지 않다.
        // 그러므로 이 부분에 대한 대응이 필요하다!


        if (num1 > num2)
        {
            System.out.printf("%d > %d\n", num1, num2);
        }else if(num1 == num2)// 수업도중 강사님이, 서로같은 숫자일땐, else로 빠져나가 같은숫자여도 %d = %d  로나오지않고
                            // else 값이 도출되어  내가 else if 달아서 num1과  num2 가 같을땐 %d = %d 로 출력하도록 수정하였다.
            {
            System.out.printf("%d = %d\n",num1,num2);
        }
        else
        {
            System.out.printf("%d < %d\n", num1, num2);
        }
    }
}