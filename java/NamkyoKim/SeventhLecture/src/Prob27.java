import java.util.Scanner;

public class Prob27 {
    public static void main(String[] args) {
        // 피보나치수열
        // 사용자가 n번을 입력하면 n번째 값을 구하는 프로그래밍


        Scanner sc = new Scanner(System.in);
        System.out.print("n번째 값을 입력 : ");

        int num = sc.nextInt();
        int res = 0;

        // 예외 처리 (음수와 0 )
        if(num <= 0 ){
            System.out.println(" 0 번째 항 혹은 음수 항은 존재하지 않습니다");
        }else if (num < 3 ){        // 0이 아니면 음수가 아니고 3미만이라면 1번째와 2번째뿐
            // 1번째와 2번째 값은 무조건적으로 1에 해당함
            System.out.println("당신이 찾는 값은 1입니다");
        }else {
            // 위의 조건이 모두 만족되지 않는다는 것은 결론족으로 숫자 3보다 크다는 것을 의미함
            int first = 1, second = 1;
            // -2 를 했던 이유는 시작할 때 first 값과 second 값 2개를 알고 시작했기 때문1
            for (int i = 0; i < num - 2; i++) {
                res = first + second;
                first = second;
                second = res;
            }
            System.out.println("결과는 = " + res);
        }
    }
}
// 1  1  2  3  5  8  13  21 ....09

// first second      res
//  1       1         2     첫번째 루프에서 first + second 까지의 상태
//  1       2         3     두번째 루프에서 first + second 까지의 상태
//  2       3         5     세번째 루프에서 first + second 까지의 상태
//  3       5         8     세번째 루프에서 first + second 까지의 상태