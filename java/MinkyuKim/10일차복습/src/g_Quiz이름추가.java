class SalaryTEst {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTEst (String name) {
        this.name = name;
        salary = (int)(Math.random()* 1101 + 2400);
        //2400~3500

    }
    public void calcRandomSalary (int year) {
        float incRate;

        for ( int i = 0; i< year; i++) {
            incRate = (int)(Math.random()* 20 + 1);
            //1~20%.
            //float하지 않은 이유는 소수점으로 인하여 20이 넘는 수치가 나오기 때문에 1~20으로 하기 위하여 int로 한후 다시 처리
            salary = (int) (salary + salary * incRate * PERCENT);
            System.out.printf("%s의 %d년자 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary, incRate);
            //출력기능을 아래가아닌 위에서 처리
        }
    }
    public void printRandomSalary() {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
        //최종 연봉만 보겠다 할시
    }
}
public class g_Quiz이름추가 {
    public static void main(String[] args) {

        String[] nameArr = {"강한별", "강한빛", "강경수", "임종수", "백종수", "최빛나", "최창수", "박창수", "김창수", "김명수"};

        int nameLen = nameArr.length;
        //위의 이름 10개.
        SalaryTEst[] st = new SalaryTEst[nameLen];

        for(int i = 0; i<nameLen; i++) {
            st[i] = new SalaryTEst(nameArr[i]);

            st[i].calcRandomSalary(10);
            //10년동안 연봉률과 그때당시 연봉을 출력
            st[i].printRandomSalary();
            //10년후의 최종값만 출력

        }


    }
}


    /*랜덤 연봉 적용을 해보자
    어떤 회사에 직원이 10명 있다.
            10명의 이름은 적당히 지어주도록 한다.
    이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
    또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
            10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
    또한 연별로 평균 연봉값을 계산해보도록 한다. */
