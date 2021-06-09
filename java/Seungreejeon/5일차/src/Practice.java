public class Practice {
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;

        int testBit = 0;
        int randNum;
        for (int i = 0 ; i < 6 ; i++) {
            randNum = (int)(Math.random()*6 + 5);

            while ((testBit & (BIN << randNum)) != 0) {
                randNum = (int) (Math.random()*6 + 5);
            }

            System.out.printf("\trandNum = %3d", randNum);

            if (randNum == 7 || randNum == 8 || randNum == 9 || randNum == 10) {
                System.out.printf("\trandNum2 = %3d" ,randNum);
            }

            testBit |= (BIN << randNum);

        }  Thread.sleep(500);
        //제가 이해한게 맞는지 모르겠습니다. 출력 값은 이렇게나옵니다.
    }

}
