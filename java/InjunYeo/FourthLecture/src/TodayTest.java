public class TodayTest {
    public static void main(String[] args) {


        // for 문제 1 (1~10)까지 출력하는 프로그램을 만들어보자
        System.out.println("========1번 문제==============");
        for(int i=1;i<=10;i++){
            System.out.println("i : "+i);
        }
        /*
        System.out.printf("%3d",i);
        //%3d 는 먼저 %d가 정수형 숫자를 출력하는 역할을 수행함을 상기하고 3의 의미는 3칸을 먼저 확보하라는 뜻이다.

         */

        System.out.println("========2번 문제==============");
        //for 문제 2 (1~20에서 3의 배수를 출력하는 프로그램을 만들어보자 -if문 없이)
        for(int i =3;i<=20;i+=3){
            System.out.println(i);
        }

        System.out.println("========3번 문제==============");
        //for + if 문제 (1~30까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍을 해보자)
        for(int i =1;i<=30;i++){
            if(i%2 == 0){
                System.out.println(i+"(은)는 짝수입니다.");
            }
            else {
                System.out.println(i + "(은)는 홀수입니다.");
            }
        }





    }
}
