public class Quiz23 {
    public static void main(String[] args) {
        //23. 중복 방지 문제(Challenge)
        //앞서서 22번의 경우엔 난수의 범위가 0 ~ 9 였다.
        //이번에는 2개의 범위를 가지는 난수 2개를 중복없이 제어해보자!
        //하나는 5 ~ 10의 범위를 가지고 다른 하나는 7 ~ 10의 범위를 가진다.
        //22번 예제를 응용하여 풀 수 있는 문제고 다소 난이도가 높은 문제다.
        //ex) 5, 6, 7, 8, 9, 10이 모두 출력되어야 하고 또한 7, 8, 9, 10이 출력되어야 한다.
        //    여기서 중복이 발생하면 안됨

        final int BIN = 1;
        int testBit1 = 31;
        int testBit2 = 127;
        // testBit에 출력하지 않을 숫자를 미리 입력해두자
        // 1 2 3 4 쉬프트 미리미리 입력
        // 00000011111 ==> 31
        // 마찬가지로 7 8 9 10만 나오게 하려면 테스트비트가 00001111111 ==> 127
        int randNum1;
        int randNum2;


        for (int i = 1; i < 7; i++) {
            randNum1 = (int) (Math.random() * 11);

            while ((testBit1 & (BIN << randNum1)) != 0) {
                // 4나오면 00000010000
                //        00000011111 AND -> 00000010000 != 0 연산하믄 true값
                // 5나오면 00000100000
                //        00000011111 AND -> 00000100000 != 0 연산하믄 false값 탈출!


                //System.out.println("중복이 이렇게 많이 발생합니다" + randNum1);
                randNum1 = (int) (Math.random() * 11);
            }
            testBit1 += (BIN << randNum1);
            //Q. 결과는 잘 나오는데 제대로 쓴 건지 잘 모르겠습니다.
            //
            //   22번대로 하면 제가 생각하기에는 testBit값이 0 그대로 변하지를 않아서 중복체크를 못 해야 하는데 정상작동하는 게 이해가 되지 않습니다.
            //   quiz23을 풀 때도 testBit값이 변하질 않아 중복체크가 안 돼서 위처럼 밖으로 빼 randNum1을 testBit에 더해 중복체크를 했습니다.
            //   저처럼 따로 빼는 거 없이도 돌아가는 22번 예제와 차이가 무엇인지 궁금합니다.

            System.out.printf("ranNum = %d\n", randNum1);
            }
        System.out.println();
        for (int d = 1; d < 5; d++) {
            randNum2 = (int) (Math.random() * 11);

            while ((testBit2 & (BIN << randNum2)) != 0) {
                //System.out.println("중복이 이렇게 많이 발생합니다" + randNum2);
                randNum2 = (int) (Math.random() * 11);
            }
            testBit2 += (BIN << randNum2);

            System.out.printf("ranNum2 = %d\n", randNum2);
        }
    }
}
