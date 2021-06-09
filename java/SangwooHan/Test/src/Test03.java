
public class Test03 {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;


        int testBit = 0;
        int randNum;


        for (int i = 0; i < 10; i++) {
            // 0 ~ 9 가 나올것
            randNum = (int) (Math.random() * 10);
            while ((testBit & (BIN << randNum)) != 0) {
                System.out.println("저기요?" + randNum + "은 중복입니다 다시뽑아주시죠");
                randNum = (int) (Math.random() * 10);
            }

            System.out.printf("randNum = %d\n", randNum);


            testBit |= (BIN << randNum);
        }

    }
    }
