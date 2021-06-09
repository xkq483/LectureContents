import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수(n)를 입력하면 n 번째 값을 찾아드립니다 :");

        int user = sc.nextInt();
        // 사용자입력으로 n번째 값을 찾아야 하기때문에 스캐너 사용
        int num1 = 0, num2 = 1;
        int sum = 1;
        // 피보나치수열힌트를 주셨고 변수 2개라고하셨는데 저는 왜 3개인지 ..ㅠㅠ
        // 첫 번째 값과 두 번째 값이 같아서 num1 =0 num2 = 1 로 설정
        // sum 은 for문이 시작과 동시에 출력하기 위해 1로 설정
        // 그러고 이후 피보나치수열 규칙으로 연산
        // 열심히 풀어 봤지만 코드는 이게 최선이였습니다
        // 결과값은 잘 나오지만 뭔가 이쁘지가 않네요 코드가 ,,
        for (int i = 0; i < user; i++){
            System.out.println(sum);
        sum = num1 + num2;
        num1 = num2;
        num2 = sum;

        }

    }
}
