import java.util.Scanner;

public class Quiz29 {
    public static void main(String[] args) {
        System.out.println("1, 3, 9, 27,  ...");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요 ? ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
        } else if (num < 2) {
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {
            int numArr[] = new int[num];

            numArr[0] = 1; //두번째 방법으론 없어도됨

            for (int i = 1; i < numArr.length; i++) { //length는 배열의 길이
                numArr[i] = numArr[i - 1] * 3;
                //2번째 방법 : numArr[i] = (int)MAth.pow(3,i);
                // 현재값은 이전값 X3
                //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
                //| 1 | 2 | 3 | 4 |
                //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
                // [0] [1] [2] [3]
                //입력값이 될때 까지 3을 곱한다는 말이 맞나
            }

            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
        }
    }
}

