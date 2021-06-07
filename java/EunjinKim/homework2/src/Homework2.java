public class Homework2 {
    public static void main(String[] args) {
        int num1 = 4, num2 = 7;
        float fnum1 = 3.1f, fnum2 = 4.3f;
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d %% %d = %d\n\n", num1, num2, num1 % num2);

        System.out.printf("%f + %f = %f\n", fnum1, fnum2, fnum1 + fnum2);
        System.out.printf("%f - %f = %f\n", fnum1, fnum2, fnum1 - fnum2);
        System.out.printf("%f * %f = %f\n", fnum1, fnum2, fnum1 * fnum2);
        System.out.printf("%f / %f = %f\n", fnum1, fnum2, fnum1 / fnum2);
        System.out.printf("%.2f %% %.3f = %f\n\n", fnum1, fnum2, fnum1 % fnum2);


        System.out.printf("%d + %d + %f + %f = %f\n\n"
                , num1, num2, fnum1, fnum2, num1 + num2 + fnum1 + fnum2);

        //4 + 7 + 3.1 + 4.3 = ??
        System.out.printf("%d + %d + %.1f + %.1f = %.1f"
                , num1, num2, fnum1, fnum2, num1 + num2 + fnum1 + fnum2);

    }
}