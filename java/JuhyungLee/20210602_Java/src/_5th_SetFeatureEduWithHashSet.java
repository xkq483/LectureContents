import java.util.HashSet;
import java.util.Set;
public class _5th_SetFeatureEduWithHashSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();

        s1.add("Apple");
        s1.add("Tesla");
        s1.add("Microsoft");

        s2.add("Tesla");
        s2.add("Alphabet");
        s2.add("Texas Instruments");

        Set<String> union_s1_s2 = new HashSet<>(s1);
        union_s1_s2.addAll(s2);
        System.out.println("합집합: " + union_s1_s2);

        Set<String> intersection_s1_s2 = new HashSet<>(s1);
        intersection_s1_s2.retainAll(s2);
        System.out.println("교집합: " + intersection_s1_s2);
    }
}
