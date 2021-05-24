import java.util.Scanner;

class randSalary {

    final int MAX = 10;

    int[] yearSalary;
    int increasSalary;
    int afterSalary;
    String [] name =  { "a", "b", "c", "d", "e", "f", "g", "h","i", "j"};
    // 10년 수치, 연봉, 상승률, 10년후값, 구성원 명칭

    public randSalary() {
        afterSalary = 0;
        yearSalary = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            yearSalary[i] = (int) (Math.random() * 1100 + 2401);
            // 랜던연봉 (2400~3500)
        }
    }

    public int[] getYearSalary() {
        return getYearSalary;
}
public class f_Quiz {
    public static void main(String[] args) {
        randSalary rs = new randSalary();

    }


    /*랜덤 연봉 적용을 해보자
    어떤 회사에 직원이 10명 있다.
            10명의 이름은 적당히 지어주도록 한다.
    이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
    또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
            10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
    또한 연별로 평균 연봉값을 계산해보도록 한다. */


}

}
