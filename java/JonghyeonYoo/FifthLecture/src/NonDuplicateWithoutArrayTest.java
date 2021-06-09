public class NonDuplicateWithoutArrayTest {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;
        //final로 선언하면 한번 초기화된 변수는 변경할 수 없는 상수값

        // 2진 비트 연산자 AND와 OR 연산자를 활용함
        // 또한 쉬프트 연산자를 함께 활용해서 각각의 비트를 채우는 형식으로 코드를 구현했음
        int testBit = 0;
        int randNum;

        // 2진수에 대한 이해가 필요함(이 문제를 다루기 위해)
        // 십진수 10을 이진수로 변환해보자!
        // 변환 절차
        // 1. 10에서 가장 근접하면서 10 보다 작은 2^n을 찾는다 = 8
        // 2. 찾는 숫자 10 에서 8을 뺀 값인 2를 적는다.
        // 3. 값이 0이 나올때까지 이 절차를 반복한다.
        // 4. 0이 된 이후 뺏던 값들의 2^n에 해당하는 n 값들을 열거한다 ===> 3, 1
        // 5. 구한 숫자들이 각각 이진수의 자리수에 해당한다.
        // 6.    2^3    2^2    2^1    2^0
        //        1      0      1      0
        // 7. 검산 ===> (2^3 x 1) + (2^2 x 0) + (2^1 x 1) + (2^0 x 0) = 10

        for (int i = 0; i < 10; i++) {
            // 0 ~ 9 가 나올것
            randNum = (int)(Math.random() * 10);

            // 이 부분은 중복이 있는지 없는지 검사하는 루틴
            /*
               testBit는 int형이니까 전체가 4바이트(32비트)
               ex) 4, 5, 4, 1
             */
            while ((testBit & (BIN << randNum)) != 0) {
                //testBit(0) %(AND)교집합개념 (BIN(1) << randNum(0~9)) != 0)
                // 랜덤값이 2라고 가정시 BIN(1) * 2^2 는 4이므로 testBit(0)과는 다룸 난제발생
                // 아래의 testBit |= (BIN << randNum);로 이동
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

        Thread.sleep(500);
        }
    //컴퓨터 비트는 0번부터 셈
        /*
        관계연산자 AND와 비트연산자 AND는 서로 동작 방식에 약간의 차이가 있다.
        비트연산자 AND는 각 비트의 자리수가 1(참)인 녀석들끼리만 1(참)이 된다.
        하나라도 0(거짓)이 있으면 해당 자리수는 0(거짓)이 된다.
        비트연산자 OR은 각 빝의 자리수중 하나라도 1(참) 이있으면 1(참)이 된다.
        양쪽 모두 0(거짓)을 가지고 있는 경우에만 0(거짓)이 된다.
         */
    }
