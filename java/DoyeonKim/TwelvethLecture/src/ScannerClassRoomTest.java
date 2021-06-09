
// Q: Scanner 써서 만들어 볼까요 ?
// A: 코드로

// 랜덤 연봉 적용을 해보자
// 어떤 회사에 직원이 10명 있다.
// 10명의 이름은 적당히 지어주도록 한다.
// 이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
// 또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
// 10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
// 또한 연별로 평균 연봉값을 계산해보도록 한다.
//
import java.util.Scanner;

// 클래스 배열을 사용하므로
//1. 직원 정보에는 이름과 자신의 페이가 기록됨
// 여기서 페이는 배열로 작성하여 연별값을 얻을 수 있어야함
//2. 초봉 설정은 2400~3500
//3.매년 인상률은 변동하며 1~20%임 (데이터기 궁금할 수 있으므로 배열로 관리한다)
// 4. 각각의 페이 정보(클래스 배열)에 대한 합산 결과가 요구됨
//    새로운 개념인 유팅이티 메서드(static 매서드)를 사용
//5. scanner 사용이 필요하므로 학생 이름이 키보드로 넘어옴
//6. 몇명 입역할것인지 대한 정보 추가로 필요함
class Employee {
    final float PERCENT = 0.01f;

    String name;
    int[] pay;
    float[] incRate;

    int curYear;


    public Employee (String name, int year) { //직원 이름과 년도
        this.name = name;
        curYear = 0;

        pay = new int[year]; //년마다 페이값이 들어감
        incRate = new float[year];

        pay[0] = (int)(Math.random() * 1101 + 2400); //랜덤 연봉지정
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
    public void calcYearPay () { //해마다 쭉 연봉을 구합
        for (int i = curYear; i < pay.length; i++) {
            pay[i] = pay[i - 1] + (int)(pay[i - 1] * getRandomIncTate() * PERCENT);
        }
    }
    public void calcPay () { //초봉
        pay[curYear + 1] = pay[curYear] + (int)(pay[curYear] * getRandomIncTate() * PERCENT);
        curYear++;
    }
    public void printPay() { //연봉 프린트
        for (int i = 0; i < pay.length; i++) {
            System.out.printf("%s님의 %d년차 연봉은 %d입니다.\n", name, i + 1, pay[i]);
        }
    }

    public float getRandomIncTate () { //랜덤 인상
        return (float)(Math.random() * 20 + 1 );
    }
    public int[] getPay() {
        return pay;
    }
    public int getYearPay(int year) {
        return pay[year];
    }
}

public class ScannerClassRoomTest {
    // static은 정적 변수로 메모리 레이아웃으로 치면 data 섹션에 잡힘

    // --------------
    // | Stack      |
    // --------------
    // | Heap       |
    // --------------
    // | Data       | <<<<<<<--- 이 영역에 잡히는 것은 전역 변수로서 역할을 수행함
    // --------------
    // | Text(Code) |
    // --------------

    // 그렇기 때문에 static 으로 선언된 녀석들은 new가 없어도 사용이 가능한 것임
    // 대표적으로 ? main() 매서드가 new 없이 사용했었고 static이 붙어있음

    static final Scanner scan = new Scanner(System.in);

    public static String inputName() {
        System.out.println("학생 이름을 입력하세요: ");
        return scan.nextLine();
    }

    public static int inputYear() {
        Boolean isTrue = false;
        int num;

        do {
            System.out.println("몇 년치를 계산할까요?");
            // return scan.nextInt();
            // 예외 상황으로 인해
            num = scan.nextInt();

            if (num <= 0) {
                System.out.println("0보다 큰 숫자를 입력해주세요");
                isTrue = true;
            }
        } while (isTrue);

        return num;
    }

    public static float[] calcEmployeeMean(Employee[] emp) { //임플로이 배열 (아래 클래스 배열 emp )을 가져옴
        int[] pay;
        int length = emp[0].getPay().length; //페이 배열 길이값 가져옴
        float mean[] = new float[length]; //길이값만큼 평균 배열을 ㅁ만들고

        for (int i = 0; i < length; i++) { //몇년간 루프
            float sum = 0;

          for (int j = 0; j < emp.length; j++) { //사람 수에 대한 합산, i값이 고정일때 j값이 변함
              //j번쨰 사람의 i년차 연봉
              sum += emp[j].getYearPay(i);
          }

             mean[i] = sum / (float) emp.length; //1년차 몇년차 다 세팅하고 위에 float mean배열을 한다

        }
        return mean;
}
//psvm 메인 호출할때 new안하고 한 이유는 static덕분
    public static void main(String[] args) {
            final int YEAR = 10;

        System.out.println("몇 명의 학생 정보를 입력할까요? ");
        int studentNum = scan.nextInt();
        scan.nextLine();

        Employee[] emp = new Employee[studentNum];

        //static 매서드의 대표 예
        //int num = Math.pow(2,2);
        //굳이 특정한 클래스에 소속될 필요없이 필요하면 항상 사용하는 녀석들
        // 이런경우를 유틸리티 매서드라고 하는데
        //이런 유틸리티 매서드들은 static 매서드로 만들어서 사용하곤 한다
        // 필요하다면 클래스에 static 매서드를 만든다
        //ex) Math.exp() ====> 오일러 상수 e^x같은거 표현할때 쓰는거
        //ex) Math.pow() ====> x^y 표현 등등
        // 결론적으로 앞의 Math <<< 라는것이 수학 관련 라이브러리임을 알려주고
        // 뒤에 exp, pow, sqrt 등이 어떤 매서드인지를 알려준다.
        // 현재 우리가 main 근처에 작성한 유틸리티 클래스는
        // 딱히 ? Math 나 어디에 종속 되어있다고 표현하기도 애매한 상황
        // 그러므로 그냥 별도 클래스에 적지 않고 내부에 작성하였다.
        // 만약 예를 들어서 나중에 주식 관련 무언가를 만든다 가정을 한다면
        // Trade.inputName() 이런식으로 작성을 할 수도 있다.
        for (int i = 0;i < studentNum; i++) {
            emp[i] = new Employee(inputName(), YEAR);


                emp[i].calcYearPay();
                emp[i].printPay();


            }

            float[] mean = calcEmployeeMean(emp);

            for (int i = 0; i < mean.length; i++) {
                System.out.printf("%d년차 연봉 평균은 %f\n", i + 1, mean[i]); //

            }
        }

    }
