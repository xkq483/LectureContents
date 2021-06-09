public class ArrayLenghTest {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};

        System.out.println("arr의 길이 = "+arr.length);

        /*
        동적할당은 모두 프로그램 실행 도중 생성하는것을 의미한다.(그래서 느림)
        동적할당이 아닌 것들은 준비를 싹 해뒀다가 준비된 상태로 올림(그래서 빠름)
         */

        int[] dynamicArr = new int[30];

        System.out.println("dynamicArr의 길이 = "+ dynamicArr.length);
    }
}
