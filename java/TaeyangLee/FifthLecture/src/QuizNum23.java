public class QuizNum23 {
    public static void main(String[] args) {
        final int BIN = 1;
        int testBit = 0;
        int testBit2 = 0;

        int randNum;
        int randNum2;

        for(int i=0; i<6; i++){
            randNum = (int)(Math.random()*6+5);

            while((testBit & (BIN <<randNum)) != 0){
                randNum = (int)(Math.random()*6+5);

            }
            System.out.printf("randNum = %d \n",randNum);
            testBit |= (BIN << randNum);
        }

            for(int i=0; i<4; i++){
                randNum2 = (int)(Math.random()*4+7);  //
                while((testBit2 & (BIN <<randNum2)) != 0){

                    randNum2 = (int)(Math.random()*4+7);

                }
                System.out.printf("randNum2 = %d \n",randNum2);

                testBit2 |= (BIN << randNum2);
            }

        }

}




