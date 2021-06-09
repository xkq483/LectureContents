public class _4th_Quiz23_Selfstudy {
    public static void main(String[] args) throws InterruptedException {


        final int BIN = 1;
        int testBit1 = 0;
        int testBit2 = 0; 
        // 1번 while문 끝낼 때 그냥 testbit 하나로만 쓰면 무한루프 걸림.
        int randNum;

        for (int i = 0; i < 6; i++) {
            randNum = (int) (Math.random() * 6 + 5);

            while ((testBit1 & (BIN << randNum)) != 0) {
                randNum = (int) (Math.random() * 6 + 5);
            }

            System.out.printf("5 ~ 10 randNum = %d\n", randNum);
            testBit1 |= (BIN << randNum);
        }
        System.out.println("testBit = " + testBit1);

        for (int i = 0; i < 4; i++) {
            randNum = (int) (Math.random() * 4 + 7);

            while ((testBit2 & (BIN << randNum)) != 0) {
                randNum = (int) (Math.random() * 4 + 7);
            }

            System.out.printf("7 ~ 10 randNum = %d\n", randNum);
            testBit2 |= (BIN << randNum);
        }
        System.out.println("testBit = " + testBit2);
    }
}