import java.util.HashSet;
import java.util.Set;

public class HowToUseHashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();

        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕"};

        // 집합의 특성: 중복 허용x
        for (String str : sample) {
            if(!s.add(str)) {
                System.out.println("중복되었습니다: " + str);
            }
        }

        // size()는 원소의 개수
        System.out.println(s.size() + " 중복을 제외한 단어: " + s);
    }
}
