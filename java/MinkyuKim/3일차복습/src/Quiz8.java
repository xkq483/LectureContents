import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        // 8. if + while + Scanner 문제
        //키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
        //입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
        Scanner scan = new Scanner(System.in);
        int select = 1;
//여기서 select = 1로 왜 설정했는지 잘 모르겠습니다.(2로해도 정상작동하고, 3으로해도 정상작동이 되네요.)

        while(select != 0) {
            System.out.print("짝수인지 홀수인지 판별해보자: ");
            select = scan.nextInt();

            if (select % 2 == 0 ) {
                System.out.println(select + "은(는) 짝수로 판명되었다.");
            } else {
                System.out.println(select + "은(는) 짝수가 아닌것으로 판명되었다.");
            }
        }
    }
}
