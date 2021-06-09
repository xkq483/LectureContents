import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
//ArrayList 사용시 키워드 타입과 클래스 타입을 구별하여 사용하자!
public class ArrayListIntegerTest {
    public static void main(String[] args) {
        // 자바 컴파일러용 int는 키워드
        int[] num = {3, 7};
        // Integer는 클래스
        // 둘 다 데이터 타입이지만 하나는 그냥 키워드고 하나는 클래스다.
        Integer[] numArray = { 3, 7, 33, 77, 333 };

        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numArray));

        System.out.println(numList);

        System.out.println("근대 나는 int[] 키워드 형식의 배열도 ArrayList에 저장하고 싶은데 ?");

        ArrayList<Integer> numList2 = new ArrayList<Integer>(
                // num에 있는 특정 데이터 타입들을 쭉 가져와서 박스에 넣어놓고
                // 전부 수집한 다음에 List로 바꾸세요라는 의미를 가짐
                Arrays.stream(num).boxed().collect(Collectors.toList())
        );

        System.out.println(numList2);

        Float[] floatArray = { 3.3f, 4.4f, 5.5f, 6.6f, 7.7f };

        ArrayList<Float> floatList = new ArrayList<Float>(Arrays.asList(floatArray));

        System.out.println(floatList);
    }
}