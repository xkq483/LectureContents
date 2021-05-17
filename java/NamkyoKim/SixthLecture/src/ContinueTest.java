public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
                // continue 를 만나면 아래쪾에 진행해야하는 코드가 남았더라도
                // 무조건 for loop의 최상단으로 이동하게 된다.
                // 그러므로 증감식이 진행된다.  ---> 설명을 너무 잘해주셔서 바로 이해
                continue;

            }
            System.out.println("i = "+ i);
        }
    }
}
