public class Quiz_22 {
    public static void main(String[] args) {
        final int Bin = 1;

        int testBit = 0;
        int randNum;
        int randNum1;


        System.out.println("5 ~ 10의 범위");

        for (int i = 0; i < 6; i++) {
            randNum = (int)(Math.random() * 6 + 5);

            while ((testBit & (Bin << (randNum - 5))) != 0) {
                randNum = (int)(Math.random() * 6 + 5);

            }
            System.out.printf("ranNum = %d\n", randNum);
            testBit |= (Bin << (randNum - 5));
        }

        System.out.println(" 7 ~ 10의 범위");

        for (int j = 0; j < 4; j++) {
            randNum1 = (int)(Math.random() * 4 + 7);

            while ((testBit & (Bin << (randNum1 - 1))) != 0) {
                randNum1 = (int)(Math.random() * 4 + 7);

            }
            System.out.printf("ranNum1 = %d\n", randNum1);
            testBit |= (Bin << (randNum1 - 1));
        }

    }

}