import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("우유");
        set.add("빵");
        set.add("베아컨");
        set.add("소시지");
        set.add("HAM");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        set.add("HAM");
        set.add("ham");

        // HashSet의 핵심 특성중 하나 java내에 존재하는 collection중 가장 빠른 속도를 자랑함
        // 또한 hashSet의 집합(set)의 특성을 가지고 있어 중복을 허용하지 않음


        System.out.println(set);
    }
}
