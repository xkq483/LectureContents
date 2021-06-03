/*
카드게임을 만들기
숫자 0~9 까지의 카드가 존재한다.
또한 카드별로 문양이 있고 문양의 종류는 3가지이다.
창(separ),검(sword),화살(arrow)이다.
카드는 총30장으로 모두 각각 창,검,활 10(0~9)장씩 들어가있다.
우선 이상태에서 사용자에게 랜덤하게 4장의 카드를 나눠주도록하자.

 */

import java.util.HashMap;
import java.util.Map;

class Card {

}


public class TodayTest {
    public static void main(String[] args) {
        int[] cardNum ={0,1,2,3,4,5,6,7,8,9};

        HashMap<String,int[]> cards = new HashMap<String,int[]>();

        cards.put("Spear",cardNum);
        cards.put("Sword",cardNum);
        cards.put("Arrow",cardNum);
        for(Map.Entry<String,int[]>card : cards.entrySet()) {



        }

    }




}
