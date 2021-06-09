public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }

        System.out.println("최종 합산 값 = " + sum);

        // 주식과 관련된 작업을 한다면 이 부분을 상당히 조심해야 한다.
        // 분명 설명을 해주셧는데 왜 하필 주식과 관련된 작업이었는지 기억이 안난다...
        // 좀 더 집중해서 수업을 듣도록 하자

        float average = sum / 10;
        System.out.println("평균 = " + average);



        // sum은 더하라는 거고
        // int 정수형이기 때문에 1부터 10까지 전부 다 합친값 55에서
        // 5.5에서 소수점을 버려서 5가 나오는 것이고
        // float으로 나눴을 때는 소수점을 살려서 5.5가 나오는 것
        // 정수는 int 소수점은 double는 항상 기억하자

        // 위에 1부터 10까지 증가하라는 부분은 이해가 가고
        // sum += i;
        // System.out.println("sum = " + sum);
        // 여기 2줄만 이해하면 크게 어려운건 없는 듯 하다.

        average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}
