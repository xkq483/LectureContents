public class Prob15 {
    public static void main(String[] args) {
        //15
        //for + if 문제
        //1~100까지의 숫자중 4의 배수만 출력해보자
        for(int i = 1; i <= 100; i++) {
            //1~100까지 1씩 증가하면서 반복된다.

            if(i%4 == 0) {
                //i나누기4의 나머지값이 0이면 4의 배수다.
                System.out.println(i);
            }
        }
    }
}
