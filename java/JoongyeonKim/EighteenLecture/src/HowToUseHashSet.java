import java.util.HashSet;
import java.util.Set;

public class HowToUseHashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();  // Set은 한국말로는 "집합"이고, 따로 저장 순서를 유지하지는 않는다.
                                                // 또한 중복 값을 허용하지 않는다는 특징을 갖고 있다.
        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕"};

        // 집합의 특성 : 중복 허용 x
        for (String str : sample) {
            if(!s.add(str)) {  //거짓을 부정해서 참으로 만든 후에  if문안에 들어감, 왜 거짓이지?(안녕이 첨으로 들어감(참)-> !로 인해 거짓이됨 -> if문을 빠져나간후 밑에 s에 출력됨
                               // 다시 한번 안녕이 나옴 -> 이미 안녕이 있으니 거짓 -> !로인해 결과가 참이됨 -> if문에 있는 str에 들어감)
                System.out.println("중복되었습니다"+ str);
            }
        }
        //size()는 원소의 개수
        System.out.println(s.size()+"중복을 제외한 단어 :" +s);
    }
}
