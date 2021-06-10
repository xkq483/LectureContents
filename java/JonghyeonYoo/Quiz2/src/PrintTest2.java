public class PrintTest2 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 4;
        float fnum1 = 2.1f, fnum2 = 7.2f;

        System.out.println("*정수형 사칙연산*");
        System.out.println("1. 더하기");
        System.out.printf("    %d + %d = %d\n", num1, num2, num1 + num2);
        System.out.println("2. 빼기");
        System.out.printf("    %d - %d = %d\n", num1, num2, num1 - num2);
        System.out.println("3. 곱하기");
        System.out.printf("    %d * %d = %d\n", num1, num2, num1 * num2);
        System.out.println("4. 나누기");
        System.out.printf("    %d %% %d = %d\n", num1, num2, num1 % num2);
        System.out.println("\n");
        System.out.println("*실수형 사칙연산*");
        System.out.println("1. 더하기");
        System.out.printf("    %.1f + %.1f = %.1f\n", fnum1, fnum2, fnum1 + fnum2);
        System.out.println("2. 빼기");
        System.out.printf("    %.1f - %.1f = %.1f\n", fnum1, fnum2, fnum1 - fnum2);
        System.out.println("3. 곱하기");
        System.out.printf("    %.3f * %.3f = %.3f\n", fnum1, fnum2, fnum1 * fnum2);
        System.out.println("4. 나누기");
        System.out.printf("    %.4f %% %.6f = %.4f\n", fnum2, fnum1, fnum2 % fnum1);
    }
}
