import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("소시지");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        set.add("HAM");
        set.add("ham");
        //HashSet의 핵심 특성중 하나 Java내에 존재하는 Collection중 가장 빠른 속도를 자랑함
        //또한 HashSet의 집합(Set)의 특성을 가지고 있어 중복을 허용하지 않는다.
        //대신 순서는 랜덤(정확히는 자바개발자들이 설정한 알고리즘대로)으로 출력된다.
        //중요: 순서가 중요하다면 ArrayList를 사용하세요.
        //      순서가 별로 중요하지않고 빠른처리를 원한다면 Hashset을 권장합니다.
        
        System.out.println(set);
    }
}
