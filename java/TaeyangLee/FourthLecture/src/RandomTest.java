
public class RandomTest {
    public static void main(String[] args) {

        for(;;){

            //math.random()은 [0~1]에 해당하는 소수점 데이터를 출력
            //0.0이상 1.0 미만
            //여기에 10곱하니까
            //0.0이상 10.0미만 (9.9xxxx이하)
            //소수점이지만 값을 int로 처리하면 소수점은 버려짐.
            //0~9까지의 정수가 출력됨
            System.out.println((int)(Math.random()*10));

        }
    }
}
