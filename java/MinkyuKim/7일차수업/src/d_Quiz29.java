import java.util.Scanner;

public class d_Quiz29 {
    public static void main(String[] args) {
        //29. 배열 문제
        //아래와 같은 형태의 숫자들이 있다.
        //1, 3, 9, 27, 81, 243, 729, 2187, ...
        //n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!
        System.out.println("1, 3, 9 ... 729, ....");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요? ");
        int num = scan.nextInt();

        if(num <=0) {
            System.out.println("잘못된 값을 입력하였음");
        } else if (num < 2) {
            System.out.println(" 결과값은 1입니다.");
        }else {
            int numArr[] = new int[num];

                    numArr[0] = 1;

            for(int i = 0; i < numArr.length; i++) {
                numArr[i] = (int) Math.pow(3, i);
            }
            System.out.printf("%d번째 항은 = %d\n", num, numArr[num -1]);

        }

    }
}
