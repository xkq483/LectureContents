public class NonDuplicateWithoutArrayTest {
    //0~9까지의 숫자가 중복되지않게 만들기 (배열없이)
    public static void main(String[] args) throws InterruptedException {

        // 2진 비트 연산자 AND와 OR 연산자를 활용함
        // 또한 쉬프트 연사자를 함께 활용해서 각각의 비트를 채우는 형식으로 코드를 구현

        // 2진수에 대한 이해가 필요
        // 십진수 10을 이진수로 변환 하면
        //1. 10에서 가장 근접하면서 10보다 가장 작은 2^n을 찾는다 = 8
        //2. 찾는 숫자 10에서 8을 뺀 값 2를 적는다.
        //3. 값이 0이 나올때까지 이 절차를 반복한다.
        //4. 0 이 된 이후에 뺏던 값들의 2^에 해당하는 n 값들을 열거한다. ==> 3, 1
        //5. 구한 숫자들이 각각 이진수의 자리에 해당
        //6. 2^3 2^2 2^1 2^0
        //    1   0    1   0
        //검산 각 ^ 곱하기
        // 각  ^ 위치가 비트표시 위치이다.
        final int BIN = 1;

        int testBit = 1;
        int randNum;
        for (int i = 0; i < 10; i++) {
            randNum = (int)(Math.random()*10);
            // 나온 randNum에 대한 중복 판정을 어떻게 할 것인가? bit 연산
            while ((testBit & (BIN << randNum)) != 0) {
                randNum = (int) (Math.random() * 10);
            }

            System.out.printf("randNum = %d\n", randNum);

            testBit |= (BIN << randNum);

        }
        Thread.sleep(500);
    }
    //21 ---> 16(2^4) + 4(2^2)

    //Q : 2진수 ||연산은 덧셈인가?
    //A : 아니다.
    // 10 + 7 = 17이지만 이진수 ||연산에서는  15이다.
}
// 2^9 2^8 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
