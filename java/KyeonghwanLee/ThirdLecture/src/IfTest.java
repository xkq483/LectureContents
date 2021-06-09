//public class에 오는 이름은 파일명에서 .java를 제외한 이름과 동일해야 한다.
// 또한 한 파일 내에서 public class는 오직 하나뿐이다!

//public class Number 단어 이니셜마다 대문자가 들어가는 형식으로 표현해줘야 합니다.

public class IfTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;

        if (num1 < num2) System.out.printf("%d < %d\n", num1, num2);
        else System.out.printf("%d > %d\n", num1, num2);
    }
}
