public class test2 {
    public static void main(String[] args) {
        int num1 = 6, num2 = 4;
        float fnum1 = 3.3f, fnum2 = 4.2f, fnum3 = 5.2f;

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);

        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
        System.out.printf("%.2f %% %.10f = %.3f\n", fnum2, fnum1, fnum2 % fnum1);
    }
}
