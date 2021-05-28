import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class DrawGame {
    //중복이 발생하지 않게 랜덤한 배열에 사람 이름을 무작위로 믹스한다.
//그리고 당첨자 번호를 3개 뽑도록 한다(마찬가지로 중복 x)
//당첨된 사람의 이름을 출력하고 "당첨되셨습니다. 누구 누구 누구 축하합니다 ^^" 를 출력하자!

    ArrayList<String> nameList;
    String[] tmpArr;
    int[] tmpIdx;
    int[] success;

    int nameLength;
    Boolean isRedundant;

    public DrawGame(String[] names) {
        nameLength = names.length;
        isRedundant = true;

        nameList = new ArrayList<String>();
        tmpArr = new String[nameLength];
        tmpIdx = new int[nameLength];

        success = new int[3];

        int i = 0;
        for (String name : names) {
            tmpArr[i++] = name;
        }
    }

    private Boolean checkDuplicate(int idx) {   //중복제거
        for (int i = 0; i < idx; i++) {
            if (tmpIdx[i] == tmpIdx[idx]) {
                return true;
            }
        }

        return false;
    }

    public void shuffle() {
        int i = 0;

        isRedundant = true;

        do {
            tmpIdx[i] = (int) (Math.random() * nameLength);

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
        return "Name {" + Arrays.toString(tmpArr) +
                "\nNum=" + Arrays.toString(tmpIdx)+
                '}';
    }

}
public class Quiz48ArrayList {
       public static void main(String[] args) {
           String[] names = {
                   "박세진", "김창욱", "김민규", "김중연", "문성호",
                   "강병화", "최승현", "유종현", "한상우", "전승리",
                   "이경환", "최준환", "김원석", "여인준", "이태양",
                   "김윤영", "정도영", "황정아", "임초롱", "김남교",
                   "이주형", "김도연", "최혜주", "김도혜", "고재권",
                   "임익환", "안보미", "이상훈"
           };
           DrawGame dg = new DrawGame(names);

           dg.shuffle();

           System.out.println(dg);

           dg.checkSuccess();
           dg.printSuccessArr();

       }
   }

