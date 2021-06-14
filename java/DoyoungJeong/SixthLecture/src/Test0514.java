import java.util.Scanner;

public class Test0514 {
    public static void main(String[] args) {
        //챌린지문제
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("n번 째 값 입력 : ");
            int valueN = sc.nextInt();

            int i = 1, num = 1, num2 = 0;
            while (i <= valueN) {
                if (i == 1 || i % 2 == 1) {
                    num = num2 + num;
                    System.out.println(num);
                } else if (i == 2 || i % 2 == 0) {
                    num2 = num + num2;
                    System.out.println(num2);
                }
                if (i == valueN) {
                    if (i == 1 || i % 2 == 1) {
                        System.out.print(i + "번 째 값은 : " + num + "\n");
                    } else System.out.print(i + "번 째 값은 : " + num2 + "\n");
                }
                i++;
            } //풀긴했지만 시간이 다소 많이 걸렸습니다.
        }

    }
}
