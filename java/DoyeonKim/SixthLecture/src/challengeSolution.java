public class challengeSolution {
    public static void main(String[] args) {
        // 우리는 현재 5 ~ 10을 사용하고 있음
        // 하지만 비트는 0 ~ 5를 표현해야하므로 5를 빼줘야함(빼는 바이어스값)
        final int FIRST_BIAS = 5;

        // 두 번째는 7 ~ 10을 사용하고 있음
        // 하지만 비트는 6 ~ 9를 사용해야하므로 1을 빼서 사용해야함(마찬가지로 빼는 바이어스값)
        final int SECOND_BIAS = 1;

        final int FIRST_RANGE = 6;
        final int FIRST_OFFSET = 5;

        final int SECOND_RANGE = 4;
        final int SECOND_OFFSET = 7;


        final int BIN = 1;
        int testBit = 0;
        int randNum;

        //5 ~ 10 ---> 6개 A조
        for (int i = 0; i < FIRST_RANGE; i++) { //5보다 작으면 i숫자 하나씩 늘려서 돌림
            randNum = (int)(Math.random() * FIRST_RANGE + FIRST_OFFSET); //5부터 10까지


            // 2^5, 2^6, 2^7, 2^8, 2^9, 2^10
            // 2^0, 2^1, 2^2, 2^3, 2^4, 2^5
            //테스트 비트가 0~5숫자가 들어옴
            while ((testBit & (BIN << (randNum - FIRST_BIAS))) != 0) {
                //랜덤값에서 5를 빼주기?
                randNum = (int)(Math.random() * FIRST_RANGE + FIRST_OFFSET);//5부터 10까지
            }
            System.out.printf("5 ~ 10 randNum = %d\n", randNum);

            testBit |= (BIN << (randNum - FIRST_BIAS));
        }

              System.out.println("testBit = " + testBit);

          for (int i = 0; i < SECOND_RANGE; i++) {

              randNum = (int)(Math.random() * SECOND_RANGE + SECOND_OFFSET); //3 ~ 10

              while ((testBit & (BIN << (randNum - SECOND_BIAS))) != 0) {
                  randNum = (int)(Math.random() * SECOND_RANGE + SECOND_OFFSET);
              }
              System.out.printf("7~10 randNum = %d\n", randNum);

            testBit |= (BIN << (randNum - SECOND_BIAS));
        }

        //2^10빼기 2^1승
        System.out.println("testBit = " + testBit);

        // 예로 추첨(랜덤) 시스템을 돌렸다고 가정함
        // 이번 추첨의 당첨자는 A조의 2번(랜덤으로 나온값) 고객님입니다 ~~!!~!
        if ((testBit & (1 << 2)) != 0) {
            System.out.println("당첨을 축하드립니다! 당신이 뽑은 번호는 A조 " + (2 + FIRST_BIAS));



            }
        }
    }

