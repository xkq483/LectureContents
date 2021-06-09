import java.util.ArrayList;
import java.util.Arrays;
public class _1st_ArrayList_2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "strawberry", "grape", "watermelon"};
        //Arrays.asList()를 통해 배열 등을 ArrayList로 변형 할 수 있다.
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        System.out.println("<<fruitsList[]>>");
        for(int i = 0; i < 4 ; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
            // ArrayList에 있는 값을 가져올 때는 get(index)를 사용.
            // 여기서 index는  | data1| ->| data2 | -> | data8|
            //                   0          1            2
        }
        // fruitsList의 내용을 clone 변수에 복제함.
        // 배열을 복제했으니까 이건 객체(원본)을 복사했다 라고 오해 할 수 있는데
        // clone은 그 값들을 복사하는 것이니 주의
        // ArrayList에 구현되어 있는 clone은 객체를 복제할 수 있게 support
        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
        System.out.println("<<clone>>");
        for(int i = 0; i < 4 ; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        // 복사한 대상인 fruitsList[]에서 grape를 빼도
        // 다시 clone의 값들을 확인해보면 grape가 빠지지 않은 것을 확인.
        fruitsList.remove("grape"); // .remove
        System.out.println("<<fruitsList[]에서 grape를 삭제 후 clone[]의 값들을 확인>>");
        for(int i = 0; i < 4 ; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        System.out.println("<<fruitsList[]에서 garpe가 빠졌는지 확인>>");
        for(int i = 0; i < 3 ; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        fruitsList.clear(); // .clear
        System.out.println("<< clear로 배열 값들 삭제 >>");
        System.out.println("after clear: " + fruitsList);
        // clear는 내부의 '값'만 clear시킴. 즉 객체는 살아있음 = 객체는 data 위에 있음.

        // indexOf // fruitsList clear로 밀어버려서 clone[]을 응용
        System.out.println("grape는 어느 index에? " + clone.indexOf("grape"));
        System.out.println("strawberry는 어느 index에? " + clone.indexOf("strawberry"));
        System.out.println("없는 값을 indexOf하면? " + clone.indexOf("낑깡"));
        // ArrayList에 존재하지 않는 것은 -1
        // -1은 오류를 뜻 하지만 숫자로도 사용가능.
        // indexOf를 사용할 수 있는 예를 들면
        // 당첨자 명단[] / 시상식 참석자 명단[]
        /* for( 참가판단[] : 시상식 참석자 명단[])      >> for-each 이런 느낌으로 쓸 수 있다~ 정도로 인지.
            if(indexOf("당첨자") == -1){ continue}
            else{ ~~~ }
        */
        //System.out.println("ArrayList로 만들지 않은 fruits 배열은 error 발생 " + fruits.indexOf("낑깡"));

        //.contains  >> 포함되어 있는가?를 의미 true 또는 false로 결과가 나온다.
        System.out.println("grape가 contain되어 있는가? " + clone.contains("grape"));
        System.out.println("낑깡이 contain되어 있는가? " + clone.contains("낑깡"));
    }
}


