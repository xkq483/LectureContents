public class BitShiftTest {
    public static void main(String[] args) {
        int num1= 2, num2=5, num3=10;

        System.out.printf("%d << %d = %d\n",num1, num2, num1 << num2);  // 2 x 2^5 = 64
        System.out.printf("%d << %d = %d\n",num2, num2, num2 << num2);
        System.out.printf("%d << %d = %d\n",num3, num2, num3 << num2);

        System.out.printf("%d << %d = %d\n",num1, num1, num1 << num1);
        System.out.printf("%d << %d = %d\n",num2, num1, num2 << num1);  // 5 x 2^2 = 20
        System.out.printf("%d << %d = %d\n",num3, num1, num3 << num1);

        System.out.printf("%d << %d = %d\n",num1, num3, num1 << num3);
        System.out.printf("%d << %d = %d\n",num2, num3, num2 << num3);
        System.out.printf("%d << %d = %d\n",num3, num3, num3 << num3);  // 10 x 2^10 = 10 x 1024= 10240

        //왼쪽 시프트는 단순히 2^n을 곱하면 되지만,
        //오른쪽 시프트는 단순히 2^n을 나누면 안된다.
        // 5/ 2^2 = 1.25 인데 코드를 돌려보면 1.0이 나온다.
        // 결론 : 오른쪽 시프트는 2^n으로 나누되 소수점을 버려야한다.
        // *시프트 연산은 정수형만 된다.


    }

}
