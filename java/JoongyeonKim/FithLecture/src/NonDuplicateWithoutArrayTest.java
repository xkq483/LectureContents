public class NonDuplicateWithoutArrayTest {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;

        // 2진 비트 연산자 AND와 OR 연산자를 활용함
        // 또한 쉬프트 연산자를 함께 활용해서 각각의 비트를 채우는 형식으로 코드를 구현했음
        int testBit = 0;
        int randNum;


        for (int i = 0; i < 10; i++) {    //i가 소괄호 내부에만 존재하는데 어떻게 중괄호까지 영향을 주는건가요??
            // 0 ~ 9 가 나올것               //중복된 수 없이 모든 수가 출력된다면 for문을 빠져나온다
            randNum = (int)(Math.random() * 10);

            // 나온 randNum에 대한 중복 판정을 어떻게 할 것인가 ? : bit 연산으로!
            // 2^9   2^8   2^7   2^6   2^5   2^4   2^3   2^2   2^1   2^0  <-testBit에 점점 값이 쌓여감
            //                                1                           <-쌓인 값은 이렇게 채워짐(중복되면 다시 반복)

            // BIN = 2로 시작하면 2^1 에서 시작하는 것이라
            // 맨 마지막값이 무조건 2^1 x 2^9이 되서 1024가 더해지므로 논리적 오류가 발생함
            // 그러므로 BIN = 1로 만들어서 2^0 x 2^9 으로 512가 되게 처리해야 정상적인 결과가 나옴

            // 십진수기 때문에 위치가 이동할 때마다 10씩 곱해졌다.
            // 이진수는 위치가 이동할 때마다 2씩 곱해진다.

            // 이 부분은 중복이 있는지 없는지 검사하는 루틴
            /*
               testBit는 int형이니까 전체가 4바이트(32비트)
               ex) 4, 5, 4, 1
             */                                           //비트 연산자가 while부터 들어가 randNum이 2^(정수) 이 된다
            while ((testBit & (BIN << randNum)) != 0) {   //BIN의 값은 1로 final이라 값이 변화해도 다시 1로 돌아옴
                System.out.println("숫자가 중복됩니다!");    //0이 맞으면 빠져나옴

                randNum = (int)(Math.random() * 10);      //while 반복문 내에 randNum변수 생성
            }

            System.out.printf("randNum = %d\n", randNum);  //중복되지 않은 while문 randNum 출력

            // 실제 자리수 셋팅은 여기서 한다.
            // A += B ===> A = A + B
            // A |= B ===> A = A | B
            testBit |= (BIN << randNum);  // 여기서 testBit값이 (BIN << randNum); 랑 같아진다 만약 while문에서 여기서 같아진 값이
                                          // 나온다면 !=0으로 인해 while문내에서 다시 중복되지않은 숫자가 나올때 까지 반복한다
                                          //  만약 중복되지 않은 값이 나온다면 여기서 설정되지 않은 값이기에 0으로 설정되어서 빠져나와 중복되지 않은 숫자만 printf에 출력된다
        }

        System.out.println("testBit의 최종값은 1023이다. 진짜 ? " + testBit);  //반복문에서 빠져나와 2^9~2^0까지의 수를 더한다
        Thread.sleep(500);
    }
}

// 21 ---> 16(2^4) + 4(2^2) + 1(2^0)
//          10101
// 1, 3, 5 번째 비트지만
// 실제 표현할때는 0번 비트, 2번 비트, 4번 비트로 표현해주도록 한다.

// 73 ---> 64(2^6) + 8(2^3) + 1(2^0)
//            1001001
// 0번 비트, 3번 비트, 6번 비트로 표현됨

