import java.util.Scanner;

public class QuizTest27 {
    public static void main(String[] args) {
     //강사님이 푸는방법
        // 피보나치수열
        // 사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍

        System.out.println("사용자로부터 n을 입력받아 n 번째 피보나치 수열의 항을 구합니다. ");

        Scanner scan = new Scanner(System.in);
        System.out.print("n 값을 입력하세요 : ");

        int num = scan.nextInt();
        int res = 0;

        //에외처리 음수와 0

        if (num <= 0) {
            System.out.println("0번째 항 혹은 음수 항은 존재하지 않습니다.");
        } else if (num < 3) {
            // 1번째와 2번째값은 무조건적으로 1에 해당함
            System.out.println("당신이 찾는 값은 1입니다. ");
        } else {
            // 위의 조건이 모두 만족되지 않는다는 것은 결론적으로 숫자 3보다 크다는 것을 의미함
            int first = 1, second = 1;
            // -2를 했던 이유는 시작할 때 first 값고 second 값 2개를 알고 시작했기 때문
            for (int i = 2; i < num; i++) {
                //for (int i = 0; i < num -2; i++)
                res = first + second;
                first = second;
                second = res;
            }

            System.out.println("걀과는 = " + res);
        }




    }
}
