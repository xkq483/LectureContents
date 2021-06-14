import java.util.HashSet;
import java.util.Set;

public class SetFeatureTestWithHashSet {
    public static void main(String[] args) {
        //set<> 변수명 = new HashSet<>();
        //Hashset => add, HashMap=> put
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("Apple");
        s1.add("Tesla");
        s1.add("Microsoft");

        s2.add("Tesla");
        s2.add("Alphabet");
        s2.add("Texas Instruments");

        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);  // s1, s2를 합집합 -> 중복은 알아서 컷

        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
    }
}