public class NonDuplicateWithoutArrayTest {
    public static void main(String[] args) throws InterruptedException {
        final int BIN =1;

        //2진 비트 연산자 AND 와 OR 연산자를 활용함
        //또한 쉬프트 연산자를 함께 활용해서 각각의 비트를 채우는 형식으로 코드를 구현했음
        int testBit = 0;
        int randNum;

        //2진수에 대한 이해가 필요함(이 문제를 다루기위해)


        for(int i =0; i<10; i++){
            //0~9가 나올것
            randNum =(int)(Math.random()*10);

            //나온 randNum에 대한 중복 판정을 어떻게 할 것인가? bit 연산
            //이진수는 위치가 이동할때마다 2씩 곱해진다.
            while((testBit & (BIN << randNum)) != 0){
                randNum = (int)(Math.random() * 10);
            }
            System.out.printf("randNu, = %d\n",randNum);

            testBit |= (BIN << randNum);


        }
        System.out.println(testBit);

        Thread.sleep(500
        );
        //컴퓨터 비트는 0번부터 셈
        /*
        관계연산자 AND와 비트연산자 AND는 서로 동작 방식에 약간의 차이가 있다.

        비트연산자 AND는 각 비트의 자리수가 1(참)인 녀석들끼리만 1(참)이 된다.
        하나라도 0(거짓)이 있으면 해당 자리수는 0(거짓)이 된다.

        비트연산자 OR은 각 빝의 자리수중 하나라도 1(참) 이있으면 1(참)이 된다.
        양쪽 모두 0(거짓)을 가지고 있는 경우에만 0(거짓)이 된다.

         */
    }

}
