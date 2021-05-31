import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    //ArryList를 통해 사람 이름을 여러개 받을 수 있도록 구성
    ArrayList<String> nameLists;
    //임시 저장하는데 활용하기 위한 백업용 배열
    String[] tmpArr; //이름
    //당첨자들의 인덱스를 저장할 배열
    int[] tmpIdx;//번호

  //  String[] successName;

  //실제 몇명의 참가자가 있는지
    int[] success;
//중복 검사를 위한 변수
    int nameLength;
    // 중복 검사를 위한 변수
    Boolean isRedundant;

    final int SUCCESS_MAX = 3;

    final int DATA_INT = 1;
    final int DATA_STRING = 2;


    //생성자 ==> 초기화
    public Roulette(String[] names) {//룰렛
        nameLength = names.length;
        isRedundant = true;

        nameLists = new ArrayList<String>();//다 호출해서 객체 생성
        tmpArr = new String[nameLength];
        tmpIdx = new int[nameLength];

        success = new int[SUCCESS_MAX];//3명을 뽑음
        // successName = new String[3];


        tmpArr = names; //아래코드보다 이게 더 편함,배열의 값이 그대로 저장됨
    }

        /*


        int i = 0;


       for (String name : names) {
            tmpArr[i++] = name;//tmpArr 배열에 이름을 넣어준다
        }
    }

         */
    //idx는 현재 할당받은 인덱스 값
        //b / a / a
        //        idx
        //0  1
        private Boolean checkDuplicate (int[] arr, int idx){ //중복 확인
            for (int i = 0; i < idx; i++) {
                if (arr[i] == arr[idx]) { //i와 tmpIdx의 번호 갯수가 맞으면 참
                    return true;
                }
            }

            return false;
        }

        public void doGemble () {
            checkDuplicateArr(tmpIdx);
            checkDuplicateArr(success);
            // printSuccessArr();
            printIntArr(tmpIdx);
            printStringArr(tmpArr);
            printIntArr(success);

            printWinner(); //!!
        }
        public void checkDuplicateArr (int[] arr) {
            int i = 0;

            isRedundant = true;

            do {
                arr[i] = (int)(Math.random() * nameLength);
                //success[i] = (int)(Math.random() * nameLength);

                if (checkDuplicate(arr, i)) {
                    continue;
                }

                i++;

                if (i == arr.length) {
                    isRedundant = false;
                }
            } while (isRedundant);
        }

        //셔플(카드 섞기랑 동일)
        public void shuffle () {
            int i = 0;

            isRedundant = true; //false로 시작해도 된다

            //중복 검사를 하며 각각에 모든 중복되지 않는 숫자(0~ 사람숫자 -1)를 할당함
            //현재는 shuffle() 메서드와
            do {
                tmpIdx[i] = (int) (Math.random() * nameLength); //이름을 랜덤으로 i에 넣어줌
                // 중복 검사
                if (checkDuplicate(tmpIdx, i)) { //중복이면 다시 랜덤값 할당
                    continue;
                }

                //중복이 아니라면 다음 인덱스에 랜덤값을 받기위해 인덱스 하나 증나
                i++;

                //전체 사람 숫자만큼 랜덤을 모두 할당했다면 더 이상 반복이 필요없으므로 루프 탈출
                if (i == nameLength) { //만약 이름갯수가..? i와 같으면 거짓
                    isRedundant = false; //즉 사람 숫자만큼 다 만들면 거짓
                }
            } while (isRedundant); //루프 탈출
        }

//리팩토링 대상
    public void checkSuccess() {
        int i = 0;

        isRedundant = true;

        do {
            success[i] = (int) (Math.random() * nameLength); //이름에서 랜덤을 당첨자에 넣어줌

            if (checkDuplicate(success, i)) { //중복 확인
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

    //public void printArr () { 이거보다 예쁘게 리팩토링 하려면면
       public void printIntArr (int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("tmp[%d] = %d\n", i, arr[i]);

                if ( i % 5 == 4) {
                    System.out.println();
                }
            }
           System.out.println();
        }

    // 문자열 출력 <<< 리팩토링 대상
    public void printArr () {
        for (int i = 0; i < nameLength; i++) {
            System.out.printf("tmpArr[%d] = %s\n", i, tmpArr[i]);
        }
    }

    public void printStringArr (String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %s   ", i, arr[i]);

            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // 아직 멀티 데이터 타입 처리하는 방식을 학습하지 않았기 때문에
    // String 타입의 배열, int 타입의 배열을 혼성하여 인자로 받을 수 없음
    public void printVariousArr (int[] arr, int option) {
        for (int i = 0; i < arr.length; i++) {
            if (option == DATA_INT) {
                System.out.printf("arr[%d] = %d\n", i, arr[i]);
            } else if (option == DATA_STRING) {
                System.out.printf("arr[%d] = %s\n", i, arr[i]);
            }

        }
    }

 /*   public void successName() {
        //당첨 숫자와 이름 배열에 있는 같은 숫자를 꺼내와야 할 것 같은데 어떻게 해야하는지 모르겠다
        for (int i = 0; i < )

    }
}


  */

    public void printWinner () {
        for (int i = 0; i < success.length; i++) {
            System.out.printf("당첨자의 이름은 = %s\n", tmpArr[tmpIdx[success[i]]]);
        }
    }

    @Override
    public String toString() { //toString은 자동완성 가능함. 객체의 정보 출력 사용
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';

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

        //여기서 첫번째 출력이 으아앙ㄱ으로 바뀐다는것은 객체(메모리)를 전달하면
        // 규칙이 불변함을 의미한다
        //(규칙:메모리는 원본이 전달, 값은 복제)
        names[0] = "으아아악";
        //r.printArr();

        System.out.println(r);

        /*
        r.shuffle();
        System.out.println(r);
        r.checkSuccess();
        r.printSuccessArr();
         */

        r.doGemble();

        System.out.println(r);
    }
}