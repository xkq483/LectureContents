public class WhileNumberTest {
    public static void main(String[] args) {
        int i = 0;
        /*
        i++에서 ++는 +1과 동일한 개념이다
        i++ 은 i=i+1로 볼수있다.
        i++<10 은 i값을 1더하고 10하고 비교하라는 뜻으로 볼 수있다
        i<10 대한 조건검사를 먼저하고
        while 문의 중괄호(본문)를 실행하기 직전에 값이 증가한다.
        이와 같이 다음라인에서 연산되는것을 후위연산이라고 부른다.
         */

        while(i++<10){
            System.out.println(i);
        }

        System.out.println("++i는 해당 라인에서 바로 연산이 진행된다");
        i=0;
        //해당라인에서 연산되는건 전위연산
        while(++i<10){
            System.out.println(i);
        }
        i = 0;
        while(i<10){
            System.out.println(i++);
        }
    }
}
