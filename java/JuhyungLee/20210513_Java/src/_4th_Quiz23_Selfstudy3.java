public class _4th_Quiz23_Selfstudy3 {
    public static void main(String[] args) throws InterruptedException {

        int randNum1, randNum2;
        int testBit= 0;
        int BIN = 1;

        for(int i = 0; i < 6; i++){
            randNum1 = (int)(Math.random() * 6 + 5);
            while((testBit & (BIN << randNum1)) != 0){
                randNum1 = (int)(Math.random() * 6 + 5);
            }
            System.out.println(randNum1);
            testBit |= (BIN << randNum1);
        }

            testBit = 0;

        for(int i = 0; i < 4; i++){
            randNum2 = (int)(Math.random() * 4 + 7);
            while((testBit & (BIN << randNum2)) != 0){
                randNum2 = (int)(Math.random() * 4 + 7);
            }
            System.out.println(randNum2);
            testBit |= (BIN << randNum2);
        }
    }
}