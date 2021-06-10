import java.util.Scanner;

public class Quiz28 {
    public static void main(String[] args) {
        //Quiz28
        // 아래와 같은 형태의 숫자들이 있다.
        // 1, 2, 4, 8, 16, 32, 64, 128, 256, 1024, ...
        //n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자


        System.out.print("n번째 숫자 입력 : ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        if (num <= 0) {
            System.out.println("숫자를 잘못 입력했습니다.");
        } else {
            int numArr[] = new int[num];

            numArr[0] = 1;  // 첫번째 배열은 언제나 0
                           // 첫번째 배열칸에 1을 대입
                            // 처음(기준이되는) 시작하는 숫자를 입력.
            for (int i = 1; i < numArr.length; i++) {
                numArr[i] = numArr[i - 1] * 2;
                //현재값은 이전값 x 2
                // -------------------------
                // | 1 | 2 | 4 | 8 |  |   |   |
                //---------------------------
                //  [0] [1] [2] [3] [4] [5]
                // numArr[i - 1] (i가 2였을때 2 - 1 =[1] 2번째 배열칸에 입력하라는 뜻)
                // 왜냐면 배열은 [0]칸부터 채워지기때문에 -1을 입력해준다!!!!


            }
            System.out.printf("%d번째 항의 값 : %d\n ", num, numArr[num - 1]);
            //numArr[num - 1]  -1은 배열의 첫 시작이 0 이라서 0부터 입력받기 위해서이다.
        }
    }
}