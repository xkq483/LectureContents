public class test {
    public static void main(String[] args) {
        //--------------------------------------------------------
        // 바뀌지 않는 값이기 때문에 final로 지정 해주었고 아래에서 FIRST_BIAS처럼  변수를 사용해
        // 코드의 가독성을 올리고 편집성을 올린듯 하다 .
        final int FIRST_BIAS = 5;
        final int SECOND_BIAS = 1;

        final int FIRST_RANGE = 6;
        final int FIRST_OFFSET = 5;

        final int SECOND_RANGE = 4;
        final int SECOND_OFFSET = 7;

        final int BIN = 1;
        //-----------------------------------------------------
        int testBit = 0;
        int randNum;

        // 5 ~ 10 ---> 6개 A조
        for (int i = 0; i < FIRST_RANGE; i++) {
        // 5~10 까지의 숫자가 6개범위이기 때문에 for문도 범위에 맞춰 RANGE를 설정

            randNum = (int)(Math.random() * FIRST_RANGE + FIRST_OFFSET);
            // 랜덤값 Matr.random() 은 0.0 ~ 0.99999이기 때문에  6을 곱해주면
            // 0 부터 5까지의  6개의 숫자가 나오게 되고 FIRST_OFFSET = 5
            // 를 더해주면 범위는 5 ~ 10까지의 범위내에서 랜덤으로 번호를 뽑아내서
            //  randNum에 설정 --- > 그렇게 총 6개의 숫자를 뽑아냄

            while ((testBit & (BIN << (randNum - FIRST_BIAS))) != 0) {
                // while문 조건에 randNum - FIRST_BITS 를 하는 이유는
                // 5 ~ 10 사이의 숫자가 나오겠지만
                // 2^5 2^6 2^7 2^8 2^9 2^10
                // 2^0 2^1 2^2 2^3 2^4 2^5 순서대로 담기위해서 -5
                // 만약 랜덤 숫자가 5 가 나왔더라면 testBit 와 앤드연산을 해서
                // 1이 되므로 2^0 비트에 담기게되는 원리?인데 여기서는 중복을 제거 하는 구문이고
                // 중복이나오면 아래 구문처럼 다시 랜덤숫자 뽑음
                // 배열의 인덱스방 같은 느낌으로 생각하는중
                randNum = (int)(Math.random() * FIRST_RANGE + FIRST_OFFSET);
                // 만약 while문이 만족된다면 위처럼 다시 랜덤 숫자 뽑아내도록 설정
            }

            System.out.printf("5 ~ 10 randNum = %d\n", randNum);

            testBit |= (BIN << (randNum - FIRST_BIAS));
            // 여기서는 중복되지 않은 결과를 testBit 에 OR 연산을 사용해
            // or연산은 합집합개념 testBit의 2^0에 위치시킨다
            // 이런개념 !같음

        }

        System.out.println("testBit = " + testBit);
        // 그렇게 testBit의 결과값은 다꺼내보면
        // 2^0 +2^1+ 2^2+ 2^3+ 2^4+ 2^5 으로
        // 결과값은 : 63 이 나올것이다 .

        // 7 ~ 10 ---> 4개 B조
        // ------------------------위에 정리하여서 아래도 동일하다고 판단------------------
        for (int i = 0; i < SECOND_RANGE; i++) {


            randNum = (int)(Math.random() * SECOND_RANGE + SECOND_OFFSET);


            while ((testBit & (BIN << (randNum - SECOND_BIAS))) != 0) {
                randNum = (int)(Math.random() * SECOND_RANGE + SECOND_OFFSET);
            }

            System.out.printf("7 ~ 10 randNum = %d\n", randNum);

            testBit |= (BIN << (randNum - SECOND_BIAS));
        }

        System.out.println("testBit = " + testBit);

        // 예로 추첨(랜덤) 시스템을 돌렸다고 가정함
        // 이번 추첨의 당첨자는 A조의 2번(랜덤으로 나온값) 고객님입니다 ~~!!~!
        if ((testBit & (1 << 2)) != 0) {
            System.out.println("당첨을 축하드립니다! 당신이 뽑은 번호는 A조 " + (2 + FIRST_BIAS));
        }
    }
}