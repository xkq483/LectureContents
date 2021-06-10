import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] fruits = {"apple","strawberry","grape","watermelon"};
        //asList() <--배열을 ArrayList로 변형할 수 있음
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        for(int i =0; i<4; i++){
            System.out.printf("get(%d) = %s\n",i,fruitsList.get(i));
        }

        System.out.println("복사이후");

        //clone() <--ArrayList 값을 복제 주속복제x
        // ArrayList에 구현되어있는 clone은 객체를 복제할수있게서포트
        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
        fruitsList.remove("grape");
        for(int i =0; i<4; i++){
            //ArrayList에 있는 내용을 가져올때 get(index)를 사용한다.
            System.out.printf("get(%d) = %s\n",i,clone.get(i));
        }

        /*clear() 는 ArrayList안의 데이터를 다 지움*/
       fruitsList.clear();
       System.out.println("after clear : " + fruitsList);

        /* 검색 - idextOf()  인덱스값을 반환해준다. */
        System.out.println("포도 위치 : "+clone.indexOf(1));
        System.out.println("딸기 : "+clone.indexOf("strawberry"));
        System.out.println("멜론 위치 : "+clone.indexOf("watermelon"));
        //존재하지 않는 것은 -1이 나옴(오류)
        System.out.println("없는것 : "+clone.indexOf("없는것"));

        /* contains() 또한 IndexOf와 유사하게 사용이 가능하다
           참거짓으로 유무(true - false)만 표시함.
        */
        System.out.println("포도 위치 : "+clone.contains("포도"));
        System.out.println("딸기 : "+clone.contains("strawberry"));
        System.out.println("멜론 위치 : "+clone.contains("watermelon"));
        System.out.println("없는것 : "+clone.contains("없는것"));
         

    }
}
