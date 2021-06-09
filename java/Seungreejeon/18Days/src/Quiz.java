//hashset으로 중복체크 못하고 코드가 많이 조잡해졌습니다.
import java.util.*;

class Check {
    Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
    Map<String, Integer>[] preparedMap = new HashMap[3];

    String[] pattern;

    final int length = 4;

    int[] randNum = new int[length];

    public Check() {
        pattern = new String[]{"spear", "sword", "arrow"};

    }

    public void Starter() {
        cardSetting();
        r_num();
    }

    public void cardSetting() {
        for (int i = 0; i < 3; i++) {
            preparedMap[i] = new HashMap<String, Integer>();

            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i] + j, j);
            }
        }

        for (int i = 0; i < 3; i++) {
            map.put(pattern[i], preparedMap[i]);
        }
    }
    //중복체크 hashset을 사용하려고했는데 못했다.
    public void r_num() {
        for (int j = 0; j < randNum.length; j++) {
            randNum[j] = (int)(Math.random() * 10);
            for (int k = 0; k < j; k++) {
                if (randNum[j] == randNum[k]) {
                    j--;
                    break;
                }
            }
        }
    }

    String[] sculptureArr = new String[4];
    String name;

    public void print() {
        System.out.println("카드를 분배합니다.");
        for (int i = 0; i < 4; i++) {
            String sculpture = pattern[(int)(Math.random() * 3)];
            sculptureArr[i] = sculpture;
            System.out.println(name +"에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum[i] + " 카드입니다!");
        }
    }
}
//트리플 , 스트레이트(서로다른문양), 플러쉬
class CheckMethod {
    public CheckMethod() {
    }

    int sum = 0;
    int MAX = 0;


    public int differentPattern(String[] inputArr) {
        int cnt = 0;
        for (int i = 0; i < inputArr.length; i++) {
            cnt = 0;
            for (int j = 0; j < inputArr.length; j++) {
                if (inputArr[i] != inputArr[j]) {
                    cnt++;
                }
            }
        }
        if (cnt >= 2) {
            return 5;
        }
        return 6;
    }


    public int patternCheck(String[] inputArr) {
        int cnt = 0;
        for (int i = 0; i < inputArr.length; i++) {
            cnt = 0;
            for (int j = 0; j < i; j++) {
                if (inputArr[i] == inputArr[j]) {
                    cnt++;
                }
            }
        }
        if (cnt >= 2) {
//            System.out.println("MADE FLUSH");
//            System.out.println(Arrays.toString(compare));
            return 3;
        }
        return 4;
    }
    public int num_Check(int[] inputArr) {
        int cnt = 0;
        for (int i = 0; i < inputArr.length; i++) {
            cnt = 0;
            for (int j = 0; j < i; j++) {
                if (inputArr[i] == inputArr[j]) {
                    cnt++;
                }
            }
        }
        if (cnt >= 2) {
//            System.out.println(Arrays.toString(compare));
            return 7;
        }
        return 8;
    }
    int compare[];
    public int checkTripple(int[] inputArr) {

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr.length; j++) {
                if (inputArr[i]+1 == inputArr[j]) {
                    for (int k = 0; k < inputArr.length; k++) {
                        if (inputArr[i] + 2 == inputArr[k]) {
//                            System.out.println("MADE STRAIGHT "+inputArr[i]+inputArr[j]+inputArr[k]);
                            sum = inputArr[i] + inputArr[j] + inputArr[k];
                            if (MAX < sum) {//스트레이트 높은수로
                                MAX = sum;
                                compare = new int[]{inputArr[i], inputArr[j], inputArr[k]};
//                                System.out.println("MAX처리");
                                System.out.println("MADE STRAIGHT "+inputArr[i]+inputArr[j]+inputArr[k]);
                                return 1;
                            }
                        }
                    }
                }
            }
        }return 2;
    }
}

class CheckHand {
    final int Bit = 1;
    int testBit = 0;
    Check ch;
    CheckMethod cw;


    public CheckHand(String name) {
        ch = new Check();
        cw = new CheckMethod();
        ch.Starter();
        ch.name = name;
        ch.print();
    }

    //다른 색깔 3개이상 성공 5 ,실패 6 플러쉬 성공 3, 실패 4  스트레이트 성공 1, 실패 2
    //같은 번호 성공 7, 같은번호 실패 8
    public void testbit() {
        do {
            testBit |= (Bit << cw.checkTripple(ch.randNum));
            testBit |= (Bit << cw.patternCheck(ch.sculptureArr));
            testBit |= (Bit << cw.differentPattern(ch.sculptureArr));
            testBit |= (Bit << cw.num_Check(ch.randNum));

            if (testBit == 330) {//체크 되면서 내려가야되는데 한번에 설정해버렸다.
                System.out.println("같은 문양의 숫자가 연속되게 3개 나오는 경우 [스트레이트플러쉬]");
                break;
            } else if (testBit == 306) {
                System.out.println("서로 다른 문양의 숫자가 연속되게 3개 나옴 [스트레이트]");
                break;
            } else if (testBit == 180) {
                System.out.println("서로 다른 문양의 같은 숫자 [트리플]");
                break;
            } else if (testBit == 332) {
                System.out.println("서로 같은 문양이 3개 나옴[플러쉬]");
                break;
            }else if(testBit == 308){
                System.out.println("[하이 카드]");
                break;
            }
        } while (true);
    }


}

public class Quiz {

    public static void main(String[] args) {
        CheckHand com = new CheckHand("컴퓨터");

        com.testbit();

        CheckHand usr = new CheckHand("유저");

        usr.testbit();

        if (usr.testBit == com.testBit) {
            System.out.println("무승부");
        } else if (usr.testBit != 308 && usr.testBit < com.testBit) {
            System.out.println("유저 승");
        } else if (com.testBit != 308 && com.testBit < usr.testBit) {
            System.out.println("컴퓨터 승");
        }

    }
}



//        }
//        if (cw.patternCheck(com.sculptureArr) == 3) {
//
//        }
//        if (cw.differentPatternTripple(com.sculptureArr) == 5) {
//
//        }

//다른 색깔 3개이상 성공 5 ,실패 6 플러쉬 성공 3, 실패 4  스트레이트 성공 1, 실패 2

