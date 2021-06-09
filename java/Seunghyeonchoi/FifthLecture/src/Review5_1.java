public class Review5_1 {
    public static void main(String[] args) {
        //0~9 숫자가 중복되지 않게 ㄱ

        //final
        final int BIN = 1;
        int testBit = 0;
        int randNum;

        //2진수 변환 방법 ok

        for (int i = 0; i < 10; i++)    {
            randNum = (int)(Math.random() * 10);
            //0~9.999... 나오겠지?
            //중복판정 방법 : bit 연산

            //쉬프트 연산의 결과 (비트를 왼쪽으로 이동시킴)
            //1 << 2    :   2^0 x 2^2 = 4    (비트를 왼쪽으로 2칸 이동시킴)
            //1 << 4    :   2^0 x 2^4 = 16   (비트를 왼쪽으로 4칸 이동시킴)
            //1 << 8    :   2^0 x 2^8 = 256  (비트를 왼쪽으로 8칸 이동시킴)
            //1 << 9    :   2^0 x 2^9 = 512  (비트를 왼쪽으로 9칸 이동시킴)
            //?

            //10000    :1이라는 숫자를 왼쪾으로 2칸 이동하면
            //1000000  :다음과 같이 나오고
            //그 값은 2^4에서 2^6가 된다

            //testbit는 int형이라 전체 4바이트(32비트)

            //최대값이 9가 이진수로 표현해도 1001 <-4자리
            //0001 0011 0101 0111 1001
            //  1    3    5   7    9
            // 9 & 1 = (0001)

            while ((testBit & (BIN << randNum)) != 0)   {
                System.out.println("중복이 이렇게 많이 발생합니다" +randNum);
                randNum = (int)(Math.random() * 10);
            }
            // 111111000 & 000000010  -> 000000000  0이네 != 하면 false값이네?
            // while문 종료 아래 println으로 주사위값 출력
            // 다시 for문 처음으로 롤백 주사위 돌림  5 나옴!
            // 111111000 & 0000100000    ->0000100000   0이 아니네 != 하면 true값
            // Q. 중복이 이렇게 많이 발생합니다....<<<<이거 왜 출력 안 되나?
            //

            System.out.printf("ranNum = %d\n", randNum);
        }

        System.out.println("testBit의 최종값은 1023이다." + testBit);

        //interrupt? 그냥 최우선 사항 딴 거 다 멈추고 제일 먼저 해야 함

        //비트 연산자
        // &    : AND
        // |    : OR

        int num1 = 10, num2 = 8;

        System.out.printf("%d AND %d = %d\n", num1, num2, num1 & num2);
        //10 AND 8 = 8
        //10 ==> 1010
        // 8 ==> 1000
        // AND하믄 1000 ==> 8 맞네
        num2 = 138;
        System.out.printf("%d OR %d = %d\n", num1, num2, num1 | num2);
        //10 OR 138 = 138
        //138 ==> 1000 1010
        //10  ==> 0000 1010
        // OR하믄  1000 1010 ==> 138 맞네
        //복습순서를 거꾸로 해버렸네



    }

}
