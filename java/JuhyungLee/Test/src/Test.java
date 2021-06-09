public class Test {
    public static void main(String[] args) {
        System.out.println("Excercise");

        /*
        <<Data Type>>
         >> int byte float double long ...... 등등
         byte: 1byte
         int: 4byte
         short: 2byte /  long: 8byte
         float: 4byte
         double: 8byte
         */

        /*
         Byte는 컴퓨터 체계에서 사용하는 일종의 기호.
         컴퓨터에서 데이터를 표현하는 가장 작은 단위 = 비트(bit)
         bit는 0 or 1 중 하나만 표현할 수 있는 최소 단위.
         8bit =1byte
         */

        /*
         1비트는 표현할 수 있는 숫자는 2^1개
         2비트는 2^2개
         3비트는 2^3개
         4비트는 2^4개
         >> 2^n = n비트 데이터가 표현할 수 있는 갯수
         */

        /*
        1byte = 2^8 = 256개를 표현할 수 있음.
        int(4byte) = 2^32 = 42억 9천만개를 표현할 수 있음
        float(4byte), double(8byte)는 표현 방식이 조금 상이함.
        float은 오차가 double에 비해 크고 속도가 빠름. double은 오차가 작아 정밀도가 높고 속도가 느림.
        */

        int number = 7; //Datatype 설정, Datatype 명명, Datatype 값설정

        System.out.println("number"+ number);

        // 동일한 DataType을 가진 변수를 선언할 때는 아래와 같이 생략해서 정의 가능.
        int num1 =2, num2 = 4;
        //float형 data를 저장할 때는 반드시 뒤에 f를 붙인다. 그렇지 않으면 double로 인식함.
        float fnum1 = 3.3f, fnum2 = 4.2f, fnum3 = 5.2f;

        // prinf()는 print format
        // %d는 decimal로 정수형 숫자(int)를 의미한다.
        // %f는 float인 소수점을 의미함.
        // \n의 경우 Enter키와 동일한 역할. 한 줄 띄어쓰기

        //printf("%d + %d = %d\n")의 경우
        // "숫자 + 숫자 = 숫자" 형식의 format
        // 첫번째 %d에는 num1, 두번쨰 %d에는 num2, 마지막 %d에는 num1+num2
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);

        // int형끼리 연산하는 경우에 소수점은 버림을 취한다. 이 부분을 유의.
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        // % 연산은 정수론의 MOD 연산과 동일하다.
        // num1을 num2로 나눠서 남은 나머지 = ? // 나머지 연산자
        // 자바는 정수 혹은 소수점 모두 나머지 연산을 적용할 수 있다.
        // 나머지 연산자는 짝수 혹은 홀수 판정시에 가장 많이 활용된다.
        /* %%에 %가 두 개인 이유는 >> format에서 양식을 지정하는데, 양식 지정자가 %이다.
            따라서 %만 사용하면 이것이 %d인지, %f인지 아니면 다른 무엇인지 알 수가 없음.
            %%라고 적으면 아! 이것은 변수를 바꿔치기 하려고 놓은 양식이 아니라, 진짜 %기호를 표기하려고 적은 문자구나
            라는 것을 인식하게 만들기 위함.
         */
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
        System.out.printf("%f %% %f = %f\n", fnum2, fnum1, fnum2 % fnum1);
        //.2f > 소수점 두자리까지 표현하겠다.
        System.out.printf("%.3f %% %.2f = %.5f\n", fnum2, fnum1, fnum2 % fnum1);


    }
}
