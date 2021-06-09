import java.util.HashSet;
import java.util.Set;

public class c_HowToUseHashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        // ++ Set은 interface
        // ++ HashSet은 impliment

        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕" };

        // 집합의 특성: 중복 허용x
        for(String str : sample) {
            // ++
            // add -> 지정된 요소가 포함되어있다면 true, 즉 if문이 계속 진행되게됨.
            // 하지만 ! 이므로 포함되어있지 않은 경우가 true로 볼 수 있음.

            // s.add(str)은 안녕,하이,헬로만 출력, 집합의 형태이므로 중복된 안녕2개는 제외되어 출력됨.
            // !s.add(str)은 안녕, 안녕. 즉 중복만 출력됨.

            // 집합의 형태이므로 중복이 자동으로 제거 출력, 반대로 !이붙은것은 중복된 부분만이 출력됨.
            // 지정된 값이 포함되어 있다면(안녕,하이,헬로) 사실
            // 즉 !s.add(str)의 경우 지정되지 않은(제외된) 값인 안녕, 안녕이 출력됨\
            // ++ 객체.add(변수)
            if (!s.add(str)) {
                System.out.println("중복되었습니다: " + str);
            }
        }
        // size()는 집합내에 구성되어있는 원소의 개수
        System.out.println(s.size() + "중복을 제외한 단어: " + s);
    }
}
