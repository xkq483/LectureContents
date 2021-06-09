public class _5th_RandomTest {
    public static void main(String[] args) {
        for ( ; ; ) {
            // Math.random()은 [0~1)에 해당하는 소수점 데이터를 출력한다.
            //// [0~1) 표현은 0이상 1미만 이라는 뜻 //
            // 여기에 10을 곱하기 때문에 0.0이상 10.0 미만 ( 9.9xxxxxxxx 이하)
            // 소수점이지만 값을 앞에서 int로 처리했기 때문에 소수점은 버려짐
            // 따라서 0~9까지의 정수가 출력.
            System.out.println((int) (Math.random() * 10)); // 헷갈릴까봐 소괄호들 조금 띄어둠.
        }
    }
}