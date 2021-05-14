// Quiz22의 예제는 난수 범위 0~9

// 이번에는 2개의 범위를 가지는 난수 2개를 중복없이 제어해보기
// 하나는 5~10의범위, 다른하나는 7~10의 범위를 가진다.

public class Quiz23 {
    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;  //BIN 값은 변하지 않음 : final

        int testBit1 = 0, testBit2=0;   // 0으로 초기화
        int randNum1;
        int randNum2;   // 난수를 받을 randNum변수 선언



        System.out.println("5~10난수 중복없이 제어해보기");

        for (int i = 1; i <=5; i++)     //5개 출력
        {
            randNum1 = (int)(Math.random() * 6+5);  //난수 범위 5~10

            while ((testBit1 & (BIN << randNum1)) != 0)
            {
                randNum1 = (int)(Math.random() * 6+5);
            }
            System.out.printf("randNum1 = %d\n", randNum1);
            testBit1 |= (BIN << randNum1);
        }

        System.out.println("====================================");
        System.out.println("7~10의 난수 중복없이 제어해보기");

        for (int i = 1; i <=3; i++) //3개 출력
        {
            randNum2 = (int)(Math.random() * 4+7);  //난수 범위 7~10

            while ((testBit2 & (BIN << randNum2)) != 0)
            {
                randNum2 = (int)(Math.random() *4+7 );
            }

            System.out.printf("randNum2 = %d\n", randNum2);
            testBit2 |= (BIN << randNum2);
        }
    }
}

