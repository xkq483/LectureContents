class RandomSalary {
    final int MAX = 10;
    final float PERCENT = 0.01f;
    int[] yearSalary;

    public RandomSalary () {
        yearSalary = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            yearSalary[i] = (int)(Math.random() * 1101 + 2400);
        }
    }
    public void calcRandomSalary (int year) {
        float randIncRate;

        for (int i = 0; i < year; i++) {
            // 1 ~ 20%
            randIncRate = (float)(Math.random() * 20 + 1);
            // yearSalary[i] = (int)(yearSalary[i] + yearSalary[i] * randIncRate * PERCENT);
            yearSalary[i] = (int)(yearSalary[i] * (1.0f + randIncRate * PERCENT));
            // X = A + A * B * C
            // X = A + ABC ===> A * (1 + B * C)
            // 10% 는 ? (10 / 100) <<<=== 0.01을 곱하는것과 같고
            // %를 없애주기 위해 0.01을 곱함
        }
    }
    public void printSalary () {
        for (int i = 0; i < MAX; i++) {
            System.out.println("연봉을 출력합니다: " + yearSalary[i]);
        }
    }
}
// 랜덤 연봉 적용을 해보자
// 어떤 회사에 직원이 10명 있다.
// 10명의 이름은 적당히 지어주도록 한다.
// 이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
// 또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
// 10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
// 또한 연별로 평균 연봉값을 계산해보도록 한다.

// 1. 랜덤 연봉 범위 2400 ~ 3500
// 2. 직원은 10명임 (고정 상수 10 사용)
// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점 (0.01 사용)

public class Prob43 {
    public static void main(String[] args) {
        RandomSalary rs = new RandomSalary();

        rs.calcRandomSalary(10);
        rs.printSalary();
    }
}