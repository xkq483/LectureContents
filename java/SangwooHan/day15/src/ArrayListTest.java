import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] truits ={"apple","strawberry"};
        ArrayList<String> fruitList  = new ArrayList<>(Arrays.asList(truits));

        for(int i = 0; i< 2 ; i++){
            System.out.printf("get(%d)= %s\n",i,fruitList.get(i));
        }

            System.out.println("복제하기");
            ArrayList<String>clone = (ArrayList<String>)fruitList.clone();

        for(int i = 0; i< 2 ; i++){
            System.out.printf("get(%d)= %s\n",i,clone.get(i));
        }

        fruitList.remove("apple");

        System.out.println("앞서 저장된 원본클론이기에  원본클론을 가져왔을때 아직여긴 애플이 있다..");
        for(int i = 0; i< 2 ; i++){
            System.out.printf("get(%d)= %s\n",i,clone.get(i));
        }
        System.out.println("근데 여기선 바뀐 원본클론이 아니라 원본자체를 가져왔으니 즉, apple빠진 애를 직접데려온것이다.");
        System.out.println(fruitList);

        fruitList.clear();

        System.out.println("남는것은"+fruitList);

        System.out.println("사과는 몇번인덱스에있니?"+clone.indexOf("apple"));
        System.out.println("딸기 몇번인덱스에있니?"+clone.indexOf("strawberry"));
    }
}
