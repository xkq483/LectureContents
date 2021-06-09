import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 준비를 위한 절차
        // 키보드 입력을 받고자 할 경우 무조건 사용한다고 보면 된다.
        // Scanner에 대한 설명하신듯..?

        // 1.Scanner는 뭐지?
        //      Scanner는 클래스의 개념
        //      제어문인 if, for, while 등을 학습하고 배열까지 학습한 이후 배우게 됨

        // 2. new는 뭐지?
        //      Heap(힙) 메모리에 동적할당하는 개념으로 클래스 객체를 만들 때 활용
        //      마찬가지로 class를 학습할 때 배움

        // 3. 소괄호 내부에 있는 System.in은 ??
        //      System.in의 경우엔 시스템 입력이라는 의미로 사용.
        //      키보드나 마우스 같은 입력 장치라고 생각하면 된다. 아래에서는 키보드.

        // 결론: scan이라는 변수를 통해 키보드에 대한 제어를 수행하겠다.
        Scanner scan = new Scanner(System.in);

        // println()의 경우엔 엔터키(줄바꿈)이 적용됨
        // print()는 엔터키가 적용되지 않음
        System.out.print("아무 숫자나 입력해보세요:");

        // scan << 키보드에 대한 제어를 수행
        // scan.nextInt() >> scan 변수 내부에 있는 nextInt()를 실행한다
        //      >> "키보드 입력으로 들어온 값을 숫자로 바꿔라"를 의미
        // ex) 시나리오: 키보드로 숫자 35를 입력(ENTER)
        // scan.nextInt()에서 키보드 입력 35를 받아서 int형 35를 만듬
        // 그리고 변수 num에 변환된 int형 숫자 35를 저장한다.
        // Q.: 키보드로 입력하는 35는 원래 숫자 35가 아님???
        // A.: ㅇㅇ아님. 실제로 보통 키보드에 대한 입력 처리는 문자 형태인 byte로 처리가 된다.
        //      좀 더 내부적으로 얘기를 하면 키보드 입력에 대한 전기 신호를 해석한다는 것..  웹 과정에서 다룰 내용은 아님.
        // 결론: scan.nextInt()는 키보드 입력을 숫자로 만들어준다.
        int num = scan.nextInt();

        System.out.println("내가 입력한 숫자는 =" + num);
    }
}
