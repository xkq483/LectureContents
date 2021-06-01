import java.util.Scanner;

public class AllocHeapArray {
    public static void main(String[] args) {
        //동정 할당 되는 데이터를 관리하는 메모리 -heap

        Scanner scan= new Scanner(System.in);
        System.out.print("학급에 학생이 몇명 있습니까? ");

        int studentNum= scan.nextInt();

        // 동적할당되는 데이터를 관리하는 메모리 = heap
        // new로 만든 데이터는 전주 heap에서 관리
        // 기존에 우리가 stack에 배열을 만들 경우엔 항상 제약 사항이 발생햇었다.
        // 어떤 제약사항? -> 개수가 고정됨(할당된 값으로)
        // heap 방식의 할당에서는 공간을 필요한 만큼 할당할 수 있어서 유연한 접근이 가능하다.
        // 근데 여기에도 제약사항이 있다? stack보다 느리다.

        //새로운 개념 new를 통해 공간을 만드는 방법
        // 1. new 를 적느다
        // 2. 데이터 타입을 적는다.
        // 3. 만약 데이터타입이 배열이라면 대괄호를 열고 몇 개를 만들지 적는다.
        //      만약 데이터타입이 클래스라면 소괄호를 열고 필요하다면 인자를 설정한다.(Scanner 등등)
        //      (아직 클래스를 배우지 않았으므로 패스)

        int studentArr[] = new int[studentNum]; // --> Heap공간에 int형 배열을 studentNum 개수만큼 만들겠습니다.
                                                // 그리고 studentArr는 Heap에 생성된 공간을 제어하게 된다.
                                                // [0],[1],,,[3]등의 인덱스가 heap에 있는 공간을 바라보게 된다는 뜻인데,
                                                // 복잡하게 생각하기 싫다면 기존 배열 제어하는 방식과 동일하되,
                                                // 메모리 생성시에만 아래와 같은 방식을 사용한다고 보면 되겠다.

        // 비교대상
        //int arr[] = {1,2,3,4,5};

        for(int i=0; i<studentNum; i++)
        {
            studentArr[i]= (int)(Math.random()*21)+80;  //80~100
            System.out.printf("studentArr[%d] = %d\n",i,studentArr[i]);
        }

    }
}
