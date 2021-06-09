import java.util.Scanner;

class FForEach {

    int arr[];
    int len;
    Scanner sc;
    public FForEach(){}
    public FForEach(int[] intputArr) {
        int i = 0;
        len = intputArr.length;

        arr = new int[len];

        for (int data : intputArr) {
            arr[i++] = data;
        }
    }

    public void scaner() {
        sc = new Scanner(System.in);
        System.out.println("배열길이 :");
        int num = sc.nextInt();

        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("숫자 입력");
            int ss = sc.nextInt();
            arr[i] = ss;
        }
    }

    public void Print() {
        //하나씩 출력
        for (int data : arr) {
            System.out.println(data);
        }

    }


}

public class Pracitce1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        FForEach fo = new FForEach(arr);
        fo.Print();

        fo.scaner();
        fo.Print();
    }
}
