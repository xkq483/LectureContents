import java.util.HashSet;
import java.util.Set;

public class HowToUseHashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();

        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕"};

        // 집합의 특성: 중복 허용 x
        // 매커니즘이해,,
        // sample에서 str로 원소하나가 넘어갈때, 포문이 한번 돌아간다.
        //  str는 if문을 만나 검사를해본다  (!s.add(str) 조건에 맞으면 str은 이프문안으로 빨려들어갈것이다.
        // 최초 안녕은 잘들어갈것이다.
        // 하지만 2번째 안녕은 이미 안녕이란 원소가 있기 떄문에 , 추가가안된다. (중복으로 넣지못한다.)
        // 그래서 이프문은 추가가 안될때!  중복되었습니다 str을 넣는것이다.
        // 똑같은 매커니즘으로 3번째 도 들어간다.


        //질문 이 포문을 통해 어딘가에서 s.add str을 해주고있는데 대체 어디일까???
        // 질문 이 포문을 통해 어딘가에서 s.add str을 해주고있는데 대체 어디일까???
        for (String str : sample) {
            System.out.println("그냥원소들="+str);
            if (!s.add(str)) {
                System.out.println("중복되었습니다: " + str);
            }
        }

        // size()는 원소의 개수

        System.out.println(s.size() + " 중복을 제외한 단어: " + s);
    }
}