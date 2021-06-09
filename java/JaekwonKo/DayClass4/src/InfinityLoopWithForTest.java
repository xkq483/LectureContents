public class InfinityLoopWithForTest {
    public static void main(String[] args) {

        // while(true) 와 다르게 for의 경우엔 무조건이라는 식을 만들 수 있다.
        // 조건부에 아무런 조건이 없드는 것은 --> 무조건 이라는 뜻

        /*
        for(;;) {
            System.out.println("나도 무한 루프야");
        }

         */



        // 아래 케이스는 단순히 i에 대해 무한히 1씩 더하는 케이스 이다
        //for(int i =1; ; i++) {

        // 이 코드는 무한하게 i에 대해서는 1씩 더하고 j에 대해선 1씩 뺀다
        for(int i =1, j = 0; ; i++, j--)
            System.out.println("i = " + i + ", j = " + j);
        }
    }
//--------------이해 완료
