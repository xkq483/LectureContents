public class PrintTest {
    public static void main(String[] args) {
        System.out.println("민규");
int number;
byte number2 = 7;
        System.out.println("number2 = " + number2);


        //동일한 데이터타입을 가진 변수를 선언할 때는 데이터타입 표기를 아래와 같이 생략할 수 있다.
        // ',' 콤마가 변수 이름의 구분자로고 보면 된다.

        // 데이터타입은 int고 변수 이름은 num1이며, num1에 저장된 값은 2다.
        // 또한 콤마에 의해 동일한 데이터타입을 갖고, 변수이름은 num2이며, num2에 저장된 값은 4다.
        int num1 = 2, num2 -4;
        //float 형 데이터를 저장할 때는 반드시 뒤에 f를 붙여줘야 한다.
        // f를 붙이지 않으면 기본적으로 double 타입으로 인식한다.
        float fnum1 = 3.3f, fnum2 - 4.2f, fnum3 = 5.2f;

        //printf()는 print format의 약자입니다.
        //format이란 무엇일까? 양식
        //%d는 decimal로 정수형 숫자 (int)를 의미합니다.
        //%f는 float인 소수점을 의미합니다.
        // pirntf("%d + %d = %d/n")의 경우
        // "숫자 + 숫자 = 숫자" 형식의 format 입니다.
        // \n의 경우 엔터키와 동일한 역할로 한 줄 띄기라고 보면 됩니다.
        // 첫번째 %d에는 num1 , 두번째 %d에는 num2, 마지막(세번쨰) %d에는  num1 + num2
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        // int  형끼리 연산하는 경우에 소수점은 버림을 취합니다.
        // 이 부분을 유의해야 합니다.
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        // %연산은 정수론의 MOD 연산과 동일하다.
        // num1을 num2로 나눠서 남은 나머지는 얼마인가 ? 라는 연산자  >  결론 : 나머지 연산자
        // 자바는 정수 혹은 소수점 모두 나머지 연산을 적용할 수 있다.
        // 2/4는 몫이 0, 나머지 2  ex) num1 =6일 시 몫이 1, 나머지 2
        // 짝수 혹은 홀수 판정시 가장 많이 활용된다.

        // %%가 두개 온 이유 ? format 에서 양식을 지정하는데 양식 지정자가 % 입니다.
        // 그러니 %만 덩그러니 놓여있으면 이것이 %d인지, %f인지 아니면 무엇인지 알 수가 없습니다.
        // %%라고 적으면 아! 이것은 변수를 바꿔치기할려고 놓은 양식이 아니라
        // 진짜 %기호를 표기하려고 적은 문자구나! 라는 것을 인식하게 만들기 위한 용도라 보면 됩니다.
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

        //소수점 2자리 표현 시 System.out.printf("%.2f %% %.2f = %.2f\n", fnum2, fnum1, fnum2 % fnum1);
        //소수점 10자리 표현은 .10f로 표기
        System.out.printf("%f %% %f = %f\n", fnum2, fnum1, fnum2 % fnum1);
        //오차가 발생하는 이유 ? float이든 전부 데이터를 표현하는 bit(비트) 수에 한계가 있습니다.
        // float은 32비트, double은 64비트로 표현할수 있는 한계치를 넘어선다면 오차가 발생
        // 부호비트, 지수비트, 소수점비트와 같은 경우 표현에 한계가 있어서 오차가 발생합니다.
        // 소수점 자리수의 표현이 낮아지면 반올림을 하기 때문에 오차가 안보임


    }
}
