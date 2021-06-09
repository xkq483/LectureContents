class AnnualSalary  {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public AnnualSalary(String name) {
        this.name = name;
        salary = (int) (Math.random() * 1101 + 2400);
    }

    public void calcRaise (int year) {
        float raise;

        for (int i = 0; i < year; i++) {
            raise = (int) (Math.random() * 20 + 1);
            salary = (int) (salary + salary * raise * PERCENT);
        }
    }


    public void calcRaise ()    {//calcRandomSalary
        float raise = (int) (Math.random() * 20 + 1);

        salary = (int)(salary + salary * raise * PERCENT);
    }
    public void printAnnualSalary () {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
    }

    public int getSalary()  {
        return salary;
    }

}

public class Review11_3 {
    public static void main(String[] args) {

            String[] employeesNameArr = {
                    "김씨", "이씨", "정씨", "고씨", "최씨",
                    "강씨", "임씨", "백씨", "박씨", "남궁씨"
            };

            int nameLength = employeesNameArr.length;
            AnnualSalary[] cd = new AnnualSalary[nameLength];
            for (int i = 0; i < nameLength; i++)    {
                cd[i] = new AnnualSalary(employeesNameArr[i]);
            }

            for (int i = 0; i < 10; i++) {

                float sum = 0; //초기화

                for (int j = 0; j < nameLength; j++) {

                    cd[j].calcRaise();//초봉 설정
                    sum += cd[j].getSalary();// 각 사원의 초봉 합산
                    cd[j].printAnnualSalary();
                }
                System.out.println("올해 평균 연봉 = " + (sum / 10.f));
            }
    }
}
