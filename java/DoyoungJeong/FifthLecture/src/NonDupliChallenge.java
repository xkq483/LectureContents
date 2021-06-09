public class NonDupliChallenge {
    public static void main(String[] args) throws InterruptedException {
        int ranNum;
        int testBit = 0;
        int testBit2 = 0;

        for(int i=5; i<=10; i++) {
            ranNum = (int)(Math.random()*11);
            while(ranNum < 5) {
                ranNum = (int)(Math.random()*11);
            }

            while((testBit & (1 << ranNum)) != 0) {                //혼자 풀다보니까 어제 보여주셨던 변수 int BIN = 1;이 굳이 필요 없을것같은데 굳이 생성하셔서 작성하신 이유가 궁금합니다.
 //               System.out.println(ranNum + "은 중복된 값입니다."); //저는 필요성을 느끼지못해 그냥 (1 << ranNum)) != 0)로 작성했습니다.
                ranNum = (int)(Math.random()*11);
                while(ranNum < 5) {
                    ranNum = (int)(Math.random()*11);
                }
            }
            System.out.println(ranNum + "를 출력합니다.");
            testBit |= (1 << ranNum);

            if(i==10) {
                System.out.println("또한");
                for (int j=7; j<=10; j++) {
                    ranNum = (int)(Math.random()*11);
                    while (ranNum<7) {
                        ranNum = (int)(Math.random()*11);
                    }
                    while((testBit2 & 1<<ranNum) != 0) {
 //                       System.out.println(ranNum + "은 중복된 값입니다.");
                        ranNum = (int)(Math.random()*11);
                        while (ranNum<7) {
                            ranNum = (int)(Math.random()*11);
                        }
                    }
                    System.out.println(ranNum + "을 추가로 출력합니다.");
                    testBit2 |= (1 << ranNum);
                    Thread.sleep(900); //Thread의 위치에 따라 출력텀 적용이 되고 안되고 하던데 명확하게 알고싶습니다.
                }
            }
            Thread.sleep(900);
        }   // 문제는 풀긴했는데 효율적인 코드란 느낌이 들지않아서... 더 훨씬 간결한 방법이 있을것같습니다.
    }
}
