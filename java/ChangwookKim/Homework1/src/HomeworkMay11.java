public class HomeworkMay11 {
    public static void main(String[] args) {
        System.out.println("사칙연산을 해봅시다.");

        int number;
        byte number2 = 7;

        System.out.println("number2 = " + number2);

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
