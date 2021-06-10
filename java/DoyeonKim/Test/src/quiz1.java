public class quiz1 {
    public static void main(String[] args) {
        System.out.println("QuizTest");

        int number = 7;


        byte number2 = 7;
        System.out.println("number2 = "+ number2);


        int num1 = 2, num2 = 4;

        System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n",num1, num2, num1 - num2);
        //int형끼리 연산하는 경우에 소수점은 버림!주의
        System.out.printf("%d / %d = %d\n",num1, num2, num1 / num2);
        System.out.printf("%d * %d = %d\n",num1, num2, num1 * num2);
        // %연산은 정수론의 MOD 연산과 동일
        // num1을 num2로 나눠서 남은 나머지는 얼마? 결론;나머지 연산자
        System.out.printf("%d %% %d = %d\n",num1, num2, num1 % num2);

    }
}
