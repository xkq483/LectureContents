import java.util.HashSet;
import java.util.Set;

public class Review0602HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        // HashSet은 Java내에서 존재하는 Colletion 중 가장 빠른 속도임
        // 또한 HashSet/Set 은 집합의 특성을 가지고 있어 중복을 허용하지 않음
        // add한 순서대로 출력되지 않으며 그 순서는 고정되어있어 랜덤은 아님
        // 순서를 지켜야 하는 상황이면 ArrayList 사용

        set.add("우유");
        set.add("베이컨");
        set.add("빵");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        set.add("소시지");
        set.add("Ham");
        set.add("우유");
        set.add("우유");


// ----------------------------------------------------------------------------------------

        Set<String> s = new HashSet<String >();

        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕"};

        for(String str : sample){
            if(!s.add(str)){
                System.out.println("중복되었습니다: " + str);
            }
            // Set/HashSet은 중복이 없으므로 중복값은 false를 리턴함
            // false를 부정하므로 true이 되어 아래 문장이 출력됨
        }
        System.out.println(s.size() + "중복을 제외한 단어: " + s);
            // size()는 원소의 개수를 숫자로 표현

// ------------------------------------------------------------------------------------------

        Set<String> s1 = new HashSet<String >();
        Set<String> s2 = new HashSet<String >();

        s1.add("Apple");
        s1.add("Tesla");
        s1.add("Microsoft");

        s2.add("Tesla");
        s2.add("Alphabet");
        s2.add("Texas Instruments");

        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);
        // 합집합을 나타내므로 모두 출력(중복된 것은 한번만)

        System.out.println("합집합: " + union);

        Set<String> intetsection = new HashSet<String>(s1);
        intetsection.retainAll(s2);
        // 교집합을 나타내므로 중복된 것만 출력

        System.out.println("교집합: " + intetsection);


























    }
}
