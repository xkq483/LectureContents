//랜덤 연봉 적용을 해보자
//어떤 회사에 직원이 10명 있다.
//10명의 이름은 적당히 지어주도록 한다.
//이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
//또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
//10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
//또한 연별로 평균 연봉값을 계산해보도록 한다.
// 10명 배열지정하기 , 1년차 월급만 랜덤셋팅 그이후부터는 1~20% 랜덤한 인상률, 10년후 각 직원들 연봉, 모든 직원들의 연별 평균 연봉값
class RandomSalary {
        int randSal[];

        int sal;
        int sum;
        public RandomSalary() {
                randSal = new int[2];
                int i;

                for ( i = 1; i < 2; i++) {
                        randSal[1] = (int) (Math.random() * 1100 + 2400);
                }
                for(i = 1; i<10; i++){
                        sal = (int) (Math.random() * (19 + 1));
                }
                sum = randSal[1]+sal;
        }

}


public class Test43 {
        public static void main(String[] args) {
                RandomSalary ra= new RandomSalary();

                for(int i =1; i<2; i++) {
                        System.out.printf("직원 1의 %d년차 월급 =%d\n", i, ra.randSal[i]);
                }
        }
}
