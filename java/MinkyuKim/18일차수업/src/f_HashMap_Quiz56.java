// 숫자 0~9까지의 카드가 존재한다.
// 또한 카드별로 문양이 있고 문양의 종류는 3가지다.
// 문양의 종류는 창(spear), 검(sword), 활(arrow)이다.
// 카드는 총 30장으로 모두 각각 창, 검, 활 문양이 0~9까지 10개씩 존재한다.
// 우선 이 상태에서 사용자에게 랜덤하게 4장의 카드를 나눠주도록 하자!

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class f_HashMap_Quiz56 {
    public static void main(String[] args) {
        // 1. 문양은 3개, 3개 각각에 0~9의 숫자가 있음
//     ---> Map(문양, 숫자)로 만들면 좋음
//         ---> Map(문양, 추가Map)
//              추가Map(문양num, 1) (~~, 2), (~~, 3), (~~, 4)
// 2. 각각에서 4장씩 나눠주는 매커니즘이 존재함
//    어떤 방식으로 나눠줄지? 랜덤

        Map<String, Map<String, Integer>> mapp = new HashMap<String, Map<String, Integer>>();

        // Map<String, Integer> prepareMap = new HashMap<String, Integer>();를
        // 배열로 만들 필요가 있음. mapp.put(pattern[i], prepareMap); 시 전부다 들어가게되므로
        Map<String, Integer>[] prepareMap = new HashMap[3];

        String[] pattern = {"spear", "sword", "arrow"};


        for(int i = 0; i < 3; i++) {
            prepareMap[i] = new HashMap<String, Integer>();

            for (int j = 0; j < 10; j++) {
                // ++ 스피어 0~9
                prepareMap[i].put(pattern[i] + j, j);
            }
        }
        for(int i = 0; i < 3; i++) {
            mapp.put(pattern[i], prepareMap[i]);
        }
        System.out.println(mapp);

        System.out.println("카드를 분배합니다.");

        for(int i = 0; i < 4; i++) {
            String sculpture = pattern[(int) (Math.random() * 3)];

            // 중복되는 숫자를 체킹하는 코드가 필요합니다.
            // do while이나 Hashset 등을 통하여 중복검사

                int randNum = (int) (Math.random() * 10);

            System.out.println("사용자에게 분배된 카드는 = " + sculpture + "문양의" +randNum + " 카드입니다!");


                }

            }


                }




