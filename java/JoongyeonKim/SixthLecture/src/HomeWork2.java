public class HomeWork2 {
    //앞서서 22번의 경우엔 난수의 범위가 0 ~ 9 였다.
    //이번에는 2개의 범위를 가지는 난수 2개를 중복없이 제어해보자!
    //하나는 5 ~ 10의 범위를 가지고 다른 하나는 7 ~ 10의 범위를 가진다.
    //22번 예제를 응용하여 풀 수 있는 문제고 다소 난이도가 높은 문제다.
    //ex) 5, 6, 7, 8, 9, 10이 모두 출력되어야 하고 또한 7, 8, 9, 10이 출력되어야 한다.
    //    여기서 중복이 발생하면 안됨

    public static void main(String[] args) {
        final int BIN = 1;

        int testBit1 = 0;
        int testBit2 = 0;
        int randNum1;
        int randNum2;

        for(int i=0; i<6; i++) {
            randNum1 = (int) (Math.random() * 6 + 5);

            while ((testBit1 & (BIN << randNum1)) != 0) {  //while은 참이 나오면 반복조건을 실행한다 만약 결과가 0이라면 while문을 넘어가고
                randNum1 = (int) (Math.random() * 6 + 5); }   //0이 아니라면(중복된 숫자가 나온다면) while문을 실행하게된다

            System.out.println(randNum1);

            testBit1 |= (BIN << randNum1);
        }

                for (int j = 0; j < 4; j++) {
                randNum2 = (int) (Math.random() * 4 + 7);

                while ((testBit2 & (BIN << randNum2)) != 0) {
                    randNum2 = (int) (Math.random() * 4 + 7);
                }

                System.out.println(randNum2);

                testBit2 |= (BIN << randNum2);
        }
    }
}
