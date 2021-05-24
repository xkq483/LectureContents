import java.util.Scanner;

class Employee{

    Scanner scan;
    private String name;

    private int pay;

    public Employee(){
        System.out.print("직원 이름을 입력해주세요 : ");
        Scanner scan = new Scanner(System.in);
        this.name= scan.nextLine();
        pay =(int)(Math.random()*1100+2400);
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
    Employee em[];


    PayCalculator(Employee[] em){
        this.em = em;
    }

    //직원들 1년 인상률
    private void employeesIncrease(){
        for(int i=0;i<em.length;i++){
            increase = em[i].getPay()*(((int)(Math.random()*20+1))*0.01);
            em[i].setPay(em[i].getPay()+(int)increase);
            System.out.println(em[i].getName()+"의 연봉은 "+em[i].getPay());
        }
    }

    //입력받은 int값만큼 연봉인상
    public void showIncrease(int year){
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
        PayCalculator p = new PayCalculator(em);
        p.showIncrease(3);




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
