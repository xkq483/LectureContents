public class ArrayLengthTest {
    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6 ,7};

        System.out.println("arr의 길이 = " +arr.length);

        // 동적 할당은 모두 프로그램 실행 도중 생성하는 것을 의미(그래서 느림)
        // 동적 할당이 아닌 것들은 준비를 싹 해뒀다가 준비된 상태로 올림(그래서 빠름)
        int dyanmicArr[] = new int[30];
        //int형 데이터를 30개(0~29, 배열은 0부터 시작) 사용할수있는 배열을 만들겠다는 의미

        System.out.println("dynamicArr의 길이 = " +dyanmicArr.length);
    }
}
