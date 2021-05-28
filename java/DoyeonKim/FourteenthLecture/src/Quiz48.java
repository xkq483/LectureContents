import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    ArrayList<String> nameLists;
    String[] tmpArr; //이름
    int[] tmpIdx;//번호
    String[] successName;

    int[] success;

    int nameLength;
    Boolean isRedundant;

    public Roulette(String[] names) {//룰렛
        nameLength = names.length;
        isRedundant = true;

        nameLists = new ArrayList<String>();//다 호출해서 객체 생성
        tmpArr = new String[nameLength];
        tmpIdx = new int[nameLength];

        success = new int[3];//3명을 뽑음
        successName = new String[3];

        int i = 0;

        for (String name : names) {
            tmpArr[i++] = name;//tmpArr 배열에 이름을 넣어준다
        }
    }

    private Boolean checkDuplicate(int idx) { //중복 확인
        for (int i = 0; i < idx; i++) {
            if (tmpIdx[i] == tmpIdx[idx]) { //i와 tmpIdx의 번호 갯수가 맞으면 참
                return true;
            }
        }

        return false;
    }

    public void shuffle() {
        int i = 0;

        isRedundant = true;

        do {
            tmpIdx[i] = (int) (Math.random() * nameLength); //이름을 랜덤으로 i에 넣어줌

            if (checkDuplicate(i)) { //중복 확인후 계속
                continue;
            }

            i++;

            if (i == nameLength) { //만약 이름갯수가..? i와 같으면 거짓
                isRedundant = false;
            }
        } while (isRedundant);
    }

    public void checkSuccess() {
        int i = 0;

        isRedundant = true;

        do {
            success[i] = (int) (Math.random() * nameLength); //이름에서 랜덤을 당첨자에 넣어줌

            if (checkDuplicate(i)) { //중복 확인
                continue;
            }

            i++;

            if (i == 3) { //3개만 뽑아줌
                isRedundant = false;
            }
        } while (isRedundant);
    }

    public void printSuccessArr() { //출력
        for (int i = 0; i < 3; i++) {
            System.out.printf("success[%d] = %d\n", i, success[i]);
        }                     //당첨 [0]번 인덱스 = 당첨숫자
    }
}
 /*   public void successName() {
        //당첨 숫자와 이름 배열에 있는 같은 숫자를 꺼내와야 할 것 같은데 어떻게 해야하는지 모르겠다
        for (int i = 0; i < )

    }
}

  */

  /*  @Override
    public String toString() {
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';

    }
}
   */


public class Quiz48 {
    public static void main(String[] args) {
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

        r.shuffle();

        System.out.println(r);

        r.checkSuccess();
        r.printSuccessArr();
       // r.successName();
    }
}