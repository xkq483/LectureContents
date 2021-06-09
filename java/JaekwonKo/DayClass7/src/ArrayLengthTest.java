public class ArrayLengthTest {
    public static void main(String[] args) {
        // syaticArr (정적)
        int arr[] = {2, 3, 4, 5, 6, 7 };

        System.out.println("arr의 길이 = " + arr.length);

        // 동적 = 프로그램이 실행하는 도중에 만들어지는것을 의미 (그래서 느림)
        // 동적 할당이 아닌 것들은 준비를 해뒀다가 준비된 상태로 올림 (그래서 빠름)
        int dynamicArr[] = new int[30];
        // 30개니까 0 ~ 30이 아니라 0 ~ 29라는 부분을 주의해야한다!

        System.out.println("dynamicArr의 길이 = " + dynamicArr.length);
    }
}
