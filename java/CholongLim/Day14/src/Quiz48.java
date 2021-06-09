
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;


// 사람 이름을 무작위로 믹스 (이름 중복불가)
// 당첨자 번호 3개를 뽑는다 (번호 중복불가)
// 당첨자의 이름을 포함하여 "당첨되셨습니다. 누구 누구 누구 축하합니다 ^^" 출력

// 사람 이름을 인덱스에 배정, 랜덤룰렛, 중복방지, 최종프린트

class Roulette {
    ArrayList<String> nameLists;
    String[] tmpArr;
    int[] tmpIdx;

    int[] success;  // 당첨자

    int nameLength;
    Boolean isRedundant;

    public Roulette (String[] names) {
        nameLength = names.length;  // 28
        isRedundant = true;

        nameLists = new ArrayList<String>();

        tmpArr = new String[nameLength];
//        String[] tmpArr = new String[nameLength];
//        tmpArr에 28개의 인덱스가 대입된다.
//        tmpArr[0] ~ tmpArr[27]

        tmpIdx = new int[nameLength];
//        int[] tmpIdx = new int[nameLength];
//        tmpIdx에 28개의 인덱스가 대입된다.
//        tmpIdx[0] ~ tmpIdx[27]

        success = new int[3];
//        int[] success = new int[3];
//        success에 3개의 인덱스가 대입된다.
//        success[0] ~ success[2]

        int i = 0;

//        for( a : b )
//        b에서 차례대로 객체를 꺼내서 a에다 넣겠다.
//        하단 names에서 객체를 꺼내서 name에다 넣겠다.
        for (String name : names) {
            tmpArr[i++] = name;

        }
    }

//    중복방지
    private Boolean checkDuplicate (int idx) {
        for (int i = 0; i < idx; i++) {
            if (tmpIdx[i] == tmpIdx[idx]) {
                return true;
            }
        }

        return false;
    }

//    사람(당첨번호)랜덤분배
    public void shuffle () {
        int i = 0;

        isRedundant = true;

        do {
            tmpIdx[i] = (int)(Math.random() * nameLength);
//            nameLength = 현재 28
//            (int)(Math.random() * 28)
//            0이상 28미만, 0 ~ 27

            if (checkDuplicate(i)) {
                continue;
            }

            i++;
//            i = 27 일때까지만 반복할 것이다.
            if (i == nameLength) {
                isRedundant = false;
            }
        } while (isRedundant);
    }

//    당첨 3명 뽑기
    public void checkSuccess () {
        int i = 0;

        isRedundant = true;

        do {
            success[i] = (int)(Math.random() * nameLength);
            if (checkDuplicate(i)) {
                continue;
            }

            i++;
//            i = 2 일때까지만 반복할 것이다.
//            0 , 1, 2 (3명 당첨)
            if (i == 3) {
                isRedundant = false;
            }
        } while (isRedundant);
    }

//    당첨번호 3명출력
    public void printSuccessArr () {
        for (int i = 0; i < success.length; i++) {
            System.out.printf("success[%d] = %d\n", i, success[i]);
//            System.out.printf("당첨되셨습니다. %s 축하합니다 ^^\n",tmpArr[success[i]]);
        }
    }

//    당첨자 인덱스에 들어있는 번호를 가진 사람을
//    shuffle 인덱스에서 찾아내어 출력하기

    @Override
    public String toString() {
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';
    }



}

public class Quiz48 {
    public static void main(String[] args) {
//        stack
        String[] names = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };

        Roulette r = new Roulette(names);

        System.out.println(r);

//    사람(당첨번호)뽑기 및 중복방지
        r.shuffle();

        System.out.println(r);

        r.checkSuccess();
        r.printSuccessArr();





    }
}