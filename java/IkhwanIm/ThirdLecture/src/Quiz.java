import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        //3번. if문제
        int i = 3;

        if (i % 2 == 1) {
            System.out.println("홀수입니다");
        } else {
            System.out.println("짝수입니다");

            //4번. scanner 문제

        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);

        //5번. while 문제
        int j = 0;
        while (j++ < 20) {
            if (j % 2 == 0)
                System.out.println(j);
        }

        }
    }

