public class ForTest {
    public static void main(String[] args) {
        // for문
        // for(초기화; 조건식; 증감식;){}
        // 초기화는 for문 최초 진입시 한번만 실행
        // 조건식은 for문 내부{중괄호}로 진입하기 위한 조건
        // 증감식은 for문 내부의 동작이 완료된 후에 동작할 코드
        // 이후 다시 조건식 코드로 가서 조건 비교->true면 다시 반복
        // 조건식코드에서 false면 for문 종료

        for(int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
