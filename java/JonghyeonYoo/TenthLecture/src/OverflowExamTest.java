public class OverflowExamTest {
    public static void main(String[] args) {
        short num = (short)((1 << 15) - 1);
        // 2^15 - 1 = 32768 - 1 = 32767
        // -2^15 ~ 2^15 - 1
        // -2^15 ~ -1 개수로 치면 32768개(2^15개)
        // 0 ~ (2^15 - 1) 개수로 치면 32768(2^15개)
        // short는 16비트임(16비트 이상의 더 큰 숫자를 표현하게 되면 초기화가 발생함)

        // -32768 ~ 0 ~ 32767
        // 이와 같은 일직선상에서 32767 + 1을 하는 순간 -32768이 된다는 뜻이다.

        System.out.println("num = " + num);

        num++;

        System.out.println("num = " + num);
    }
}
