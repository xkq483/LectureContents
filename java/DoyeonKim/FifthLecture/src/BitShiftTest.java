public class BitShiftTest {
    public static void main(String[] args) {
        int num1 = 2, num2 = 5, num3 = 10;

        // 2^1 x 2^5 = 2^6(64)
        System.out.printf("%d << %d = %d\n", num1, num2, num1 << num2);
        // 5 x 2^5 = 160
        System.out.printf("%d << %d = %d\n", num2, num2, num2 << num2);
        // 10 x 2^5 = 320
        System.out.printf("%d << %d = %d\n", num3, num2, num3 << num2);

        // 2^1 x 2^2 = 2^3(8)
        System.out.printf("%d << %d = %d\n", num1, num1, num1 << num1);
        // 5 x 2^2 = 20
        System.out.printf("%d << %d = %d\n", num2, num1, num2 << num1);
        // 10 x 2^2 = 40
        System.out.printf("%d << %d = %d\n", num3, num1, num3 << num1);

        // 2^1 x 2^10 = 2^11(2048)
        System.out.printf("%d << %d = %d\n", num1, num3, num1 << num3);
        // 5 x 2^10 = 5120
        System.out.printf("%d << %d = %d\n", num2, num3, num2 << num3);
        // 10 x 2^10 = 10240
        System.out.printf("%d << %d = %d\n", num3, num3, num3 << num3);

        System.out.printf("%d >> %d = %f\n", num2, num1, (float)(num2 >> num1));

    }
}
