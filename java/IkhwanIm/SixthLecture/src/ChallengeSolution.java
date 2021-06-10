public class ChallengeSolution {
    public static void main(String[] args) {

    final int BIN = 1;
    int testBit = 0;
    int randNum;


        //5~10 6개
        for(int i = 0; i <6; i++){
            //5~10
            randNum = (int)(Math.random()*6+5);

            // 2^5 2^6 2^7 2^8 2^9 2^10
            // 2^0 2^1 2^2 2^3 2^4 2^5
            while ((testBit & (BIN<<(randNum-5)))!=0){
                randNum = (int)(Math.random()*6+5);
            }
            System.out.printf("5~10 randNum = %d\n", randNum);

            testBit |= (BIN << (randNum-5));
        }
        // 7~10 ---> 4개
        for(int i = 0; i < 4; i++) {
            //7~10
            randNum = (int)(Math.random()*4+7);

            while ((testBit & (BIN << (randNum - 1))) !=0) {
                randNum = (int)(Math.random() * 4 + 7);
            }
            System.out.printf("7~10 randNum = %d\n", randNum);
            testBit |=(BIN <<(randNum-1));
        }
        System.out.println("testBit = " + testBit);
    }
}
