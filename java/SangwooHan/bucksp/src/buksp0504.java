public class buksp0504 {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;
// 이건  저의 정리가 아직안된, 개념들을 혼자 정리해본 개념입니다.

        int testBit = 0;
        int randNum;


        for (int i = 0; i < 10; i++) {
            // 0 ~ 9 가 나올것
            randNum = (int)(Math.random() * 10);
            //4가 나왔다고 하자.


            //0    &  (1 << 4)  이 0이 아닐때 조건충족되면 randNum = (int)(Math.random() * 10);
            // 으로 빠질것이다.  randNum이 4일때 and연산자로 값을 출력하면 0이 뜬다.
            // 즉 while 식에 충족하지 않으므로
            //System.out.printf("randNum = %d\n", randNum); 으로 넘어가겠다.
            // randNum = 4 라는 판정이뜬다.
            // 그다음 testBit  |= (BIN << randNum); 으로넘어가는데,
            // 동의어 를 적자면 testBit = testBit | (BIN << randNum);
            // 0 = 0 | 1<< 4
            // testBit는 16이된다가 된다.
            // 0 = 0 + (1X2^4)
            // testBit는 현재 2^4(16)을저장후 포문에 따라 다시 위로가서 2바퀴째
            // 만약 또 랜덤하게 4가 나왔다다고 하자,
            // 그럼이제 while 문에 식을 정수로 표현하자면, 16 & (1<<4) !=0
            // 2^4 과 & 2^4 이  무엇일까? --> 엔드연산자는 교집합처리를 하니까,
            // 2^4 이 나온다 즉, while 식에 충족이 되어
            //   randNum = (int)(Math.random() * 10);으로 들어가 번호를다시뽑는다.
            //  이제 첫번째 testBit 는 이진법 2^0 2^1 2^2 2^3 2^4 2^5 2^6 2^7 2^8 2^9중
            //     2^4의 2진법 인 10000를 갖고있기에, 위에서온 2^4즉 10000를만나
            //  엔드연산결과가 0이 아닌 10000, 즉 2^4 (16)이 나와서
            // while은 어? 0이 아니네?(어중복이네? 와 같은맥락)  너그러면, 아래 로직줄테니까 다시뽑아, 해서 만약또4뽑으면 같은 로직으로한바퀴 또 도는거고
            // 만약 5가뜨면,

            // randNum = 5 를 저장하고
            // 아래 testBit  OR 연산자로
            // 현재 testBit는 2^4 인데 2^5승이 OR 연산되어 합집합 하게된다,
            // 즉, 5가 나왔을때,
            // testBit의 값은 2^4 | 2^5 된거로 2진법으로 나타냈을땐 110000
            // 같은 개념으로, 다음에 5가 나왔을때 비교해보자,
            // ( 계속저장되어있는 testbit=110000 & 새로 굴러온 randNum 5 =100000 ) = 100000으로 0이 아니여서
            // while 문이 어? 너 0이 아니네?(여태 저장된숫자중에 너꺼있다 아래로직으로 다시뽑자;;)
            // 해서 2가걸리면, 2가 시스템아웃에 배출되고
            // testbit는 또다시, 110000에서 2^1을 저장한다,
            // testbit 그럼 110010 이되어 다음 2,5,6,은 걸러진채로 다른숫자들이 배출될것이다.

            while ((testBit & (BIN << randNum)) != 0) {
                System.out.println("저기요?"+randNum+"은 중복입니다 다시뽑아주시죠");
                randNum = (int)(Math.random() * 10);
            }

            System.out.printf("randNum = %d\n", randNum);


            testBit |= (BIN << randNum);
            // 핵심적인 코드는 while { ((testBit & (BIN << randNum)) != 0)
            //  randNum = (int)(Math.random() * 10); }
            // 위코드는 2진법적으로 저장된 testBit 새로굴러들어오는 2진법이 교집합 하였을때, 0이되냐마냐로 중복결정을 하는 중요한로직,


            // testBit |= (BIN << randNum)
            // 이로직은 아래에서 조건충족이 되어 굴러떨어진 randNum을  2진법적을 계속 더해주는 핵심적인 로직
        }




    }
}
