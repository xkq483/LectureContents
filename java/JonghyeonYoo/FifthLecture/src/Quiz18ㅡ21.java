public class Quiz18ㅡ21 {
    public static void main(String[] args) {

        //Quiz18. 십진수 21을 이진수로 표현해보자!
        // 0001 0101

        //Quiz19. 십진수 73을 이진수로 표현해보자!
        // 0100 1001

        // Quiz20
        // 2^1 + 2^3 + 2^5 + 2^6 을 2진수로 표현해보자!
        //int num1 = 106; //0110 1010
        int num = 2, num1 = 8;
        int num2 = 32, num3 = 64;
        System.out.printf("%d or %d or %d or %d = %d\n", num, num1, num2, num3, num | num1 | num2 | num3);

        //Quiz21
        //##20 2^0 + 2^3 + 2^6 + 2^7 + 2^8 + 2^9 를 2진수로 표현해보자
        int a = 1, b = 8, c = 64, d = 128, e = 256, f = 512;
        // int num = 969; //0011 1100 1001
        System.out.printf("%d or %d or %d or %d or %d or %d= %d\n", a, b, c, d, e, f, a | b | c | d | e | f);
    }
}