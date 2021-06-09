import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();     //Random을 사용하기 위해서는 import문 필요
                                        //Random 클래스, rand객체 생성

        for(;;)     //무한루프
        {
            System.out.println((int)(Math.random() *10)); // 0~9사이의 정수형 랜덤값 출력
        }

        /*
        Math.random()은 [0~1]에 해당하는 소수점 데이터를 출력
        0.0~1.0사이의 소수점     0.0 <=Math.random() <10.0
        여기에 10을 곱하기 때문에
        0.0이상 10.0미만 (9.xxx까지)
        소수점이지만 값을 int형으로 처리하면 소수점은 버려짐      :       ((int)(Math.random() *10))
        0~9까지의 정수만 출력됨

        */

    }
}
