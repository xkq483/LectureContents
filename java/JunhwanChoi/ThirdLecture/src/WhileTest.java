//  while 반복문 연습
//  형식 : while(조건식) {실행할 문장};

public class WhileTest {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("안녕 무한반복");
        }

        //현재 조건식에서는 조건이 항상 참이므로 무한반복을 하게됨
        //조건식에 false를 넣으면 : unreachable statement가 나오면서
        //루프 내부에 도달할 수 없을을 알리는 에러 메시지가 나옴

        //모든 제어문(if, while for)에서 모든 조건은 결과가 trun 아니면 false로 나옴
    }
}
