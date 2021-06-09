public class Test {
    public static void main(String[] args)  {
        System.out.println("김진영");



        // 변수를 사용해보자!

        int number;

        byte number2 = 8;

        // 쌍따옴표의 역할 ? 문장
        System.out.println("number2 = " + number2);

        int num1 = 4, num2 = 8;

        // float 형 데이터를 저장할 때는 반드시 뒤에 f를 붙여줘야 합니다.
        // f를 붙이지 않으면 기본적으로 double 타입으로 인식합니다.
        // int 형끼리 연산하는 경우에 소수점은 버림을 취합니다.
        float fnum1 = 2.2f, fnum2 = 5.2f, fnum3 = 6.2f;

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);



    }
}
