public class _2nd_BitAndTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 8;
        System.out.printf("%d & %d = %d\n", num1, num2, num1 & num2);
        num2 = 138;
        System.out.printf("%d & %d = %d\n", num1, num2, num1 & num2);
    }
}
// & 이 비트연산자 AND
// 관계연산자에서는 && 형태로 나타냄.
// 10 ===> 1010
//  8 ===> 1000 AND
// -----------------
//  8 ===> 1000

// 138 ===> 10001010
//  10 ===>     1010 AND
// ----------------------
//  10 ===> 00001010