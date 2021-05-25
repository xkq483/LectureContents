class Salary1 {
    private String name;
    private final float PERCENT = 0.01f;
    int yearSalary;

    public Salary1(String name) {
        this.name = name;
        yearSalary = (int)(Math.random() * 1101 + 2400);
        //System.out.println(yearSalary);  <= 한번 되는지 출력 해보자
    }
    public void incrSalary(int year) {
        float incrSalary;
        for (int i = 0; i < year; i++) {
            incrSalary = (float)(Math.random() * 20 + 1);
            yearSalary = (int) (yearSalary + yearSalary * incrSalary * PERCENT);
            //System.out.println(yearSalary); <=출력값에 문제가 없는지 출력해보자
        }
    }
    public void printSalary() {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, yearSalary);
    }
}

//.. 가상설계 작성..//
//1. 메인에 10명분의 직원에 이름을 정하여 코드를 작성한다.
//2. 생성자를 통하여 연봉(년)을 작성 2400만원 ~ 3500 사이의 랜덤값 필요
//3. 메소드를 활용하여 10년치 연봉에 대한 인상율을 구하는 값을 설정, 연봉인상율은 1% ~ 20%
//4. 출력 메소드를 설정하고 출력을 받을준비
//5. 메인을 통하여 10년치 연봉 인상 값 도출

public class Prob43PracticeEnhance {
    public static void main(String[] args) {
        String[] nameArr = {"김원석", "김원석1", "김원석2", "김원석3", "김원석4",
                "김원석5", "김원석6", "김원석7", "김원석8", "김원석9"};

        int len = nameArr.length;
        Salary1[] company = new Salary1[len];

        for (int i = 0; i < len; i++) {
            company[i] = new Salary1(nameArr[i]);
            // company[i].nameCreate(nameArr[i]); 혹시 생성자가 아닌 메소드로 이름입력값을 설정해서 출력할수 있나요?
            company[i].incrSalary(10);
            company[i].printSalary();
        }
    }
}
