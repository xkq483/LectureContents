import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
//        3. if문제 : 숫자 3이 짝수인지 홀수인지 판별하는 코드를 작성해봅시다!
        System.out.println("숫자 3은 홀수인가 짝수인가?");
        int num1 = 3;
        if(num1 % 2 ==0) {
            System.out.printf("%d는 짝수이다.",num1);
        } else {
            System.out.printf("%d는 홀수이다.\n",num1);
        }

//        4. Scanner문제 : 아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드를 작성해봅시다!

        Scanner scan = new Scanner(System.in);
        System.out.print("아무 숫자나 입력해주세요 : ");
        int i1 = scan.nextInt();
        System.out.print("아무 숫자나 입력해주세요 : ");
        int i2 = scan.nextInt();
        System.out.print("아무 숫자나 입력해주세요 : ");
        int i3 = scan.nextInt();

        System.out.println("세 숫자의 합은 " + (i1+ i2+ i3));

//        5.while문제 : 1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다.
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }

}
        // while 사용시 조건이 추가될 때 어려움을 느낍니다.
        // While이 들어가는 5,7,8번 문제에서 비슷한 혼란을 느끼고 있습니다.
//                while (i <= 20) {
//            System.out.println(i);
//            i += 2;
//            }                    일때의 값과
//                while (i <= 20) {
//            i += 2;
//            System.out.println(i); } 값에서 차이가 있다는 것에 빠른 판단이 어려우며 개념적으로 부족한것같습니다.
//                                      while 반복문에 대해 다시한번 말씀해주셨으면 좋겠습니다.


