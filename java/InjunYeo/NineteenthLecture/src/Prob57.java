// 같은 문양의 숫자가 연속되게 3개 나오는 경우(예 9 8 7) > 서로 다른 문양의 같은 숫자
// 서로 다른 문양의 같은 숫자                         > 서로 다른 문양의 숫자가 연속되게 3개 나옴
// 서로 다른 문양의 숫자가 연속되게 3개 나옴            > 서로 같은 문양이 3개 나옴
// 무기간 상성이 존재한다고 가정한다(가위 바위 보처럼)
// 만약 서로 같은 문양의 숫자가 연속되게 나오는 케이스에서
// 창 987과 검 987 활 987 경우가 우연치않게 나왔다면 아래 상성을 따른다.
// 창 > 검
// 검 > 활
// 활 > 창
// 또한 창 987 vs 창 654는 큰 숫자로 구성된 쪽이 이겨야한다.

import java.util.HashMap;
import java.util.Map;

// 컴퓨터와 사용자가 있음
class ThreePoker {

    final int PATTERN_MAX = 3;  //패턴개수
    final int CARD_MAX = 10;    //카드개수
    final int DISTRIBUTED_CARD_NUM = 4; //나눠줄 카드개수

    final int USER = 1024;  //유저식별번호
    final int COMPUTER = 2048;  //컴퓨터 식별번호

    private Map<String, Map<String, Integer>> map;  //해쉬맵으로 키로 문자열,밸류로 해쉬맵을 가짐(전체카드를 담을배열)
    private Map<String, Integer>[] preparedMap; //해쉬맵을 담은 배열로 해쉬맵은 문자열과 숫자를가짐(패턴 카드들을 각각 담을배열)
    private String[] pattern = {"spear", "sword", "arrow"}; //패턴들을 담은 문자열 배열

    private int[][] dupNumArrCheck; //중복숫자체크배열?

    private int[][] usrCard;    //유저가 가진카드 배열
    private int[][] comCard;    //컴퓨터가 가진카드 배열

    public ThreePoker () {  //생성자
        map = new HashMap<String, Map<String, Integer>>();  //해쉬맵 (문자열,해쉬맵)초기화
        preparedMap = new HashMap[PATTERN_MAX]; //해쉬맵배열공간을 패턴숫자만큼 지정

        dupNumArrCheck = new int[PATTERN_MAX][CARD_MAX];    //중복숫자카드 배열[패턴숫자][카드숫자]로 초기화

        usrCard = new int[PATTERN_MAX][DISTRIBUTED_CARD_NUM];   //유저카드배열 [패턴숫자][나눠줄카드개수] 초기화
        comCard = new int[PATTERN_MAX][DISTRIBUTED_CARD_NUM];   //컴퓨터카드배열 [패턴숫자][나눠줄카드 개수] 초기화

        for (int i = 0; i < PATTERN_MAX; i++) { //패턴숫자만큼(3)만큼 루프
            preparedMap[i] = new HashMap<String, Integer>();    //총카드배열(해쉬맵배열)에 순차적으로 해쉬맵을 할당

            //문양한개당 카드숫자0~9까지 넣는작업)
            for (int j = 0; j < CARD_MAX; j++) {    //이중for문으로 카드숫자(10번)만큼 루프
                preparedMap[i].put(pattern[i] + j, j);  //총카드배열[i]번째당 패턴이름을[i]카드숫자(j)를 붙여 키값,카드숫자로(j)로 밸류값으로 넣음
            }


            for (int k = 0; k < DISTRIBUTED_CARD_NUM; k++) { //이중 for문으로 나눠주는 카드숫자만큼(4번)루프
                usrCard[i][k] = -1; //유저카드에 [3][4]이중배열에 모두 -1만큼 할당
                comCard[i][k] = -1; //컴퓨터 카드에 [3][4]이중배열에 모두 -1만큼 할당
            }
        }

        for (int i = 0; i < PATTERN_MAX; i++) { //패턴숫자만큼(3)번만큼 반복
            map.put(pattern[i], preparedMap[i]);    //전체카드를 담을 배열에 [각각의패턴][패턴마다 카드10장씩들어있는 맵]을 담음
        }
    }

    //전체카드를 출력
    public void printMap () {
        System.out.println(map);
    }

    //복사확인 메소드 불리언값을 리턴
    public static Boolean checkDuplicate (  //입력값으로 int,int,int이중배열을 받음
            int patternIdx, int randNum, int[][] randCheckArr) {

        if (randCheckArr[patternIdx][randNum] > 0) {
            return true;    //만약 이중배열안의값이 0보다크면 트루반환
        }

        return false;   //그렇지않다면 false반환
    }

    //카드나눠주는 메소드
    public void distributeCard (int[][] arr, int identity) {    //이중배열과 인식번호를 인자값으로 받음
        String sculpture;   //지역변수로 패턴을표시할 변수를받음
        int sculptureIdx;   //지역변수로 패턴의인덱스를 받음
        int randNum;    //지역변수로 할당받은값을 받음

        int cnt = 0;    //지역변수로 카운트할 변수로 받음

        for (int i = 0; i < 4; i++) {   //4번만큼 루프
            do {    //do while문
                // 중복되는 숫자를 체킹하는 코드가 필요합니다:
                // 56번에서는 중복체킹하는것을 추가로 처리하여
                // 57번 문제를 풀어보도록 합시다!
                sculptureIdx = (int) (Math.random() * 3);   //문양인덱스는 랜덤값으로 할당받음
                randNum = (int) (Math.random() * 10);       //번호를 랜덤값으로 할당받음
            } while (checkDuplicate(sculptureIdx, randNum, dupNumArrCheck));    //중복확인인덱스돌림 중복이 아니라면 다음진행

            sculpture = pattern[sculptureIdx];  //sculpture에 랜덤값으로 받은인덱스를 패턴인덱스에 대입해서 할당
            dupNumArrCheck[sculptureIdx][randNum]++;    //중복확인 인덱스에[랜덤문양값][할당받은번호]++해서 1으로 해준다.(중복확인배열은0 유저,컴터카드배열은-1)
            arr[sculptureIdx][cnt++] = randNum;     //매개변수로 받은 이중어레이에 [랜덤문양값][카운트숫자(카드뽑은순서)] 에 뽑은 숫자할당

            //고유번호로 유저식별
            if (identity == USER) {
                System.out.print("사용자");
            } else if (identity == COMPUTER) {
                System.out.print("컴퓨터");
            }

            System.out.println("에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum + " 카드입니다!");
        }
    }

    private Boolean checkTrippleWeapon (int[][] arr, int identity) {
        // 1. 문양도 일치해야하고
        // 2. 숫자가 연속되어야함
        if (!checkTripplePattern(arr, identity)) {
            return false;
        }   //조건이 맞다면 false를 리턴 아니라면 넘어감

        // 1번이 검사 완료되었으므로 2번만 검사하면 된다.
        // 이 부분은 연속된 숫자를 검사하는 부분으로
        // checkTripplePattern() 부분을 작업하면 결과를 바로 얻을 수 있음
        if (!checkTrippleHarmonic(arr, identity)) {
            return false;
        }   //조건이 맞다면 false를 리턴 아니라면 넘어감

        return true;
    }

    /* 아래 두 가지를 완성하면 자동으로 checkTrippleWeapon()은 완성이됩니다. */
    private Boolean checkTrippleNumber (int[][] arr, int identity) {
        return false;
    }
    private Boolean checkTrippleHarmonic (int[][] arr, int identity) {
        return false;
    }
    //같은패턴인지 확인하는 메서드
    private Boolean checkTripplePattern (int[][] arr, int identity) {   //숫자배열과 정수를 입력값으로받음
        // 1. 전체를 순회하며 처음 나오는 값을 찾는다.
        // 2. 처음 나오는 값의 숫자와 패턴을 파악한다.
        // 3. 같은 패턴이 3개 존재하는지 검사한다.

        // 4. 만약 조건이 달성되지 않는다면 다시 2번째 값으로 위 작업을 반복한다.
        // 5. 2번째 값에서 판정이 되지 않았다면 다음을 검사할 필요가 없다!

        // ex) 창, 검, 활, 검
        // ex) 창, 검, 검, 검
        // ex) 활, 창, 활, 활
        // ex) 활, 창, 검, 활
        // ex) 창, 활, 창, 창
        int[] savedRow = new int[DISTRIBUTED_CARD_NUM]; //savedRow라는 숫자배열에 나눠주는카드만큼 배열을만듬(4개)
        int rowCnt = 0;

        int[] savedCol = new int[DISTRIBUTED_CARD_NUM]; //savedCol이라는 숫자배열에 나눠주는 카드만큼 배열을만듬(4개)
        int colCnt = 0;

        //유저식별정보
        if (identity == USER) {
            System.out.println("사용자 데이터입니다.");
        } else if (identity == COMPUTER) {
            System.out.println("컴퓨터 데이터입니다.");
        }

        // 가만 보니 숫자 0이 들어가서 0 과 0이 같아서 구별이 안되는 문제도 있고
        // 조건이 0 보다 큰 것으로 잡아놨는데 0이니까 식별 자체를 안하는 문제가 겹쳤었음

        //  [0]  [1]  [2]  [3]
        // --------------------
        // | 0 | -1 | -1 | -1 |   [0] spear
        // --------------------
        // | -1 | 5 | -1 | -1 |   [1] sword
        // --------------------
        // | 2 | -1 | -1 | 1  |   [2] arrow
        // --------------------

        // savedRow | 0 | 1 | 2 | 2 |
        // savedCol | 7 | 7 | 0 | 3 |

        for (int i = 0; i < PATTERN_MAX; i++) { //for문이 패턴숫자만큼(3)돌아감
            for (int j = 0; j < DISTRIBUTED_CARD_NUM; j++) {    //각패턴을돌면서 나눠주는카드숫자(4)만큼 돌아감
                // 주의해야할 것이 arr에 1, 0으로 값이 있다 없다가 아니라
                // 실제 셋팅된 값 자체가 배치되어 있다!
                // 그러므로 실제 사용하는 숫자 0이 들어간 경우 문제가 발생할 수 있음
                if (arr[i][j] != -1) {  //입력받은배열의 [i][j]가 -1이 아니라면 [(3][4]배열을 차례대로 순회함) 아래조건실행
                    savedRow[rowCnt++] = i; //숫자가존재하는 행에 행값을 저장
                    savedCol[colCnt++] = j; //숫자가존재하는 열에 열값을 저장
                }
            }
        }

        int patternCnt = 0; //패턴카운트 0
        int secondaryPatternCnt = 0;    //두번째패턴카운트 0

        // savedRow | 0 | 1 | 2 | 2 |
        for (int i = 0; i < DISTRIBUTED_CARD_NUM; i++) {  //for문4번실행 위에서 저장된 row를 순차적으로 도는 for문
            if (savedRow[0] == savedRow[i]) {   //처음저장된 row값이 순회하는i값과 같다면 patternCnt를 플러스
                patternCnt++;
            }
            if (savedRow[1] == savedRow[i]) {   //두번째 row값이 순회하는 i값과 같다면 두번째 패턴카운트를 플러스
                secondaryPatternCnt++;
            }
        }

        System.out.println(pattern[savedRow[0]]);
        System.out.println("첫 번째 패턴과 일치하는 개수 = " + patternCnt);
        System.out.println(pattern[savedRow[1]]);
        System.out.println("두 번째 패턴과 일치하는 개수 = " + secondaryPatternCnt);

        if (patternCnt >= 3 || secondaryPatternCnt >= 3) {  //그리고 처음패턴카운트가 3이상이거나 두번째 패턴카운트가 3이상이면 true반환
            System.out.println("동일한 패턴 3개 이상 검출되었습니다!");
            return true;
        }

        return false;   //그렇지 않다면 false반환
    }

    //각각의 승리공식을 확인하는 메소드
    private String checkPattern (int[][] arr, int identity) {
        // 현재 케이스에서 바로 일반화를 적용하기는 어려움
        // 그러므로 각각의 패턴들에 대한 검사를 항목별로 만들어준다.
        if (checkTrippleWeapon(arr, identity)) {
            return "TrippleWeapon";
        } else if (checkTrippleNumber(arr, identity)) {
            return "TrippleNumber";
        } else if (checkTrippleHarmonic(arr, identity)) {
            return "TrippleHarmonic";
        } else if (checkTripplePattern(arr, identity)) {
            return "TripplePattern";
        } else {
            return "Bang";
        }
    }

    // 먼저 승리 패턴에 대한 분석이 필요함
    // 1. 같은 문양의 연속된 숫자 3개       - 트리플 웨폰(TrippleWeapon)
    // 2. 서로 다른 문양의 같은 숫자        - 트리플 넘버(TrippleNumber)
    // 3. 서로 다른 문양 + 연속된 숫자 3개  - 트리플 하모닉(TrippleHarmonic)
    // 4. 서로 같은 문양                  - 트리플 패턴(TripplePattern)
    // 5. 아무것도 아님                   - 꽝(Bang)

    //승자확인메소드,인자값으로 유저카드와 컴퓨터카드를 넣고 어떤승리조건인지확인
    public void checkWinner () {
        // 1. String 값으로 각각의 패를 가져오도록 한다.
        String usr = checkPattern(usrCard, USER);
        String com = checkPattern(comCard, COMPUTER);

        System.out.println("사용자 패 검사: " + usr);
        System.out.println("컴퓨터 패 검사: " + com);
    }

    //게임하는 메소드 카드ㅏ눠주고 승리조건확인
    public void playGame () {
        Boolean wantContinue = false;

        do {
            distributeCard(usrCard, USER);
            System.out.println("------------------절취선------------------");
            distributeCard(comCard, COMPUTER);
            printArr(usrCard, USER);
            System.out.println("------------------절취선------------------");
            printArr(comCard, COMPUTER);
            checkWinner();
        } while (wantContinue);
    }

    //유저카드정보와 컴퓨터 카드정보 확인하는 메소드
    public void printArr (int[][] distArr, int identity) {
        if (identity == USER) {
            System.out.println("사용자");
        } else if (identity == COMPUTER) {
            System.out.println("컴퓨터");
        }

        for (int i = 0; i < PATTERN_MAX; i++) {
            for (int j = 0; j < DISTRIBUTED_CARD_NUM; j++) {
                System.out.printf("distArr[%d][%d] = %3d ", i, j, distArr[i][j]);
            }
            System.out.println();
        }
    }
}

public class Prob57 {
    public static void main(String[] args) {
        ThreePoker tp = new ThreePoker();

        tp.playGame();

        // 여러분들이 알고 있는 수학의 그 파이가 맞습니다.
        System.out.println("원주율 PI = " + Math.PI);
    }
}
