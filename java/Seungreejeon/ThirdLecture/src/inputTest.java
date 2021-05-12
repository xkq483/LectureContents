import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아무 숫자나 입력해보세요");
        int num = sc.nextInt();
    // new :
    // Heap(칩) 메모리에 동적할당하는 개념으로 클래스 객체를 만들때 활용된다
    // System.in 경우엔 시스템 입력이라는 의미이므로 키보드 마우스와 같은 입력장치라고 생각하면된다.
        // 데이터 타입 , 변수이름, 필요값 할당
        // scanner          sc         new Scnner()
        System.out.println("당신의 입력한 숫자는 " + num);
    }
}
