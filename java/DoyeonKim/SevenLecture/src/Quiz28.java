import java.util.Scanner;

public class Quiz28 {
    public static void main(String[] args) {

        System.out.println("1,2, 4, 8, ... 1024, ...");

        Scanner scan = new Scanner(System.in);

        System.out.println("몇번째 항을 구할까요?");
        int num = scan.nextInt();


        if (num <= 0) {
            System.out.println("잘못된 값을 입력");
        } else if (num < 2) {
            System.out.println("1임");
        } else  {
            int numArr[] = new int[num];

        for (int i =1; i < numArr.length; i++) {
            numArr[i] = numArr[i - 1] * 2;
            //그 앞의 항에서 입력값까지 2를 계속 곱해줌
        }
            System.out.printf("%d 번째 항은 = %d\n",num, numArr[num - 1]);




        }
    }
}
