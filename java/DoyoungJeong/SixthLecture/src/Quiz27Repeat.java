import java.util.Scanner;

public class Quiz27Repeat {
    public static void main(String[] args) {
        //챌린지문제
        int valueN=1;
        Scanner sc = new Scanner(System.in);

        while (valueN!=0) { //while문으로 입력, 출력을 반복하려했는데 첫 번째는 정상 출력이 되는데 두 번째부터 이상하게 출력이 되네요;;
            int num = 1, num2 = 0, i=1; //해결 완료

            System.out.print("n번 째 값 입력 : ");
            valueN = sc.nextInt();

            for (i=1; i<=valueN; i++) {
                if (i == 1 || i % 2 == 1) {
                    num = num2 + num;
                    // System.out.println(num);
                } else if (i == 2 || i % 2 == 0) {
                    num2 = num + num2;
                    // System.out.println(num2);
                }
                if (valueN == i) {
                    if (i == 1 || i % 2 == 1) {
                        System.out.print(i + "번 째 값은 : " + num + "\n");
                    } else System.out.print(i + "번 째 값은 : " + num2 + "\n");
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
