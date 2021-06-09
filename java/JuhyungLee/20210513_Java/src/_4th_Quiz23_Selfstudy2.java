public class _4th_Quiz23_Selfstudy2 {
    public static void main(String[] args) {

        int randNum1, randNum2;
        int testBit1 = 0, testBit2 = 0;
        int BIN = 1;

        for(int i = 0; i < 6; i++){
            randNum1 = (int)(Math.random() * 6 + 5);
            while((testBit1 & (BIN << randNum1)) != 0){
                randNum1 = (int)(Math.random() * 6 + 5);
            }
            System.out.println(randNum1);
            testBit1 |= (BIN << randNum1);
        }

        for(int i = 0; i < 4; i++){
            randNum2 = (int)(Math.random() * 4 + 7);
            while((testBit2 & (BIN << randNum2)) != 0){
                randNum2 = (int)(Math.random() * 4 + 7);
            }
            System.out.println(randNum2);
            testBit2 |= (BIN << randNum2);
        }
    }
}

