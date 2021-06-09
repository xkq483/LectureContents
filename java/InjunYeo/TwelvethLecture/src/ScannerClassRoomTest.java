import java.util.Scanner;

class Employee {
    final float PERCENT = 0.01f;
    String name;
    int pay[];
    float[] incRate;
    int curYear;

    public Employee(String name, int year) {
        this.name = name;
        curYear=0;

        pay = new int[year];
        incRate = new float[year];

        pay[0] = (int)(Math.random()*1101+2400);

    }

    public void calcYearPay(){
        for(int i =curYear+1;i<pay.length;i++){
            pay[i]=pay[i-1]+(int)(pay[i-1]*getRandomIncRate()*PERCENT);
        }
    }

    public void calcPay(){
        pay[curYear + 1] = pay[curYear]+(int)(pay[curYear]*getRandomIncRate()*PERCENT);
        curYear++;
    }
    //왜필요하지?

    public void printPay(){
        for(int i =0;i<pay.length;i++){
            System.out.printf("%s님의 %d년차 연봉은 %d입니다.\n",name,i+1,pay[i]);
        }
    }

    public float getRandomIncRate(){
        return (float)(Math.random()*20+1);
    }


    //연봉 배열 얻어오는것
    public int[] getPay() {
        return pay;
    }

    public int getYearPay(int year) {
        return pay[year];
    }

}


public class ScannerClassRoomTest {
    //static은 정적 변수로 메모리 레이아웃으로치면 data 섹션에 잡힘

    static final Scanner scan = new Scanner(System.in);

    public static String inputName() {
        System.out.print("학생이름을 입력하세요 : ");
        return scan.nextLine();
    }

    public static int inputYear() {
        Boolean isTrue = false;
        int num;

        do {

            System.out.print("몇 년치 입력을 할까요? ");
            num = scan.nextInt();
            if(num<1) {
                System.out.println("0보다 큰 숫자를 입력해주세요");
                isTrue = true;
            }


        }while(isTrue);

        return num;
    }
    public static float[] calcEmployeeMean(Employee[] emp){

        int[] pay;
        int length = emp[0].getPay().length;

        float mean[] = new float[length];

        for(int i =0;i<length;i++){
            float sum =0;
            for(int j=0;j<emp.length;j++){
                sum += emp[j].getYearPay(i);
        }

        mean[i] = sum/emp.length;
        }
        return mean;
    }


    public static void main(String[] args) {
        final int YEAR=10;

        System.out.println("몇 명의 학생 정보를 입력할까요 ? ");
        int studentNum = scan.nextInt();
        //버그지우는용
        scan.nextLine();

        Employee[] emp = new Employee[studentNum];
        //static 메서드의 대표 예
        //int number = (int)Math.pow(2,2);
        /*
        굳이 특정한 클래스에 소속될 필요없이 필요하면 항상 사용하는 녀석들
        이런 경우를 유틸리티 메서드라고 하는데
        이런 유틸리티 메서드들은 static 메서드로 만들어서 사용하곤 한다.
        필요하다면 클래스에 static메서드를 만든다.
        ex> Math.exp() ==> 오일러 상수 e^x같은 표현
        ex> Math.pow() ==> x^y 표현등등
        결론적으로 앞으 Math<<라는것이 수학관련 라이브러리임을 알려주고
        뒤에 exp,pow,sqrt등이 어떤 메서드인지를 알려준다
        현재 우리가 main근처에 ㄷ작성한 유틸리티 클래스는 딱히 Math나 어디에도 종속되어있다고 표현하기 애매한상황
        그러므로 그냥 별도 클래스에 적지않고 내부에 작성하였다
        만약 예를 들어서 주식관련 무언가를 만든다면,Trade.inputName()이런식으로 작성을 할수있다.
         */

        for(int i = 0;i<studentNum;i++){
            //emp[i]= new Employee(inputName(),YEAR);
            emp[i]= new Employee(inputName(),inputYear());
            scan.nextLine();


            emp[i].calcYearPay();
            emp[i].printPay();

        }

        float[] mean = calcEmployeeMean(emp);

        for(int i =0;i<mean.length;i++){
            System.out.printf("%d년차 평균연봉은 %f\n",i+1,mean[i]);
        }

    }


}
