public class homework_0513 {
    public static void main(String[] args) {
        //앞서서 22번의 경우엔 난수의 범위가 0 ~ 9 였다.
        //이번에는 2개의 범위를 가지는 난수 2개를 중복없이 제어해보자!
        //하나는 5 ~ 10의 범위를 가지고 다른 하나는 7 ~ 10의 범위를 가진다.
        //22번 예제를 응용하여 풀 수 있는 문제고 다소 난이도가 높은 문제다.
        //ex) 5, 6, 7, 8, 9, 10이 모두 출력되어야 하고 또한 7, 8, 9, 10이 출력되어야 한다.
        //    여기서 중복이 발생하면 안됨
        System.out.println("23. 중복 방지 문제(Challenge)");

        final int BIN = 1;

        int testBit = 0, testBit2 = 0;
        int randNum, randNum2;

        for (int i = 0; i < 6; i++) {
            // 5 ~ 10
            randNum = (int)(Math.random() * 6 + 5);
            // Math.random() 값 지정하는법 (초기범위 0 ~ 1 , * 사용)
            // 1.최대값 지정 : 범위시작인 0에는 뭘 곱해도 0이기 때문에 최대값인 1에 최대범위를 곱하면됨 (Math.random() * 10)
            // 2.최소값 지정 : 최소값 변경시에는 + 써야함, 주의 할 점 : 최소값 변경하면 최대값도 같이 변함
            // 해결방법 : 최대값 설정시 최대값에서 최소값을 뺴버린 값을 대입.
            // 5~10 -> (10-5)+5 여기서 또 문제. 이러면 5~9까지만 나온다. 그러므로 초기 최대값에 1을 더해서 변경해준다.
            // -> (11-5)+5
            // **반복연습 필요**
            while ((testBit & (BIN << randNum)) != 0) {
//                System.out.println("중복이 많이 발생1 : " + randNum);
                randNum = (int)(Math.random() * 6+5);
            }

            System.out.printf("randNum = %d\n", randNum);

            testBit |= (BIN << randNum);
        }

        for (int i = 0; i < 4; i++) {
            // 7 ~ 10
            randNum2 = (int)(Math.random() * 4 + 7);
            // 7~10 -> (10-7)+7
            // --> (11-7)+7

            while ((testBit2 & (BIN << randNum2)) != 0) {
//                System.out.println("중복이 많이 발생2 : " + randNum2);
                randNum2 = (int)(Math.random() * 4 + 7);
            }

            System.out.printf("randNum2 = %d\n", randNum2);

            testBit2 |= (BIN << randNum2);
        }


//        System.out.println("testBit의 최종값은 1023이다" + testBit);

    }
}
