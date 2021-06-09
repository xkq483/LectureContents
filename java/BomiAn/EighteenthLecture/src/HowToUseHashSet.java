import java.util.HashSet;

public class HowToUseHashSet {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();

        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕"};

        for (String str : sample) {
            if(!s.add(str)) {
                System.out.println("중복되었습니다. " + str);
            }
        }

        System.out.println(s.size() + "중복을 제외한 단어" + s);


    }
}
