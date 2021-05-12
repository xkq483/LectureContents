public class Quiz1 {
    public static void main(String[] args) {
//        11. for 문제 1 : 1 ~ 10까지 출력하는 프로그램을 만들어보자!
        for(int i1 = 1; i1 <= 10; i1++) {
            System.out.println(i1);
        }


//        12. for 문제 2 : 1 ~ 20에서 3의 배수를 출력하는 프로그램을 만들어보자(if 문 없이!)
        for(int i2 =3; i2 <= 20; i2 += 3 ) {
            System.out.println(i2);
        }


//        13. for + if 문제 : 1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
        for(int i3 = 1; i3 <=30; i3++) {
            if(i3 % 2 ==0) {
                System.out.printf("%d 의 값은 짝수.\n", i3);
            } else {
                System.out.printf("%d 의 값은 홀수.\n", i3);
            }
        }


    }
}
