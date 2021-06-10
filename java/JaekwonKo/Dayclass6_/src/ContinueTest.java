public class ContinueTest {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++) {
            if (i % 2 == 0) {
                continue;
                // continue 를 만나면 아래쪽에 진행해야하는 코드가 남아있더라고
                // 무조건 for loop의 최상단으로 이동하게 된다
                // 그러므로 증감식이 진행된다
            }

            System.out.println("i = " +i);
        }
    }
}
