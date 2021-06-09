public class AndOrShift05 {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;


        int testBit = 0;
        int randNum;


        for (int i = 0; i < 10; i++) {
            // 0 ~ 9 가 나올것
            randNum = (int)(Math.random() * 10);
            //4가 나왔다고 하자.
            // randNum 값 현재 정수 4
            // while 이말한다 비트연산자 앤드로 testBit 하고 (BIN << randNum) 연산해서
            // 0이면 나통과해  근데 !=0이면, randNum을  다시뽑자, 언제까지? 0이 나올떄까지.
            // 현재 testbit 는 0  (BIN << randNum)은 2^4 (쉬프트연산되어)
            // 0 & 2^4  ==     00000000000 AND   //
            //                       10000       //
            //              ---------------      //    <- while 식
            //                           0      //
            // 앤드연산 하여 0이 나오면, testbit에 중복이 없는걸로 간주.
            // 만약있으면, testbit에 중복이 있는걸로 간주, 하여 중복이 안될떄까지 계속 돌린다.
            while ((testBit & (BIN << randNum)) != 0) {
                System.out.println("저기요?"+randNum+"은 중복입니다 다시뽑아주시죠");
                randNum = (int)(Math.random() * 10);
            }

            System.out.printf("randNum = %d\n", randNum);


            testBit |= (BIN << randNum);
            // 위에 randNum 의 값들을 저장하여, 이전에 나왔던 ranNum이 안뜨게끔
            // randNum의 2진법 공간들을 모으는역할을 하는 핵심적인  로직이다.
        }




    }
}

