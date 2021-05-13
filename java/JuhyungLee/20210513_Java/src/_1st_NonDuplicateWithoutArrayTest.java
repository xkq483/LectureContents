public class _1st_NonDuplicateWithoutArrayTest {
    public static void main(String[] args) throws InterruptedException {

        // 0 ~ 9까지의 숫자가 중복이 없게 나오도록(단, 배열 없이)

        final int BIN = 1;

        // 2진 비트 AND연산자와 OR연사자를 활용
        //또한 쉬프트 연산자를 함께 활용해서 각각의 비트를 채우는 형식으로 코드를 구현.
        int testBit = 0;
        int randNum;

        ///////  강사님 설명에 집중하고 나중에 쓸 것//////

        // 이 문제를 다루려면 2진수에 대한 이해가 필요함.
        // 십진수 10을 이진수로 변환해보면
        // 1. 10에 가장 근접하면서 10보다 작은 2^n을 찾는다 > 8
        // 2. 찾는 숫자는 10에 8을 뺀 값인 2를 적는다.
        // 3. 값이 0이 나올때까지 이 절차를 반복.
        // 4. 0이 된 이후 뺏던 값들의 2^n에 해당하는 n 값들을 열거 >> 3, 1
        // 5. 구한 숫자들이 각각 이진수의 자리수에 댕한다.
        // 6. 2^3  2^2  2^1  2^0
        //     1    0    1    0
        // 7. 검산 >>> (2^3 * 1) + (2^2 * 0) + (2^1 * 1) + (2^0 * 0) = 10
        for (int i = 0; i < 10; i++){
            randNum = (int)(Math.random() * 10);

            // 나온 randNum에 대한 중복 판정을 어떻게 할 것인가 >> bit 연산

            while((testBit & (BIN << randNum)) != 0){
                randNum = (int)(Math.random() * 10);
            }

            System.out.printf("randNum = %d\n", randNum);

            testBit |= (BIN << randNum);
        }

        Thread.sleep(500);
    }
}
