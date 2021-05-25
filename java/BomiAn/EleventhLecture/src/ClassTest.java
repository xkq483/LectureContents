import java.util.Arrays;
import java.util.Scanner;

class EmployeeAnnualSalary {

    // 어제 수업을 듣고 복습하면서 나만의 커스텀 메소드를 만들어 보자 해서 만들어봤는데 생각보다 시간이 오래 걸렸습니다.
    // 강사님께서 한번 보시고 좀 더 효율적인 방법이나 피드백을 주셨으면 좋겠습니다.

    // 직원의 이름을 입력받아 배열을 할당하고, 배열의 길이를 변수로 지정/ 랜덤 연봉, 램덤 인상률 식을 완성한 후
    // 2차원 배열을 이용하여 년차별 연봉값을 값을 할당 --> 리셋되지 않기에 각 년차별 평균을 구하기 쉽게 설정하는 시나리오


    //1. 이름 배열을 변수로 지정, 스캐너로 직원 이름을 입력받고, 입력받은 값을 이름 배열에 할당하는 메소드 만듬
    //2. 이름 배열 전체를 보여주는 프린트 메소드 만듬
    //3. 2차원 배열을 이용하여 이름 배열의 길이 + 메인에서 입력한 년차만큼 랜덤 연봉을 계산하고 할당하는 메소드를 만듬
    //4. for문을 활용하여 0~이름배열(len)의 길이까지 의 2차원 배열 행마다 main 에서 입력한 num 열의 값을 더해서
    //   len 으로 나누는 평균 메소드를 구함

    Scanner sc;
    final float PERCENT = 0.01f;
    String empArr[];
    int[][] empSalaryArr;
    int len;
    String empName;
    int salary;
    float incRate;
    int year;
    float mean;


    public EmployeeAnnualSalary(){
        sc = new Scanner(System.in);

    }

    public void inputEmpName() {
        System.out.print("직원 수 입력 : ");
        len = sc.nextInt();
        empArr = new String[len];
        sc.nextLine();

        for (int i = 0; i < len; i++) {
            System.out.print("직원의 이름을 입력하세요 : ");
            empName = sc.nextLine();
            empArr[i] = empName;
        }
    }

    public void printEmpName() {
        System.out.println("============= 사내 연봉 인상자 명단을 공개합니다. =============");
        System.out.println(Arrays.toString(empArr));
    }


    public void calcEmpSalary(int year) {
        this.year = year;
        empSalaryArr = new int[len][year];

        for (int i = 0; i < len; i++) {
            salary = (int)(Math.random() * 1101 + 2400);

            for (int j = 0; j < year; j++) {

                incRate = (int)(Math.random() * 20 + 1);
                salary = (int)(salary + (salary * incRate * PERCENT));

                empSalaryArr[i][j] = salary;
            }
            System.out.printf("%s 님의 %d년차 연봉은 = %d이며 당해 인상률 = %f 입니다. \n", empArr[i], year, salary, incRate);

        }
    }

    public void calcYearSalaryAvg(int num) {
        System.out.println("============= 해당 년차의 평균 연봉을 공개합니다. ==============");

        int sum = 0;

        for (int i = 0; i <len; i++) {
            sum += empSalaryArr[i][num - 1];
        }
        mean = sum/(float)len;
        System.out.println(num + "년차의 평균 연봉은 = " + mean + "입니다. ");

    }

}

public class ClassTest {
    public static void main(String[] args) {
        EmployeeAnnualSalary es = new EmployeeAnnualSalary();
        es.inputEmpName();
        es.printEmpName();
        es.calcEmpSalary(5);
        es.calcYearSalaryAvg(2);



    }

}
