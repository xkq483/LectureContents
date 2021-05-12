public class FourthQuiz {
    public static void main(String[] args) {
        //Quiz11.  for 문제 1
        // 1~10까지 출력하는 프로그램을 만들어보자!
        for (int a = 1; a <= 10; a++) {
           /* for (int i = 1; i < 11; i++) {
              %3d는 먼저 %d가 정수형 숫자를 출력하는 역할을 수행함을 상기한다.
              여기서 3의 의미는 3칸을 확보하라는 뜻이다.
              숫자 10의 경우 2칸을 차지하고
              붙어 있으면 10인지 구별이 안되니까 공백 1칸을 추가로 확보한다.
              그러므로 910으로 표현되지 않고 9 10 으로 깔쌈하게 표현된다.
                          --- 3칸 확보
              System.out.printf("%3d", i);

              i 값이 5로 나눠서 떨어지면 앤터 적용
              if (i % 5 == 0) {
              아무것도 출력 안하고 앤터만 적용함(println())
              System.out.println();
                }
            }
            System.out.println("a = " + a);
        }
*/
        //Quiz12. for 문제 2
        // 1~20에서 3의 배수를 출력하는 프로그램을 만들어보자(if문 없이!)
        for(int i = 3; i<=20; i+=3){
            System.out.println(" 1~20숫자중 3의배수 출력 : " +i);
        }

        //Quiz13. for+if문제
        // 1~30까지 숫자중 짝수와 홀수를 각각 모두 판정 하도록 프로그래밍 해보자

        for(int b = 1; b<=30; b++) {

            if(b%2==0) {
                System.out.printf("%d는 짝수 입니다. \n", b);
            } else {
                System.out.printf("%d는 홀수 입니다. \n" , b);
            }
        }
    }
}