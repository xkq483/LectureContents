public class WhileNumberTest {

    public static void main(String[] args) {

        int i=0;
        // i++ < 10은 i값을 1더하고 10과 비교한라는 뜻.
        // i<10에 대한 조건을 먼저 검사하고
        // while 문의 중괄호를 실행하기 직전에 값이 증가됨.
        while(i++<10)
        {

            System.out.println("i= "+i);

        }
        System.out.println("후위연산 while문 끝나고 나서 i 값: "+ i);
        System.out.println("--------------------------------");

        i=0;// i값을 다시 0으로 초기화

        while(++i<10)
        {
            System.out.println("i= "+i);
        }
        System.out.println("전위연산 while문 끝나고 나서 i 값: "+ i);

    }
}
