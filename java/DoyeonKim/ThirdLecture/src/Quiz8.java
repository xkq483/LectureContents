import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select = 1;
        //0이 아니라 참이니까 와일로 넘어간것


        while(select != 0) {
            //0이 아니라면 참, 계속 실행
            System.out.println("짝수인지 홀수인지 판별해보자:");
            select = scan.nextInt();

            if (select % 2 ==0) { //짝수홀수 감별하는거,나머지가 0이면 짝수 아님 홀수
                System.out.println(select + "는 짝수!");
            } else {System.out.println( select + "는 홀수!");
            }
        }
    }
}
