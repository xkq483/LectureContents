public class ChallengeAdditionalQuestion {
    public static void main(String[] args) {
        final int RANGE = 10;

        final int BIN = 1;
        int testBit = 0;
        int randNum;

        for (int i = 0; i < RANGE; i++) {
            randNum = (int)(Math.random() * RANGE);

            while ((testBit & (BIN << randNum)) != 0) {
                randNum = (int)(Math.random() * RANGE);
                System.out.println("마의 구렁텅이");
            }

            if (randNum > 3) {
                System.out.printf("3보다 큼: randNum = %d\n", randNum);
            } else {
                System.out.printf("3보다 작음: randNum = %d\n", randNum);
            }

            testBit |= (BIN << randNum);
        }
    }
}
