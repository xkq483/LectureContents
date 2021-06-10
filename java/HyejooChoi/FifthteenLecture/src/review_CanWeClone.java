import java.util.Arrays;

class Test1 {
    int[] arr;

    public Test1 () {
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

public class review_CanWeClone {
    public static void main(String[] args) {
        Test1 t = new Test1();

        System.out.println(t);
        System.out.println("--------------절취선--------------");

        int[] cloneArr = t.clone();

        // 원본과 같은 값이 복제된다
        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }


        System.out.println("--------------절취선--------------");

        // 원본의 값을 바꿨다
        t.changeArr(); // arr[1] = 10000000;

        System.out.println(t);


        System.out.println("--------------절취선--------------");

        // 위에서 원본의 값을 바꿨지만 복제된 객체의 값은 변하지 않았다
        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }


        System.out.println("--------------절취선--------------");

        // 복제된 값을 바꿨다
        cloneArr[1] = 77777777;

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }


        t.vectorAdd(cloneArr);

        System.out.println(t);
    }
}