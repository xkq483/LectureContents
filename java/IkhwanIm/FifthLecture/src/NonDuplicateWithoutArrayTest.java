public class NonDuplicateWithoutArrayTest {
    // 0~9 까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열없이)
    public static void main(String[] args) {
        final int BIN = 1;

        //2진 비트 연산자 AND와 OR 연산자를 활용함
        //또한 쉬프트 연산자를 함께 활용해서 각각의 비트를 채우는 형식으로 코드를 구현했음
        int testBit = 0;
        int randNum;

        // 2진수에 대한 이해가 필요함(이 문제를 다루기 위해)
        // 십진수 10을 이진수로 변환해보자!
        // 변환절차
        // 1. 10에서 가장 근접하면서 10보다 작은 2^n 을 찾는다 = 9
        // 2. 찾는 숫자 10 에서 8을 뺀 값인 2를 적는다.
        // 3. 값이 0이 나올 때까지 이 절차를 반복한다.
        // 4. 0이 된 이후 뺏던 값들의 2^n에 해당하는 n 값들을 열거한다 ===>3, 1
        // 5. 구한 숫자들이 각각 이진수의 자리수에 해당한다.
        // 6. 2^3  2^2  2^1  2^0
        //     1    0    1    0
        //7. 검산 ==> (2^3 x 1) + (2^2 x 0) + (2^1 x 1) + (2^0 x 0) = 10

        for(int i = 0; i < 10; i++) {
            //0~9가 나올것
            randNum = (int)(Math.random() * 10+5);

            //나온 randNum에 대한 중복 판정을 어떻게 할 것인가? bit 연산
            // 2
            while ((testBit & ( BIN << randNum)) !=0) {
                randNum = (int)(Math.random() * 10+5);
                }

            System.out.printf("randNum = %d\n", randNum);

            testBit |= (BIN << randNum);
        }

    }
}
