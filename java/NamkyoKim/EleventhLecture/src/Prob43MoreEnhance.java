class SalaryTest2 {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTest2(String name){
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }
    // 편의성 제공 (하지만 확장성 Down)
    public void calcRandomSalary(int year){
        float incRate;

        for(int i = 0; i < year; i++){
            incRate = (int) (Math.random() * 20 + 1);
            salary = (int)(salary + salary * incRate * PERCENT);
            // System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary,incRate
            // );
        }
    }
    // 편의성 Down ( 그러나 확장성 Up )
    public void calcRandomSalary(){

        float incRate = (int)(Math.random() * 20 + 1);

        salary = (int)(salary + salary * incRate * PERCENT);
    }
    public void printRandomSalary(){
        System.out.printf("%s의 현재 연봉은 = %d\n",name,salary);
    }

    public int getSalary() {
        return salary;
    }
}

// 1. 랜덤 연봉 2400 ~ 3500
// 2. 직원 10명임(고정 상수 10 사용)
// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력가능
// 6. 퍼센트 계산이므로 고정된 소수점(0.01 사용)
// 7. 각 연도별 평균값에 대한 정보가 필요
public class Prob43MoreEnhance {
    public static void main(String[] args) {

        String []nameArr = {
                "강한별","강떙떙","김아무","이아무"," 박아무",
                "최아무","최최최","선영","보리","제임스","본드"
        };
        int nameLen = nameArr.length;
        SalaryTest2[] st = new SalaryTest2[nameArr.length];
        // int[] arr = new int[len];

        for (int i = 0; i < nameLen; i++){
            st[i] = new SalaryTest2(nameArr[i]);
        }

        // 10년치 처리를 하려면 또 한 번 루프로 감싸야함
        // 필요하다면 생성자쪽에서 몇 년치 계산할지 입력을 주는것도 좋은 방법이고
        // 이것도 여의치가 않다면 Setter를 활용해서 10년치 처리임을 설정하도록 하는것도 좋은 방법이 될 수 있다.
        for(int i = 0; i < 10; i++){
            float sum = 0;
            // 현재 이건 10명분에 대한 1년치 처리만함
        for (int j = 0; j < nameLen; j++){
          //  st[i].calcRandomSalary();     // j 값으로 처리했어야 하는데 잘못처리함을 표기
          //  sum += st[i].getSalary();
          //  st[i].printRandomSalary();

            // 왜 1년치 일까?
            st[j].calcRandomSalary();
            sum += st[j].getSalary();
            st[j].printRandomSalary();
        }

            System.out.println("올해 평균 연봉 = " + (sum / 10.0f));
        }
        // summary:
        // 결국 10년동안 각 해의 평균 연봉을 계산하여 출력.
    }
}

// 초기값을 설정해주는 것들만 생성자에 적고
// 계산이 들어간 부분은 따로 매서드명을정해서 매서드에 코드화하기