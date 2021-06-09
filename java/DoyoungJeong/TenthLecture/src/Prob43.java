class Employee {
    private int salary;
    private int payRiseRate;
    private int futSalary;
    private final int YEAR=10;

    public Employee() {
        salary = (int)(Math.random()*1100+2400);
        payRiseRate = (int)(Math.random()*20+1);
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
    public int calcSalary() {
        futSalary = getSalary();
        for(int i=1; i<YEAR; i++) {
            futSalary = (int)(futSalary + (futSalary*(getPayRiseRate()/100.0))); //마지막 100을 100.0으로 소숫점을 표현해서 값 표현이 가능해졌다. 소숫점을 표현하는 방식이 아직 헷갈립니다.ㅠ
            //System.out.println((double)getPayRiseRate()/100); //여기서 문제있음 (payRate/100)하면 소숫점 밑자리를 버리기 때문에 무조건 0이 나온다. 100분의 1할 수 있는 다른 방법 찾아야함!
            System.out.printf("이 사원의 %d년차 연봉은 %d만원입니다.\n", i+1, futSalary);
        }
        return futSalary;
    }
}
public class Prob43 {
    public static void main(String[] args) {
        Employee em[] = new Employee[10];

        for(int i=0; i< em.length; i++) {
            em[i] = new Employee();
            System.out.printf("%d번째 사원의 첫 해 연봉은 %d만원이고, 연봉 인상률은 %d퍼센트입니다.\n", i+1, em[i].getSalary(), em[i].getPayRiseRate());
            System.out.printf("즉, %d년 후에 %d번째 사원의 연봉은 %d만원입니다.\n", em[i].getYear(), i+1, em[i].calcSalary());
            System.out.println();
        }

    }
}
