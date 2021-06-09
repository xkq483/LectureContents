public class ForeachTest {
    public static void main(String[] args) {
        //for(int i ~~~)를 사용하지 않고 배열 뿌리기

        int randArr[] = new int[7];

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * 6 + 1);
        }
        System.out.println("주사위 눈금: " + randArr);
        // randArr 배열에 있는 값을 순차적으로 하나씩 꺼내와서 arr에 설정해라!
        // 배열이 끝날때까지 계속 순회하게 됨
        // 맨 마지막에 가면 더 이상 가져올 값이 없으므로 끝
        for (int arr : randArr) {
            System.out.println("주사위 눈금: " + arr);
        }
    }
}
