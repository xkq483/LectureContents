public class ChallengeTest {
    public static void main(String[] args) {
        final int BIN = 1 ;

        int testBit1 = 0 ;
        int testBit2 = 0 ;

        int randNum1;
        int randNum2;

        // 검사 횟수
        for(int i = 1 ; i < 11 ; i++) {

            randNum1 = ((int)(Math.random() * 6 + 5 ));
            randNum2 = ((int)(Math.random() * 4 + 7 ));

            while((testBit1 & (BIN << randNum1)) != 0) {
                randNum1 = ((int)(Math.random() * 6 + 5 ));
            }

            // Math.random()에 곱하는 숫자가 결국 나올 수 있는 숫자의 범위 개수다.
            // 검사 횟수가 11번인데 범위의 개수는 4개이므로
            // 영원히 반복하게 된다.
            while((testBit2 & (BIN << randNum2)) != 0) {
                randNum2 = ((int)(Math.random() * 4 + 7 ));
            }

            if(randNum1 != randNum2) {
                System.out.printf("randNum1 = %d, randNum2 = %d\n", randNum1, randNum2 );

                testBit1 |= (BIN << randNum1);
                testBit2 |= (BIN << randNum2);
            }
        }
    }
}
