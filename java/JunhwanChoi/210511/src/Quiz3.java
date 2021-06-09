
//질문 X
import java.util.Scanner;


public class Quiz3 {
    public static void main(String[] args) {
        // 3번 문제
        // 숫자 3이 짝수인지 홀수인지 판별
        int num = 3;

        // A를 B로 나눴을때 나머지가 0이란 뜻은
        // 결국 A가 B의 배수란 의미
        if (num % 2 == 0) {
            System.out.println("이 숫자는 2의 배수(짝수)입니다.");
        } else {
            System.out.println("이 숫자는 2의 배수가 아닙니다.(홀수)");
        }

    }


}
