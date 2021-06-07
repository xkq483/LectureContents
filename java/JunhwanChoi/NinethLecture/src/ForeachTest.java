
public class ForeachTest {
    public static void main(String[] args) {
        int randArr[] = new int[7];

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * 6 + 1);
            System.out.printf("arr[%d]= %d\n",i,randArr[i]);
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("1. randArr 배열에 있는 값을 순차적으로 하나씩 꺼내와서 arr에 설정해라!");
        System.out.println("2. 배열이 끝날때까지 계속 순회하게 됨");
        System.out.println("3. 맨 마지막에 가면 더 이상 가져올 값이 없으므로 끝");

        System.out.println("=============================================================");

        for (int arr : randArr) {
            System.out.println("주사위 눈금: " + arr);
        }
    }
}