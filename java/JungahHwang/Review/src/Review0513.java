public class Review0513 {
    public static void main(String[] args) throws InterruptedException {

        // AND--------------------------------------------------------------

        int num1 = 10, num2 = 8;
        // 비트연산자 AND는 &로 표현
        System.out.printf("%d AND %d = %d\n", num1, num2, num1 & num2);
        // 값이 8이 나옴
        num2 = 138;
        System.out.printf("%d AND %d = %d\n", num1, num2, num1 & num2);
        // 값이 10이 나옴


        // OR---------------------------------------------------------------

        int num3 = 10, num4 = 5;
        // 비트연산자 OR은 |로 표현
        System.out.printf("%d OR %d = %d\n", num3, num4, num3 | num4);
        // 값이 15가 나옴
        num4 = 136;
        System.out.printf("%d OR %d = %d\n", num1, num2, num1 | num2);
        // 값이 138이 나옴
        // OR 연산은 합집합 개념, AND 연산은 교집합 개념


        // 쉬프트연산자-----------------------------------------------------
        // 쉬프트 연산자는 비트를 이동시킨다
        // 왼쪽쉬프트는 2^n을 곱하면 됨
        // 1 << 2 ===> 2^0 x 2^2 = 4   (비트를 왼쪽으로 2칸 이동시킴)
        // 1 << 4 ===> 2^0 x 2^4 = 16  (비트를 왼쪽으로 4칸 이동시킴)
        // 오른쪽쉬프트는  2^n으로 나누고 소수점을 버림
        // 5 >> 2 ===> 5 / 2^2 = 1.25  (비트를 오른쪽으로 2칸 이동시킴)

        int a = 2, b = 5, c = 10, d = 53;
        // 왼쪽쉬프트 (2<<5=64 가 출력됨)
        System.out.printf("%d << %d = %d\n", a, b, a << b);
        // 오른쪽쉬프트 (53>>2=13 가 출력됨)
        System.out.printf("%d >> %d = %d\n", d, a, d >> a);

        // final----------------------------------------------------------
        int sum = 0;
        final int START = 1;
        final int END = 10;
        // final 키워드가 붙으면 고정된 값이 되어 변경이 불가능해짐. 직접 숫자를 적을 경우에 유리
        for (int i = START; i <= END; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값 = " + sum);


        // 0-9까지의 숫자가 중복되지 않게 나오게 만들기(배열없이)--------------------
        // 2진수 비트연산자 AND와 OR연산자를 활용하고 쉬프트연산자를 함께 활용해서 각각의 비트를 채우는 형식
        final int BIN = 1;
        int testBit = 0;
        int randNum;

        for (int i = 0; i < 10; i++) {
            randNum = (int) (Math.random() * 10);
            // 0-9가 나올것
            // 나온 randNum에 대한 중복 판정을은 Bit연산으로 함
            // 2^9   2^8   2^7   2^6   2^5   2^4   2^3   2^2   2^1   2^0
            // 각 비트에 1이냐 0이냐로 중복판정

            // 이 부분은 중복이 있는지 없는지 검사하는 루틴
            while ((testBit & (BIN << randNum)) != 0) {
                randNum = (int) (Math.random() * 10);
            }
            System.out.printf("randNum = %d\n", randNum);

            // 실제 자리수 셋팅은 여기서 함
            testBit |= (BIN << randNum);
            // testBit |= (BIN << randNum)  <==> testBit = testBit|(BIN << randNum)
        }
        System.out.println("testBit의 최종값은 1023이다. 진짜 ? " + testBit);
        // testBit의 최종값은 모든 비트가 1이므로 모든 값을 더한 1023이다
        // (2^0 + ... + 2^9 = 2^(9+1) -1 + 1023)


        //Interrupt----------------------------------------------------------
        for (int i = 0; ; i++) {
            if (i % 2 == 0) {
                System.out.println("안녕 난 짝수야!");
            } else {
                System.out.println("하이 난 홀수야!");
            }
            Thread.sleep(500);
            // interrupt = event
            // 기본적으로 이벤트라는 것은 최우선적으로 처리해야 하는 작업 우선순위가 높음
            // 여기서 Thread.sleep()도 이벤트(인터럽트)의 일종
            // 그러므로 이 작업을 완료하기 전까지는 어떠한 작업도 수행하지 않는다는 뜻

        }

        // 18. 21을 이진수로 표현하기
        //     21 = 16(2^4) + 4(2^2) + 1(2^0) ==> 10101
        // 19. 73을 이진수로 표현하기
        //     73 = 64(2^6) + 8(2^3) + 1(2^0) ==> 1001001
        // 20. (2^1 + 2^3 + 2^5 + 2^6) 을 2진수로 표현하기
        //     2^6 + 2^5 + 2^3 + 2^1 ==> 1101010
        // 21. (2^0 + 2^3 + 2^6 + 2^7 + 2^8 + 2^9) 을 2진수로 표현하기
        //     2^9 + 2^8 + 2^7 + 2^6 + 2^3 + 2^0 ==> 1111001001

    }
}