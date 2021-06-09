public class TrickTest {
    public static void main(String[] args) {
        int a = 3, b = 4;

        //AND연과 OR연산의 특성때문에 발생한 논리적 오류
        //AND는 하나라도 거짓이면 거짓(false)

        if ((a % 3 == 1) && (b++ % 5 == 0))
        {
            System.out.println("이 조건은 실행되지 않습니다.");
        }

        //OR는 하나라도 참이면 참
        //앞의 케이스가 참이라 뒤에 연산을 볼필요가 없다-> 그래서 컴파일러가 뒤에 코드는 보지도않음  -> b는 증가되지않음
        if ((a%3==0)||(b++%6==0)) // 참 ||거짓
        {
            System.out.println("이 조건은 실행됩니다.");
        }
        System.out.printf("a= %d, b= %d\n",a,b);
    }
}
