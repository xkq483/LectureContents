import java.util.Scanner; //Scanner를 사용하기 위한 import문

public class InputTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. Scanner 란?
        //  클래스라는 개념이다
        //  제어문을 배운 이후에 배우게 된다.
        //  키보드로 입력받는 것

        // 2. new란?
        //  Heap 메모리에 동적할당하는 개념으로 클래스 객체를 만들때 사용
        //  그러므로 클래스를 학습할때 같이 배움

        // 3. 소괄호 내부에 System.in이란?
        //  시스템 입력이라는 의미로 사용됨


        // println -> 줄바꿈이 적용
        // print   -> 줄바꿈 적용 x

        System.out.print("아무 숫자 입력: ");
        int a = scan.nextInt();
        //  scan : 키보드에 대한 제어를 수행
        //  scan.nextInt() :scan 변수 내부에 있는 nextInt()를 실행해주세요~
        //  키보드 입력으로 들어온 값을 숫자로 바꿔주세요~
        //  Q: 키보드에 임의의 수 20 을 입력하면 20은 숫자가 아닌가요?
        //  A: Yes. 실제로 키보드에 대한 입력 처리는 문자형태인 byte로 처리가 된다.

        System.out.println("입력한 수 : "+ a);



    }
}
