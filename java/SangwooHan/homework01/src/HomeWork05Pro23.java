public class HomeWork05Pro23 {

    public static void main(String[] args) throws InterruptedException {
        final int BIN = 1;
        int testBit = 0;
        int randNum;

        int testBit2 = 0;
        int randNum2;
        for (int i =1; i < 7; i++)
            {

            randNum = (int)(Math.random() * 6+5);
            while ((testBit & (BIN << randNum)) != 0)
            {
                randNum = (int)(Math.random() * 6+5);
            }

            System.out.printf("randNum = %d\n", randNum);

            testBit |= (BIN << randNum);
            }
        System.out.println(" ");

        for(int j = 1; j < 5; j ++){
            // 자 7이떳다고 가정하자.
            //randNum2은 현재 7이뜸 .
            // while문안에 비트연산자 앤드 식으로인해
            // 0 & ( 2^7) != 0이냐 묻고있는데,
            // 당연히 0과 2^7의 교집합은 0이니까,
            // 000000000 과 10000000의 교집합은 0이다.
            // 그래서 sout에 randNum2 에 7 저장
            // 한바퀴돌아서, 7를 다시뽑앗다고 가정하자,
            // while문 안에 식에의하면,
            // testBit2는 현재, 2^7값을 가지고있고, BIN과 randNum의 쉬프트연산을하면, 2^7이된다.
            // 2^7 과 2^7이 앤드연산자로 교집합으로 10000000 가 나와 0 이 되지 않는다.
            // 0이 아닐떄, while 안에 들어가서 다시뽑게된다. while문에 충족될때까지,

            randNum2 = (int)(Math.random()*4 +7);
            while((testBit2 & (BIN<<randNum2)) != 0)
            {
                randNum2 = (int)(Math.random()*4 +7);
            }
            System.out.println("randNum2="+randNum2 );

            testBit2 |= ((BIN << randNum2));

            // testBit2 는 2진법으로서 2진법을 모두 저장하고싶다.
            // 위에서 나온 randNum 은 정수인데, randNum을 TestBit에 2진법으로서 저장을 하고싶어서, BIN과 Shift연산을한다
            //
        }
        System.out.println("5월13일 5일차 숙제 결과값입니다.");
    }














    }

