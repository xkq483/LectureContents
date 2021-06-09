public class ContinueTest {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i%2 ==0) {
                //continue 를 만나면 아래쪽에 진행해야 하는 코드가 남아있더라도
                // 무조건 for loop의 최상단으로 이동하게 된다.
                //그러므로 증감식이 진행된다.
                continue;  //for문의 증감식 코드로 이동됨!  (2의 배수는 출력되지 않음!)
            }
            System.out.println("i ="+i);
        }
    }
}
