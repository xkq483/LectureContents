import java.util.Scanner;
public class _1st_AllocHeapArray {
    public static void main(String[] args) {

        // 동적할당 되는 Data를 관리하는 메모리 - Heap
        // new로 만든 Data는 모두 Heap에서 관리됨.
        // stack에 배열을 만들 경우엔 항상 [개수가 고정]된다는 제약사항이 발생함.
        // Heap방식의 할당에서는 공간을 필요한만큼 할당할 수 있어서 유연한 접근이 가능.
        // 하지만 Heap방식은 stack방식 보다 느리다.

        Scanner scan = new Scanner(System.in);
        System.out.print("합급에 있는 학생 수는? : ");
        int studentNum = scan.nextInt();

        // new를 통해 공간을 만드는 방법
        // 1. new를 적는다.
        // 2. 데이터타입을 적는다.
        // 3. 만약 데이터타입이 배열이라면 대괄호를 열고 몇 개를 만들지 적는다.
        //    만약 데이터타입이 클래스라면 소괄호를 열고 필요하다면 인자를 설정한다.
        int studentArr[] = new int[studentNum]; // <<< Heap공간에 int형 배열을 studentNum의 개수 만큼 만들겠다.
        // 그리고 studentArr는 Heap에 생성된 공간을 제어하게 된다.
        // [0], [1], ... [3] 등의 인덱스가 Heap에 있는 공간을 바라보게 된다는 의미.
        // 복잡하게 생각하기 싫다면 기존 배열 제어하는 방식과 동일하되,
        // 메모리 생성시에만 위와 같은 방식을 사용한다고 보면 된다.

        for (int i = 0; i < studentNum; i++){
            studentArr[i] = (int)(Math.random() * 21) + 80;
            System.out.printf("studentArr[%d]의 점수는 = %d\n", i, studentArr[i]);
        }
    }
}
