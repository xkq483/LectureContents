public class NonDupliNum {
    public static void main(String[] args) throws InterruptedException {
        int testBit = 0;
        int random;
        int bin = 1;

        for(int i=0; i<10; i++) {
            random = (int)(Math.random()*10);

            while((testBit & (bin << random)) != 0) {
 //               System.out.println(random + "은 중복입니다!");
                random = (int)(Math.random()*10);
            }
            System.out.println(random + "을 출력");
            testBit |= (bin << random);

        Thread.sleep(800);
        }
//        System.out.println(19 & 10); //10011 & 1010 ===> 00010 (2)
//        System.out.println(19 | 10); //10011 | 1010 ===> 11011 (27)
        // 워낙 헷갈리는 개념이다보니 좀 안쓰면 바로 까먹을것같은데 기억하는 팁이나 주로 쓰이는 분야?가 궁금하네요.
    }
}
