import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        //Scanner? : 클래스
        //new?: heap 메모리에 동적할당하는 개념 클래스 객체를 만들때 활용됨
        //소괄호 내부에 있는 system.in: 키보드나 마우스 같은 입력장치 (키보드라고 보면 됨)
        //결론: scan 이라는 변수를 통해 키보드에 대한 제어를 수행
        //변수복습:1.데이터 타입을 적는다 2. 변수이름을 만든다 3.필요하다면 값을 할당한다

        Scanner scan = new Scanner(System.in);

        //println(의 경우엔 엔터키(줄바꿈)이 적용됨
        //print()는 엔터기 적용안됨

        System.out.print("아무 숫자나 입력해보세요: ");
        //scan : 키보드에 대한 제어를 수행
        //scan.nextIn() scan 변수 내부에 있는 nextInt()를 실행해주세요
        //키보드 입력으로 들어온 값을 숫자로 바꿔주세요

        //ex) 키보드에 숫자 35를 입력하고 엔터를 침
        //scan.nextInt()에서 키보드 입력 35를 받아서 int 형 35를 만듬
        //그리고 변수 num에 변환된 int 형 숫자 35를 저장한다
        //결론: sacn.nexIn()는 그냥 키보드 입력을 숫자로 만들어준다

        int num = scan.nextInt();

        System.out.println("당신이 입력한 숫자는 = " + num);

    }
}
