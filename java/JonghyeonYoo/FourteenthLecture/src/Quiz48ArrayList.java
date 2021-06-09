import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class DrawGame {
//중복이 발생하지 않게 랜덤한 배열에 사람 이름을 무작위로 믹스한다.
//그리고 당첨자 번호를 3개 뽑도록 한다(마찬가지로 중복 x)
//당첨된 사람의 이름을 출력하고 "당첨되셨습니다. 누구 누구 누구 축하합니다 ^^" 를 출력하자!

    ArrayList<String> nameList;
    String[] tmpArr;  //String 타입의 배열
    int[] tmpIdx;     //int타입의 배열
    int[] success;    //int타입 배열 당첨자

    int nameLength;   // 이름의 길이를 받을 변수
    Boolean isRedundant; // 참/ 거짓으로 중복숫자를 없애기 위함

    public DrawGame(String[] names) {
        nameLength = names.length;  // nameLength안 에다가 names의 길이를 대입 (28)
        isRedundant = true;

        nameList = new ArrayList<String>();
        tmpArr = new String[nameLength]; // String타입 배열 인덱스 28개 생성
        tmpIdx = new int[nameLength];   // int 타입 배열 인덱스 28개 생성

        success = new int[3]; // 당첨자가 들어갈 인덱스 3개 생성

        int i = 0;  //아래 tmp[i++]의 인덱스 0부터 넣기위함.
        for (String name : names) { //main의 names에 있는 이름을 String name에 입력한다.
            tmpArr[i++] = name; // String name에 들어간 이름을 배열에 0번 인덱스부터 순서대로 대입
        }
    }

    private Boolean checkDuplicate(int idx) {   //중복제거 메소드
                                                // 아래의 shuffle, checkSuccess 메소드의 중복을 제거
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

            if (checkDuplicate(i)) { // 위 checkDuplicate 메소드에서 tmpIdx[i] 의 중복검사 실행
                continue;
            }

            i++; // tmpIdx[i] 0번인덱스부터 점차 증가 (0 -> 1 -> 2 -> 3 -> ... 27)

            if (i == nameLength) {  // nameLength의 길이(28) 까지오면 탈출 0번 ~27번 인덱스까지만 실행
                isRedundant = false;
            }
        } while (isRedundant);
    }

    public void checkSuccess () {
        int i = 0;
        isRedundant = true;

        do {
            success[i] = (int)(Math.random() * nameLength);

            if (checkDuplicate(i)) { // 위 checkDuplicate 메소드에서 success[i]의 중복검사를 실행
                continue;
            }

            i++; // 0번부터 점차 증가 +1  (0 -> 1 -> 2 ....)

            if (i == 3) {  //인덱스 3번방까지오면 탈출한다?? 0번 ~ 2번 인덱스까지 실행
                isRedundant = false;
            }
        } while (isRedundant);
    }
    public void printSuccessArr () {
        for (int i = 0; i < 3; i++) {
            System.out.printf("success[%d] = %d\n", i, success[i]);

        }
    }
    public void printName() {
        for(int i = 0; i < 3; i++) {
            System.out.printf("%d번 당첨 %s님 축하드립니다.\n", success[i], tmpArr[success[i]]);

        }
     }



    @Override
    public String toString() {
        return "DrawGame {" +
                "tmpIdx=" + Arrays.toString(tmpIdx)+
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
           dg.printName();

       }
   }

