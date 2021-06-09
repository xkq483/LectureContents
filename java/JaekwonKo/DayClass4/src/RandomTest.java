import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //Random rand = new Random();

        //무한루프를 사용하기 위해 for(; ; )사용용
       for (; ; ) {

           //Math.random()은 (0 ~ 1)에 해당하는 소수점 데이터를 출력합니다.
           // 0.0 이상 1.0 이상 사이의 소수점
           // 여기에 10을 곱하기 때문에
           // 0.0 이상 10.0 미만 (9.9xxxxxx 이하)
           // 소수점이지만 값을 int로 처리하면 소수점은 버려짐
           // 0 ~ 9 까지의 정수가 출력됨
           System.out.println( (int) (Math.random() * 10) );

            //System.out.println(rand.nextInt() % 10);

        }
    }
}
//-------------------이해 완료