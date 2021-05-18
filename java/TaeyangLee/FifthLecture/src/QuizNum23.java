public class QuizNum23 {
    public static void main(String[] args) {
        final int BIN = 1;
        int testBit = 0;
        int testBit2 = 0;

        int randNum;
        int randNum2;

        for(int i=0; i<6; i++){ //5,6,7,8,9,10  6개의 숫자를 뽑기위해 6번반복
            randNum = (int)(Math.random()*6+5); //6을 곱해줘서 0부터 6미만의 범위에 5를 더해줘서 5이상 11미만의 정수로 범위를 바꾸어준다

            while((testBit & (BIN <<randNum)) != 0){//testBit의 초기값은 0, 발생된난수의 중복확인
                randNum = (int)(Math.random()*6+5);

            }
            System.out.printf("randNum = %d \n",randNum);
            testBit |= (BIN << randNum);//비교후 중복되지않으면 testBit에 저장
        }

            for(int i=0; i<4; i++){
                randNum2 = (int)(Math.random()*4+7);  ////4을 곱해줘서 0부터 4미만의 범위에 7를 더해줘서 7이상 11미만의 정수로 범위를 바꾸어준다
                while((testBit2 & (BIN <<randNum2)) != 0){//testBit2의 초기값은 0, 발생된난수의 중복확인

                    randNum2 = (int)(Math.random()*4+7);

                }
                System.out.printf("randNum2 = %d \n",randNum2);

                testBit2 |= (BIN << randNum2); //비교후 중복되지않으면 testBit에 저장
            }

        }

}




