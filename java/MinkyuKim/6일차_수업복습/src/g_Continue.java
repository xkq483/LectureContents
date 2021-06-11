public class g_Continue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if( i % 2 == 0) {
                continue;
                //continue로 인하여 아래 진행해야할 코드가 있더라도
                // 무조건 for loop의 최상단으로 이동하게됨.

                // i가 2의배수일 때 증감식이 계속 진행되게됨?
                // 2의배수는 왜 출력이 안되었는지?
                // 출력되는 부분이 if조건식은 제외되고 출력되는 것인지?
            }
            System.out.println("i = " + i);
        }
    }
}
