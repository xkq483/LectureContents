import java.util.HashSet;
import java.util.Set;

// HashSet(집합)으로 합집합(union),교집합(intersection) 출력하기
public class SetFeatureTestWithHashSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("Apple");
        s1.add("Tesla");
        s1.add("Microsoft");

        s2.add("Tesla");
        s2.add("Alpahbet");
        s2.add("Texas Instruments");

        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);

        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);

    }
}
