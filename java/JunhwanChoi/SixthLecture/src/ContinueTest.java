public class ContinueTest {
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
        {
            if(i %2 ==0)
            {
                continue;
                // continue 를 만나면 아래쪽에 진행해야 하는 코드가 남아 있어도
                // 무조건 for loop 최상단으로 이동하여
                // 증감식문장부터 다시 시작하게 된다.

            }
            System.out.println("i= " + i);
        }
    }
}
