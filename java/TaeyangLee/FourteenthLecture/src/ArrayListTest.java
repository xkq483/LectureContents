import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //일종의 배열
        // 배열의 사이즈를 지정하고 사용해야 하지만
        // 넣고 싶은대로 막 넣어도된다
        //힙메모리에 동적할당을 수행한다
        ArrayList<String> lists = new ArrayList<String>();
        //배열과의 차이점은 메모리가 불연속 배치된다는것

        lists.add("빵");
        lists.add("버터");
        lists.add("우유");
        lists.add("계란");
        lists.add("주스");
        lists.add("베이컨");
        lists.add("파스타");
        lists.add("피자");

        for(String list : lists){
            System.out.println("현재 항목은 =" + list);
        }

    }
}
