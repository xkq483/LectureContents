class SalaryTest2 {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTest2 (String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }
    public void calcRandomSalary (int year) {
        // ++year년치
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1);
            // 원가 + 증액분
            salary = (int)(salary + salary * incRate * PERCENT);
            // System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary, incRate);
            // ++ 연별 평균에 대한 정보까지 들어가있어, 연도별 평균을 구할 수 없었음. 즉 분할이 완벽하게 되어있지 않다고 볼 수 있음.
        }
    }
    public void calcRandomSalary () {
        // ++ 1년치 계산
        float incRate = (int)(Math.random() * 20 + 1);

        salary = (int)(salary + salary * incRate * PERCENT);
    }
    public void printRandomSalary () {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
    }

    public int getSalary() {
        return salary;
    }
}

public class h_Quiz이름추가최종값만 {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한별", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수"
        };

        int nameLen = nameArr.length;
        SalaryTest2[] st = new SalaryTest2[nameLen];

        for (int i = 0; i < nameLen; i++) {
            st[i] = new SalaryTest2(nameArr[i]);
            // st[0] 강한별 ..... 각 이름별로 네임이 할당됨.
            // 위의 생성자에서 이름값을 생성했기 때문에, name값이 할당됨.
            // st배열에 각 이름에 초봉을 할당한다.
            // st[i] = new SalaryTest2(nameArr[i]);를 말하는 것.
        }

        // 10년치 처리를 하려면 또 한 번 루프로 감싸야함
        // 필요하다면 생성자쪽에서 몇 년 치 계산할지 입력을 주는것도 좋은 방법이고
        // 이것도 여의치 않다면 Setter를 활용해서 10년치 처리임을 설정하도록 하는것도 좋은 방법이 될 수 있다.
        // i < 10을 설정하는 방식에 대한 이야기
        for (int i = 0; i < 10; i++) {
            // ++10년치가 돌아야함.

            float sum = 0;
            //++for문안에 sum값이 들어가있어 해당년도에 해당되는 sum값만 누적되게됨.

            // 현재 이건 10명분에 대한 1년치 처리만했음
            for (int j = 0; j < 10; j++) {
                //++ 사람 숫자만큼에 대한 1년치 연봉계산

                // st[i].calcRandomSalary();
                // sum += st[i].getSalary();
                // st[i].printRandomSalary();
                st[j].calcRandomSalary();
                // ++ 1년치의 연봉상승률 할당(갱신)
                sum += st[j].getSalary();
                // ++ 1년치 계산된 연봉을 누적하게 됨(sum에)
                // ++ for문을 돌고나면 10명분의 1년치 연봉의 합계가 계산됨.(10년치가 아님), 10명분의 합산값값
                st[j].printRandomSalary();

            }

            System.out.println("올해 평균 연봉 = " + (sum / 10.f));
            // ++나누기 10을한것은 전체연봉합계의 평균값을 나타내기 위해.
            // ++for i문에서는 10년동안의 평균값을 출력하게됨

        }
        // 요약
        // 결국 10년동안 각 해의 평균 연봉을 계산하여 출력함.
    }
}

/// 기능부터 하나씩 써볼 것.
// 1. 랜덤 연봉 범위 2400 ~ 3500
// 2. 직원은 10명임 (고정 상수 10 사용)

// final 및 생성자 초기화값

// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점(0.01 사용)
// 7. 각 연도별 평균값