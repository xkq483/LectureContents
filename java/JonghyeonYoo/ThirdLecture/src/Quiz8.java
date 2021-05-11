import java.util.Scanner;

public class Quiz8 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int select = 1;

            while(select != 0) {
                System.out.print("짝수인지 홀수인지 판별해보자 : ");
                select = scan.nextInt();

                if (select %2 == 0) {
                    System.out.println(select +" 는 짝수");
                } else {
                    System.out.println(select + "는 홀수");
                }
            }
        }
    }


