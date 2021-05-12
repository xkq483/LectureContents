public class FourthQuiz {
    public static void main(String[] args) {
        //Quiz11.  for 문제 1
        // 1~10까지 출력하는 프로그램을 만들어보자!
        for (int a = 1; a <= 10; a++) {
            System.out.println("a = " + a);
        }

        //Quiz12. for 문제 2
// 1~20에서 3의 배수를 출력하는 프로그램을 만들어보자(if문 없이!)
        for(int i = 0; i<=20; i+=3){
            System.out.println(" 1~20숫자중 3의배수 출력 : " +i);
        }

        //Quiz13. for+if문제
        // 1~30까지 숫자중 짝수와 홀수를 각각 모두 판정 하도록 프로그래밍 해보자

        for(int b = 0; b<=30; b++) {

            if(b%2==0) {
                System.out.println("짝수 : "+b);
            } else {
                System.out.println("홀수 : " +b);
            }
        }
    }
}