class SalaryTest2  {
    final float PERCENT = 0.01f;

    String name; //생성해준다
    int salary;

    public  SalaryTest2 (String name) { //생성자에서 이름값이 설정돼서 이름이 할당됨
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400); //2400~3500 연봉

    }
    // 편의성 제공 (하지만 확장성 Down)
    public void calcRandomSalary (int year) {  //
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1); //1~20사이의 연봉인상률
            // 원가 + 증액분
            salary = (int)(salary + salary * incRate * PERCENT);
            // System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary, incRate);
        }
    }
    // 편의성 Down (그러나 확장성 Up)
    public void calcRandomSalary () { //연봉인상

        float incRate = (int)(Math.random() * 20 + 1);

        salary = (int)(salary + salary * incRate * PERCENT);
    }
       public void printRandomSalary () { //현재 연봉 출력
      System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);

       }
         public int getSalary() {
            return salary;
    } //외부로 연봉을 꺼내와준다
}

public class QuizMoreEnhance {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한병", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수",//10개
        };
        int nameLen = nameArr.length;
        SalaryTest2[] st = new SalaryTest2[nameLen];//객체배열을 사람 갯수만큼 만든것

        for (int i = 0; i < nameLen; i++) { //10명마다 1년치를 10번 도니까 10년치를 돌림
            st[i] = new SalaryTest2(nameArr[i]); //st9번이 김영수
        } //st에다가 이름하고 연봉인상 할당


        // 10년치 처리를 하려면 또 한 번 루프로 감싸야함
        for (int i = 0; i < nameLen; i++) { //사람 숫자만큼 돈다

            float sum = 0; //sum이 0이니까 초기화해줌 그래서 해당 연도에 해당하는 sum값만 해주게된

            for (int j = 0; j < 10; j++) {
               //왜 1년치인가? 위에 1년치라서 10명분에 대한 1년치
                // st[i].calcRandomSalary();
                // sum += st[i].getSalary();
                // st[i].printRandomSalary();
                st[j].calcRandomSalary(); //위에서 할당한st정보를 갱신, 1년치 연봉을 증가시키라는 뜻
                sum += st[j].getSalary(); //특정한 사람의 연봉을 sum에다가 누적한다. 그래서 sum은 10명의 1년치 연봉합
                st[j].printRandomSalary();
        }

        System.out.println("올해 평균 연봉= " + (sum / 10.f));//10명의 합산갑을 10으로 나누면 평균이 나옴

        }
    }
}