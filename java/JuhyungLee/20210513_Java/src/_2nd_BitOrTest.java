public class _2nd_BitOrTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        System.out.printf("%d | %d = %d\n", num1, num2, num1 | num2);
        num2 = 136;
        System.out.printf("%d | %d = %d\n", num1, num2, num1 | num2);
    }
}
// |는 비트연산자 OR
// 관계 연산자에서는 || 형태로 존재하였음
// 10 ===> 1010
//  5 ===> 0101 OR
// -----------------
// 15 ===> 1111

//  10 ===> 00001010
// 136 ===> 10001000 OR
// ---------------------
// 138 ===> 10001010

// OR 연산은 합집합 개념, AND 연산은 교집합 개념