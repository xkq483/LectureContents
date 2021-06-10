import java.util.HashSet;

public class b_HashsetTest_콜렉션 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String >();

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("소시지");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        set.add("HAM");
        set.add("ham");
        // HashSet의 핵심 특성중 하나 어떤 Java내에 존재하는 Collection중 가장 빠른 속도를 자랑함.

        System.out.println(set);




    }
}
