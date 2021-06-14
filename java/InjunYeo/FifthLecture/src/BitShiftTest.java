public class BitShiftTest {
    public static void main(String[] args) {
        int num1 = 2, num2 = 5, num3 = 10;
        System.out.printf("%d << %d = %d\n",num1,num2,num1<<num2);
        //2x2^5 = 64
        System.out.printf("%d << %d = %d\n",num2,num2,num2<<num2);
        //5x2^5
        System.out.printf("%d << %d = %d\n",num3,num2,num3<<num2);

        System.out.printf("%d << %d = %d\n",num1,num1,num1<<num2);
        System.out.printf("%d << %d = %d\n",num2,num1,num2<<num2);
        System.out.printf("%d << %d = %d\n",num3,num1,num3<<num2);

        System.out.printf("%d << %d = %d\n",num1,num3,num1<<num2);
        System.out.printf("%d << %d = %d\n",num2,num3,num2<<num2);
        System.out.printf("%d << %d = %d\n",num3,num3,num3<<num2);

        //왼쪽쉬프트의 경우 단순히 2^n을 곱하면 되지만
        //오른쪽 쉬프트의 경우 단순히 2^n을 나누면 안된다. 몫만 남기고 나머지는 버린다.
        //5/2^2 = 1.25
        System.out.printf("%d >> %d = %d\n",num2,num1, num2 >>num1);

        //이유:
        //0101---> 5
        //0001---> 1

        //종합적결론:
        //쉬프트 연산은 2^n을 곱하거나나눈다.


    }
}
