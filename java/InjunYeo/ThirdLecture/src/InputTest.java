import java.util.Scanner;


public class InputTest {
    public static void main(String[] args) {
        //키보드 입력을 받기위한 준비를 하기위한 절차
        //키보드 입력을 받고자 할 경우 무조건 사용함

        //1.Scanner란 무엇인가?
        //  우선은 클래스라는 개념
        //  먼저 제어문을 학습하고 배열까지 학습한이우 공부
        //2.new는 뭐지?
        //  Heap(힙)메모리에 동적할당하는 개념으로 클래스 객체를 만들때 활용
        //   그러므로 클래스를 학습할때 같이배움
        //3.소괄호 내부에 잇는 System.in 이란
        //  System.in의 경우엔 시스템 입력이라는 의미로 사용
        //키보드나 마우스 같은 입력장치라고 생각하면 된다.

        //결론 : scan이라는 변수를 통해 키보드에 대한 제어를 수행행
       Scanner scan = new Scanner(System.in);

        //println()의 경우엔 엔터기(줄바꿈)이 적용됨
        //print()는 엔터기가 적용되지 않음
        System.out.print("아무 숫자나 입력해보세요:");
        /*
        scan <<-- 키보드에 대한 제어를 수행
        scan.nextInt() scan 변수 내부에 있는 nextInt()를 실행해주어라
        키보드입력으로 들어온 값을 숫자로 바꿔주세요

        ex>키보드에 숫자 35를 입력하면 scan.nextInt()에서 키보드 입력35를 받아서 int형35를 만듬
        그리고 변수 num에 변환된 int형 35를할당한다.


         */
        int num = scan.nextInt();

        System.out.println("당신이 입력한 숫자는 : "+num);


    }
}
