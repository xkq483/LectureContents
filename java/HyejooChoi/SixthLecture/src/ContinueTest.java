public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if ( i % 2 == 0) {
                // continue : continue를 만나면 실행할 코드가 남았더라도
                // 무조건 for loop의 최상단으로 이동함
                // 그러므로 증감식이 진행됨
                continue;
            }

            System.out.println("i = " + i);
        }
    }
}
