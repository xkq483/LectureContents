import java.util.Scanner;

public class AllocHeapArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("학급에 학생이 몇 명 있습니까 ? ");

        int studentNum = scan.nextInt();


        int studentArr[] = new int[studentNum];

        /* 기억해둘것 3가지

           1. new로 만든 데이터는 heap(메모리)에서 관리함.
           2. stack으로 만든 배열은 할당된 값으로 갯수가 제약되지만
              new에서는 공간이 필요한만큼 할당할 수 있음.
           3. 반면, 속도가 stack에 비해서 느림.

         */


        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < studentNum; i++) {

            // 80점부터 100점까지만 점수가 나오게 끔 조정함.
            studentArr[i] = (int)(Math.random() * 21) + 80;
            System.out.printf("studentArr[%d] = %d\n", i, studentArr[i]);
        }
    }
}