import java.util.ArrayList;
import java.util.Arrays;

public class java582 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "grape","바나나","똬알기"};
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));
        for (int i = 0; i <4; i++) {
            System.out.println("get(%d)= %S\n", i, fruitsList.get(i));
        }
        System.out.println("복제이후!");

        ArrayList

    }
}
