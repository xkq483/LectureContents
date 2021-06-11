public class BitAndTest {
    public static void main(String[] args) {
        final int BIN = 1;
        int testBit = 0;
        int randNum;
        // BIN값을 1로 고정시킨다
        // testBit는 0이다
        // randNum
        for (int i = 0; i < 10; i++) {
            randNum = (int)(Math.random() * 10);
            // i는 0이고, 10미만일때 동작하고, i에 계속하여 1을 더한다
            // randNum은 0~9까지 랜덤으로 출력한다

            while ((testBit & (BIN << randNum)) != 0) {
                randNum = (int) (Math.random() * 10);
            }
            // 처음에는 testBit는 0. 앞
            // 0(testBit) and 1*2의 randNum승, 0이 아닐동안 계
            //
            // randNum~ Math~ 부분은 위조건이 만족되지 않으면 계속하여 랜덤출력하라는 의미

            System.out.printf("randNum = %d\n", randNum);

            testBit |= (BIN << randNum);

            // or 연산 시작후부터 testbit가 더이상 0이아님, 처음은 0임
            // or 연산, 서로 중복되지 않은것을 모두 채워줌
            // 즉 testBit= testBit |(or)  BIN * randNum
            // 이 코드가 없다면, 항상 0이 출력됨

            // 중복방지
        }
    }

}
