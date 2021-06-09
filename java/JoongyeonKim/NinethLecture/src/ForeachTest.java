public class ForeachTest {

    //for(int i ~~~)를 사용하지 않고 배열 뿌리기
    public static void main(String[] args) {
        int randArr[] = new int[7];  //Heap을 이용해 6개의 수를 randArr메소드배열에 대입한다

        for (int i = 0; i < randArr.length; i++) {  //1~6의 무작위확률을 가진 수를 6개 출력한다
            randArr[i] = (int)(Math.random() * 6 + 1);
        }

        // randArr 배열에 있는 값을 순차적으로 하나씩 꺼내와서 arr에 설정해라!
        // 배열이 끝날때까지 계속 순회하게 됨
        // 맨 마지막에 가면 더 이상 가져올 값이 없으므로 끝
        for (int arr : randArr) {   //randArr에 입력되는 값들이 순차적으로 int arr에 입력된다.
            System.out.println("주사위 눈금: " + arr);
        }
    }
}