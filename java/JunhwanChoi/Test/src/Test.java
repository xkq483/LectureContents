import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hi");

        // 프로그래밍의 기본은 변수부터!
        // 변수란? : 값을 담는 그릇이다.
        // : 데이터타입이 존재하고, 이 데이터타입만큼 공간을 활용할 수 있음
        // : 그릇의 크기를 결정하는 것이 데이터타입(data type)이다.

        // 데이터타입 ( Data Type)
        // int(4byte), byte(1byte), float(4byte), double(8byte), long(4byte)
        // : 바이트란 컴퓨터 세계에서 사용하는 일종의 기호
        // : 컴퓨터에서 데이터를 표현하는 가장 작은 단위 = 비트(bit)
        // : bit * 8 = 1byte   -> 1byte = 8bit
        // 비트 : 0 또는 1로 표현할 수 있는 최소단위

        // 1비트로 표현할 수 있는 숫자 :  0, 1 (2개)
        // 2비트로 표현할 수 있는 숫자 : 00, 01, 10, 11 (4개)
        // 3비트로 표현할 수 있는 숫자 : 000, 001, 010, 011, 100, 101, 110, 110 (8개)
        // n비트로 표현할 수 있는 숫자 : 2^n비트

        //float는 오차가 double에 비해 크고 속도가 빠름
        //double은 오차가 작아 정밀도가 높고 속도가 느림

        // 변수를 사용해보자!
        //1. 데이터 타입을 적는다
        //2. 그릇에 이름을 부여한다
        //3 . 필요 시 값을 설정한다.

        int number=1;

        byte number2= 10;



        System.out.println("number1: "+number);
        System.out.println("number2: "+number2);


        //동일한 데이터 타입의 변수를 선언할 때는 아래와같이 생략이 가능하다.
        int a= 10, b=20;


        //float형으로 데이터를 저장할 떄는 반드시 뒤에 f를 붙여줘야 한다.
        float fnum1=1.1f, fnum2=2.2f;

        System.out.println("a+b= "+ (a+b));
        System.out.println("fnum1-fnum2= " + (fnum1-fnum2));


        //printf란 print format의 약자
        //format이란 : 양식(format)
        //int형끼리의 연산은 소숫점을 버린다


        System.out.printf("%d+%d= %d\n",a,b,a+b);
        System.out.printf("%d*%d= %d\n",a,b,a*b);

        System.out.printf("%.1f - %.1f= %.1f\n",fnum1,fnum2,(fnum1-fnum2)); // %.1f : 소숫점 1자리로 제한 / 기본 : 소숫점 6자리
        System.out.printf("%f / %f= %.1f\n",fnum1,fnum2,(fnum1/fnum2));





    }
}
