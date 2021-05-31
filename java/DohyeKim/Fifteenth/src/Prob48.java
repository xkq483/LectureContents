import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    ArrayList<String> nameLists;
    String[] tmpArr;
    int[] tmpIdx;
    final  int winner = 3;
    int[] success;

    int nameLength;
    Boolean isRedundant;

    public Roulette (String[] names)// 매개변수를적어 매인매소드에있는 배열을 가져왔다.
    {
        nameLength = names.length; // 현재 nameLength 정수28
        isRedundant = true;

        nameLists = new ArrayList<String>();
        tmpArr = new String[nameLength]; // String 배열인 tmpArr을  28개방을 만들겠다.
        tmpIdx = new int[nameLength];  // int 배열인 tmpIdx 방도  28개만들겠다.

        success = new int[winner]; // success그러니까 당첨자 3명을 여기다가 넣겠다. 그말인거같다.

        int i = 0;

        for (String name : names) {
            tmpArr[i++] = name;// String 배열 tmpArr[0]...[27]까지에 각각의 방마다 우항의값 names를 좌항의값 name에게 넘겨주겠다.
            //tmpArr은 현재 각방마다. 사람들의 이름이 넣어져있을것이다.
        }
    }

    private Boolean checkDuplicate (int idx) {
        for (int i = 0; i < idx; i++) {
            if (tmpIdx[i] == tmpIdx[idx]) {
                return true;
            }
        }

        return false;
    }

    public void shuffle () {
        int i = 0;

        isRedundant = true;

        do {
            tmpIdx[i] = (int)(Math.random() * nameLength);

            if (checkDuplicate(i)) {
                continue;
            }

            i++;

            if (i == nameLength) {
                isRedundant = false;
            }
        } while (isRedundant);
    }

    public void checkSuccess () {
        int i = 0;

        isRedundant = true;

        do {
            success[i] = (int)(Math.random() * nameLength);

            if (checkDuplicate(i)) {
                continue;
            }

            i++;

            if (i == 3) {
                isRedundant = false;
            }
        } while (isRedundant);
    }

    public void printSuccessArr () {
        for (int i = 0; i < 3; i++) {
            System.out.printf("success[%d] = %d\n", i, success[i]);

        }
    }

    @Override
    public String toString() {
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';
    }
    public void printWinningNames(){
        for(int i = 0; i <3; i++){
            System.out.println("당첨자="+tmpArr[tmpIdx[success[i]]]);
        }
    }
}

public class Prob48 {
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
        r.printWinningNames();

    }
}