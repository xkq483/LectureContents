public class homework_0510 {
    public static void main(String[] args) {
        byte num1 = 1, num2 = 2;
        int num3 = 3, num4 = 4;
        double num5 = 1.8, num6 = 1.1;
        float num7 = 2.4f, num8 = 1.7f;

        System.out.printf("%d + %d - %d = %d\n", num1, num2, num3, num1 + num2 - num3); // 0
        System.out.printf("%d + %d * %d = %d\n", num1, num2, num3, num1 + num2 * num3); // 7
        System.out.printf("%d + %d / %d = %d\n", num1, num4, num2, num1 + num4 / num2); // 3
        System.out.printf("%d * %d + %d %% %d = %d\n", num2, num2, num4, num3, num2 * num2 + num4 % num3); // 5

        System.out.printf("%f + %f * %f = %f\n", num5, num6, num6, num5 + num6 * num6); // 3.01
        System.out.printf("%f * %f / %f = %f\n", num7, num8, num7, num7 * num8 / num7); // 1.7
    }
}
