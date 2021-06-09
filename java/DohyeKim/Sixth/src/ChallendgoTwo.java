public class ChallendgoTwo {
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
