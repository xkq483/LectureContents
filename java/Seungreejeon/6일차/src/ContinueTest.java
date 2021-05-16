public class ContinueTest {
    public static void main(String[] args) {
        //continue 사용시 아래 코드를 실행하지 않고 for 조건문으로 이동
        //1~10까지 홀수만 출력
        for(int i = 0; i < 10; i++){
            if (i % 2 == 0) {
                continue;

            }
            System.out.println("i :" + i);

        }
    }

}

