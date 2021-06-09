public class RandomTest {
    public static void main(String[] args) {
        for(;;) {
            //Math.random() 은 (0 ~ 1)에 해당하는 소수점 데이터를 출력합니다.
            //0.0이상 1.0 미만 사이의 소숫점
            //여기에 10을 곱하기 때문에
            // 0.0이상 10.0미만
            // 소수점이지만 int로 처리하면 소수점은 버려짐
            //0~9까지의 정수가 출력
            System.out.println((int)(Math.random() * 10));
        }
    }
}
