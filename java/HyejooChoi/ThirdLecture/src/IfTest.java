// public class에 오는 이름은 파일명에서 .java를 제외한 이름과 동일해야 한다.
// 또한 한 파일 내에서 public class는 오직 하나뿐이다


public class IfTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;

        // if 작성법
        // 1. if(조건){조건이 만족할 경우 동작할 코드}
        // 조건 안에는 다양한 케이스 존재 :  >, <, >=, ==, !==
        // A > B : A가 B보다 크면 참(1) 아니면 거짓
        // A < B : A가 B보다 작으면 참(1) 아니면 거짓
        // A >= B : A가 B보다 크거나 같으면 참(1) 아니면 거짓
        // A <= B : A가 B보다 작거나 같으면 참(1) 아니면 거짓
        // A == B : A와 B가 같다면 참(1) 아니면 거짓
        // A != B : A와 B가 같지 않다면 참(1) 아니면 거짓
        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        }else {
            // else는 (조건)이 만족하지 않았을 경우 동작
            System.out.printf("%d > %d\n", num1, num2);
        }
    }
}
