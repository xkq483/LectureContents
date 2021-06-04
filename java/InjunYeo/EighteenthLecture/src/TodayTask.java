import java.util.HashMap;
import java.util.Map;

/*
카드게임을 만들기
숫자 0~9 까지의 카드가 존재한다.
또한 카드별로 문양이 있고 문양의 종류는 3가지이다.
창(separ),검(sword),화살(arrow)이다.
카드는 총30장으로 모두 각각 창,검,활 10장씩 들어가있다.
우선 이상태에서 사용자에게 랜덤하게 4장의 카드를 나눠주도록하자.
게임을 진행시킨다. 컴퓨터와 사용자가 이 카드게임을 진행하도록 만들어보자.
같은 문양의 숫자가 연속되게 3(7,8,9 이런식으로)개 나오는경우 승리한다.

같은 문양의 숫자가 연속되게 3개 나오는 경우(예 9 8 7) > 서로 다른 문양의 같은 숫자
서로 다른 문양의 같은 숫자                           > 서로 다른 문양의 숫자가 연속되게 3개 나옴
서로 다른 문양의 숫자가 연속되게 3개 나옴             > 서로 같은 문양이 3개 나옴

 */
class Palyer{

    private String name;
    Palyer(String name){
        this.name = name;
    }
}


public class TodayTask {
    public static void main(String[] args) {
        String[] cardMark={"spear","sword","arrow"};
        int[] cardNumbers={0,1,2,3,4,5,6,7,8,9};

        Map<String,int[]> Deck = new HashMap<String,int[]>();

        for(int i =0;i<cardMark.length;i++){
            Deck.put(cardMark[i],cardNumbers);
        }
        System.out.println(Deck);
        for(int i =0;i<cardNumbers.length;i++){

        }

    }




}
