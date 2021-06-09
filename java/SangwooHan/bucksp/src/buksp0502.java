public class buksp0502 {
    public static void main(String[] args) {
        int num1 = 3, num2 =14, num3 = 10;

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

        // 왼쪽 쉬프트의 경우 단순히 2^n을 곱하면 되지만
        // 오른쪽 쉬프트의 경우 단순히 2^n을 나누면 안된다.
        // 5 / 2^2 = 1.25
        // 결론: 오른쪽 쉬프트는 2^n으로 나누되 소수점을 버려야 한다.
        System.out.printf("%d >> %d = %f\n", num2, num1, (float)(num2 >> num1));

        // 이유:
        // 0101 ----> 5
        // 0001 ----> 1
        //이부분이 이해가 안되었었는데, 
        // 만약 14>>4 라고 했을떄
        // 14의 2진법은 1110 이고 우항이  2^4이다 0000
        // 이떄 ^N칸만큼 칸수가 증감 하기에,
        //1110 맨앞 전체가 4칸이라, 4칸모두 감소 0 
        // 만약 14<<3 이라면,
        //  1110 에서 3칸을뺴는것이기에, 
        // 0001이될것이다.

        // 종합적 결론:
        // 쉬프트 연산은 2^n을 곱하거나 나눈다.
        // 안타깝게도 쉬프트 연산은 정수형끼리밖에 안된다.
        // 최근에 나온 휴대폰 전용 ARM 프로세서에서는 소수점에 대한 쉬프트 연산을 지원하기도 한다.
    }
}