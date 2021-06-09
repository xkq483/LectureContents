class SalaryTest {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTest(String name){
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }
    public void calcRandomSalary(int year){
        float incRate;

        for(int i = 0; i < year; i++){
            incRate = (int) (Math.random() * 20 + 1);
            salary = (int)(salary + salary * incRate * PERCENT);
           // System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary,incRate
           // );
        }
    }
    public void printRandomSalary(){
        System.out.printf("%s의 현재 연봉은 = %d\n",name,salary);
    }
}

public class Prob43Enhance {
    public static void main(String[] args) {

        String []nameArr = {
                "강한별","강떙떙","김아무개","이아무개"," 박아무개",
                "최아무개","최최최","선영","보리","제임스","본드"
        };
        int nameLen = nameArr.length;
        SalaryTest[] st = new SalaryTest[nameArr.length];

        for (int i = 0; i < nameLen; i++){
            st[i] = new SalaryTest(nameArr[i]);
            st[i].calcRandomSalary(10);
            st[i].printRandomSalary();
        }
    }
}
