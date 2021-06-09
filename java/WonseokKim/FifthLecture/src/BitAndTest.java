public class BitAndTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 8;

        // & 이 비트연산자 AND
        // 관계 연산자에서는 && 형태로 존재하였음
        // 10 ===> 1010
        //  8 ===> 1000 AND
        // -----------------
        //  8 ===> 1000
        System.out.printf("%d AND %d = %d\n", num1, num2, num1 & num2);

        num2 = 138;

        // 138 ===> 10001010
        //  10 ===>     1010 AND
        // ----------------------
        //  10 ===> 00001010
        System.out.printf("%d AND %d = %d\n", num1, num2, num1 & num2);
    }
}
