import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();

        for (;;) {//무한루프 사용하기 위함

            //Math.random()은 [0~1]에 해당하는 소수점 데이터를 출력합니다.
            // 0.0 이상 1.0미만 사이의 소수점
            // 여기에 10을 곱하기 때문에
            // 0.0이상 10.0 미만 (9.9xxxx이하)
            //소수점이지만 값을 int(정수형)으로 처리하면 소수점은 버려짐
            // 결과는 0~9까지 정수가 출력됨.
            System.out.println((int) (Math.random() * 10) );
        }
    }
}
