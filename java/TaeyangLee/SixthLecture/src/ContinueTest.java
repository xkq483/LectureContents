public class ContinueTest {
    public static void main(String[] args) {
        for(int i =0 ; i < 10; i++){
            if ( i % 2 == 0 ){
                continue;
                //continue 를 만나면 아래쪽에 진행해야하는 코드가 있어도
                // 무조건 for문의 맨 위로 이동
            }
            System.out.println("i = "+ i);
        }
    }
}
