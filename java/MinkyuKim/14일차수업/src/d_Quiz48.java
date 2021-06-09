import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    ArrayList<String> nameLists;
    String[] tmpArr;
    int[] tmpIdx;

    int[] success;

    int nameLength;
    Boolean isRedundant;

    public Roulette (String[] names) {
        nameLength = names.length;
        isRedundant = true;

        nameLists = new ArrayList<String>();
        tmpArr = new String[nameLength];
        tmpIdx = new int[nameLength];

        success = new int[3];

        int i = 0;

        for (String name : names) {
            tmpArr[i++] = name;
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
    public int[] getSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';
    }
}

public class d_Quiz48 {
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
        // 0000 숫자

        r.shuffle();

        System.out.println(r);
        // 섞여진 숫자 차례로 나열

        r.checkSuccess();
        // i = 3일때 멈추고, 0, 1, 2 인덱스 배열에 name.Length만큼의 랜덤숫자 할당
        r.printSuccessArr();
        // 할당된 숫자 출력



        System.out.printf("당첨자는 %s님, %s님, %s님입니다. 축하드립니다.\n",
                names[r.getSuccess()[0]-1], names[r.getSuccess()[1]-1], names[r.getSuccess()[2]-1]);

    }

}