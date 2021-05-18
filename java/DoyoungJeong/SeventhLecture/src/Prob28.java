import java.util.Scanner;

public class Prob28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n값 입력 : ");
        int num = sc.nextInt();

        int array[] = new int[num];
        if(num==0) {
            System.out.println(1);
        }
        for (int i = 0; i < num; i++) { //num을 array.length로 바꾸는것도 가능
            array[i] = 1 << (num-1);
        //7을 넣으면 배열이 64로 7개 채워짐. {64, 64, 64, 64, 64, 64, 64}

        }
        //System.out.println(array[i]); 로 출력문을 만드려했는데 i가 for문 밖에 지정이 안돼있어 막혔었습니다.
        System.out.println(array[num-1]); //array[num]으로 하게되면 배열이 0에서 시작해서, 없는 배열 공간을 출력하란 뜻, 그래서 num-1을 해준다.
                                          //num-1이 아니라 -2나 -3도 상관 없음. 어짜피 배열에는 같은 값만 들어있기 때문에.

    }
}
