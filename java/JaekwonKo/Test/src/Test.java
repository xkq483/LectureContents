public class Test {
    public static void main(String[] args) {
        System.out.println("Test");

      int number;

      byte number2 = 7;
        System.out.println("number2 = " + number2);
        int num1 =2, num2 = 4;
        //float 쓸땐 반드시 f붙이기
        float fnum1 = 3.3f, fnum2 = 4.2f, fnum3 = 5.2f;

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

        System.out.printf("%f %% %f = %f\n", fnum2, fnum1, fnum2 % num1);
    }
}
