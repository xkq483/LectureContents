public class BitAndTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 8;

        // 10 ===> 1010
        //  8 ===> 1000
        // -----------------
        //         1000
        System.out.printf("%d AND %d = %d\n", num1, num2, num1 & num2);
        //&연산자는 겹치는 자리수가 둘다 1이여야만 1이다!

        num2 = 138;

        // 138 ===> 10001010
        //  10 ===>     1010
        // ----------------------
        //          00001010
        System.out.printf("%d AND %d = %d\n", num1, num2, num1 & num2);
    }
}
