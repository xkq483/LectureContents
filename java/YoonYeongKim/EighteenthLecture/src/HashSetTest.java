import java.util.HashSet;

// HashSet의 특성 : 집합. 중복허용 X. 빠른 속도. 순서대로 출력 X
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(); // "set" 인스턴스 생성
        // HashSet<타입> 집합변수명 = new HashSet<타입>(); // 인스턴스 생성

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("소시지");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        set.add("HAM");
        set.add("ham");
        // HashSet의 핵심 특성중 하나 Java내에 존재하는 Collection중 가장 빠른 속도를 자랑함.
        // 또한 HashSet의 집합(Set)의 특성을 가지고 있어 중복을 허용하지 않는다.
        // 중요 : 순서가 중요하다면 ArrayList를 사용하세요.
        //       순서가 별로 중요하지 않고 빠른 처리를 원한다면 HashSet을 권장합니다.

            System.out.println(set);

    }
}
