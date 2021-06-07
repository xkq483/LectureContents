public class a_비트연산자 {
    //비트연산자를 이용한 중복회피 문제
    public static void main(String[] args) {
        final int Bin = 1;
        int testBit = 0;
        int randNum;

        for(int i = 0; i < 10; i++) {
            randNum =(int)(Math.random() * 10);

            //i는 돌아가는 횟수. 즉 0~9까지 총 10회를 돌리게됨. 랜덤수
            // 0~9 까지를 랜덤으로 10회출력

            while ((testBit & (Bin << randNum)) !=0) {
                randNum = (int) (Math.random() * 10);

                // 0이므로 while문은 돌지 않는다 > or 관계연산자에서 입력되지 않은 2^n이 0~9까지 중복되지않되게 입력된다
                // souf를 통해 randNum의 값이 출력된다.
            }
            System.out.printf("randNum = %d\n", randNum);

            testBit |= (Bin << randNum);
        }
    }
}
