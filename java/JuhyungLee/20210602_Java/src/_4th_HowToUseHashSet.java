import java.util.HashSet;
import java.util.Set;

public class _4th_HowToUseHashSet {
    public static void main(String[] args) {
        //중복을 허용하지 않는 HashSet 특성 사용의 예
        HashSet<String> sayhello = new HashSet<>();

        String[] sample = { "안녕", "hi", "헬로", "안녕", "안녕", "hi" };

        for (String str : sample){
            if(!sayhello.add(str)){
                // Returns: true if this set contained the specified element << ctrl + b로 ".add" 확인
                // add 할 때 이미 집합 내용에 포함되어 있지 않으면 true > !니까 반대
                System.out.println("중복되었습니다: " + str);
            }
        }
        System.out.println("중복을 제외한 단어들: " + sayhello );
    }
}
