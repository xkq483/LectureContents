import java.util.Arrays;
class Test{
    int[] arr;

    public Test(){
        arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 6 + 1);
        }
    }

    public int[] clone(){
        int[] cloneTestArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            cloneTestArr[i] = arr[i];
        }
        return cloneTestArr;
    }

    public void changeArr(){
        arr[1] = 100000;
    }

    @Override
    public String toString() {
        return "Test{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
public class _1st_ArrayCloneExample {
    public static void main(String[] args) {
        // 그냥 단순히 예제를 위해 만든 파일이고
        // 중요한거는 _1st_ArrayList_2에 있는 개념임
        Test t = new Test();
        System.out.println(t);
        System.out.println("--------");

        int[] cloneArr = t.clone();

        for(int i = 0; i < cloneArr.length; i++){
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }
        System.out.println("--------");

        t.changeArr();
        System.out.println("t.changeArr() method를 통해서 arr[1]의 값을 변경 ");
        System.out.println(t); // arr[] 값 print
        System.out.println("--------");
        for(int i = 0; i < cloneArr.length; i++){
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }

        System.out.println("--------");
        cloneArr[1] = 777777; // cloneArr[1]의 값을 변경
        System.out.println("cloneArr[1]의 값을 777777로 변경");
        for(int i = 0; i < cloneArr.length; i++){
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }
        System.out.println("--------");
        System.out.println("arr[]의 값을 print해서 확인");
        System.out.println(t);
    }
}