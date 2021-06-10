import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    // ArrayList를 통해 사람 이름을 여러개 받을 수 ㅇ있도록 구성
    ArrayList<String> nameLists;
    // 임시로 저장하는데 활용하기 위한 백업용 배열
    String[] tmpArr;

    int[] tmpIdx;

    int[] success; // 당청자들 인덱스를 저장할 배열

    int nameLength;// 실제 몇명의 참가자가 있는지
    Boolean isRedundant; // 중복 검사를 위한 변수

    final int SUCCESS_MAX=3;

    // 생성자 --> 초기화
    public Roulette (String[] names) {
        nameLength = names.length;
        isRedundant = true;

        nameLists = new ArrayList<String>();
        tmpArr = new String[nameLength];
        tmpIdx = new int[nameLength];

        success = new int[SUCCESS_MAX];

        int i = 0;

        //for문 사용하지 않고 배열 사용하기
        tmpArr= names; // name 배열을 tmp배열에 대입함


        /*for (String name : names) {
            tmpArr[i++] = name;*/
        }


    private Boolean checkDuplicate (int idx) {
        for (int i = 0; i < idx; i++) {
            if (tmpIdx[i] == tmpIdx[idx]) {
                return true;
            }
        }

        return false;
    }

    // 셔플 (카드섞기)
    public void shuffle () {
        int i = 0;

        isRedundant = true;

        //중복 검사를 하며 가각에 모든 중복되지 않는 숫자(0~ 사람숫자-1)를 할당함
        //현재는 셔플 메서드와 checkSuccess가 사실상 동일 패턴을 가지고있음
        // 리팩토링을 통해 중복을 제거할 수 있다
        do {
            tmpIdx[i] = (int)(Math.random() * nameLength);   // 랜덤값 ㅇ마누거나 가져옴

            if (checkDuplicate(i)) { // 중복검사
                continue; // 중복이면 다시 랜덤값 할당
            }

            i++; // 중복아니면 다음 인덱스에 랜덤값 받기위해 인덱스증가

            if (i == nameLength) { // 전체 사람 숫자만큼 랜덤을 모두 할당했다면 더 이상 반복이 필요 없이므로 루프 탈출
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

    // 아래 두개코드도 거의 유사
    // 리팩토링 대상
    public void printSuccessArr () {
        for (int i = 0; i < 3; i++) {
            System.out.printf("success[%d] = %d\n", i, success[i]);
        }

    }
    /*public void printArr () {
        for (int i = 0; i < 3; i++) {
            System.out.printf("tepArr[%d] = %d\n", i, tmpArr[i]);
        }

    }*/


    // sout 클래스 객체
    // 클래스 객체 내부에 우리가 지정한 내용물을 볼 수 잇다
    // 지정한 내용물이란? return 에서 뿌려주는 내용
    @Override
    public String toString() {
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';
    }


    public void printWinner()
    {
        for(int i=0; i< success.length; i++)
        {
            System.out.println("당첨자:  ???");
        }
    }
}

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
        names[0] = "객체인지 변수인지 확인 -> 객체이면 name[0]이 바뀌어야함?";// 으으악이 출력되면 객체를 가져온거기 때문에 값이 바뀐거임
                                                                      // ( 생성자 쪽에 tmpArr= names; // name 배열을 tmp배열에 대입함    <-- 이 라인에대한 의문을 푸는 문장

        /*r.printArr();
*/
        System.out.println(r);

        r.shuffle();

        System.out.println(r);

        r.checkSuccess();
        r.printSuccessArr();
        r.printWinner();

    }
}