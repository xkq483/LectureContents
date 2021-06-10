public class Quiz23 {
    public static void main(String[] args) {

        final int BIN1 = 1;
        final int BIN2 = 1;
        int testBit1=0;
        int testBit2 = 0;
        int randNum1, randNum2;
        System.out.println(" 중복없이 5~10 출력하기");
        for (int i = 0; i < 6; i++ ) {
            randNum1 = (int)(Math.random()*6 + 5);

            while ((testBit1 & (BIN1 << randNum1)) != 0) {
                randNum1 = (int)(Math.random()*6 + 5);
            }

            System.out.println(" randNum1의 값 : " + randNum1);
            testBit1 |= (BIN1 << randNum1);
        }
        System.out.println(" 중복없이 7~10 출력하기");
        for(int i = 0; i < 4; i++) {
            randNum2 = (int)(Math.random()*4+7);

            while((testBit2 & (BIN2 << randNum2)) != 0) {
                randNum2 = (int)(Math.random()*4+7);
            }

            System.out.println(" randNum2의 값 : " + randNum2);
            testBit2 |= (BIN2 << randNum2);
        }
    }
}
