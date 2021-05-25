class Employee {
    private int salary;
    private int startSalary;
    private int payRiseRate;
    private final int YEAR=10;
    private String name;

    public Employee(String empName) {
        this.name = empName;
        salary = (int)(Math.random()*1101+2400);
    }
    public void calcStartSalary() {
        startSalary = salary;
    }
    public void calcSalaryOfAYear() {
        payRiseRate = (int)(Math.random()*20+1);
        salary = (int)(salary + (salary*(payRiseRate*0.01)));
    }
    public int getSalary() {
        return salary;
    }
    public int getPayRiseRate() {
        return payRiseRate;
    }
    public int getYear() {
        return YEAR;
    }
    public int getStartSalary() {
        return startSalary;
    }

}
public class Prob43Revised {
    public static void main(String[] args) {
        String empName[] = {"이규호", "강선혁", "주하민", "장하늘", "이종화", "손현구", "정도영", "조유라", "장준하", "신준호"};
        Employee em[] = new Employee[empName.length];

        for(int i=0; i< empName.length; i++) {
            em[i] = new Employee(empName[i]);
        }

        for (int i=0; i<em[i].getYear(); i++) { //for문 안에서 em[i].getYear()은 어짜피 10이므로 같은 값인데, i<em[i].getYear();으로 했을 때 에러가난다. i<10으로 했을 때는 문제가 없다. 왜그런지 잘 모르겠습니다.
            int sumAYear = 0;

            for (int j = 0; j < empName.length; j++) {
                if (i == 0) { //1년차 시작 연봉 즉 i가 0일때는 인상률이 salary에 안곱해지게 계산해야할것아서 밑 부분을 추가했습니다.
                    em[j].calcStartSalary();
                    System.out.printf("%s의 시작 연봉은 %d만원입니다.\n", empName[j], em[j].getStartSalary());
                    sumAYear += em[j].getStartSalary();
                } else {
                    em[j].calcSalaryOfAYear(); //j=사원, 사원별로 급여계산을 돌린다!
                    System.out.printf("%s의 %d년차 연봉은 %d만원이고 인상률은 %d퍼센트입니다.\n", empName[j], i + 1, em[j].getSalary(), em[j].getPayRiseRate());
                    sumAYear += em[j].getSalary();
                }
            }
            System.out.printf("%d년차 사원들의 연봉의 평균은 %d원 입니다.\n", i + 1, sumAYear / 10);
            System.out.println();

        }

    }

}
