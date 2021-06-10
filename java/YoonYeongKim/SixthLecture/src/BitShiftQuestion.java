public class BitShiftQuestion {
    public static void main(String[] args) {
        int num = 1;

        System.out.printf("%d << %d = %d\n", num, 2, num << 2);

        // 숫자 1을 비트로 쓰면 0000 0001
        // 여기서 만약 왼쪽으로 2비트 이동시키면 ?
        // 0000 0001 -> 0000 0100
        // 숫자 1이 4가 되었음
    }
}