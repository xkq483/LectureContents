public class IfTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;

        //if로 이루어진 간단한 코드
        //num1과 num2중에 더 큰 것을 표시하지만 두 수의 값이 같다면 부자연스러워진다
        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        } else {
        System.out.printf("%d > %d\n", num1, num2);
    }
    }
}
