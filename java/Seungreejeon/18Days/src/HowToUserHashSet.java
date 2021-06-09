import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

public class HowToUserHashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();

        String[] sample = {"하이", "헬로", "안녕", "하이","하이","헬로"};

        for (String data : sample) {
            if(!s.add(data)) // add특성 내부에 동일 값이 포함 되어있면 return true
            System.out.println("중복검사 :" + data);
        }


        System.out.println(s.size() + "중복을 제외한 단어 : " + s);

    }
}
