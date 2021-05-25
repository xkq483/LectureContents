import java.util.Scanner;

class RandSalary {

    final int MAX = 10;
    final float PERCENT = 0.01f;

    int[] yearSalary;

    int increaseSalary;
    String [] name =  { "a", "b", "c", "d", "e", "f", "g", "h","i", "j"};
    // 10년 수치, 연봉, 상승률, 10년후값, 구성원 명칭

    public RandSalary() {
        yearSalary = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            yearSalary[i] = (int) (Math.random() * 1101 + 2400);
            // 랜던연봉 (2400~3500)
        }
    }
    public void calcRandSalary ( int year) {
        float randIncRate;

        for(int i = 0; i < year; i++) {
            randIncRate = (float)(Math.random() * 20 + 1);
            yearSalary[i] = (int)(yearSalary[i] + yearSalary[i] * randIncRate * PERCENT);
            // yearSalary[i] = (int)(yeasSalary[i] * (1.0f + randIncRate * PERCENT)) 와 동일
            // ++ 연봉 + 연봉인상률
            // ++ 해당 메소드는 즉 연봉 인상률을 의미함.
            // ++ randIncRate가 인상률(1~20% 랜덤배정)
            // ++ percent는 백분율로 0.01을 곱함. 위에 0.01f로 설정
        }
    }
    public void printSalary() {
        for(int i = 0; i < MAX; i++) {
            System.out.println("연봉을 출력합니다: " + yearSalary[i]);

            // ++ 해당 메소드는 10년간 연봉인상률을 출력함.
        }
    }
 }
public class f_Quiz {
    public static void main(String[] args) {

        RandSalary rs = new RandSalary();

        rs.calcRandSalary(10);
        //10년 (year값에 10입력)
        rs.printSalary();
        //출력하라 (printSalary를 실해하라)

    }
}


    /*랜덤 연봉 적용을 해보자
    어떤 회사에 직원이 10명 있다.
            10명의 이름은 적당히 지어주도록 한다.
    이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
    또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
            10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
    또한 연별로 평균 연봉값을 계산해보도록 한다. */

// 기능부터 하나씩 써볼 것.
// 1. 랜덤 연봉 범위 2400 ~ 3500
// 2. 직원은 10명임 (고정 상수 10 사용)

// final 및 생성자 초기화값

// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점(0.01 사용)