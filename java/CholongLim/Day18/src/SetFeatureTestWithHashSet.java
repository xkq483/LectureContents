import java.util.HashSet;
import java.util.Set;

// Set은 인터페이스
public class SetFeatureTestWithHashSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("Apple");
        s1.add("Tesla");
        s1.add("Microsoft");

        s2.add("Tesla");
        s2.add("Alphabet");
        s2.add("Texas Instruments");

        // 합집합 : addAll()
        // 말그대로 모두 다 더한다. (but, 중복은 피한다.)
        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);
        //s1과 s2의 합집합 : Apple, Tesla, Microsoft, Alphabet, Texas Instruments
        // 위 목록들이 순서대로 출력되지 않음 (그렇다고 매출력시 랜덤은 아니다.)

        // 교집합 : retainAll()
        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);
        //s1과 s2의 교집합 : Tesla

        System.out.println("합집합 = " + union);
        System.out.println("교집합 = " + intersection);

    }
}
