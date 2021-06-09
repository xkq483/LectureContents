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
    final int PATTERN_MAX = 3;
    final int CARD_MAX = 10;
    final int DISTRIBUTED_CARD_NUM = 4;

    final int USER = 1024;
    final int COMPUTER = 2048;

    private Map<String, Map<String, Integer>> map; //<문양, preparemap<문양,0~9번> >
    private Map<String, Integer>[] preparedMap; // map안에 value값에 넣기위한 준비 맵
    private String[] pattern = {"spear", "sword", "arrow"}; //패턴

    private int[][] dupNumArrCheck;

    private int[][] usrCard;
    private int[][] comCard;

    public ThreePoker() { //생성자 = 초기화
        map = new HashMap<String, Map<String, Integer>>();
        preparedMap = new HashMap[PATTERN_MAX]; //HashMap 배열 수 초기화

        dupNumArrCheck = new int[PATTERN_MAX][CARD_MAX]; // 중복체크용 더미

        usrCard = new int[PATTERN_MAX][DISTRIBUTED_CARD_NUM]; //유저 카드
        comCard = new int[PATTERN_MAX][DISTRIBUTED_CARD_NUM]; //컴퓨터 카드

        for (int i = 0; i < PATTERN_MAX; i++) {
            preparedMap[i] = new HashMap<String, Integer>(); //객체생성

            for (int j = 0; j < CARD_MAX; j++) { //생성된 객체마다 0~9번 카드 초기화
                preparedMap[i].put(pattern[i] + j, j);
            }

            for (int k = 0; k < DISTRIBUTED_CARD_NUM; k++) { //나중에 숫자 0으로인식 못함을 방지
                usrCard[i][k] = -1;
                comCard[i][k] = -1;
            }
        }

        for (int i = 0; i < PATTERN_MAX; i++) {
            map.put(pattern[i], preparedMap[i]); //마지막으로 완성한 prepared맵을 최종 맵에 key,value로 초기화
        }
    }

    public void printMap() {
        System.out.println(map);
    }

    public static Boolean checkDuplicate( //중복체크
                                          int patternIdx, int randNum, int[][] randCheckArr) {

        if (randCheckArr[patternIdx][randNum] > 0) { //더미배열은 모든배열 = 0, 0이 아니면 중복 -> true
            return true;
        }

        return false;
    }

    public void distributeCard(int[][] arr, int identity) { //카드 분배
        String sculpture;
        int sculptureIdx;
        int randNum;

        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            do {
                // 중복되는 숫자를 체킹하는 코드가 필요합니다:
                // 56번에서는 중복체킹하는것을 추가로 처리하여
                // 57번 문제를 풀어보도록 합시다!
                sculptureIdx = (int) (Math.random() * 3); //문양 0~2 spear,sword,arrow 순서
                randNum = (int) (Math.random() * 10); //랜덤번호
            } while (checkDuplicate(sculptureIdx, randNum, dupNumArrCheck)); //문양인덱스, 번호, 중복체크용 배열

            sculpture = pattern[sculptureIdx];// 인덱스 값 String으로 변환

            dupNumArrCheck[sculptureIdx][randNum]++; // 중복체크 완료 배열에 체크표시 1
            arr[sculptureIdx][cnt++] = randNum; // -1로 된 배열에 순차적으로 랜덤값 표시

            if (identity == USER) {
                System.out.print("사용자");
            } else if (identity == COMPUTER) {
                System.out.print("컴퓨터");
            }

            System.out.println("에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum + " 카드입니다!");
        }
    }

    private Boolean checkTrippleWeapon(int[][] arr, int identity) {
        // 1. 문양도 일치해야하고
        // 2. 숫자가 연속되어야함
        if (!checkTripplePattern(arr, identity)) {
            return false;
        }

        // 1번이 검사 완료되었으므로 2번만 검사하면 된다.
        // 이 부분은 연속된 숫자를 검사하는 부분으로
        // checkTripplePattern() 부분을 작업하면 결과를 바로 얻을 수 있음
        if (!checkTrippleHarmonic(arr, identity)) {
            return false;
        }

        return true;
    }

    /* 아래 두 가지를 완성하면 자동으로 checkTrippleWeapon()은 완성이됩니다. */
    private Boolean checkTrippleNumber(int[][] arr, int identity) {
        return false;
    }

    private Boolean checkTrippleHarmonic(int[][] arr, int identity) {
        return false;
    }

    private Boolean checkTripplePattern(int[][] arr, int identity) { //문양 체크 3개면 참

        int[] savedRow = new int[DISTRIBUTED_CARD_NUM]; //열 중복체크
        int rowCnt = 0;

        int[] savedCol = new int[DISTRIBUTED_CARD_NUM]; // 행 중복체크
        int colCnt = 0;

        if (identity == USER) { // 혼동방지용
            System.out.println("사용자 데이터입니다.");
        } else if (identity == COMPUTER) {
            System.out.println("컴퓨터 데이터입니다.");
        }
        for (int i = 0; i < PATTERN_MAX; i++) {
            for (int j = 0; j < DISTRIBUTED_CARD_NUM; j++) { //패턴마다 0~9번 중복체크 (행값 = 문양 열값 = 숫자) -> 열값으로 스트레이트 검사 가능
                if (arr[i][j] != -1) {
                    savedCol[colCnt++] = i;
                    savedRow[rowCnt++] = j;
                }
            }
        }

        int patternCnt = 0;
        int secondaryPatternCnt = 0;

        for (int i = 0; i < DISTRIBUTED_CARD_NUM; i++) { //위 for문에서 중복된 행 값으로 카운트
            if (savedCol[0] == savedCol[i]) {
                patternCnt++;
            }
            if (savedCol[1] == savedCol[i]) {
                secondaryPatternCnt++;
            }
        }

        System.out.println(pattern[savedCol[0]]);
        System.out.println("첫 번째 패턴과 일치하는 개수 = " + patternCnt);
        System.out.println(pattern[savedCol[1]]);
        System.out.println("두 번째 패턴과 일치하는 개수 = " + secondaryPatternCnt);

        if (patternCnt >= 3 || secondaryPatternCnt >= 3) {
            System.out.println("동일한 패턴 3개 이상 검출되었습니다!");
            return true;
        }

        return false;
    }


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
    public void checkWinner () {
        // 1. String 값으로 각각의 패를 가져오도록 한다.
        String usr = checkPattern(usrCard, USER);
        String com = checkPattern(comCard, COMPUTER);

        System.out.println("사용자 패 검사: " + usr);
        System.out.println("컴퓨터 패 검사: " + com);
    }

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

public class Prob56 {
    public static void main(String[] args) {
        ThreePoker tp = new ThreePoker();

        tp.playGame();

        // 여러분들이 알고 있는 수학의 그 파이가 맞습니다.
        System.out.println("원주율 PI = " + Math.PI);
    }
}