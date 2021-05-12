public class InfinityLoopWithForTest {
    public static void main(String[] args) {

        //while(true)와 다르게 for의 경우엔 무조건이라는 식을 만들 수 잇따.
        // 조건부에 아무런 조건이 없다는 것은??? 무조건 실행!!

        /*
        for(;;) {
            System.out.println("나도 무한 루프야");
            }
         */

        //아래 케이스는 단순히 i에 대해 무한히 1씩 더하는 케이스다.
        // for(int i = 1 ;; i++){

        // 이 코드는 무한하게 i에 대해서는 1씩 더하고 j에 대해서는 1씩 뺀다.
        for(int i = 1, j = 0; ; i++, j--) {
            System.out.println("i = " +i + ", j = " +j);
        }
        // ## for 문제 1
        // 1~10까지 출력하는 프로그램을 만들어보자!


        // ## for 문제 2
        // 1~20에서 3의 배수를 출력하는 프로그램을 만들어보자(if문 없이!)

        //## for+if 문제
        // 1~30까지 숫자중 짝수와 홀수를 각각 모두 판정 하도록 프로그래밍 해보자
    }
}
