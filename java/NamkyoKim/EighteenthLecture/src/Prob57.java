import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Game{
    final int HASHMAX = 3;
    final int PATTERNMAX = 3;
    final int CARDMAX = 10;


    Map<String, Map<String,Integer>> map = new HashMap<String, Map<String,Integer>>();
    Map<String, Integer>[] preparedMap = new HashMap[HASHMAX];
    Set<Integer> s = new HashSet<Integer>();


    String[] pattern;
    public Game(){
        pattern = new String[]{"spear", "sword", "arrow"};

    }
    public void Card(){
        for (int i = 0; i < PATTERNMAX; i ++) {
            preparedMap[i] = new HashMap<String, Integer>();
            for (int j = 0; j < CARDMAX; j++) {
                preparedMap[i].put(pattern[i]+ j, j);
            }
        }
        for (int i = 0; i < PATTERNMAX; i++){
            map.put(pattern[i], preparedMap[i]);
        }
    }
    public void Distribution(){

        for(int i = 0; i < 4; i++){
            String sculpture = pattern[(int)(Math.random() * 3)];
            int[] randnum = {(int)(Math.random() * 10)};
            for (int userNum : randnum){
                if(!s.add(userNum)){
                continue;
                 }
                System.out.println("사용자에게 분배된 카드는 = "+sculpture + s);
            }

            //System.out.println("사용자에게 분배된 카드는  = " + sculpture + "문양의 "
                  //  + randnum + "카드입니다");
        }
    }

}



public class Prob57 {
    public static void main(String[] args) {
            Game gm = new Game();
            gm.Distribution();
    }
}
