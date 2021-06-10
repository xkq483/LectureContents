public class _1st_NonDuplicateWithoutArrayTest {
    public static void main(String[] args) throws InterruptedException {

        // 0 ~ 9까지의 숫자가 중복이 없게 나오도록(단, 배열 없이)
        // 2진 비트 AND연산자와 OR연사자를 활용
        //또한 쉬프트 연산자를 함께 활용해서 각각의 비트를 채우는 형식으로 코드를 구현.
        final int BIN = 1;
        int testBit = 0;
        int randNum;

        for (int i = 0; i < 10; i++){
            randNum = (int)(Math.random() * 10); // int형이므로 0 ~ 9 가 나올 것
            // 나온 randNum에 대한 중복 판정을 어떻게 할 것인가 >> bit 연산
            while((testBit & (BIN << randNum)) != 0){
                randNum = (int)(Math.random() * 10);
            }
            System.out.printf("randNum = %d\n", randNum);
            testBit |= (BIN << randNum);  // A |= B ===> A = A | B
        }
        Thread.sleep(500);
    }
}
// 2^9   2^8   2^7   2^6   2^5   2^4   2^3   2^2   2^1   2^0
//  1     0     0     0     0     0     0     0     0     0     2^9(512)
//  0     1     0     0     0     0     0     0     0     0     2^8(256)
//  0     0     1     0     0     0     0     0     0     0     2^7(128)
//  0     0     0     1     0     0     0     0     0     0     2^6(64)
//  0     0     0     0     1     0     0     0     0     0     2^5(32)
//  0     0     0     0     0     1     0     0     0     0     2^4(16)
//  0     0     0     0     0     0     1     0     0     0     2^3(8)
//  0     0     0     0     0     0     0     1     0     0     2^2(4)
//  0     0     0     0     0     0     0     0     1     0     2^1(2)
//  0     0     0     0     0     0     0     0     0     1     2^0(1)
