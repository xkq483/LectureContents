public class _4th_Quiz23 {
    public static void main(String[] args) throws InterruptedException {

//        Quiz 23.
//        22번 문제(1st_NonDuplicateWithoutArrayTest)의 경우엔
//        random number(난수)의 범위가 0 ~ 9 였다.

//        이번에는 2개의 범위를 가지는 random number 2개를 중복없이 제어해볼 것.
//        하나는 5 ~ 10의 범위를 가지고 다른 하나는 7 ~ 10의 범위를 가진다.
//        22번 예제를 응용하여 풀 수 있는 문제고 다소 난이도가 높은 문제다.
//         ex) 5, 6, 7, 8, 9, 10이 모두 출력되어야 하고 또한 7, 8, 9, 10이 출력되어야 한다.
//            여기서 중복이 발생하면 안됨

        final int FIRST_BIAS = 5;   //변수 BIAS 활용하는 이유는 아래 설명
        final int SECOND_BIAS = 1;

        // int는 4바이트이므로 32비트에 해당하는 데이터를 저장할 수 있음
        // 우리가 testBit를 가지고 제어할 수 있는 비트의 개수는 32개
        // 숫자가 많은것이 아니므로 32개의 공간을 최대한 효율적으로 활용해야 할 것임
        // (32개라서 1개가 아까운 상황이라고 보면 됨)
        // 이 상황에서 되도록이면 0번 비트부터 순차적으로 활용하고 싶을것이고 중간에 비는 공간이 없길 원할 것임
        // 이 이유로 위의 변수 BIAS 활용

        final int FIRST_RANGE = 6;  // 5~10 6개
        final int FIRST_OFFSET = 5;
        // 0<=Math.random() * 6< 6 이기 때문에 +5로 5, 6, 7, 8, 9, 10의 정수가 나오도록함.

        final int SECOND_RANGE = 4; // 7~10 4개
        final int SECOND_OFFSET = 7;
        // 0<=Math.random() * 4< 4 이기 때문에 +7로  7, 8, 9, 10의 정수가 나오도록함.

        final int BIN = 1;
        int testBit = 0;
        int randNum;

        // 5 ~ 10 ---> 6개 A조
        for (int i = 0; i < FIRST_RANGE; i++) {
            // 5 ~ 10
            // 실제 출력값은 5~10을 사용하고,비트연산에서는 0번~5번 비트를 사용>>> BIAS 이용
            // 2^5, 2^6, 2^7, 2^8, 2^9, 2^10
            // 2^0, 2^1, 2^2, 2^3, 2^4, 2^5
            randNum = (int)(Math.random() * FIRST_RANGE + FIRST_OFFSET);
            while ((testBit & (BIN << (randNum - FIRST_BIAS))) != 0) {
                randNum = (int)(Math.random() * FIRST_RANGE + FIRST_OFFSET);
            }
            System.out.printf("5 ~ 10 randNum = %d\n", randNum);
            testBit |= (BIN << (randNum - FIRST_BIAS));
        }
        System.out.println("testBit = " + testBit);

        // 7 ~ 10 ---> 4개 B조
        for (int i = 0; i < SECOND_RANGE; i++) {
            // 7 ~ 10
            // 출력되는 숫자는 7 ~ 10을 사용하고, 비트 연산에는 6번 ~ 9번 비트를 사용.
            // 2^7, 2^8, 2^9, 2^10
            // 2^6, 2^7, 2^8, 2^9
            randNum = (int)(Math.random() * SECOND_RANGE + SECOND_OFFSET);

            while ((testBit & (BIN << (randNum - SECOND_BIAS))) != 0) {
                randNum = (int)(Math.random() * SECOND_RANGE + SECOND_OFFSET);
            }

            System.out.printf("7 ~ 10 randNum = %d\n", randNum);

            testBit |= (BIN << (randNum - SECOND_BIAS));
        }
        System.out.println("testBit = " + testBit);
        }
    }
// 2^9   2^8   2^7   2^6   2^5   2^4   2^3   2^2   2^1   2^0
//  0     0     0     0     0     0     0     0     0     0
