// 배열문제
// 1, 3, 9, 27, 81, 243, 729, 2187, ...
// n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!


import java.util.Scanner;

public class Quiz29 {
    public static void main(String[] args) {

        System.out.println("1, 3, 9, 27, 81, 243, 729, 2187, ...");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요 ? ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
        } else if (num < 2) {
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {
            int numArr[] = new int[num];

            numArr[0] = 1;

            for (int i = 1; i < num; i++) {
                //numArr[i] = (int)Math.pow(3, i);  -
                numArr[i]= numArr[i-1]*3;

            }

            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]); // ex) n=3이면 3번째 항을 구하는 건데 배열에서는
                                                                            // 3번째항은 arr[2]이기 떄문에 -1을 해준것


        }
    }
}
