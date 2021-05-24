class SalaryTest1 {
    final float PERCENT = 0.01f;

    String name; // 이름을 넣기 위해 사용?
    int salary;

    public SalaryTest1 (String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400); ////1100 ~ 3500 연봉 구하기
    }
    // 편의성 제공 (하지만 확장성 Down)
    public void calcRandomSalary (int year) {
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1); //연봉 인상률률 1 ~ 20%

            salary = (int)(salary + salary * incRate * PERCENT);
            // 원가 + 증액분??

        }
    }
    // 편의성 Down (그러나 확장성 Up)
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

public class SalaryTest2 {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한별", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수"
        };

        int nameLen = nameArr.length; //
        SalaryTest1[] st = new SalaryTest1[nameLen];
        // int[] arr = new int[len];

        for (int i = 0; i < nameLen; i++) {
            st[i] = new SalaryTest1(nameArr[i]);
        }

        for (int i = 0; i < 10; i++) {

            float sum = 0;


            for (int j = 0; j < nameLen; j++) {

                st[j].calcRandomSalary();
                sum += st[j].getSalary();
                st[j].printRandomSalary();
            }

            System.out.println("올해 평균 연봉 = " + (sum / 10.f));

        }

        // summary:
        // 결국 10년동안 각 해의 평균 연봉을 계산하여 출력함
    }
}

/* 생성자에서 하는 일들은 아래와 같은 형태를 만드는 것
int num = 3;
int arr[] = { 2, 3, 4 };
int randNum = (int)(Math.random() * 6 + 1); */

/* 아래와 같은 계산은 생성자에서 작성하지 말자!
float mean = sum / num; */