import java.util.Arrays;

class Test {
    int[] arr; // 배열을 쓴다.

    public Test () {
        arr = new int[3];  // 배열을 세가지의 값을 가짐, 3개의 인덱스.

        for (int i = 0; i < 3; i++) {           //3개의 인덱스는 1부터 6개의 숫자 랜덤 값
            arr[i] = (int)(Math.random() * 6 + 1);
        }
    }

    public int[] clone () {
        int[] testArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            testArr[i] = arr[i];
        }

        return testArr;
    }

    public void changeArr () {
        arr[1] = 10000000;
    }

    public void vectorAdd (int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            arr[i] += vec[i];
        }
    }

    @Override
    public String toString() {
        return "Test{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

public class CanWeClone {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t);
        System.out.println("--------------절취선--------------");

        int[] cloneArr = t.clone();

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }
        System.out.println("--------------절취선--------------");

        t.changeArr();

        System.out.println(t);
        System.out.println("--------------절취선--------------");

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }

        System.out.println("--------------절취선--------------");
        cloneArr[1] = 77777777;

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }

        t.vectorAdd(cloneArr);

        System.out.println(t);
    }
}
