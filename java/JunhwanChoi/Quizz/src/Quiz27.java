// 아래와 같은 형태의 숫자 배치가 있다.
//  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열 (1+1=2, 1+2=3, 2+3=5 .......)
//  사용자로부터 입력을 받아서 15번째 값을 구하도록 프로그래밍 해보자!
// (n을 입력하면 n번째 값을 구하도록 프로그래밍 해보자!)

import java.util.Scanner;

//  챌린지문제! (여유있는 사람만 해보기)   / 챌린지 문제
public class Quiz27 {
    public static void main(String[] args) {

        //피노나치 수열 = 뒤에 오는 항이 앞의 두 항을 더한 값을 가짐

        int num1=0; //첫 항
        int num2=1; //둘째 항
        int sum=0;  //셋째 항 ( num1+num2)

        Scanner scan = new Scanner(System.in);

        System.out.print("n값을 입력하세요: ");
        int n = scan.nextInt();

        System.out.printf("피보나치 수열의 %d번째 값= ", n);

        for (int i = 1; i < n; i++)
        {
            sum = num1 + num2;
            num1 = num2;
            num2= sum;

            /*
                    i           sum         num1        num2
         ------------------------------------------------------------
          초기화     1            0           1           1
         for loop   1          0+1=1         0           1
                    2          0+1=1         1           1
                    3          1+1=2         1           2
                    4          1+2=3         2           3
                    5          3+2=5         3           5
                                       .
                                       .
                                       .
                    n
             */
        }
        System.out.println(sum);

    }
}
