public class ArrayLengthTest {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7};  // 지역변수, stack을 할당받음
        System.out.println("arr의 길이= "+ arr.length);

        int dynamicArr[] = new int[30]; // Heap을 할당 받음(동적메모리 할당)
                                        // 동적으로 메모리가 만들어진다 --> 프로그램이 실행되는 중에 만들어진다(그래서 느리다.)
                                        // 동적 할당이 아닌 것들은 준비를 싹 해뒀다가 준비된 상태로 올림 (빠름)

        // [30]개니깐 0~30이 아니라  [0]~[29]라는 부분을 주의해야함!
        System.out.println("dynamicArr[]길이= "+dynamicArr.length);


    }
}
