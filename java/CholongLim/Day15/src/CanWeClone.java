import java.util.Arrays;

class Test {
    int[] arr;

    public Test () {
        arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1);
            // [0] ~ [2]에 1 ~ 6 까지의 랜덤 숫자를 3개를 각각 대입한다.
        }
    }
    public int[] clone () {
        int[] testArr = new int[arr.length];
        // int [] testArr = new int[3];
        // testArr의 인덱스 3개

        for (int i = 0; i < arr.length; i++) {
            testArr[i] = arr[i];
            // testArr[0] = arr[0]
            // testArr[0] = 1 ~ 6까지의 랜덤 숫자
        }
        return testArr;
        // testArr[0] = 1 ~ 6
        // testArr[1] = 1 ~ 6
        // testArr[2] = 1 ~ 6 를 리턴받는 건가?
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

        // 원본
        // [0] ~ [2]에 1 ~ 6 까지의 랜덤 숫자를 3개를 각각 대입한다.
        // toString에 의해 출력된 그 값
        System.out.println(t);
        System.out.println("--------------절취선--------------");

        int[] cloneArr = t.clone();
        // t.clone()은 계산 후 리턴받은 testArr[]
        // cloneArr[i] = testArr[i]


        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }
        System.out.println("--------------절취선--------------");

        t.changeArr();
        // arr[1] = 10000000; 값을 바꿈

        // 원본 = 값이 바뀐 것이 적용됨
        System.out.println(t);
        System.out.println("--------------절취선--------------");

        // 말그대로 복사본, 초기값 유지되며 바뀐 값이 적용되지 않는다.
        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }

        System.out.println("--------------절취선--------------");
        // clone을 변경하기 위해서는 ?
        cloneArr[1] = 77777777;

        for (int i = 0; i < cloneArr.length; i++) {
            // 원본적용이 아닌, 복사본에 대해 변경값을 적용하면
            // 복사본의 값도 변경된다.
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }

        t.vectorAdd(cloneArr);

        System.out.println(t);
    }
}
