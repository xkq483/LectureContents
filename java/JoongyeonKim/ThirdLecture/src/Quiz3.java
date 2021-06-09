import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //8번 while + Scanner 문제 문제 키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
        // 입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
        int select=1;  //1.여기서 select를 1로 지정해서

        while (select != 0) {  //2.여기에 1로 변수를 지정하고   //4.select를 0으로 입력하면 반복문의 반복조건이 풀려서 반복이 끝나는건가요??
            System.out.println("짝수인지 홀수인지 판별하기");
            select=scan.nextInt(); //3.여기서 다시 값을 초기화해서 계속 반복하는게 가능해지고
            if(select % 2 == 0) {
                System.out.println("num은 짝수!");
            }
            else{
                System.out.println("num은 홀수!");
            }
           
    }

    }
}
