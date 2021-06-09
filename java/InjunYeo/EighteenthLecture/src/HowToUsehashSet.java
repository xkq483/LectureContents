import java.util.HashSet;
import java.util.Set;

public class HowToUsehashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();

        String[] sample = {"안녕","하이","헬로","안녕","안녕"};

        for(String str:sample){
            //집합의 특성: 중복 허용 x
            if(!s.add(str)){//set.add() 같은경우는 boolean값을 내뱉는데 중복인경우 거짓을 내뱉고 그것을!로 부정하기때문에 참이되어 if문 실행;
                System.out.println("중복되었습니다 :"+str);
            }

        }

        System.out.println(s.size()+"중복을 제외한 단어: "+s);
    }


}
