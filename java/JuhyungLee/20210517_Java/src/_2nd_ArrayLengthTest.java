public class _2nd_ArrayLengthTest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7}; // stack을 활용한 배열 할당
        System.out.println("arr의 길이 = " + arr.length);

        int dynamicArr[] = new int[20]; // heap을 활용한 배열 할당당
        System.out.println("dynamicArr의 길이 = " + dynamicArr.length);
        //30이니까 0~30이 아니라 index0~29(30개)라는 것 주의

        // 동적 할당은 모두 프로그램 실행 도중 생성하는 것을 의미한다(느림)
        // 동적 할당이 아닌 것들은 준비가 이미 되어있음. 준비된 상태로 올림(빠름)
    }
}
