public class NonDuplicateTest {
    public static void main(String[] args) {

        final int BIN = 1;        //고정된 값인 final 키워드의 BIN변수

        int testBit = 0;          //첫번째 난수의 testBit와 randNum
        int randNum;

        int testBit2 = 0;         //두번째 난수의 testBit2와 randNum
        int randNum2;

        for (int i = 0; i < 5; i++) {
             randNum = (int) (Math.random() * 6 +5);
             //범위의 최대값은 11을 곱해주고 최소값은 5를 더해준다.
            //여기까지의 범위는 5~16이다.
            //5를 더해주면 최대,최소값이 동시에 변하기때문에 최대값을 곱해줄때 (11-5) 더해준 5를
            //빼면서 곱해준다. (Math.random() * (11-5) + 5)

            while ((testBit & (BIN << randNum)) != 0) {
                //testBit에 0를 세워두고 int형이기 때문에 32개의 비트가 있을것이다
                //BIN에는 2^0승인 1을 기본값으로 설정해놓고 일정한범위의 randNum값만큼 왼쪽으로
                //이동시켜서 값을 변화시킨다.
                //&나 |는 모두 비트연산자로서, 둘다 두비트가 1일땐 1, 0일땐 0이지만,
                //두비트가 같지않을떄 &는 0, |는 비트를 채워준다. 1로
                 randNum = (int) (Math.random() * 6 +5);
            }
            System.out.printf("첫번째 난수 randNum = %d\n", randNum);

            testBit |= (BIN << randNum);
            //여기서는 while문 조건에 해당하지 않는 randNum변수가 왔을것이다.
            //while문에서는 &연산자로 두비트가 같지않을때 0으로 만드는 특성으로 조건을 썻다면,
            //여기서는 실제로 그 비트자리에 |로 1을 채워주므로써 중복되지 않게 한다.

        }

        System.out.println("========================");

        for (int j = 0; j < 4; j++) {
            randNum2 = (int) (Math.random() * 4 +7);

            while ((testBit2 & (BIN << randNum2)) != 0) {
                randNum2 = (int) (Math.random() * 4 +7);
            }
            System.out.printf("두번째 난수 randNum = %d\n", randNum2);

            testBit2 |= (BIN << randNum2);

        }
    }
}


