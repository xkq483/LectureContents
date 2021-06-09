public class IfTest {
    public static void main(String[] args) {
        int num1 = 3, num2 =7;

        // if문의 조건에는 다음과 같은 케이스들이 존재한다.
        //A > B: A가 B 보다 크면 참(1) 아니면 거짓(0)
        //A < B: A가 B 보다 작으면 참(1) 아니면 거짓(0)
        //A >= B: A가 B 보다 크거나 같으면 참(1) 아니면 거짓(0)
        //A <= B: A가 B 보다 작거나 같으면 참(1) 아니면 거짓(0)
        //A == B: A와 B가 같다면 참(1) 아니면 거짓(0)
        //A != B: A와 B가 같지 않다면 참(1) 아니면 거짓(0)
        if(num1 < num2){
            System.out.printf("%d < %d\n", num1, num2);
        } else {
            System.out.printf("%d > %d\n", num1, num2);
        }

        System.out.println("테스트 테스트");
        System.out.println("ㅌㅅㅌ ㅌㅅㅌ");
        System.out.print("테스트 테스트");
        System.out.print("ㅌㅅㅌ ㅌㅅㅌ");
    }
}
