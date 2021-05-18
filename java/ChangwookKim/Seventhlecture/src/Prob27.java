import java.util.Scanner;

public class Prob27 {
    public void test() {
        int num = 3, res = 2;
    }
    public static void main(String[] args) {

        System.out.println("사용자로부터 n을 입력받아 n 번째 피보나치 수열의 항을 구합니다.");

        Scanner scan = new Scanner(System.in);
        System.out.print("n 값을 입력하시오: ");

        int num = scan.nextInt();
        int res = 0;


        if (num <= 0) {
            System.out.println("0번째 항 혹은 음수 항은 존재하지 않습니다.");
        } else if (num < 3) {

            // 0과 음수가 아닌 숫자를 넣을 경우 "0번째 항 혹은 음수 항은 존재하지 않습니다." 라고 출력
            // 첫 번째와 두 번째만 피보나치 수열에서 미리 주어진 값이 있기 때문에 3미만(즉, 1 과 2)을 이렇게 예외로 구분해둠


            System.out.println("당신이 찾는 값은 1입니다.");
        } else {

            int first = 1, second = 1;

            for (int i = 2; i < num; i++) {



                res = first + second;
                first = second;
                second = res;
            }

            System.out.println("결과는 = " + res);
            System.out.println("first = " + first);
        }

    }
}

