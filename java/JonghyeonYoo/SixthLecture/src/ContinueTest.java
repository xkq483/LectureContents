public class ContinueTest {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if (i % 2 ==0) {
                // if(i % 2 == 0) 짝수일때만 continue;를 만나게 되므로
                // for문 최상단으로 이동하여 다음 값을 실행
                // 출력은 0~9까지중 홀수만 출력됨 (2로 나눴을때 0이 나오는 값은 제외하고 나온 값)
                //                                 if(i % 2 == 0)
                continue;
                // continue 를 만나면 아래쪽에 진행해야하는 코드가 남아있더라도
                // 무조건 for loop의 최상단으로 이동하게 된다.
                // 그러므로 증감식이 된다.
            }
            System.out.println("i = "+ i);
        }
    }
}
