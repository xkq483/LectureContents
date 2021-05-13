public class InfinityLoopWithForTest {
    public static void main(String[] args) {
        for(int i = 1, j = 0; ; i++,j--)
        {
            System.out.println("i="+i+"j="+j);
        }
    }
}
