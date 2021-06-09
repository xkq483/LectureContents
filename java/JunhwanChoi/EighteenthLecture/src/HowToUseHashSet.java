import java.util.HashSet;
import java.util.Set;

public class HowToUseHashSet {
    public static void main(String[] args) {

        Set<String> s = new HashSet<String>();

        String[] sample = {"안녕","하이","헬로","안녕","하이"};

        //집합의 튿성: 중복허용 x
        for(String str : sample)  // sample배열을 str에 집어넣응ㅁ
        {
            if(!s.add(str)) // 거짓을 부정(s.add(str)) -> 참    // s.add(str) => s.add("안녕")
                                                              //               s.add("하이")
                                                              //               s.add("헬로")
                                                              //               s.add("안녕")      --> 한개는 컷
                                                              //               s.add("하이")
            {
                System.out.println("중복되었습니다: "+str);
            }
        }
        System.out.println(s.size()+"중복을 제외한 단어: "+s);

    }
}
