//질문 X
import java.util.Scanner;
public class Quiz5 {
    public static void main(String[] args) {
        int i = 2;

        while (i <= 20) {
            System.out.println(i);

            i += 2;
            // i = i + 2;
        }

        // 추가 설명
        // 여기서 A += B 는 아래와 같다.
        // A = A + B
        // A -= B
        // A = A - B
        // A *= B
        // A = A * B
        // A /= B
        // A = A / B
        // A %= B
        // A = A % B
        // 주의할 점은 이와 같은 연산을 하게 되면 A의 값이 변경된다는 점에 주의해야 한다!

        // 우리가 수학을 하면서 '=' 기호는 ~과 같다로 보통 인식함
        // 실제로 어떤 프로그래밍 언어가 되었든 '='은 대입 연산으로 취급합니다.
        int A = 3, B = 5;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        A += B;
        // A = A + B
        // A + B 결과를 A에 대입하세요.
        System.out.println("A = " + A); //위에 연산이 수행된 상태 -> a=8
        System.out.println("B = " + B); // b는 그대로
    }
    }

