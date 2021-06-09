import java.util.Scanner;
class ForEachTestClass {
    int[] arr;
    Scanner scan;

    public ForEachTestClass (int[] inputArr) {
        // Case.1
        // inputArr[]를 매개변수로 갖는 생성자 / main에서 testArr를 매개변수로 받아들임.
        // 즉 생성자에서 inputArr = testArr
        int i = 0;
        arr = new int[inputArr.length];
        for (int data : inputArr) {
            arr[i++] = data;
            //for-each로  arr[0]~ arr[input.Arr.length]의 값을 inputArr(testArr)를 이용해서 설정.
        }
    }
    public ForEachTestClass () {
        // case.2
        // 생성자 오버로딩
        // scanner 사용해서 arr[]의 index수와 각 index에 해당하는 값 설정.
        scan = new Scanner(System.in);
        System.out.print("몇 개를 입력하시겠습니까 ? ");
        int num = scan.nextInt();
        arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("입력할 값을 적어주세요: ");
            arr[i] = scan.nextInt();
        }
    }
    public void printArr () {
        // Arr[] print 하는 method
        for (int data : arr) {
            System.out.println("입력값 = " + data);
        }
    }
}
public class _99th_ForEachInput {
    public static void main(String[] args) {
        // case.1
        int[] testArr = { 1, 2, 3, 4, 5 };
        ForEachTestClass fetc = new ForEachTestClass(testArr);
        // testArr를 매개변수로 대입
        fetc.printArr();

        // case.2
        ForEachTestClass fetc2 = new ForEachTestClass();
        fetc2.printArr();
    }
}
