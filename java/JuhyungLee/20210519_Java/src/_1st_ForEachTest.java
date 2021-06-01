public class _1st_ForEachTest {
    public static void main(String[] args) {
        int randArr[] = new int[7];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * 6 + 1);
        }
        // For-Each 문
        // randArr 배열에 있는 값을 순서대로 하나씩 arr에 설정하는 코드.
        // 배열이 끝날때까지 계속 순회하게 됨
        // 맨 마지막에 가면 더 이상 가져올 값이 없으므로 끝
        for (int arr : randArr) {
            System.out.println("배열 randArr[]의 값들을 순서대로: " + arr);
        }
    }
}