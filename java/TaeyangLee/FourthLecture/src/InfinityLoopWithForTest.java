public class InfinityLoopWithForTest {
    public static void main(String[] args) {
        /*
        for(;;){     //반복문 안에 조건을 지정하지않아 무한루프
            System.out.println("나도 무한 루프야");
        }

         */

        for(int i =1; ; i++){ //또한 i는 1부터 증가시키지만 range를 설정하지않아서 무한루프
            System.out.println("i = "+ i);
        }




    }
}
