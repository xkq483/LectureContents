import java.util.Scanner;
class Employee {
    private String name;
    private int year;
    private int payRiseRate;
    private int payArray[];
    private int raiseRateArray[];

    public Employee(String name, int year) {
        this.name = name;
        this.year = year;
        payArray = new int[year];
        raiseRateArray = new int[year];
        payArray[0] = (int)(Math.random()*1101+2400);
    }
    private int getPayRiseRate() {
        return (int)(Math.random()*20+1);
    }

    public void calcPay() {
        for(int i=1; i<payArray.length; i++) {
            raiseRateArray[i] = getPayRiseRate();
            payArray[i] = (int)(payArray[i-1] + payArray[i-1]*(raiseRateArray[i]/100.0));
            //인상률 배열을 만들기 위해 raiseRateArray[i]에 for문이 돌 때 마다 1~20사이의 랜덤값 메소드를 대입했다.
            //인상률에 연봉을 곱하면 소숫점이 포함되니 (int)를 붙여주어야한다!
        }   //i에는 전년도 연봉에 인상률의 곱해주어야하니 i-1을 해줘야한다!
    }

    public void printPay() {
        for(int i=0; i<payArray.length; i++) {
            System.out.printf("%s님의 %d년차 연봉은 %d만원입니다.\n", name, i+1, payArray[i]);
        }
    }
    public void printRaiseRateArray() {
        for(int i=0; i<raiseRateArray.length; i++) {
            System.out.printf("%s님의 %d년차 연봉 인상률은 %d퍼센트입니다.\n", name, i+1, raiseRateArray[i]);
        }
    }
    public int getPayArray(int year) {
        return payArray[year];
    }
    public int[] getPayArray2() {
        return payArray;
    }
}

public class Prob43Scanner {
    public static Scanner sc;

    public static float[] calMean(Employee[] em) {

        int length = em[0].getPayArray2().length;
        float[] mean = new float[length];

        for(int i=0; i<length; i++) {
            float sum = 0;

            for(int j=0; j<em.length; j++) {
                sum+=em[j].getPayArray(i);
            }
            //System.out.println("sum : "+sum); //sum값 확인차 출력
            mean[i] = sum/(float)em.length;
        }
        return mean;
    }

    public static String inputName() { //이 이름을 넣는 inputName()메소드가 밑에 main 메소드에서 인자로 들어가려면 자료형 앞에 static이 붙어야한다!.
        sc = new Scanner(System.in);   // main이 포함된 같은 클래스 안에서 메소드가 이용되려면 static이 붙어야하는건지? 아직 헷갈립니다.
        System.out.print("직원의 이름 입력 : ");
        String name = sc.nextLine();
        return name;
    }
    public static int inputYear() {
        boolean isTure = false;
        int year;
        sc = new Scanner(System.in);
        do {
            System.out.print("계산할 년치 입력 : ");
            year = sc.nextInt();
            if (year < 1) {
                System.out.println("올바른 값을 입력해주세요");
                isTure = true;
            }
        } while (isTure);
        return year;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("직원의 수 입력 : ");
        int stuNum = sc.nextInt();
        Employee em[] = new Employee[stuNum];
        int year = inputYear();

        for(int i=0; i<em.length; i++) { //계산, 출력메소드에 이미 for문이 입력되었기 때문에 저번 예시처럼 2중 for문이 필요가 없다!
            em[i] = new Employee(inputName(), year);
            em[i].calcPay();
            em[i].printPay();
            //em[i].printRaiseRateArray();
            //System.out.println(em[i].getPayArray2()); //배열의 주소값이 나온다.
            //System.out.println(em[i].getPayArray(9)); //이걸로 인자를 넣어서 특정 연차의 연봉을 구할 수 있다.
        }
        float[] mean = calMean(em); //static 메소드라 new를 쓰지않음.

        for(int i=0; i<mean.length; i++) {
            System.out.printf("사원들의 %d년차 평균 연봉은 %.0f만원입니다.\n", i+1, mean[i]);
        }



    }
}
