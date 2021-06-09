public class InfinityLoopWithForTest {
    public static void main(String[] args) {
        //for문은 무조건이라는 식을 만들수 있음, 조건이 없다면 무조건 반복된다는 점에서
        //while(true)와 다름

//        for(;;) {
//            System.out.println("무한반복");
//        }
//      for문은 조건없이 반복할수 있기때문에 (;;)만 넣고 무한반복 시킬수 있음
        //반면에 while(true)문은 무조건 조건이 들어가야 함

//      for (int i = 1; ; i++) // 조건 없이 단순 i++
        
        

        for (int i = 1, j = 0; ; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        } // i는 1씩 더하고, j는 1씩 뺀다

        
//        for(int i = 1; ; i++) {
//            System.out.println("i = " + i);
//        }


    }
}
