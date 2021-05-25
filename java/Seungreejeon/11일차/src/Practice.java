class Practice2 {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public Practice2 (String name) {
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
        System.out.printf("%s 의 현재 연봉은 = %d\n", name, salary);
    }

    public int getSalary() {
        return salary;
    }
}


public class Practice {
    public static void main(String[] args) {
        String[] nameArr = {"강한별", "강한빛", "강경수", "임종수", "백종수", "최빛나", "최창수", "박창수", "김창수", "김명수"};

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
            System.out.println(" 올해 평균 연봉 = " + (sum / 10.f));

        }
    }
}