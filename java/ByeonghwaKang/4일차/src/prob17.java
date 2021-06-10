public class prob17 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("컴퓨터와 주사위 게임을 해보자!");
        for (;;) {
            // Math.random()은 [0 ~ 1)에 해당하는 소수점 데이터를 출력합니다.
            // 0.0 이상 1.0 미만 사이의 소수점
            // 여기에 10을 곱하기 때문에
            // 0.0 이상 10.0 미만 (9.9xxxx 이하)
            // 소수점이지만 값을 int로 처리하면 소수점은 버려짐
            // 0 ~ 9 까지의 정수가 출력됨
            System.out.println( (int)  (Math.random() * 10) );

            //ㅠㅠㅠㅠ 17번 풀이실패 더 공부하겠습니다

}

