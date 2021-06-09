public class InfinityLoopWithForTest {
    public static void main(String[] args) {

        // while(true)와 다르게 for의 경우엔 무조건이라는 식을 만들 수 있다.
        // 조건부에 아무런 조건이 없다는 것은 ??? 무조건

        /*
        for(;;) {
            System.out.println("나도 무한 루프야");
        }
         */

        // 아래 케이스는 단순히 i에 대해 무한히 1씩 더하는 케이스다.
        // for(int i = 1; ; i++) {

        // 이 코드는 무한하게 i에 대해서는 1씩 더하고 j에 대해서는 1씩 뺀다.
        for(int i = 1, j = 0; ; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);


            // Run을 해서 돌려보니 엄청 빠르게 몇십만 단위까지 올라가버린다...
            // 무한하게 +1씩 올라가는데 배운것을 응용하면 딜레이를 주어서
            // 1초마다 혹은 2초마다 등등 천천히 숫자가 올라가는 것도 볼 수 있을 것 같은데
            // 궁금한게 생길 때 마다 스스로 문제를 내고 풀어 보는것도 좋을듯 하다.
        }
    }
}
