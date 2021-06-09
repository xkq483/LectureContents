class Salary2 {
    private final float PERCENT = 0.01f;
    private String name;
    private int yearSalary;

    public Salary2(String name) {
        this.name = name;
        yearSalary = (int)(Math.random() * 1101 +2400);
    }
    public void increSalary() {//사용되진 않지만 yearSalary를 세팅하는데 필요한건가??
        float increSalary;
        increSalary = (float)(Math.random() * 20 + 1);
        yearSalary = (int)(yearSalary + yearSalary * increSalary * PERCENT);

    }
    public void printSalary() {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, yearSalary);
    }

    public int getYearSalary() {
        return yearSalary;
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

        int length = nameArr.length;
        Salary2[] company = new Salary2[length];

        /* 수정형태
        for (int i = 0; i < 10; i++) {
            company[i] = new Salary2(nameArr[i]);
        }
         */

        // i = 0인 동안
        // i = 1인 동안
        for (int i = 0; i < 10; i++) {
            float sum = 0;
            // j = 0 ~ 9을 순회함
            // 즉 총 10개의 객체를 new 해서 생성함
            // 다시 위를 반복해서 기존의 객체를 밀어버리고 새로운 객체를 만듬
            // (기존 정보는 증발 <<<<<<< )
            for (int j = 0; j < length; j++) {
                // 수정 이전 문제가 되던 부분
                company[j] = new Salary2(nameArr[j]);
                //company[j].increSalary();
                // 여기까지 포함
                sum += company[j].getYearSalary();
                company[j].printSalary();
            }
            System.out.println("올해 평균 연봉 = " + (sum / 10.f));
        }
    }
}