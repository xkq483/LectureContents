public class ChallengeSolution {
    public static void main(String[] args) {
        final int BIN = 1;

        int testBit = 0;
        int randNum;

        // testBit를 가지고 제어할 수 있는 비트의 개수는 32개
        // 숫자가 많은것이 아니므로 32개의 공간을 최대한 효율적으로 활용해야 할 것임
        // (32개라서 1개가 아까운 상황이라고 보면 됨)
        // 이 상황에서 되도록이면 0번 비트부터 순차적으로 활용하고 싶을것이고 중간에 비는 공간이 없길 원할것임

        // 5 ~ 10 ---> 6개
        for (int i = 0; i < 6; i++) {
            // 5 ~ 10
            // 실제 출력값은 5 ~ 10을 사용하되
            // 비트 연산에서는 0 ~ 5를 사용하자는 것
            randNum = (int) (Math.random() * 6 + 5);

            // 2^5, 2^6, 2^7, 2^8, 2^9, 2^10
            // 2^0, 2^1, 2^2, 2^3, 2^4, 2^5
            while ((testBit & (BIN << (randNum - 5))) != 0) {
                randNum = (int) (Math.random() * 6 + 5);
            }
            System.out.printf("5 ~ 10 randNum = %d\n", randNum);

            testBit |= (BIN << (randNum - 5));
        }

        // 7 ~ 10 ---> 4개
        for (int i = 0; i < 4; i++) {
            // 7 ~ 10
            // 출력되는 숫자는 7 ~ 10을 사용,
            // 비트 연산에는 6 ~ 9를 사용
            randNum = (int) (Math.random() * 4 + 7);

            // 2^7, 2^8, 2^9, 2^10
            // 2^6, 2^7, 2^8, 2^9
            while ((testBit & (BIN << (randNum - 1))) != 0) {
                randNum = (int) (Math.random() * 4 + 7);
            }
            System.out.printf("7 ~ 10 randNum = %d\n", randNum);

            testBit |= (BIN << randNum - 1);
        }
        System.out.println("testBit = " + testBit);

        // 추첨 당첨자가 A조의 2번이라고 가정할때
        if ((testBit & (1 << 2)) != 0) {
            System.out.println("당첨 ㅊㅊ! 당신이 뽑은 번호는 " + (2 + 5));
        }
    }

}

