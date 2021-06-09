public class BitOrTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;

        // or 연산자는 둘 중 하나만 1이면 1이된다.
        // 10 ===> 1010
        //  5 ===> 0101 OR
        // -----------------
        // 15 ===> 1111
        System.out.printf("%d OR %d = %d\n", num1, num2, num1 | num2);

        num2 = 136;

        //  10 ===> 00001010
        // 136 ===> 10001000 OR
        // ---------------------
        // 138 ===> 10001010
        System.out.printf("%d OR %d = %d\n", num1, num2, num1 | num2);


    }
}
