public class a_for문 {
    public static void main(String[] args) {
        //10 이하의 2의 배수 찾으시오
        for(int i = 2; i <= 10; i += 2) {
            System.out.println(" i = " + i);
        }
        // int i = 2 (초기화코드) 첫 시작점이 2부터?라는 의미?
        // i <= 10 (조건식코드) i가 10 이하일때까지 동작
        // i += 2 (즘감식코드) 2씩 계속하여 증가
    }
}
