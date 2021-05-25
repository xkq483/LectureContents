import java.util.Scanner;

class Employee{

    Scanner scan;
    private String name;
    private int pay;
    //상승한 연봉을 담을수 있는 배열 만들고 -> 상승한 연봉은 배열에 저장
    int[] increasedPay;
    //연봉상승률을 담을수 있는 배열을 만든다.
    int[] increasedRatio;

    public Employee(){
        System.out.print("직원 이름을 입력해주세요 : ");
        Scanner scan = new Scanner(System.in);
        this.name= scan.nextLine();
        pay =(int)(Math.random()*1101+2400);
    }
    public void setYearArr(int year){
        increasedPay = new int[year];
        increasedRatio = new int[year];
    }

    public int getPay(){
        return pay;
    }
    public void setPay(int pay){this.pay = pay;}
    public String getName(){
        return name;
    }
}

class PayCalculator{
    double increase;
    int randRatio;
    int year;

    Employee[] em;


    PayCalculator(Employee[] em,int year){
        this.em = em;
        this.year = year;

    }

    //직원들 1년 인상률과 상승한 연봉,연봉상승률 배열에 담기
    private void employeesIncrease(){
        for(int i=0;i<em.length;i++){
            //생성자에서 받은 year로 연봉상승 배열생성
            em[i].setYearArr(year);
            //연봉상승률과 상승률을 연봉상승률 배열에 담음
            randRatio =(int)(Math.random()*20+1);
            em[i].increasedRatio[i] = randRatio;
            //연봉증가량과 증가량을 증가된연봉 배열에 담음
            increase = em[i].getPay()*(randRatio*0.01);
            em[i].setPay(em[i].getPay()+(int)increase);
            em[i].increasedPay[i] = em[i].getPay();
            //출력란
            System.out.printf("%s의 연봉률 상승폭은 %d%%이며 상승된 연봉은 %d 입니다.\n",em[i].getName(),em[i].increasedRatio[i],em[i].increasedPay[i]);
        }
    }

    //입력받은 int값만큼 연봉인상
    public void showIncrease(){
        for(int i =0;i<year;i++){
            System.out.println(i+"년차 연봉 평균은"+averagePay());
            employeesIncrease();

        }


    }

    public int averagePay(){
        int sum = 0;
        int average = 0;
        for(int i=0;i<em.length;i++){
            sum+=em[i].getPay();
        }
        average= sum / em.length;
        return average;

    }

}






public class TodayTest {
    /*
    랜덤 연봉 적용을 해보자
    어떤 회사에 직원이 10명 있다.
    10명의 이름을 적당히 지어주도록 한다.
    이들의 시작 연봉은 2400~3500으로 랜덤하게 지정한다.
    또한 연봉 인상률은1%~20%사이의 랜덤값을 가지게 한다.
    10년후의 각 직원들의 연봉을 출력하도록 프로그래밍 해보자.
     */
    public static void main(String[] args) {

        System.out.print("총 몇명의 직원이 있습니까 ? ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //Employee로 이루어진 배열을 입력받은 num만큼 생성
        Employee[] em = new Employee[num];
        //for 문을 돌면서 em배열에 직원정보를 기입
        for(int i=0;i<num;i++){

            Employee e = new Employee();
            em[i] = e;
            System.out.println(em[i].getName()+"님의 연봉은 "+em[i].getPay());
        }
        PayCalculator p = new PayCalculator(em,3);
        p.showIncrease();




        //연봉률 상승코드
        //em내의 직원들숫자만큼 순회하면서
        /*
        for(int i=0;i<em.length;i++){
            //10년치 만큼 연봉인상

            for(int j=0;j<3;j++){

                double increase = (int)em[i].getPay()*(((int)(Math.random()*20+1))*0.01);
                em[i].setPay(em[i].getPay()+(int)increase);
                System.out.println(em[i].getName()+"의 연봉은 "+em[i].getPay());
            }
            System.out.println(em[i].getName()+"의 연봉은 "+(em[i].getPay()));


        }

         */



    }
}
