public class ArrayLengthTest {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6, 7 };

        System.out.println("arr의 길이 = " + arr.length);


        int dynamicArr[] = new int[30];
        // 배열은 0부터 시작이므로 0~29인것 숙지하기
        // 딱히 이해 안가는 부분은 없음.

        System.out.println("dynamicArr의 길이 = " + dynamicArr.length);
    }
}