import java.util.Scanner;

public class ThirdLecture {
    public static void main(String[] args) {


        ///// ------ 연산자 이론 실습 ------- //////
        //1. 다음 연산을 수행후 num1, num2, str을 출력 했을 때
        // 결과가 어떻게 나올지 출력 전에 예상해보고 출력해서 결과를 확인하시오.

        int num1 = 10, num2 = 0;
        String str = "hello";
        num1 += 20;  // num1 = 30
        num2 += 10;  // num2 = 10
        num1 /= num2; // num 1 = 3
        num2 *= num1; // num2 = 30
        str += num2;  //str = hello30
        num2 -= num1; // num2 = 27

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);
        System.out.println("num2 = " + num2);

        //2.정수 2개를 입력 받아 삼항 연산자를 이용하여 "두 수 모두 홀수이다" 또는
        //"두 수 모두 짝수이다" 또는 "하나는 홀수이고 하나는 짝수이다"를 판별하여 출력하시오.

        //첫번째 정수 입력 : 10
        //두번째 정수 입력 : 11
        //결과값이 "하나는 홀수이고 하나는 짝수이다"가 나와야함
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력");
        int idx = sc.nextInt();
        System.out.print("두번째 정수 입력");
        int idx2 = sc.nextInt();

        String result = (idx % 2 == 0) && (idx2 % 2 == 0) ? "두 수 모두 짝수이다" : (idx % 2 == 0) || (idx2 % 2 == 0)  ?
                "하나는 홀수이고 하나는 짝수이다" : "두 수 모두 홀수이다";
        System.out.println(result);





        /*
        // 삼항 연산자
        // 사용자에 값을 하나 받아서 그 값이 양수인지 음수인지 0인지 판별
            Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          String result = num > 0 ? "양수다" : num == 0? "0이다" : "음수다";
          System.out.println(result);

         */

       /*
        // 산술연산자 % :  나누었을 때 나머지를 구하는 연산자
        // 짝수 -> 값 % 2 == 0  ...각각 사용가능
        // 홀수 -> 값 % 2 == 1
        //n의 배수 -> 값 % n == 0 ... n의 배수를 구할때나 n의 배수임을 확인할때
        int num1  = 10;
        int num2 = 3;
        System.out.println("num1 % num2 =" + (num1 % num2)); // 1이 남음

        // 논리 연산자 쓰임새
        // 1 과 100사이의 수?
        // 1 < 수 < 100 (x)
        // 변수 > 1 && 변수 < 100 (o)
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num3 = scan.nextInt();

        System.out.println(" 1과 100사이의 수?" + (num3 > 1 && num3 < 100));

        //복합대입연산자
        //코드가 간결하며 메모리에 직접 연산을 수행하여 연산속도도 빠름
        int num4 = 5;
        num4 %= 10;   // num4 = num4 % 10 --> 5 = 5 % 10
        System.out.println("num4 = " + num4); // 15

        num4 -= 10;
        System.out.println("num4 = " + num4); // 5

        num4 *= 10;
        System.out.println("num4 = " + num4); // 50
*/

        /*
        // 증감 연산자 연습하기
        int a = 5;
        int b = 10;
        int c = (++a) + b;
        int d = c / a;
        int e = c % a;
        int f = e++;
        int g = (--b) + (d--);
        int h = 2;
        h *= e;

        System.out.println("a = " + a); //6
        System.out.println("b = " + b); //9
        System.out.println("c = " + c);//16
        System.out.println("d = " + d);//1
        System.out.println("e = " + e);//5
        System.out.println("f = " + f);//4
        System.out.println("g = " + g);//11
        System.out.println("h = " + h);//10

         */




        /*
        // 연산자 (Operator)

        int a = 10;
        int b = a++;
        System.out.println(a + "," + b);

        */
    }
}
