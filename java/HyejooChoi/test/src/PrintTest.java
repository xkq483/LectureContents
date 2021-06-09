public class PrintTest {
    public static void main(String[] args) {
        System.out.println("안녕");
        // 데이터타입(Data Type)
        // int, byte, float, double, long
        // byte : 1바이트
        // int : 4바이트
        // long : 4바이트
        // float : 4바이트
        // double : 8바이트

        //바이트(byte)는 컴퓨터 체계에서 사용하는 일종의 기호
        // 컴퓨터에서 데이터를 표현하는 가장 작은 단위 = 비트(bit)
        // 비트는 0 혹은 1 둘 중 하나만 표현할 수 있는 최소단위다.
        // 비트(bit) x 8 = 바이트(byte)

        // 2^n비트 = n비트 데이터가 표현할 수 있는 개수

        // 1byte = 2^8 = 256개를 표현할 수 있음
        // int(4byte) = 2^32 = 대략 42억 9천만개를 표현할 수 있음
        // float(4byte) , double(8byte) 표현 방식이 조금 상이함
        // (float은 오차가 double에 비해 크고 속도가 빠름, double은 오차가 적어 정밀도가 높고 속도가 느림)

        // 변수를 사용해보자
        // 1. 데이터타입을 적는다
        // 2. 그릇에 이름을 부여한다.
        // 3. 필요하다면 값을 설정한다.

        // 1번,2번 방식으로 만든 변수
        // 데이터타입은 int
        // 그릇의 이름은 number
        int number;

        // 1번, 2번, 3번을 모두 적용하여 만든 변수
        // 데이터타입은 byte
        // 그릇의 이름은 number2
        // 저장된 값은 7
        byte number2 = 7;

        // 쌍따옴표의 역할 ? 문장
        // +
        // number2 <<-- 7이라는 값이 저장되어 있음
        // 문장과 숫자의 덧셈은 ??? 가능한가 ? 안됨
        // 문장 + 숫자의 경우 숫자를 문장 형태로 만들어서 뒤에 글자를 붙임
        // number2 = 7 의 형태를 출력하게 됩니다.

        System.out.println("number2 = " + number2);

        // 동일한 데이터타입을 가진 변수를 선언할 때는 데이터타입 표기를 아래와 같이 생략할 수 있다.
        // ',' 콤마가 변수 이름의 구분자라고 보면 됨

        // 데이터타입은 int 고
        // 변수 이름은 num1 이며
        // num1에 저장된 값은 2다.
        // 또한 콤마에 의해 동일한 데이터타입을 가지고
        // 변수 이름은 num2 이며
        // num2에 저장된 값은 4다.
        int num1 = 6, num2 = 4;
        // float 형 데이터를 저장할 때는 반드시 뒤에 f를 붙여줘야 합니다.
        // f를 붙이지 않으면 기본적으로 double 타입으로 인식합니다.
        float fnum1 = 3.3f, fnum2 = 4.2f, fnum3 = 5.2f;

        // printf()는 print format의 약자
        // format 이란 무엇일까? 양식(format)
        // %d는 decimal로 정수형 숫자(int)를 의미합니다.
        // %f는 float인 소수점을 의미합니다

        // printf("%d + %d = %d\n")의 경우
        // "숫자 + 숫자 = 숫자" 형식의 format 이다.
        // \n의 경우 엔터키와 동일한 역할로 한줄 띄우기
        // 첫번째 %d에는 num1
        // 두번째 %d에는 num2
        // 마지막(세번째) %d에는 num1 + num2
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        // int 형끼리 연산하는 경우에 소수점은 버림을 취한다
        // 이 부분을 유의해야함
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        // % 연산은 정수론의 MOD 연산과 동일
        // num1을 num2로 나눠서 남은 나머지를 뜻함
        // 자바는 정수 혹은 소수점 모두 나머지 연산을 적용할 수 있다
        // 2 / 4의 몫은 8, 나머지는 2
        // 짝수 혹은 홀수 판정시 가장 많이 활용된다.

        // Q : %%가 두개 온 이유가 무엇인가?
        // A : format에서 양식을 지정하는데 양식 지정자가 % 입니다.
        //      그러니 %만 덩그러니 놓여 있으면 이것이 %d인지, %f인지 아니면 무엇인지 알 수가 없다
        //      %%라고 적으면 이것은 변수를 바꿔치기하려고 놓은 양식이 아니라
        //      진짜 % 기호를 표기하려고 적은 문자구나 라는것을 인식하게 만들기 위한 용도
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
        System.out.printf("%.2f %% %.10f = %.3f\n", fnum2, fnum1, fnum2 % fnum1);

        // Q : 오차가 발생하는 이유
        // A : float 이든, double 이든 전부 데이터를 표현하는 bit 수에  한계가 있다
        //     float는 32비트, double은 64비트
        //     부호비트, 지수비트, 소수점비트 <<-- 표현에 한계가 있어서 오차가 발생
        //     소수점 자리수의 표현이 낮아지면 반올림을 하기 때문에 오차가 안보임
    }
}
