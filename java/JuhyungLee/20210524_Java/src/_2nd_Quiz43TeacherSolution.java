class SalaryTest2 {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTest2 (String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }
    // 아래 method는 편의성 up (하지만 확장성 Down)
    public void calcRandomSalary (int year) { // method는 사용 안 했음.
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1);
            // 원가 + 증액분
            salary = (int)(salary + salary * incRate * PERCENT);
            System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary, incRate);
        }
    }
    // 아래 constructor는 편의성 Down (그러나 확장성 Up)
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
// 7. 각 연도별 평균값에 대한 정보가 필요함
public class _2nd_Quiz43TeacherSolution {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한별", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수"
        };
        int nameLen = nameArr.length;
        SalaryTest2[] st = new SalaryTest2[nameLen];

        for (int i = 0; i < nameLen; i++) {
            st[i] = new SalaryTest2(nameArr[i]); // st[0]/st[1]..의 생성자들 만들어짐.
        }

        // 10년차까지 처리를 하려면 또 한 번 for를 이용해서 루프.
        // 필요하다면 생성자쪽에서 몇 년치 계산할지 입력을 주는것도 좋은 방법.
        // 이것도 여의치가 않다면 Setter를 활용해서 10년차까지 처리하도록 설정하는 것도 좋은 방법.
        for (int i = 0; i < 10; i++) {
            float sum = 0;
            // 아래는 10명 각각에 대한 1년차씩 계산하는 for문
            for (int j = 0; j < nameLen; j++) {
                st[j].calcRandomSalary();
                sum += st[j].getSalary();
                st[j].printRandomSalary();
            }
            System.out.println("올해 평균 연봉 = " + (sum / 10.f));
        }
    }
}
/* 생성자에서 하는 일들은 아래와 같은 형태를 만드는 것
int num = 3;
int arr[] = { 2, 3, 4 };
int randNum = (int)(Math.random() * 6 + 1); */

/* 아래와 같은 계산은 생성자에서 작성하지 말자!
float mean = sum / num; */