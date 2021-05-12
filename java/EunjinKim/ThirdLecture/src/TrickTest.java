public class TrickTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4;

        //AND 연산과OR연산의 특성때문에 발생한 오류
        //AND 는 하나라도 거짓이면 거짓
        //앞의 케이스가 거짓인데 뒤의 내용을 확인할 필요가 있을까?
        //그래서 뒤의 ++코드를 실행하지 않음

        if((num1 % 3 == 1) && (num2++ % 5 == 0)) {
            System.out.println("이 조건은 실행되지 않습니다");
        }
        if((num1 % 3 == 0) || (num2++ % 6 == 0)) {
            System.out.println("이 조건은 실행됩니다");
        }
        //OR는 하나라도 참이면 참
        //앞의 케이스가 참인데 뒤에거 볼 필요가 있을까?
        //그래서 뒤의 ++코드를 실행하지 않음

        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
}
//