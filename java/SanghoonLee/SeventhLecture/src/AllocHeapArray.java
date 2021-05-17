import java.util.Scanner;

public class AllocHeapArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("학급에 학생이 몇 명 있습니까 ? ");

        int studentNum = scan.nextInt();

        // 동적할당 되는 데이터를 관리하는 메모리 - Heap
        // new 로 만든 데이터는 전부 Heap에서 관리하게 된다.
        // 기존에 우리가 stack에 배열을 만들 경우엔 항상 제약 사항이 발생했었다.
        // 어떤 제약 사항 ? 개수가 고정됨(할당된 값으로)

        // Heap 방식의 할당에서는 공간을 필요한만큼 할당할 수 있어서 유연한 접근이 가능하다.
        // 근대 여기에도 제약사항이 있다 ? stack 보다 느리다.
        int studentArr[] = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            studentArr[i] = (int)(Math.random() * 21) + 80;
            System.out.printf("studentArr[%d] = %d\n", i, studentArr[i]);
        }
    }
}
