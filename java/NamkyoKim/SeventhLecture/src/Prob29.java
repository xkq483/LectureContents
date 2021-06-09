import java.util.Scanner;

public class Prob29 {
    public static void main(String[] args) {
        //아래와 같은 형태의 숫자들이 있다.
        //1, 3, 9, 27, 81, 243, 729, 2187, ...
        //n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!

        System.out.println("1, 3, 9, 27, 81, 243, 729, 2187, ... ");

        Scanner sc = new Scanner(System.in);
        System.out.print("몇번째 값을 구해드릴까요 ? n번째 값을 입력하세요 : ");
        int num = sc.nextInt();


            int numArr[] = new int[num];
         if (num <= 0){
        System.out.println("잘못입력하셨습니다.");
          }else {
        numArr[0] = 1;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) Math.pow(3, i);
            // 확실히  Math.pow int형변환을 하고 쓰는게 편하긴하다 ..ㅎㅎ
        }
        System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
         }
    }
}
