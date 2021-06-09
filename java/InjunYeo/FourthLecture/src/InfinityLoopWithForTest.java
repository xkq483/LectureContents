public class InfinityLoopWithForTest {
    public static void main(String[] args) {
        /*
        while(true)와 다르게 for의 경우엔 무조건이라는 식을 만들 수 있다.


         */
        /*
        for(;;){
            System.out.println("무조건 무조건이야");
        }

         */

        /*
        for(int i =1;;i++){
            System.out.println("i= " +i);
        }

         */
        //이코드는 무한하게 i에대해서는 1씩 더하고 j에 대해서는 1씩 뺀다.
        for(int i=1,j=0;;i++,j--){
            System.out.println("i = "+i+", j = "+j);
        }
    }
}
