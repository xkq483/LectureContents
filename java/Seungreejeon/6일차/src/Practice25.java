import java.util.Scanner;
public class Practice25 {
    public static void main(String[] args) {
        //1 ~ 100 까지의 숫자중 2의 배수는 모두 더한다.
        //            여기서 5의 배수는 모두 뺀다.
        //            11의 배수는 더한다.
        //            중복이 발생할 경우엔 무시

        Scanner sc = new Scanner(System.in);
        Boolean isTrue = true;


        int sum1 = 0, sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
            if (i % 5 == 0) {
                sum1 -= i;
            }
            if (i % 11 == 0) {
                sum1 += i;
            }


        }

        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0 && i % 5 == 0 && i % 2 == 0) {
                System.out.println("110의 배수 : "+ i);
            } else if (i % 11 == 0 && i % 5 == 0) {
                System.out.println("55의 배수 : "+ i);
            } else if (i % 11 == 0 && i % 2 == 0) {
                System.out.println("22의 배수 : "+ i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("11의 배수 : "+ i);
            } else if (i % 11 == 0) {
                System.out.println("11의 배수 : "+ i);
                sum += i;
            } else if (i % 5 == 0) {
                System.out.println("5의 배수 : "+ i);
                sum -= i;
            } else if (i % 2 == 0) {
                System.out.println("2의 배수 : "+ i);
                sum += i;
            }
        }
        System.out.println("빼기전 값 : "+ sum1);
        System.out.println("최종결과 : " + sum);
    }

}

