import java.util.Scanner;

public class ThirdLecture_Quiz3 {
    public static void main(String[] args) {


        //Quiz8. if + while + Scanner 문제
        //키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
        //입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
        //break 개념 아직 안 배웠어서 이 문제 할 수 없음 영상확인.
        Scanner scan = new Scanner(System.in);

        int a = 1;

        while(a != 0){
        System.out.print("n은 짝수인가? 홀수인가? n을 기입하시오: ");
        a = scan.nextInt();

        if(a == 0){
            break;
        } else if(a % 2 != 0) {
            System.out.println(a + "는 홀수");
        } else if(a % 2 == 0){
            System.out.println(a + "는 짝수");
        }

        }
    }
}
