import java.util.ArrayList;
import java.util.Arrays;

class Roulette {                          //변수들을 설정해준다
    ArrayList<String> nameLists;
    String[] tmpArr;
    int[] tmpIdx;

    int[] success;

    int nameLength;
    Boolean isRedundant;

    public Roulette (String[] names) {   //변수값을 초기화 해준다
        nameLength = names.length;
        isRedundant = true;

        nameLists = new ArrayList<String>();
        tmpArr = new String[nameLength];  //이름의 문자열을 tmpArr에 대입한다
        tmpIdx = new int[nameLength];   //이름의 갯수를 tmpIdx에 대입한다

        success = new int[3];

        int i = 0;

        for (String name : names) { // names에 들어있는 이름들을 String name에 넣는다
            tmpArr[i++] = name;
        }
    }

    private Boolean checkDuplicate (int idx) {  //shuffle메소드와 checkSuccess메소드 에서나온 i값이 대입되어서 메소드가 실행된다
        for (int i = 0; i < idx; i++) {   // 값의 중복을 배제하기 위해만든 함수
            if (tmpIdx[i] == tmpIdx[idx]) {  //tmpIdx[i] == tmpIdx[idx] 값이 같으면 다시 반복한다
                return true;
            }
        }

        return false;
    }

    public void shuffle () {  // i에 27가지의 무작위 수가 대입된다, 나오는 숫자를 섞기위한 함수
        int i = 0;

        isRedundant = true;

        do {
            tmpIdx[i] = (int)(Math.random() * nameLength);

            if (checkDuplicate(i)) {  //이 checkDuplicate(i)의 0~26의 무작위 수가 들어간다??
                continue;  // 해당 반복부분 탈출 후 반복실행(do로 돌아감)
            }

            i++;        

            if (i == nameLength) {
                isRedundant = false;
            }
        } while (isRedundant);
    }

    public void checkSuccess () {  //당첨번호를 확인하기위한 메소드
        int i = 0;

        isRedundant = true;

        do {   
            success[i] = (int)(Math.random() * nameLength);  //0~26룰렛을 돌린다

            if (checkDuplicate(i)) {
                continue;
            }

            i++;

            if (i == 3) {
                isRedundant = false;
            }
        } while (isRedundant);
    }

    public void printSuccessArr () {  // 0~26중 무작위 3가지 수 가 출력된다
        for (int i = 0; i < 3; i++) {
            System.out.printf("success[%d] = %d\n", i, success[i]);
        }
    }



    @Override
    public String toString() {  //Roulette객체의 tmpIdx를 출력한다???
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';
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

        r.shuffle();  //

        System.out.println(r);

        r.checkSuccess();
        r.printSuccessArr();
    }
}