public class InfinityLoopFor {
    public static void main(String[] args) {
        //for문 무한루프


        /*
        for(;;)
        {
            System.out.println("무한루프");
        }

         */
        //for(int i=1; ;i++)
       // {
        //    System.out.println("1씩증가하는 무한루프");
       // }

        for (int i=1, j=0;; i++, j--)
        {
            System.out.println("i는 증가 j는 감소함"+i+", "+j);
        }

    }
}
