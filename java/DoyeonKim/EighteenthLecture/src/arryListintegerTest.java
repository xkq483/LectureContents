/*import java.util.ArrayList;
import java.util.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class arryListintegerTest {
    public static void main(String[] args) {
        //자바 컴파일러용 int는 키워드
        int[] num = {3,7};
        //Integer는 클래스
        // 둘 다 데이터타입 이지만 하나는 그냥 키워드고 하나는 클래스다.
        Integer[] numArray = {3, 7, 33, 77, 333};

        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numArray));

        System.out.println(numList);

        System.out.println("근데 나는 int[]키워드 형식의 배열도 ArrayList에 저장하고 싶은데?");

        ArrayList<Integer> numList2 = new ArrayList<Integer>(
                Arrays.stream(num).boxed().collect(Collectors.toList())
        );
        System.out.println(numList2);

        float[] floatArray = {3.3f, 4.4f 5.5f, 6.6f, 7.7f};

        ArrayList<Float> floatlist = new ArrayList<Float>(Arrays.asList(floatArray));

    }
}


 */