public class QuizTest23 {
    public static void main(String[] args) {
        //앞서서 22번의 경우엔 난수의 범위가 0 ~ 9 였다.
        //이번에는 2개의 범위를 가지는 난수 2개를 중복없이 제어해보자!
        //하나는 5 ~ 10의 범위를 가지고 다른 하나는 7 ~ 10의 범위를 가진다.
        //22번 예제를 응용하여 풀 수 있는 문제고 다소 난이도가 높은 문제다.
        //ex) 5, 6, 7, 8, 9, 10이 모두 출력되어야 하고 또한 7, 8, 9, 10이 출력되어야 한다.
        //    여기서 중복이 발생하면 안됨

        // 두개의 범위를 한번에 푸는 방법에 대한 아이디어는 생각 나지 않아 따로 변수를 지정하고 풀었다
        // 1 ~ 10 열 개의 정수중 5 ~ 10 6개의 정수만 나오면 될거 같아서 i < 6 이라고 조건을 달았는데 그러니 이상하게도
        // 돌릴때마다 출력되는 갯수가 달랐다 for문에 있는 변수 i가 의미하는 바를 정확히 이해하지 못한 것 같다.
        // i는 램덤으로 나오는 정수 10개를 다 본다는 의미인가??
        // 처음에는 중복되지 않은 정수 10개를 출력한다는 의미에서 i < 10 인줄 알았다.

       final int BIN = 1;

        int testBit = 0;
        int randNum;

        for (int i = 0; i < 10; i++) {
            randNum = (int)(Math.random() * 10 + 1);

            while ((testBit & (BIN << randNum)) != 0) {
                randNum = (int)(Math.random() * 10 + 1);
            }

            if(randNum > 4) {
                System.out.printf("randNum = %d\n", randNum);
            }

            testBit |= (BIN << randNum);

        }





        final int BIN2 = 1;

        int testBit2 = 0;
        int randNum2;

        for (int j = 0; j < 10; j++) {
            randNum2 = (int)(Math.random() * 10 + 1);

                    while ((testBit2 & (BIN2 << randNum2)) != 0) {
                        randNum2 = (int)(Math.random() * 10 + 1);
                    }

                    if (randNum2 > 6) {
                        System.out.printf("randNum2 = %d\n", randNum2);
                    }

                    testBit2 |= (BIN2 << randNum2);

        }

    }

}
