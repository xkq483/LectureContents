import java.util.Arrays;
// 객체전달과 값 전달의 차이 다시 알아보기
class Test {
    int[] arr;

    public Test () {     //생성자 -> 초기화 역할
        arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1);
        }
    }

    public int[] clone () {   // arr배열의 인덱스값을 testArr[i]의 인덱스에 대입
        int[] testArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            testArr[i] = arr[i];
        }

        return testArr;
    }

    public void changeArr () {    //배열의 인덱스[1]값을 재설정함
        arr[1] = 10000000;
    }

    public void vectorAdd (int[] vec) {  //
        for (int i = 0; i < vec.length; i++) {
            arr[i] += vec[i];
        }
    }

    @Override
    public String toString() {  //arr의 값을 나타냄  //toString 객체가 가지고 있는 값을 문자열로 나타냄
        return "Test{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

public class CanWeClone {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t);  // 랜덤값이 그대로나옴
        System.out.println("--------------절취선--------------");

        int[] cloneArr = t.clone();

        for (int i = 0; i < cloneArr.length; i++) {  //cloneArr의 배열을 불러온다(객체 불러옴)
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }
        System.out.println("--------------절취선--------------");

        t.changeArr();  //기존 arr배열을 복제하고 다른 값을 출력함

        System.out.println(t);
        System.out.println("--------------절취선--------------");

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);  //changeArr은 복제된 것이기에 기존 객체의 값은 변하지 않음
        }

        System.out.println("--------------절취선--------------");
        cloneArr[1] = 77777777;  // 또다시 값을 인덱스에 대입한다

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);  // 변화된 값이 출력됨
        }

        t.vectorAdd(cloneArr);   

        System.out.println(t);
    }
}