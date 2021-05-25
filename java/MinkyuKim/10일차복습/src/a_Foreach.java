class Foreachtest {
    int[] arr;

    public Foreachtest (int[] inputArr) {
        int len = inputArr.length;
        int i = 0;

        arr = new int[len];

        for (int data : inputArr) {
            arr[i++] = data;
            // ++ 배열을 복사하는 과정이므로 i++
        }
    }
    public void printArr () {
        for (int data : arr) {
            System.out.println("입력값 = " + data);
        }
    }
}

public class a_Foreach {
    public static void main(String[] args) {
        int[] testArr = {1,23,12};

        Foreachtest fetc = new Foreachtest(testArr);
        fetc.printArr();


    }
}