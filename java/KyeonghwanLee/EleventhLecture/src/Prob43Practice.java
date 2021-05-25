class SalaryPractice{
    /*랜덤 연봉 적용을 해보자
        어떤 회사에 직원이 10명 있다.
        10명의 이름은 적당히 지어주도록 한다.
        이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
        또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
        10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
        또한 연별로 평균 연봉값을 계산해보도록 한다.*/

//1. 직원은 10명
//2. 연봉 랜덤하게 2400~3500 설정
//3. 인상률 1~20% 사이의 랜덤값 설정
//4. 각 직원들의 연봉 출력
//5. 각 연도별 평균값

    final float PERCENT = 0.01f;//소수점 0.01~0.02설정을 위한 상수
    String name; // 이름을 받을 변수
    int salary; // 연봉을 받을 변수


    public SalaryPractice(String name){//name으로 들어온 값
        this.name = name;
        salary = (int)(Math.random()* 1101+2400);//연봉 2400~3500 랜덤값
    }

    public void calcSalary(int year) {
        float incSal;

        for(int i = 0 ; i < year; i++) {
            incSal = (int)(Math.random() *20 +1);// 인상률 1~20%사이의 랜덤값

            salary = (int)(salary + salary*incSal*PERCENT);//연봉 인상분
        }
    }
    public void calcSalary(){
        float incSal = (int)(Math.random() *20 +1);
        salary = (int)(salary + salary * incSal * PERCENT);

    }
    // 출력 값
    public void printSalary(){
        System.out.printf("%s님의 현재 연봉 = %d\n",name,salary);
    }
    public int getSalary(){
        return salary;
    }
}
public class Prob43Practice {
    public static void main(String[] args) {

        String[] nameArr = {
                "강수호", "이수영", "이진영", "남채원", "김명수",
                "유진호", "이한율", "김호수", "진명아", "김직원"
        };

        int nameLen = nameArr.length;
        SalaryPractice[] sp = new SalaryPractice[nameLen];//new를 통한 호출은 안에있는 매서드를 쓸 수 있다는 뜻이다.


        for (int i = 0; i < nameLen; i++) {
            sp[i] = new SalaryPractice(nameArr[i]);
        }

        for (int i = 0; i < 10; i++) {

            float sum = 0;//포문 밖에 있을때는 누적합산이 되어 출력됨
                          //포문 안에 있을때 0값으로 초기화 되어 10명의 평균값이 나오게 된다.(주의)

            for (int j = 0; j < nameLen; j++) {


                sp[j].calcSalary();//위에서 할당한 sp정보를 갱신하라(연봉1년치 증가율)
                sum += sp[j].getSalary();//나온 연봉을 누적합산 = 10명의 1년치 연봉합
                sp[j].printSalary();//위에 작성한 프린트 메서드에 의한 출력

            }

            System.out.println("올해 평균 연봉 = " + (sum / 10.f));


        }
    }
}
