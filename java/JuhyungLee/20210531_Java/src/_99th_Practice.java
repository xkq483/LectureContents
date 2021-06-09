import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class _99th_Practice {
    public static void main(String[] args) {
        Integer[] array_numbers = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(array_numbers);
//        for(int i = 0; i < array_numbers.length; i++){
//            System.out.print(array_numbers[i]);
//        }
//        System.out.println();
        ArrayList<Integer> arNum = new ArrayList<Integer>(Arrays.asList(array_numbers));
        System.out.println(arNum);

        int[] num = {3, 7};
        ArrayList<Integer> numList2 = new ArrayList<Integer>(
                Arrays.stream(num).boxed().collect(Collectors.toList())
        );
        System.out.println(numList2);
        // "num에 있는 특정 데이터 타입들을 가져와서 박스에 넣어놓고
        // 전부 수집한 다음에 List로 바꾼다" 라는 의미를 가짐


//        ArrayList<Integer> arNum2 = new ArrayList<Integer>(Arrays.asList(array_numbers));
//        System.out.println(arNum);

//        String[] fruits = {"apple", "strawberry", "melon"};
//        ArrayList<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));
//
//        System.out.println(fruits_list);
//
//        for (String f : fruits) {
//            System.out.print(f + " ");
//        }
    }
}