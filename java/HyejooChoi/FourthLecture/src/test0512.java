public class test0512 {
    public static void main(String[] args) {
        //1 ~ 10까지 출력하는 프로그램을 만들어보자!
        System.out.println("11. for 문제 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //1 ~ 20에서 3의 배수를 출력하는 프로그램을 만들어보자(if 문 없이!)
        System.out.println("12. for 문제 2");

        for (int i = 0; i <= 20; i += 3 ) {
            System.out.println(i);
        }

        //1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
        System.out.println("13. for + if 문제");

        for (int i = 1; i <=30; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " 는(은) 짝수");
            }else {
                System.out.println(i + " 는(은) 홀수");
            }
        }
    }
}
