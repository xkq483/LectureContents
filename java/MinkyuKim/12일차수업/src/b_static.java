// Q: Scanner 써서 만들어 볼까요 ?
// A: 코드로

// 랜덤 연봉 적용을 해보자
// 어떤 회사에 직원이 10명 있다.
// 10명의 이름은 적당히 지어주도록 한다.
// 이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
// 또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
// 10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
// 또한 연별로 평균 연봉값을 계산해보도록 한다.

import java.util.Scanner;

// 클래스 배열을 사용하므로
// 1. 직원 정보에는 이름과 자신의 페이가 기록됨
//    여기서 페이는 배열로 작성하여 연별값을 얻을 수 있어야함
// 2. 초봉 설정은 2400 ~ 3500
// 3. 매년 인상률은 변동하며 1 ~ 20%임 (데이터가 궁금할 수 있으므로 배열로 관리한다)
// 4. 각각의 페이 정보(클래스 배열들)에 대한 합산 결과가 요구됨 ---> 연별 평균
//    새로운 개념인 유틸리티 매서드(static 매서드)를 사용
// 5. Scanner 사용이 필요하므로 학생 이름이 키보드로 넘어옴
// 6. 또 몇명을 입력할 것인지에 대한 정보가 추가로 필요함
class Employee {
    final float PERCENT = 0.01f;

    String name;
    int[] pay;
    float[] incRate;

    int curYear;

    public Employee (String name, int year) {
        this.name = name;
        // name의 반환값
        curYear = 0;
        // ??

        pay = new int[year];
        // 해당 연수 연봉
        incRate = new float[year];
        // 매년마다 상승률

        pay[0] = (int)(Math.random() * 1101 + 2400);
        //초봉만 초기화값
    }

    public void calcYearPay () {
        for (int i = curYear + 1; i < pay.length; i++) {
            pay[i] = pay[i - 1] + (int)(pay[i - 1] * getRandomIncRate() * PERCENT);

            // 랜덤으로 증가된 연봉 생성
            // curYear = 0 / pay = year / pay[i] -> i(0~year)까지의 연봉(상승률 포함)
        }
    }
    public void calcPay () {
        pay[curYear] = pay[curYear] + (int)(pay[curYear] * getRandomIncRate() * PERCENT);
        curYear++;

        // 초봉 + 상승연봉
    }
    public void printPay () {
        for (int i = 0; i < pay.length; i++) {
            System.out.printf("%s님의 %d년차 연봉은 %d입니다.\n", name, i + 1, pay[i]);

            // 출력 이름 + 매해 연봉
        }
    }

    public float getRandomIncRate () {
        return (float)(Math.random() * 20 + 1);
        // 랜덤 인상률 값 반환
    }

    public int[] getPay() {
        return pay;
        //
    }
    public int getYearPay(int year) {
        return pay[year];
    }
}

public class b_static {
    //클래스

    static final Scanner scan = new Scanner(System.in);

    public static String inputName () {
        System.out.print("학생 이름을 입력하세요: ");
        return scan.nextLine();
    }
    public static int inputYear () {
        Boolean isTrue = false;
        int num;

        do {
            System.out.print("몇 년치를 계산할까요 ? ");
            // return scan.nextInt();
            // 예외 상황으로 인해
            num = scan.nextInt();

            if (num <= 0) {
                System.out.println("0 보다 큰 숫자를 입력해주세요!");
                isTrue = true;
            }
        } while (isTrue);

        return num;
    }
    // psvm
    public static void main(String[] args) {
        final int YEAR = 10;

        System.out.print("몇 명의 학생 정보를 입력할까요 ? ");
        int studentNum = scan.nextInt();
        scan.nextLine();

        Employee[] emp = new Employee[studentNum];
        // emp = 사용자가 입력하는 값, 즉 몇명의 학생을 입력할것인가?


        for (int i = 0; i < studentNum; i++) {
            emp[i] = new Employee(inputName(), YEAR);
            // emp[i] 변수의 배열에 inputName(), YEAR 할당
            // i = 내가 입력한 수(학생 수)

            /*
            emp[i] = new Employee(inputName(), inputYear());
            scan.nextLine();
             */

            emp[i].calcYearPay();
            emp[i].printPay();
        }
    }
}