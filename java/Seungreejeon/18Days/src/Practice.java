import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        Integer[] array_number = {1, 2, 3, 4, 5};

        ArrayList<Integer> arNum = new ArrayList<Integer>(Arrays.asList(array_number));
        System.out.println(arNum.get(1));

        System.out.println("int형배열을 ArrayList에 저장하는 방법");
        int[] num = {1, 2, 3, 4};
        ArrayList<Integer> numList2 = new ArrayList<Integer>(
                //num에 있는 있는 특정 데이터 타입들을 쭉 가져와서 박스에 넣어놓고
                // 전부 수집한 다음에 List로 바꾸세요라는 의미
                Arrays.stream(num).boxed().collect(Collectors.toList()));
        Float[] floatsArray = {3.3f, 4.5f, 5.5f, 6.6f};

        System.out.println(numList2);

        ArrayList<Float> floatsList = new ArrayList<Float>(Arrays.asList(floatsArray));

        System.out.println(floatsList);

    }

}
