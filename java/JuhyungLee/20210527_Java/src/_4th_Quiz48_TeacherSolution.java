import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    ArrayList<String> nameLists; //ArrayList를 통해 사람 이름을 여러개 받을 수 있도록 구성
    String[] tmpArr; // 임시로 저장하는데 활용하기 위한 백업용 배열
    int[] tmpIdx; // 랜덤한 숫자를 할당하는데 사용할 백업용 인데스 배열

    int[] success; // 당첨자들의 인덱스를 저장할 배열

    int nameLength; // 실제 몇명의 참가자가 있는지
    Boolean isRedundant; // 중복 검사를 위한 변수

    final int SUCCESS_MAX =3;

    public Roulette (String[] names) { // 생성자 = 초기화
        nameLength = names.length; // length는 28
        isRedundant = true;

        nameLists = new ArrayList<String>();
        tmpArr = new String[nameLength]; //tmpArr는 Stirng[]
        tmpIdx = new int[nameLength]; // tmpIdx는 int[]

        success = new int[SUCCESS_MAX]; // 3개의 index를 갖는 int형 배열 success
        tmpArr = names;
        // 아래 for문 사용해도 상관 없음
        /*
        int i = 0;
        for (String name : names) {
            tmpArr[i++] = name; // main의 students 배열을 받아서 tmpArr setting
        }
         */
    }
    public void shuffle () {
        int i = 0;
        isRedundant = true;
        // 중복 검사를 하며 각각에 모든 중복되지 않는 숫자(0 ~ (사람수-1))를 할당
        // 현재 shuffle method와 checkSuccess method가 삿실상 동일 패턴을 가지고 있음
        // 즉, 리팩토링하여 이 부분의 중복을 제가할 여지가 있음.
        do {
            //랜덤값 아무거나 가져옴
            tmpIdx[i] = (int)(Math.random() * nameLength); //tmpIdx에 값들 setting
            // 중복 검사
            if (checkDuplicate(i)) {
                // 중복이면 다시 랜덤값 할당
                continue;
            }
            // 중복이 아니라면 다음 인덱스에 랜덤값을 받기 위해 인덱스 +1
            i++;

            if (i == nameLength) { // 전체 사람수 만큼 랜덤을 모두 할당했다면 더 이상 반복이 필요 없이 루프 탈출.
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
    // idx는 현재 할당받은 인덱스 값.
    // | B | A | A |
    //   0   1  idx
    // 현재 인덱스(idx)가 중복인지 아닌지 보는 것이므로..
    //
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

    // toString은 클래스 객체를 sout 하는 경우에만 사용가능 >> sout(클래스객체)
    // 클래스 객체 내부에 우리가 지정한 내용물을 볼 수 있다.
    // 지정한 내용물이란? return에서 뿌려주는 내용.
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