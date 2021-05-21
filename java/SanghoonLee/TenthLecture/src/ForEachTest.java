class ForEachTestClass {
    int[] arr;

    public ForEachTestClass (int[] inputArr) {
        int len = inputArr.length;
        int i = 0;

        arr = new int[len];

        for (int data : inputArr) {
            arr[i++] = data;
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
    }
}
