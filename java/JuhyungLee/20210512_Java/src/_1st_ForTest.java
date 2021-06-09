public class _1st_ForTest {
    public static void main(String[] args) {

        // for문의 구성;
        //  >> for(초기화 코드; 조건식 코드; 증감식 코드)로 구성.
        // 초기화 코드는 for문에 최초 진입식 한 번만 실행.
        // 조건식 코드는 for문 내부{}로 진입하기 위한 조건
        // 증감식 코드는 for문 내부의 동작이 완료된 이후 동작할 코드
        // 이후 다시 조건식 코드로 가서 조건을 비교하고 충족한다면 루틴을 반복
        //  만약 조건식 코드에서 조건이 위배된다면 for문 종료.
        for(int i =1; i <= 10; i++){
            System.out.println("i = " + i);
        }
    }
}
