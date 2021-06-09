import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    //어제 문제가 완벽히 이해가 안되서 타자로 아는 부분만 복습하면서 정리를 해봤습니다.
    //전반적으로 shuffle 메소드의 구조가 잘 이해가 안되었습니다.
    ArrayList<String> nameLists;
    String[] tmpArr;
    int[] tmpIdx;
    int[] success; //인덱스 공간이 무한한 ArrayList배열 하나와 문자열 배열 한개, 그리고 두개의 정수형 배열이 있다.

    int nameLength;
    Boolean isRedundant;

    public Roulette (String[] names) {
        nameLength = names.length; //nameLength는 main에서 인자로서 온 names라는 배열의 수를 대입받았다.
        isRedundant = true;

        nameLists = new ArrayList<String>(); //무한정 늘어날 수 있는 nameLists배열을 객체로 만들어주고..
        tmpArr = new String[nameLength];
        tmpIdx = new int[nameLength]; //클래스이름 밑에서 선언된 배열들에 nameLength의 숫자 값을 길이로 지정해준다.

        success = new int[3]; //뽑아야될 숫자 세게를 담는 success라는 이름의 배열이다.

        int i = 0;

        for (String name : names) {
            tmpArr[i++] = name;
            //String name이라는 for문 안에서만 선언된 임시?배열에 인자로 받았던 main의 names배열의 값들을 담고,
            //tmpArr배열의 인덱스에 다시 name의 정보를 차례대로 담는다!
        }
    }

    private Boolean checkDuplicate (int idx) {
        for (int i = 0; i < idx; i++) {
            if (tmpIdx[i] == tmpIdx[idx]) {
                return true;
                //만약 idx에 4가 들어갔다고 가정해본다. 길이가 28(칸의 범위는 0~27)인 tmpIdx에는 학생 수만큼 범위의 랜덤값이
                //들어가있고, i의 값이 증가하면서 차례대로 idx칸까지 동일한 값이 있나 검사한다.
                //예를 들어 idx에 4가 들어갔으니까 {15, 2, 19, 24,.....}의 배열을 i가 0칸 부터 3칸까지 tmpIdx의 idx번째 값과
                //일치하는 값이 들어있는지 비교해보면서 검사를 진행하는 것이다.
                //idx번째 값에 19가 들어있다면 [idx]는 tmpIdx의 [2]와 같은 값을 가지게되는 것이고 그 때 true를 반환한다.
            }
        }
        return false;
        //이 메소드에서는 인자로 들어온 정수의 값만큼 i가 증가하면서 tmpIdx의 배열을 차례대로 검사하는데,
        //tmpIdx배열의 칸이 배열의 인자로 받은 정수의 칸까지 도달하게되면 true를 반환한다.
    }

    public void shuffle () {
        int i = 0;

        isRedundant = true;
        do {
            tmpIdx[i] = (int)(Math.random() * nameLength); //tmpIdx배열 안에 학생 수만큼 범위의 랜덤값을 생성해 넣는다.

            if (checkDuplicate(i)) {
                continue;
                //*****질문*****
                //i가 0부터 증가하면서 이 메소드의 인자로들어가 중복된 값을 검사하면서 if()안에 true 또는 false를 반환하는데,
                //저 체크 메소드 안에서 중복값이 발생해 true가 반환된다면 continue를 해준다.
                //continue의 역할은 if가 참일 때 뒤에있는 계산들을 무시하고 다음 i의 수로 넘어갈 수 있게 하는 용도인데..
                //여기서는 그 의미를 잘 모르겠습니다.
            }
            //*****질문*****
            i++;//i가 ++되는건 알겠지만 여기에 i++이 위치해야하는 이유를 잘 모르겠습니다.
            //i++를 do의 범위 끝에 위치시켜보았는데 그러면 에러가 나더라고요.

            if (i == nameLength) { //i가 증가하면서 tmpIdx의 배열 길이의 끝에 도달했을 때 isRedundant는 false가 된다.
                isRedundant = false;
            }
            //i++; 여기에 두니까 에러가 났습니다.

        } while (isRedundant); //즉, i가 배열 길이의 끝에 도달할 때 까지 배열의 모든 중복을 검사하라는 뜻이다.
    }

    public void checkSuccess () {
        int i = 0;

        isRedundant = true;

        do {
            success[i] = (int)(Math.random() * nameLength);
            //당첨될 숫자의 랜덤값을 success에 넣어준다. 여기서 당첨 인원은 3명이니, success 배열의 길이는 3이다.
            //즉, 3칸이니 [0]~[2]까지이다.

            //*****질문*****
            if (checkDuplicate(i)) { //여기서 중복 검사를 한번 더해준다. 왜지?
                continue;
            }

            i++;

            if (i == 3) { //i가 3까지 가면 false를 반환하니 0부터 2까지만 중복 검사를 하란 뜻이다.
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
    public String toString() { //
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

        System.out.println(r); //toString의 배열을 출력한다. 일단 여기서는 전부 0이 나온다.

        r.shuffle(); //셔플을 돌리면 toString메소드에서 랜덤값을 생성해 중복되지 않게 배열에 넣는다.

        System.out.println(r); //여기서 배열의 길이만큼 중복되지않는 값들을 toString으로 출력한다.

        r.checkSuccess(); //이 메소드 호출은 success배열 안에 랜덤값이 생성되게한다.
        r.printSuccessArr(); //success배열을 출력한다.
    }
}