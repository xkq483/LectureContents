// 43번 문제 -----------------------------------------------------------------------------
// 필요한 기능 적어보기
// 1. 랜덤 연봉 2400-3500
// 2. 직원은 10명(고정상수 10 사용)
// 3. 랜덤 인상률 1-20%
// 4. 10년간 반복하여 계산
// 5. 출력
// 6. 퍼센트 계산이므로 고정된 소수점 (0.01사용)
class SalaryTest2 {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTest2 (String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    } // 생성자에서 네임을 할당함

    public void calcRandomSalary (int year) {
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1);
            // 원가 + 증액분
            salary = (int)(salary + salary * incRate * PERCENT);
            // System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary, incRate);
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

public class Review0524Prob43 {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한별", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수"
        };

        int nameLen = nameArr.length;
        SalaryTest2[] st = new SalaryTest2[nameLen];
        // st배열에 이름과 초봉 세팅을 할당함

        for (int i = 0; i < nameLen; i++) {
            st[i] = new SalaryTest2(nameArr[i]);
        }

        // 10년치 처리를 하려면 또 한 번 루프로 감싸야함
        // 필요하다면 생성자에서 몇년치를 계산할지 입력을 주거나
        // Setter를 이용해서 10년을 설정하도록 하는 것도 좋음
        for (int i = 0; i < 10; i++) {
            // 10명분에 대한 10년치 처리

            float sum = 0;

            // 현재 이건 10명분에 대한 1년치 연봉의 합 구하기
            for (int j = 0; j < 10; j++) {
                // st[i].calcRandomSalary();
                // sum += st[i].getSalary();
                // st[i].printRandomSalary();
                // j를 i로 입력하는 실수는 하지 말기
                st[j].calcRandomSalary(); // calcRandomSalary를 갱신함
                sum += st[j].getSalary();
                st[j].printRandomSalary();
            }

            System.out.println("올해 평균 연봉 = " + (sum / 10.f));

        }

        // calcRandomSalary 메소드가 두개라서 직원들 연봉과 평균값이 다름??
        // year에 1을 넣고 get을 이용해 평균을 구함
    }
}