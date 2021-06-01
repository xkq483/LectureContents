import java.util.ArrayList;
import java.util.Arrays;
public class _99th_Practice {
    public static void main(String[] args) {
//        int[] array_numbers = { 1, 2, 3, 4, 5, 6, 7};
//        System.out.println(array_numbers);
//        for(int i = 0; i < array_numbers.length; i++){
//            System.out.print(array_numbers[i]);
//        }
//        System.out.println();

//        ArrayList<Integer> arrayList_numbers = new ArrayList<Integer>(Arrays.asList(array_numbers));

        String[] fruits = {"apple", "strawberry", "melon"};
        ArrayList<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        System.out.println(fruits_list);

        for(String f : fruits){
            System.out.print(f + " ");
        }
    }
}