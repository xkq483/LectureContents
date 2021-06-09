import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("파스타");
        set.add("소시지");
        set.add("겨란");
        set.add("4");
        set.add("1");
        set.add("5");


        System.out.println(set);
        //HASH SET의 핵심 특성중 하나 java내에 존재하는 Collection 중 빠른속도를 자랑함.
    }
}
