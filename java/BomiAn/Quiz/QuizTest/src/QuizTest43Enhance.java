class SalaryTest {

    final float PERCENT = 0.01f;
    String name;
    int salary;

    public SalaryTest(String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }

    public void calcRandomSalary (int year) {
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1);
            salary = (int) (salary + salary * incRate * PERCENT);
            System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary, incRate);
        }
    }

    public void printRandomSalary() {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
    }
}

public class QuizTest43Enhance {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한별", "강한빛", "김모모", "이모모", "한모모",
                "황모모", "안모모", "김창수", "정형돈", "박명수"
        };

        int nameLen = nameArr.length;
        SalaryTest[] st = new SalaryTest[nameLen];

        for (int i = 0; i < nameLen; i++) {
            st[i] = new SalaryTest(nameArr[i]);
            st[i].calcRandomSalary(10);
            //st[i].printRandomSalary();
        }

    }
}
