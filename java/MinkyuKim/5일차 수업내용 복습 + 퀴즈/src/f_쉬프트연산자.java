public class f_쉬프트연산자 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 5, num3 = 10;



        System.out.printf("%d << %d = %d\n", num1, num2, num1 << num2);
        System.out.printf("%d << %d = %d\n", num2, num2, num2 << num2);
        System.out.printf("%d << %d = %d\n", num3, num2, num3 << num2);

        System.out.printf("%d << %d = %d\n", num1, num1, num1 << num1);
        System.out.printf("%d << %d = %d\n", num2, num1, num2 << num1);
        System.out.printf("%d << %d = %d\n", num3, num1, num3 << num1);

        System.out.printf("%d << %d = %d\n", num1, num3, num1 << num3);
        System.out.printf("%d << %d = %d\n", num2, num3, num2 << num3);
        System.out.printf("%d << %d = %d\n", num3, num3, num3 << num3);


        System.out.printf("%d >> %d = %f\n", num2, num1, (float)(num2 >> num1));

        // 쉬프트 연산은 정수형끼리밖에 안된다는 점 주의 - 이로인하여 float없이는 계산이 안됨
    }
}