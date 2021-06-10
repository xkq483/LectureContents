import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        //hashset의 핵심중 하나 java내에 존재하는 collection중 가장 빠른 속도를 자랑함
        //또한 집합(set)의 특성을 가지고 있어 중복을 허용하지 않는다.
        //속도가 빠른 arraylist라고 보면 됨 순서는 보장하지않음


        System.out.println(set);

    }
}
