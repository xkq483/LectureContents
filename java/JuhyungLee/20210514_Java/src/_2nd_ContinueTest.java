public class _2nd_ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                // continue를 만나면 아래쪽에 진행해야하는 코드가 남아있더라도
                // 무조건 for loop의 최상단으로 이동하게 한다.
                // 따라서 증감식이 진행됨.
               continue;
            }
            System.out.println("i = " + i);
        }
    }
}
