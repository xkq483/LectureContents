public class e_Quiz11 {
    public static void main(String[] args) {
        //11. for 문제 1
        //1 ~ 10까지 출력하는 프로그램을 만들어보자!
/*
        for(int i = 1 ; i <=10 ; i++) {
            System.out.println("i = " + i);
        }
         */
        //다른식 문제풀이방법


        for (int i =1 ; i <= 10; i++) {
            System.out.printf("%3d", i);
            if (i % 5 == 0) {
                System.out.println();

                // souf("%3d", i) >> %d는 정수형 숫자를 출력하는 것, %3d의 3은 3칸을 확보하라는 뜻(띄어쓰기)
                // if (i % 5 == 0 ) >> i값이 5로 나뉘어 떨어지면,
                // sout >> 엔터 적용하여 출력하라
            }
        }
    }
}
