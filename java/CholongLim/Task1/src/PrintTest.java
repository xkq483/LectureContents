public class PrintTest {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 3;
        System.out.println(number1 + number2);
        System.out.printf("%d + %d = %d\n", number1, number2, number1 + number2 );

        int i1 = 2, i2 = 5, i3 = 8;
//        덧셈
        System.out.printf("%d + %d =%d\n", i1, i2, i1 + i2);
        System.out.printf("%d + %d +%d =%d\n", i1, i2, i3, i1 + i2 + i3 );
//        뺄셈
        System.out.println(i3 - i2);
        System.out.printf("%d - %d = %d\n", i3, i1, i3 -  i1);
//        곱셈
        System.out.println(i1 * i2 * i3);
        System.out.printf("%d * %d = %d\n", i2, i3, i2 * i3);
//        나눗셈
        System.out.println(i3 / i1);
        System.out.printf("%d / %d = %d\n", i3, i1, i3 / i1);
        System.out.printf("%d / %d = %d\n", i3, i2, i3 / i2);
//        나머지값
        System.out.printf("%d %% %d = %d\n", i2, i1, i2 % i1);
        System.out.printf("%d %% %d = %d\n", i3, i2, i3 % i2);

//        float(소수점)을 사용한 나머지값
        float f1 = 1.8f, f2 = 2.2f, f3= 7.3f, f4= 7.355f ;

        System.out.printf("%.2f %% %.1f = %.3f\n", f3, f1, f3 % f1);
        System.out.printf("%.4f %% %.1f = %.3f\n", f4, f2, f4 % f2);
        System.out.printf("%.2f %% %.1f = %.3f\n", f4, f2, f4 % f2);



    }
}
