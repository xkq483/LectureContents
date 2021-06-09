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

// clone 개념 파악용 예제!! 결과값에 주목하시오.
// 중간을 거치게 되면 객체이면 값이 변경되는데, 복제(clone)는 값이 변경 되지 않고 원본이 그대로 복제된다.
// 사본을 바꾸려면 접근제어자가 private(접근제한O)이 아니면(public) ok
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

        t.vectorAdd(cloneArr); // vectoradd는 복잡한 개념이니, 기억에서 지워버리자

        System.out.println(t);
    }
}
