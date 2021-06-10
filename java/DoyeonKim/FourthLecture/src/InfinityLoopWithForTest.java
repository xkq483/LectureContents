public class InfinityLoopWithForTest {
    public static void main(String[] args) {
        /*for (; ;)
            System.out.println("나도 무한루프야");
          } */
        //(int i = 1; i++ ) //i에 무한히 1씩 더하는 케이스

        for(int i = 1, j = 0; ; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);

        }
    }
}


