import java.io.PrintStream;

public class homework1 {
    public static void main(String[] args) {
       int num1 = 5, num2 = 7;
       float fnum1 = 1.5f, fnum2 = 3.3f, fnum3 = 8.6f;
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
        System.out.printf("%.2f %% %.7f = %f\n", fnum3, fnum1, fnum3 % fnum1);

    }
}
