
public class RandomTest {
    public static void main(String[] args) {

        for(;;){
            /*
            Math.random()은 [0~1)에 해당하는 소수점 데이터를 출력합니다.
            여기에 10을 곱하기때문에 0.0이상 10.0 미만의 범위
            int형으로 표현하기로 했기때문에 소수점 버림으로 0~9까지의 범위 출력
             */
            System.out.println((int)(Math.random() * 10));
        }
    }
}
