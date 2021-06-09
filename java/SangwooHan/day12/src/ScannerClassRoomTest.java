
import java.util.Scanner;


class Employee {
    final float PERCENT = 0.01f;

    String name;
    int[] pay;
    float[] incRate;

    int curYear;

    public Employee (String name, int year) {
        this.name = name;
        curYear = 0;

        pay = new int[year];
        incRate = new float[year];

        pay[0] = (int)(Math.random() * 1101 + 2400);
    }

    public void calcYearPay () {
        // 피보나치와 같은개념, 피보나치는 3번쨰항을 할려면 1,2항의 값을 먼저 알았어야헀다.
        // 여기선 2년차 연봉을 하고싶지만. 그러면 1년차 연봉부터 알아야 할것이다 그래서 위에
        // pay[0]에 초기 연봉 값을 넣어주고
        // 여기 포문에선 이제 pay[1]부터 ~ pay[9]까지 돌아갈것이다. 매년 , 랜덤한 getRandomIncRate에서 나오는 인상률에 의해 값이 올라가면서.
        for (int i = curYear + 1; i< pay.length; i++) {
            pay[i] = pay[i - 1] + (int)(pay[i - 1] * getRandomIncRate() * PERCENT);
        }
    }
    public void calcPay () {
        pay[curYear] = pay[curYear] + (int)(pay[curYear] * getRandomIncRate() * PERCENT);
        curYear++;
    }
    //이제 calcYearPay 에서 연산을 다맞추고 출력만 남은 상태이다.
    // 아까 입력한  name값 적용되고. 인덱스는 0부터니까 0~9년차가아닌 1~10년차여서 i+1를해주고,
    // 연봉은 pay[0~9]까지 담겨있으니 pay[i]로 출력하면 되겠다.
    public void printPay () {
        for (int i = 0; i < pay.length; i++) {
            System.out.printf("%s님의 %d년차 연봉은 %d입니다.\n", name, i + 1, pay[i]);
        }
    }

    public float getRandomIncRate () {
        return (float)(Math.random() * 20 + 1);
    }

    public int[] getPay() {
        return pay;
    }

    public int getYearPay(int year) {
        return pay[year];
    }
}

public class ScannerClassRoomTest {

    static final Scanner scan = new Scanner(System.in);

    public static String inputName () {
        System.out.print("학생 이름을 입력하세요: ");
        return scan.nextLine();
    }

    public static float[] calcEmployeeMean(Employee[] emp) {
        int[] pay;
        int length = emp[0].getPay().length;
        // length는 10이라는걸 알수있다.
        float mean[] = new float[length];
        // mean 이라는 배열방을 10개 판걸 알수있다.
        for (int i = 0; i < length; i++) {
            float sum = 0;

            for (int j = 0; j < emp.length; j++) {
                // j 번째 사람의 i 년차 연봉
                // 0 부터 emp길이-1만큼 돌리겠다 결국 입력한 생각수만큼 돌리겠다는뜻
                sum += emp[j].getYearPay(i);
                 //sum 은 emp[]안에있는 getYearpay(i)계속 더해줄것이다.
                // emp 배열하나는 학생 한명이라고 칭해도될거같다.
                // emp 하나당  pay[0]~pay[10]까지있기떄문에. 이모든 값을
                // sum이 다더하겠다는뜻이다.
            }

            mean[i] = sum / (float)emp.length;
            // 앞서 mean은 10개의 방을 팠다. mean각각방에다가 다더한 값  sum나누기, emp의 길이 즉 학생수를 나누겠다는뜻 즉 평균이다.
            //
        }

        return mean;
    }
    // psvm
    public static void main(String[] args) {
        final int YEAR = 10;

        System.out.print("몇 명의 학생 정보를 입력할까요 ? ");
        int studentNum = scan.nextInt();
        scan.nextLine();

        Employee[] emp = new Employee[studentNum];
    // Employee 의방을 studentNum의 개수만큼 만들겠다..!

        for (int i = 0; i < studentNum; i++) {
            emp[i] = new Employee(inputName(), YEAR);
            // emp[]를 인스턴스화할때, 인자값인 inputName(), YEAR이 있다.
            // 인자값을 매개변수로 넘겨주기전  inputName(), YEAR 의 값을 알아야한다
            // year은 10이고 inputName() 는 학생이름을 입력하고, 리턴하여inputName()에 저장한다.
            //  고로 Employee라는 생성자 매개변수에 학생이름과 10이라는 인자값을 넘겨주게된다.


            emp[i].calcYearPay();
            emp[i].printPay();
            //여기까지가 XX의 10년연봉까지 뽑는로직
        }

        float[] mean = calcEmployeeMean(emp);

        for (int i = 0; i < mean.length; i++) {
            System.out.printf("%d년차 평균 연봉은 %f\n", i + 1, mean[i]);
        }// 마지막으로, 평균프린팅이다.
        // 0은 mean의 길이 10 보다 작게 즉 10번 돌것이다.
        //  그떄마다 mean 배열안에있는 평균값을  가각 i번쨰 배열에 뿌려줄것이다.
    }
}