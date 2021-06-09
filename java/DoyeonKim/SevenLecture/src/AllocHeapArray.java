import java.util.Scanner;

public class AllocHeapArray {
    public static void main(String[] args) {
        //동적 할당되는 데이터를 관리하는 메모리 = Heap
        // new로 만든 데이터는 전부 Heap에서 관리하게 된다.
        // 기존에 우리가 stack에 배열을 만들 경우엔 항상 제약사항 발생
        // 제약사항이란? 개수가 고정됨(할당된 값으로)
        //
        //Heap 방식의 할당은 공간을 필요한 만큼만 할당 가능. 유연한 접근 가능
        // 대신 stack보다 느림

        //새로운 개념 new를 통해 공간을 만드는 방법
        // 1.new를 적는다.
        // 2.데이터 타입을 적는다.
        // 3.만약 데이터 타입이 배열이면 대괄호를 열고 갯수를 적는다.
        // 클래스라면 소괄호를 열고 필요하다면 인자를 설정(아직 안배웠으므로 패스)

        //Heap공간에 int형 배열을 studenNum  개수만큼 만든다
        // 그리고 studenArr는 heap에 생성된 공간을 제어하게됨
        // [0], [1\-]...등의 인덱스가 Heap에 있는 공간을 바라보게 된다는 뜻
        // 간단하게, 기존 배열 제어 방식과 동일하되
        // 메모리 생성시에만 아래와 같은 방식을 사용한다

        Scanner scan = new Scanner(System.in);
        System.out.println("학급에 학생이 몇 명 있습니까?");
        int studentNum = scan.nextInt();


        int studentArr[] = new int [studentNum];


        // 비교 대상
        int arr[] = { 1, 2, 3, 4, 5 };


        for (int i = 0; i < studentNum; i++) {
            // studentNum 만큼 생성되니 해당 학생숫자에 맞게 80 ~ 100점의 점수를 가지도록 만듬
            studentArr[i] = (int)(Math.random() * 21) + 80;
            System.out.printf("studentArr[%d] = %d\n",i, studentArr[i]);
        }
    }
}
