public class TestSever05 {
    public static void main(String[] args) {

        int BIN = 1;
        int randNum = 4;
        int testBit = 0;


        testBit |= (BIN << randNum);

        System.out.println(testBit);

    }
}
