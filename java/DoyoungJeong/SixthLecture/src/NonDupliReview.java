public class NonDupliReview {
    public static void main(String[] args) {
        int ranNum;
        int testbit=0;


        for(int i=1; i<=6; i++) {
            ranNum = (int)(Math.random()*6+5);

            while((testbit & (1 << (ranNum - 5))) != 0) {
                ranNum = (int)(Math.random()*6+5);
            }

            System.out.printf("1)출력 숫자 : %d\n", ranNum);
            testbit += (1 << (ranNum - 5)); // |=를 +=로 바꿔봤는데요, 그래도 동일한 값이 나오는건 자리값이 겹치지 않는 2진수가 testbit에 더해지기 때문인가요??
        } // 0 1 2 3 4 5

        for(int i=1; i<=4; i++) {
            ranNum = (int)(Math.random()*4+7);

            while ((testbit & (1 << (ranNum - 1))) != 0) {
                ranNum = (int)(Math.random()*4+7);
            }

            System.out.printf("2)출력 숫자 : %d\n", ranNum);
            testbit += (1 << (ranNum - 1));
        } // 6 7 8 9

    }
}
