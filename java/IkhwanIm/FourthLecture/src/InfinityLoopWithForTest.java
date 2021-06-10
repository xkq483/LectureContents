public class InfinityLoopWithForTest {
    public static void main(String[] args) {

      /*  for(;;) {
            System.out.println("나도 무한 루프야");
        }
        조건부에 아무것도 없다면 ?
        무한루프



        //단순히 1씩 더하는 케이스
        for(int i = 1; ; i++) {
            System.out.println("i = " + i);
        }

       */
        for(int i=1, j = 0; ; i++, j--) {
            System.out.println("i = " + i + ", j =" + j);
        }
    }
}
