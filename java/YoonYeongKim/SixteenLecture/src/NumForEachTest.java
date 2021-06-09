public class NumForEachTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        int num;

        // 위와 같이 작성하면 될 수도 있을것 같으나
        // 실질적으로는 foreach에서 사용하는 변수는
        // for 문 내부에서만 처리해야하기 때문에 외부에서 사용할 수 없습니다!
        /*
        for (num : arr) {
            System.out.println("나오나요 ? " + num);
        }
         */
    }
}

// 값은 복제, 객체는 원본,
// String str = "하이"
// == 값을 비교(같은지) 