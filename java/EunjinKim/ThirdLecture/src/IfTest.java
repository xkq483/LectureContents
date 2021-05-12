public class IfTest {
    public static void main(String[] args) {
        int num1 = 7, num2 = 3;

        // if를 적고 소활호를 열고 닫고 중괄호는 열고 닫는다
        // 소괄호 내부에 조건을 적는다
        // *조건에는 다음과 같은 케이스가 존재 (>, <, >=, ==, !=)
        // A > B : A가 B보다 크면 참(0) 아니면 거짓(1)
        // A >= B : A가 B보다 크거나 같으면 참(0) 아니면 거짓(1)
        // A == B : A와 B가 같다면 참(0) 아니면 거짓(1)
        // A != B: A가 와 같지 않다면 참(0) 아니면 거짓(1)
        // 조건이 만족할 경우 동작시킬 코드를 중괄호 내부에 작성한다

        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
            // 위 조건이 만 족하엿으므로 아래 코드가 동작
            //아래 코드는 단순히 결과를 출력하기 위한 코드
        } else  {
            System.out.printf("%d > %d\n", num1, num2);
            //else의 경우 num1 < num2 조건이 만족하지 않았을 경우 동작
        }
    }
}
