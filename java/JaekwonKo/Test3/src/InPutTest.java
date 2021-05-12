import java.util.Scanner;

public class InPutTest {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 준비를 하기 위한 절차
        // 키보드 입력을 받고자 할 경우 무조건 사용한다고 보면 됩니다.
        // 아무것도 모르는 상태에서 드는 의문점들
        // 1. Scanner 는 뭐지?
        //    우선 이 녀석은 클래스라는 개념입니다.
        //    먼저 제어문인 if, for, while 등을 학습하고 배열까지 학습한 이후 배우게 됨니다

        // 2. new는 뭐지?
        //    Heap(힙) 메모리에 동적할당하는 개념으로 클래스 객체를 만들때 활용됩니다.
        //    그러므로 마찬가지로 클래서 학습할 때 같이 배웁니다.

        // 3. 소괄호 내부에 있는 System.in 은 또 뭐지?
        //    System.in의 경우엔 시스템 입력이라는 의미로 사용됩니다.
        //    키보드나 마우스 같은 입력 장치라고 생각하면 되는데 키보드라고 생각하면 됩니다.

        // 결론 : scan 이라는 변수를 통해 키보드에 대한 제어를 수행하겠습니다.

        Scanner scan = new Scanner(System.in);

        // pirntln() 의 경우엔 엔터키(줄바꿈)이 적용됩니다.
        // print()는 엔터키가 적용X
        System.out.print("아무 숫자나 입력해보세요: ");
        int num = scan.nextInt();

        System.out.println("당신이 입력한 숫자는 = " + num);
    }
}
