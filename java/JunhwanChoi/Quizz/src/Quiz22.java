public class Quiz22 {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;  //BIN 값은 변하지 않음 : final

        int testBit = 0;    // 0으로 초기화
        int randNum;        // 난수를 받을 randNum변수 선언


        for (int i = 0; i < 10; i++)  // 0 ~ 9 가 나올것
            {
            randNum = (int)(Math.random() * 10);    //0~9까지의 난수를 생성하여 randNum에 저장

            while ((testBit & (BIN << randNum)) != 0)                           // i=0 -->  (( 0 & ( 1 << 난수 0~9)) != 0 )
            {
                System.out.println("중복이 이렇게나 많이 발생합니다: " + randNum);
                randNum = (int)(Math.random() * 10);
            }

            System.out.printf("randNum = %d\n", randNum);


            testBit |= (BIN << randNum);
        }

        System.out.println("testBit의 최종값은 1023이다. 진짜 ? " + testBit);

        Thread.sleep(500);
    }
}

