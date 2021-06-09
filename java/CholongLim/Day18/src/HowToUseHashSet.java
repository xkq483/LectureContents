import java.util.HashSet;
import java.util.Set;

public class HowToUseHashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();

        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕"};
        // 집합의 특성: 중복 허용 x

        for (String str : sample) {
            if (!s.add(str)) {
                // str 값("안녕", "하이", "헬로", "안녕", "안녕")을
                // s에 하나씩 추가했을때,
                // !(not)인 경우
                // 즉, 중복일때 중복되었습니다 : (중복값) 이 출력되고
                System.out.println("중복되었습니다 :" + str);
            }
        }
        // 중복이 아닐떄는 s에 추가된다.
        System.out.println(s.size() + "중복을 제외한 단어 : " + s);
    }
}
