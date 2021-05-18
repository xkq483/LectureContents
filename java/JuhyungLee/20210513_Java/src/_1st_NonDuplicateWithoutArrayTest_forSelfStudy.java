public class _1st_NonDuplicateWithoutArrayTest_forSelfStudy {
    public static void main(String[] args) throws InterruptedException {

        final int BIN = 1;
        int testBit = 0;
        int randNum;

        for (int i = 0; i < 10; i++){
            randNum = (int)(Math.random() * 10);

            while((testBit & (BIN << randNum)) != 0){
                randNum = (int)(Math.random() * 10);
            }
            System.out.printf("randNum = %d\n", randNum);
            testBit |= (BIN << randNum);
        }
        Thread.sleep(500);
        System.out.println("마지막 출력된 testbit는 2^9+2^8+2^7+.....2^1+2^0 = " + testBit);
    }
}