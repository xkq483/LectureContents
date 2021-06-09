import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        // 키보드 입력을 받기 위한 준비를 하기 위한 절차
        //키보드 입력을 받고자 할 경우 무조건 사용한다고 보면 됨

        // 1. Scanner : 클래스라는 개념, 추후에 배움
        // 2. new : Heop(힙) 메모리에 동적할당하는 개념,클래스 객체만들때 활용
        // 3. (System.in) : 시스템 입력 의미, 키보드나 마우스 같은 입력 장치
        // 1 ~ 3 : scan 이라는 변수를 통해 키보드에 대한 제어를 수행하겠따
        Scanner scan = new Scanner(System.in);

        // println()의 경우엔 엔터키(줄바꿈) 적용됨
        // print()는 엔터키 적용X
        System.out.print("아무 숫자나 입력하셈 : ");
        // scan <- 키보드에 대한 제어를 수행
        // scan.nextInt() scan 변수 내부에 있는 nextInt()를 실행해주세요
        // 키보드 입력으로 들어온 값을 숫자로 바꿔주세요

        // 실행되는 순서) 키보드에 숫자35 입력 후 엔터 -> scan.nextInt()에서 입력 35를 받아서 int형 35를 만듦
        // ->변수 num에 변환된 int형 숫자 35를 저장
        // 결론: scan.nextInt() -> 그냥 키보드 입력을 숫자로 만들어준다

        int num = scan.nextInt();

        System.out.println("당신이 입력한 숫자는 = " + num);
    }
}
