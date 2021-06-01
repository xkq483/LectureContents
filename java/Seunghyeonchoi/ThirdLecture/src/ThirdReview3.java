import java.util.Scanner;

public class ThirdReview3 {
    public static void main(String[] args)  {
        //if 문제. 숫자 3이 짝수인지 홀수인지 판별하는 코드를 작성해봅시다!
        //앞에 보는 거 없이 해보자
        //먼저 숫자를 정의
        int a =3;

        //다음 판별
        if (a % 2 == 0 )    {
            System.out.printf("%d는 짝수입니다.\n", a);
        }else   {
            System.out.printf("%d는 홀수입니다.\n", a);
        }//good

        //Scanner(키보드 입력) 문제. 아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드를 작성해봅시다!
        //입력받을 준비부터 해야겠지
        Scanner scan = new Scanner(System.in);
        System.out.printf("첫 번째 숫자를 입력하시오 : ");
        int sum1 = scan.nextInt();
        System.out.printf("두 번째 숫자를 입력하시오 : ");
        int sum2 = scan.nextInt();
        System.out.printf("세 번째 숫자를 입력하시오 : ");
        int sum3 = scan.nextInt();

        System.out.println("세 숫자의 합은 다음과 같다 : " +(sum1+sum2+sum3));
        //Q. System.out.printf("세 숫자의 합은 다음과 같다 : ", sum1+sum2+sum3);는 계산되지 않은 이유?


        //while 문제. 1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다.

        int b =2;

        while (b<=20)   {
            if (b%2==0) {
                System.out.println(b++);
            }else   {
                b++;
            }
        }

        //if + Scanner 문제. 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        //역시나 스캔 받을 준비 이미 끝남

        System.out.printf("3의 배수인지 판별할 숫자를 입력해주세요 : ");
        int scannum= scan.nextInt();
        if (scannum % 3 == 0)   {
            System.out.printf("%d는 3의 배수입니다", scannum);
        }else   {
            System.out.printf("%d는 3의 배수가 아닙니다.\n", scannum);
        }//good

        //while + Scanner 문제. 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
        System.out.printf("숫자를 입력해주세요 : ");
        int wsnum = scan.nextInt();
        int i = 1;

        while (i <= wsnum)  {
            if (i % 3 ==0)  {
                System.out.println(i++);
            }else   {
                i++;
            }
        }//good

        // if + while + Scanner 문제
        //키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
        //입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!

        int e=0;

        while (e<=98)    {
            System.out.printf("짝홀을 판별할 숫자를 입력해주세요 : ");
            int dd=scan.nextInt();

            if(dd == 0) {
                System.out.println("종료");
                e = 99;

            }else if (dd % 2 == 0)  {
                System.out.printf("%d는 짝수입니다.\n", dd);
            }else if(dd % 2 == 1)   {
                System.out.printf("%d는 홀수입니다.\n", dd);
            }
            }
        }

    }

