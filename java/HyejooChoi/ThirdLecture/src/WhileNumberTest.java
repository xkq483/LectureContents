public class WhileNumberTest {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("i++ : 다음 라인에서 연산이 진행");
        // i++ : 1씩 증가한다
        // i 값에 1을 더하고 10과 비교 -> 1 < 10(true)일 경우 다시 i에 1을 더함 -> 2 < 10 ~~~ 10에서 멈춤
        while(i++ < 10) {
            System.out.println(i);
        }


        i = 0;

        System.out.println("i++ : 해당 라인에서 바로 연산이 진행");
        while(++i < 10) {
            System.out.println(i);
        }


        System.out.println("0부터 출력");

        i = 0;
        while(i < 10) {
            System.out.println(i++);
        }
    }
}
