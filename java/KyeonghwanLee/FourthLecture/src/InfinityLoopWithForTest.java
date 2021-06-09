public class InfinityLoopWithForTest {
    public static void main(String[] args) {

        // while(true)와 다르게 for의 경우엔 무조건이라는 식을 만들 수 있다.
        // 조건부에 아무런 조건이 없다는 것은 ??? 무조건

        /*
        for(;;){
            System.out.println("나도무한루프야");
        }

        */

        //이 코드는 무한하게 i에 대해서는 1씩 더하고 j에 대해서는 1씩 뺸다.

        for(int i = 1, j = 0; ; i++, j--) {
            System.out.println(("i= " + i + ", j=" + j));
        }
    }
}