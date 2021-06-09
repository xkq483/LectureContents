public class TrickTest {
    public static void main(String[] args) {
        int num1 =3, num2 =4;

        //And는 두 개가 모두 참이여야 참
        //이미 맨 앞의 케이스가 거짓이니 뒤에것은 볼 필요가 있나?라고 인식
        //그래서 뒤의 ++코드를 실행하지 않음
        if ((num1 % 3 == 1) && (num2++ % 5 == 0)) {
            System.out.println("이 조건은 실행되지 않습니다.");
        }

        //or은 하나라도 참이면 참
        //이미 맨 앞의 케이스가 참이니 뒤에것은 볼 필요가 없는 것으로 인식함
        //그래서 뒤의 ++ 코드를 실행하지 않음
        if ((num1 % 3 == 0) || (num2++ % 6 == 0)) {
            System.out.println("이 조건은 실행됩니다.");
        }

        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
}

