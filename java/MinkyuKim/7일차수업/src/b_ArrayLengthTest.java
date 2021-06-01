public class b_ArrayLengthTest {
    public static void main(String[] args) {

        //지역변수 stack을 할당하는 방식
        int arr[] = { 2, 3, 4, 5, 6, 7 };

        System.out.println("arr의 길이 = " + arr.length);


        //Heap을 사용하는 배열할당
        // 동적할당은 모두 프로그램 실행 도중 생성하는 것을 의미한다.(그래서 느림)
        // 동적할당이 아닌 것들은 준비를 싹 해뒀다가 준비된 상태로 올림(그래서 빠름)
        // int형 사용할수 있는 배열 30개를 만들겠다.
        int dynamicArr[] = new int[30];
        // 30개니까 0~30이 아니라 0~29라는 부분을 주의해야합니다.

        System.out.println("dynamicArr의 길이 = " + dynamicArr.length);
    }
}
