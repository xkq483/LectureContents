//두개의 숫자를 입력받아 값을 비교해보기

import java.util.Scanner;

public class IfTestWithInputEnhance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //스캐너 변수 생성

        System.out.println("첫 번째 숫자를 입력하세요");
        int num1 = scan.nextInt();  // num1에다가 scan을 대입 nextInt()는  키보드입력을 숫자로 만들어준다

        System.out.println("두 번째 숫자를 입력하세요");
        int num2 = scan.nextInt();

        if (num1 > num2) {   //<--num1이 크면 이 곳의 값이 출력
            System.out.printf("%d > %d\n", num1, num2);
        } else if (num1 < num2) {   //num2가 크면 이 곳의 값이 출력
            System.out.printf("%d < %d\n", num1, num2);
        }  
        else  {  //두 개의 값이 같다면 이 곳의 값이 출력
            System.out.printf("%d과%d은 서로 같습니다!\n", num1, num2);
        }
    }
}

