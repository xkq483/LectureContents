class SalaryTest{
    final float PERCENT = 0.01f;
//    연봉인상률 %

    String name;
    int salary;

    public SalaryTest(String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }

//    편의성 제공 (하지만 확장성 Down)
    public void calcRandomSalary (int year) {
        float incRate;

        for(int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1);
//            원가 + 증액분
            salary = (int)(salary + (salary * incRate * PERCENT));
        }
    }

//    편의성 Down (그러나 확장성 Up)
    public void calsRandomSalary() {
        float incRate = (int)(Math.random() * 20 + 1);
        salary = (int)(salary + (salary * incRate * PERCENT));
    }

    public void printRandomSalary() {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
    }

    public int getSalary() {
        return salary;
    }
}

// 1. 랜덤 연봉 범위 2400 ~ 3500
// 2. 직원은 10명임 (고정 상수 10 사용)
// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점 (0.01 사용)
// 7. 각 연도별 평균값에 대한 정보가 필요함

public class Quiz43_1 {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한별", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수"
        };
        int nameLen = nameArr.length;
        SalaryTest[] st = new SalaryTest[nameLen];
//        int [] arr = new int [len]
//        SalaryTest라는 클래스를 배열로 사용하여,
//        SalaryTest 클래스 내부에는 1명에 대한 값을 적용하고
//        SalaryTest배열로 10명분을 만드는 것인지


        for(int i =0; i < nameLen; i++) {
            st[i] = new SalaryTest(nameArr[i]);
//            st[0] = SalaryTest(nameArr[0])
//            위에서 생각한대로면
//            st[0]는 nameArr[0]인 사람, 강한별의 연봉계산 클래스
        }

        for(int i = 0 ; i <10; i++) {
            float sum =0;

            for(int j = 0; j < nameLen; j++) {
                st[j].calsRandomSalary();
//                st[0]는 nameArr[0]인 사람, 강한별의 연봉계산 클래스에서
//                연봉상승률이 포함된 연봉을 계산하는것.
//                위 for문으로 10년 연봉이 계산된다.

                sum += st[j].getSalary();
//                sum =0 + [0] 사람의 연봉
//                sum =[0] 사람의 연봉 + [1] 사람의 연봉
//                sum =[0] 사람의 연봉 + [1] 사람의 연봉 + [2] 사람의 연봉
//                ... 반복하여 결국 총합은 10사람의 연봉
                st[j].printRandomSalary();
//                System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
//                하여 j값마다 포함된 사람 값을 출력한다.
//                (for문 안 for문 구조로 10년치 출력)

            }
            System.out.println("올해 평균 연봉 = " + (sum / 10.f));
        }


    }
}