public class _2nd_BitShift {
    public static void main(String[] args) {
        int num1 = 2, num2 = 5, num3 = 10;

        System.out.printf("%d << %d = %d\n", num1, num2, num1 << num2);
        System.out.printf("%d << %d = %d\n", num2, num2, num2 << num2);
        System.out.printf("%d << %d = %d\n", num3, num2, num3 << num2);

        System.out.printf("%d << %d = %d\n", num1, num1, num1 << num1);
        System.out.printf("%d << %d = %d\n", num2, num1, num2 << num1);
        System.out.printf("%d << %d = %d\n", num3, num1, num3 << num1);
    }
}


