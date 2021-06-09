import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Card {
    Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
    Map<String, Integer>[] preparedMap = new HashMap[3];

    Set<String> p = new HashSet<String>();
    String[] pattern = {"spear", "sword", "arrow"};

    private Boolean continueShopping;



   /* public void doCardGame() {


        do {
            CardDivision();
            goFirstCard();

        } while (continueCardGame);
    }


    */
    public void CardDivision() {

        for (int i = 0; i < 3; i++) { //문양 3개까지
            preparedMap[i] = new HashMap<String, Integer>();

            for (int j = 0; j < 10; j++) { //문양 하나당 10번씩 돌려서 0 ~ 9까지 카드 만들어줌
                preparedMap[i].put(pattern[i] + j, j);
            }
        }

        for (int i = 0; i < 3; i++) {
            map.put(pattern[i], preparedMap[i]);
        }

        System.out.println(map);

        System.out.println("카드를 분배합니다.");

        for (int i = 0; i < 4; i++) { //4장 분배
            String sculpture = pattern[(int) (Math.random() * 3)]; //무늬종류3개

            int randNum = (int) (Math.random() * 10); //10개
            // 중복되는 숫자를 체킹하는 코드가 필요합니다:
            // 56번에서는 중복체킹하는것을 추가로 처리하여
            // 57번 문제를 풀어보도록 합시다!
            System.out.println("사용자에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum + " 카드입니다!");
        }


    }

    public void goFirstCard() {



        for (int j = 0; j < 4; j++) {

            String sculpture = pattern[(int) (Math.random() * 3)];

           int comNum = (int) (Math.random() * 10);

            System.out.println("컴퓨터에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + comNum + " 카드입니다!");
        }

        }

}

    public class Quiz56 {
        public static void main(String[] args) {
            Card c = new Card();

            c.CardDivision();
            c.goFirstCard();
            // 숫자 0 ~ 9 까지의 카드가 존재한다.
            // 또한 카드별로 문양이 있고 문양의 종류는 3가지다.
            // 문양의 종류는 창(spear), 검(sword), 활(arrow)이다.
            // 카드는 총 30장으로 모두 각각 창, 검, 활 문양이 0 ~ 9 까지 10개씩 존재한다.
            // 우선 이 상태에서 사용자에게 랜덤하게 4장의 카드를 나눠주도록 하자!

            // 1. 문양은 3개, 3개 각각에 0 ~ 9의 숫자가 있음
            //    ---> Map(문양, 숫자)로 만들면 좋음
            //         ---> Map(문양, 추가Map)
            //              추가Map(문양num, 1), (~~, 2), (~~, 3), (~~, 4)
            // 2. 각각에서 4장씩 나눠주는 메커니즘이 존재함
            //    어떤 방식으로 나눠줄지 ? 랜덤


        }
    }

