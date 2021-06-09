import java.util.Scanner;

public class IfTestWithInputEnhance {
    public static void main(String[] args) {
        System.out.println("두 개 숫자를 입력 받아 비교해봅시다.");
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scan.nextInt();

        System.out.println("두 번째 숫자를 입력하세요 : ");
        int num2 = scan.nextInt();

        // 문제 : 같은 숫자를 넣으면 원하는 동작을 하지 않는다.
        // 원인 : 현재 조건은 둘 중 하나가 무조건 큰 경우만 보고있음
        // 즉 두 숫자가 같은 경우를 전혀 고려하고 있지 않다.
        // 그러므로 이 부분에 대한 대응이 필요

        // ex) num1 = 7, num2 = 7인경우
        //     num1 > num2 는 조건이 만족되지 않는다.

        // else 쪽으로 갔는데 if 조건이있음
        // 이 뜻은 else 위쪽의 if 조건이 만족되지 않는다면
        // else 쪽의 if 조건을 살펴봐야 한다는뜻
        // num1 < num2

        // num1 도 num2 보다 크지않고
        // 반대로 num2 도 num1 보다 크지 않다면
        // 남은 조건은 두 숫자가 같은 경우 뿐이다.
        if(num1 > num2){
            System.out.printf("%d > %d\n", num1,num2);
        }else if (num1 < num2){
            System.out.printf("%d < %d\n", num1,num2);
        }else{
            System.out.printf("%d 와 %d는 같습니다!\n",num1,num2);
        }
    }
}
