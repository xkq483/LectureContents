public class ArrayLengthTest {
    public static void main(String[] args) {
//        정적 배열
//        new를 하지않으면 정적으로 만들어진다.
//        미리 준비를 할 수 있는 것들
        int arr[] = { 2, 3, 4, 5, 6, 7 };

        System.out.println("arr의 길이 = " + arr.length);

//        동적 배열 : 프로그램이 실행되는 도중에 만들어진다.
//        new를 하면 전부 동적으로 만들어진다
//        미리 준비를 할 수 없는 것들

        // 동적 할당은 모두 프로그램 실행 도중 생성하는 것을 의미한다(그래서 느림)
        // 동적 할당이 아닌 것들은 준비를 싹 해뒀다가 준비된 상태로 올림(그래서 빠름)

//        int형 숫자를 30개 만든다.
//        30개니까 0 ~ 30이 아니라 0 ~ 29라는 부분을 주의해야합니다.
        int dynamicArr[] = new int [30];

        System.out.println("dynamicArr의 길이 = " +  dynamicArr.length);
    }
}
