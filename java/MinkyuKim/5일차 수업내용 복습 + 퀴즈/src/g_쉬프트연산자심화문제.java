public class g_쉬프트연산자심화문제 {
    public static void main(String[] args) {
        // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
        final int BIN = 1;
        //BIN 2진법의 binary의 약어.
        //final은 값을 고정시킨다는 것. 함부로 값을 변경시킬시 큰 문제가 발생할 수 있음. 주의해야함.
        //BIN이 1부터 시작하는 것은 논리적 오류 발생

        int testBit = 0;
        int randNum;
        // randNum의 값을 지정하지 않아도 되는 것은 주사위의 값으로 표현될 것이기 때문에?
        // 실제로 영향을 안주는 0 값으로 바꾸어도 기능상 별 상관이 없음.

        for(int i= 0; i < 10; i++) {
            randNum = (int) (Math.random() * 10);
            // 0~9까지; i는 10미만으로 설정; 증감식 i++ 입력
            // int형 숫자로 0~9까지 랜덤출력을 위한  Math.random * 10.
            // 즉 i가 0부터 9(Math.random * 10)까지 수를 무작위로 10번(i<10 : i=0부터니 9까지 10번)을 출력하게 됨.
            // 즉 주사위를 굴리는 횟수, 출력하는 횟수와 관계?

            while ((testBit & (BIN << randNum)) != 0) {
                randNum = (int) (Math.random() * 10);

                // testBit는 현재 0이므로 0*2의 n승(0~9)=0이 나옴.
                // 중복이 있는지 검사하는 과정
                //중복문제 해결 0 or 2^0, 0 or 2^1, 0 or 2^2.......으로 이어지면서 ^0 ~ ^9

            }
            System.out.printf("randNum = %d\n", randNum);

            testBit |= (BIN << randNum);
            // 2^0 ~ 2^9의 합 = 1023

        }
        System.out.println(testBit);
        //1023 출력



        }
    }

