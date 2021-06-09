public class NonDuplicateWithoutArrayTest {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) {
        final int BIN = 1;


        int testBit = 0;
        int randNum;

        // 이 개념은
        // 2진수의 개념과
        // AND와 OR연산의 개념
        // 그리고 쉬프트 연산자 3개의 개념을 전부다 이해를 하고 있다면
        // 이해하기는 쉽다
        // 몇줄 안되는 코드지만 생각보다 복잡한 내용이다.



        for (int i = 0; i < 10; i++) {
            // 0 ~ 9 가 나올것
            randNum = (int)(Math.random() * 10);


            while ((testBit & (BIN << randNum)) != 0) {
                System.out.println("중복이 이렇게나 많이 발생합니다: " + randNum);
                randNum = (int)(Math.random() * 10);
            }

            System.out.printf("randNum = %d\n", randNum);

            // 실제 자리수 셋팅은 여기서 한다.
            // A += B ===> A = A + B
            // A |= B ===> A = A | B
            testBit |= (BIN << randNum);
        }

        System.out.println("testBit의 최종값은 1023이다. 진짜 ? " + testBit);
    }
}
