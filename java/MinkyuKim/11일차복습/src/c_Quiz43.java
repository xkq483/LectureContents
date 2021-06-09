class SalaryTest2 {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTest2 (String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }
    public void calcRandomSalary (int year) {
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1);
            salary = (int)(salary + salary * incRate * PERCENT);
                   }
    }
    public void calcRandomSalary () {
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

public class c_Quiz43 {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한별", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수"
        };

        int nameLen = nameArr.length;
        SalaryTest2[] st = new SalaryTest2[nameLen];

        for (int i = 0; i < nameLen; i++) {
            st[i] = new SalaryTest2(nameArr[i]);
        }
        for (int i = 0; i < 10; i++) {
            float sum = 0;

            for (int j = 0; j < 10; j++) {
                st[j].calcRandomSalary();
                sum += st[j].getSalary();
                st[j].printRandomSalary();
            }
            System.out.println("올해 평균 연봉 = " + (sum / 10.f));


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