import java.util.Scanner;

public class Prob28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("n값 입력 : ");
            int num = sc.nextInt();

            int array[] = new int[num];

            array[0] = 1;
            //System.out.print(array[0] + "\t"); //0번째 인덱스 값
            int i;
            for (i = 1; i < num; i++) { //num을 array.length로 바꾸는것도 가능
                array[i] = 1 << i;

                //System.out.print(array[i] + "\t");
            }
            System.out.println(array[i-1]); //로 출력문을 만드려했는데 i가 for문 밖에 지정이 안돼있어 막혔었습니다.
            //System.out.println(array[num - 1]); //array[num]으로 하게되면 배열이 0에서 시작해서, 없는 배열 공간을 출력하란 뜻, 그래서 num-1을 해준다.

        }
    }
}
