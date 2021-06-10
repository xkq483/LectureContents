public class NonDuplicateWithoutArrayTest {
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;

        //2진 비트 연산자 And와 OR연산자 활용
        //또한 시프트 연산자를 함께 활용해 각각의 비트를 채우는 형식으로 코드를 구현
        int testBit = 0; //랜덤 10개 할당
        int randNum; //0~9가 나올것

        for (int i = 0; i < 10; i++) {


          randNum  = (int)(Math.random() * 10);

          // 나온 randNum에 대한 중복 판정을 어떻게 할 것인가 ? bit 연산
          // 2^9   2^8   2^7   2^6   2^5   2^4   2^3   2^2   2^1   2^0
          //                          1     1                 1
            
          //시프트연산의 결과 비트를 왼쪽으로 이동시킴
            // 1 << 2 ===> 2^0 x 2^2 = 4   (비트를 왼쪽으로 2칸 이동시킴)
            // 1 << 4 ===> 2^0 x 2^4 = 16  (비트를 왼쪽으로 4칸 이동시킴)
            // 1 << 8 ===> 2^0 x 2^8 = 256 (비트를 왼쪽으로 8칸)
            // 1 << 9 ===> 2^0 x 2^9 = 512 (왼쪽으로 9칸)

          while ((testBit & (BIN << randNum)) != 0) { //0이 아니라면 중복
              System.out.println("중복이 이렇게나 많이 발생합니다: " + randNum);
              randNum = (int)(Math.random() * 10);
              } // 진법 변환은 이해가 가는데 while에서 중복 발생을 어떻게 찾는지 모르겠다

            System.out.printf("ranNum = %d\n", randNum);

              testBit |= (BIN << randNum);
            }
        System.out.println("testBit의 최종값은 1023이다. 진짜? " + testBit);

             Thread.sleep(500);

        }
    }

// 10101000
// 7x5x3xxx
//  128 32  8