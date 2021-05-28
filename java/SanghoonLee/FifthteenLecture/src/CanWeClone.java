import java.util.Arrays;

class Test {
    int[] arr;

    public Test () {
        arr = new int[3];

        for (int i = 0; i < 3; i++) {
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
    }
}
