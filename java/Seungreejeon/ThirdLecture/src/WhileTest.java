import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        // 반드시 결과가 true 혹은 false로 나온다.
//        while(true) {
//            System.out.print("안녕 숫가락으로 n번 맞으면 죽을수도 있데");
//            break;
//        }
        // false를 조건에 입력 : unreachable statemnet가 나오면서 루프내부에 도달할 수 없음을 알리는 에러메시지가 나타남
        int i = 0;
        while(i++ < 10) {
            System.out.println(i);
        }
        // i++ != ++i 1부터 출력하지만 ++위치에따라 먼저 증가시킬 여부를 결정
        i = 0;
        while(i < 10){
            System.out.println(i++);
        }
        //0부터 출력
//        int num1 = 1;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("원하는 단을 입력 하시오");
//        int numU = sc.nextInt();
//
////        while(num1 <= 9) {
////            System.out.println(num1*numU);
////            System.out.printf("%d X %d = %d",num1,numU,(num1*numU));
////            num1++;
////        }
//        System.out.println("==========="+numU+"단============");
//        for(int i = 1; i < 10; i++){
//            System.out.printf("%d X %d = %d\n", numU, i, (numU*i));
//
//        }
    }
}
