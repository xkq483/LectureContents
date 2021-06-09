import java.util.Scanner;

class ForEachTestClass {
    int[] arr;
    Scanner scan;

    public ForEachTestClass (int[] inputArr) {
        int len = inputArr.length;
        int i = 0;
        arr = new int[len];
        for (int data : inputArr) {
            arr[i++] = data;
        }
    }
    public ForEachTestClass () {
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
        for (int data : arr) {
            System.out.println("입력값 = " + data);
        }
    }
}
public class ForEachTest {
    public static void main(String[] args) {
        int[] testArr = { 1, 2, 3, 4, 5 };

        ForEachTestClass fetc = new ForEachTestClass(testArr);
        fetc.printArr();

        ForEachTestClass fetc2 = new ForEachTestClass();
        fetc2.printArr();
    }
}