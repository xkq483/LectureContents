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
        nameLength = names.length; // length는 28
        isRedundant = true;

        nameLists = new ArrayList<String>();
        tmpArr = new String[nameLength]; //tmpArr는 Stirng[]
        tmpIdx = new int[nameLength]; // tmpIdx는 int[]

        success = new int[3]; // 3개의 index를 갖는 int형 배열 success

        int i = 0;

        for (String name : names) {
            tmpArr[i++] = name; // main의 students 배열을 받아서 tmpArr setting
        }
    }

    public void shuffle () {
        int i = 0;
        isRedundant = true;
        do {
            tmpIdx[i] = (int)(Math.random() * nameLength); //tmpIdx에 값들 setting
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
    private Boolean checkDuplicate (int idx) {
        for (int i = 0; i < idx; i++) {
            if (tmpIdx[i] == tmpIdx[idx]) {
                return true;
            }
        }
        return false;
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
}

public class _4th_Quiz48_TeacherSolution {
    public static void main(String[] args) {
        String[] students = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };

        Roulette r = new Roulette(students);

        System.out.println(r);

        r.shuffle();

        System.out.println(r);

        r.checkSuccess();
        r.printSuccessArr();
    }
}