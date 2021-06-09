/*
카드게임을 만들기
숫자 0~9 까지의 카드가 존재한다.
또한 카드별로 문양이 있고 문양의 종류는 3가지이다.
창(separ),검(sword),화살(arrow)이다.
카드는 총30장으로 모두 각각 창,검,활 10(0~9)장씩 들어가있다.
우선 이상태에서 사용자에게 랜덤하게 4장의 카드를 나눠주도록하자.

 */

//1.문양3개, 3개 각각에 0~9의 숫자가 있음
//          Map(문양,숫자)로 만들면좋음
//              Map(문양,추가map)
//                  추가Map(문양num,1),(~~,2),(~~,3)
//2.각각에서 4장씩 나눠주는 매커니즘이 존재함
//3.어떤방식으로 나눠줄지? -->랜덤으로
/*같은 문양의 숫자가 연속되게 3개 나오는 경우(예 9 8 7) > 서로 다른 문양의 같은 숫자
        서로 다른 문양의 같은 숫자                           > 서로 다른 문양의 숫자가 연속되게 3개 나옴
        서로 다른 문양의 숫자가 연속되게 3개 나옴             > 서로 같은 문양이 3개 나옴

 */

import java.util.HashMap;
import java.util.Map;

public class Prob56 {
    public static void main(String[] args) {

        boolean isContinue =false;
        int[]dupliCheckInt = new int[4];
        String[] dupliCheckMark = new String[4];
        int randNum;
        String mark;

        Map<String,Map<String,Integer>> map = new HashMap<String, Map<String, Integer>>();
        Map<String,Integer>[] preparedMap = new HashMap[3];

        String[] pattern = {"spear","sowrd","arrow"};
        for(int i =0;i<3;i++) {
            preparedMap[i] = new HashMap<String,Integer>();

            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i]+j, j);
            }
        }

        for(int i =0;i<3;i++){
            map.put(pattern[i],preparedMap[i]);
        }

        System.out.println(map);

        for(int i =0;i<4;i++){
            //중복되는 숫자를 체킹하는 코드가 필요하다.
            mark = pattern[(int)(Math.random()*3)];
            do {
                randNum = (int) (Math.random() * 10);
                dupliCheckInt[i] = randNum;
                dupliCheckMark[i] = mark;
                for (int j = 0; j < i; j++) {
                    if (dupliCheckInt[i] == dupliCheckInt[j] && dupliCheckMark[i].equals(dupliCheckMark[j]) ) {
                        System.out.println(dupliCheckInt[i] + dupliCheckMark[i]);
                        isContinue = true;
                        break;
                    } else {
                        isContinue = false;
                    }
                }
            }while(isContinue);

            System.out.println("사용자에게 분배된 카드는 = "+mark+"문양의"+randNum+"카드입니다!");
        }



    }
}
