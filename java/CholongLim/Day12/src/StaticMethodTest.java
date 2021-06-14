
// 클래스 배열을 사용하므로
// 1. 직원 정보에는 이름과 자신의 연봉이 기록됨
//    여기서 연봉은 배열로 작성하여 연별값을 얻을 수 있어야함
// 2. 초봉 설정은 2400 ~ 3500만원
// 3. 매년 인상률은 변동하여 1 ~ 20% (데이터가 궁금할 수 있으므로 배열로 관리)
// 4. 각각의 연봉 정보(클래스 배열들)에 대한 합산 결과가 요구됨 = 연별 평균
//    새로운 개념인 유틸리티 매서드 (static 매서드)를 사용
// 5. Scanner 사용이 필요하므로 학생 이름이 키보드로 들어옴
// 6. 몇 명을 입력할 것인지에 대한 정보가 추가로 필요함

import java.util.Scanner;

class Employee{
    final float PERCENT = 0.01f;


    String name;
    int[] pay;  //연봉
    float[] incRate;  //연봉인상률

    int curYear;  //현재 년차

    public Employee(String name, int year) {
        this.name = name;
        curYear = 0;  //신입일때(초봉)

        pay = new int[year];
//        int pay[] = new int[year]
//        int year만큼 pay 인덱스가 생긴다.
        incRate = new float[year];
//        in incRate[] = new int[year]
//        int year만큼 incRate 인덱스가 생긴다.

        pay[0] = (int)(Math.random() * 1101 + 2400);
//        초봉 랜덤값 (연봉상승률은 포함되지 않기에 pay[0]값을 초기설정한다)
    }

    public void calcYearPay() {
        for (int i = curYear + 1; i < pay.length; i++) {
//            curYear = 0;
//            pay[0] 으로 초기설정 되어 있어 i + 1 해준다.
            pay[i] = pay[i - 1] + (int)(pay[i - 1] * getRandomIncRate() * PERCENT);
//            pay[1] = pay[0] + (int)(pay[0] * getRandomIncRate() * 0.01f)
        }
    }

    // Convention(규약)
    // 나중에 팀 프로젝트 할 때도 팀간에 컨벤션 설정이 중요
    // 전부 다 가져오는 것은 표기를 어떻게 하자
    // 낱개로 가져오는 것은 표기를 어떻게 하자
    // 위와 같은 규약에 따라 그냥 지금 생각나는대로 작성한 부분
    // calc_종류_변수 : 변수의 속성에 해당하는 종류 전체값을 전부 처리함
    // calcYearPay : pay 변수의 속성 year에 해당하는 전체값을 모두 처리
    // 이 규약은 만들기 나름이고 팀 프로젝트를 하는 경우엔 반드시 필요함
    // (왜냐하면 내가 만든 매서드를 다른 사람이 사용할 수도 있기 때문)

//    clacPay는 규약의 예시, 현재 코드에서는 사용되고 있지 않다.
    public void calcPay(){
        pay[curYear + 1] = pay[curYear] + (int)(pay[curYear] * getRandomIncRate() * PERCENT);
        curYear++;
    }


    public void printPay() {
        for(int i = 0 ; i < pay.length; i++){
//            pay.length는 int year의 year.length값과 동일하다.
            System.out.printf("%s님의 %d년차 연봉은 %d입니다.\n", name, i+1,pay[i]);
        }
    }

    public float getRandomIncRate() {
        return (float)(Math.random() * 20 + 1);
    }

    public int[] getPay() {
        return pay;
    }

    public int getYearPay(int year){
        return pay[year];
    }
}


public class StaticMethodTest {
//static 매서드
    static final Scanner scan = new Scanner(System.in);

    public static String inputName() {
        System.out.print("학생 이름을 입력하세요: ");
        return scan.nextLine();
    }


//    public static void inputName() {
//        System.out.print("학생 이름을 입력하세요: ");
//        scan.nextLine();
//    }

    // void가 없었기때문에 return을 사용할 수 있었다.
    // 만약 return이 아닌 scan.nextLine();으로 사용하고 void를 추가한다면
    // 똑같이 잘 작동할까 ?
    // 하단 부 144번에서 inputName() 오류 발생
    // get이 쓰여져있지는 않지만, get의 역할을 하고있는 듯 하다.


    public static int inputYear() {
        Boolean isTrue = false;
        int num;

        do{
//            while이 참일때 do가 반복된다.
            System.out.print("몇 년치를 계산할까요?");
            num = scan.nextInt();

//            num값이 0 또는 음수일때, while이 참이되며 do가 반복된다.
            if (num <= 0) {
                System.out.println("0보다 큰 숫자를 입력해주세요!");
                isTrue = true;
            }
//            num값이 0 또는 음수가 아닐때, while의 isTrue은 false이기 때문에
//            반복문은 끝난다.
        } while (isTrue);

//        또한 상단과 같이 void가 없기때문에 reture을 받을 수 있으며,
//        입력한 키보드값을 리턴한다.
//        리턴 : 매서드 내에서 사용한 return은 return뒤에 따라오는 값을
//              매서드의 결과로 반환한다.
        return  num;
    }

    public static float[] calcEmployeeMean(Employee[] emp){
//        calcEmployeeMean()가 float[]형태이기 때문에  똑같은 형태의
//        값을 받되, 그 값은 Employee[] emp이다.
        int[] pay;
        int length = emp[0].getPay().length;
//        emp는 메인코드에 작성되어 있다.
//        emp는 Employee 클래스 배열(studentNum.length만큼)
//        emp[0].getPay().length;
//        0번째 인덱스 직원의 ~10년 월급의 길이 = 10


        float mean[] = new float[length];

//        몇 년 간
        for(int i = 0 ; i < length; i++){
            float sum = 0;

//            사람 수
            for(int j = 0; j < emp.length; j++) {
//                j번째 사람의 i년차 연봉
                sum += emp[j].getYearPay(i);
            }
            mean[i] = sum / (float)emp.length;
        }
        return mean;
    }
    public static void main(String[] args) {
        final int YEAR = 10;

        System.out.print("몇 명의 학생 정보를 입력할까요 ? ");
        int studentNum = scan.nextInt();
        scan.nextLine();  //오류 방지용

        Employee[] emp = new Employee[studentNum];
//        Employee 클래스 배열 (studentNum.length만큼)

        for(int i = 0; i < studentNum; i++) {
            emp[i] = new Employee(inputName(), YEAR);

            emp[i].calcYearPay();
            emp[i].printPay();
        }

        float[] mean = calcEmployeeMean(emp);

        for(int i =0 ; i < mean.length; i++) {
            System.out.printf("%d년차 평균 연봉은 %f\n", i+1, mean[i]);
        }

    }
}
