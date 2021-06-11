//48. ArrayList 문제
//        뽑기 게임을 만들어보자!
//        아래와 같은 클래스룸 멤버들의 이름을 적어놓고 문제를 풀어보자!
//
//        String[] name = {
//        박세진, 김창욱, 김민규, 김중연, 문성호,
//        강병화, 최승현, 유종현, 한상우, 전승리,
//        이경환, 최준환, 김원석, 여인준, 이태양,
//        김윤영, 정도영, 황정아, 임초롱, 김남교,
//        이주형, 김도연, 최혜주, 김도혜, 고재권,
//        임익환, 안보미, 이상훈
//        };
//
//        중복이 발생하지 않게 랜덤한 배열에 사람 이름을 무작위로 믹스한다.
//        그리고 당첨자 번호를 3개 뽑도록 한다(마찬가지로 중복 x)
//        당첨된 사람의 이름을 출력하고 "당첨되셨습니다. 누구 누구 누구 축하합니다 ^^" 를 출력하자!

import java.util.ArrayList;
import java.util.Arrays;

// ArrayList : 배열의 사이즈 지정 X / 메모리 불연속 배치 / 속도 느림
//일반 Array : 배열의 사이즈 지정 O /  메모리 연속 배치 / 속도 빠름

class Roulette { // 룰렛이라는 인스턴스 생성
    ArrayList<String> nameLists; // String타입인 ArrayList. nameLists(이름목록)
    String[] tmpArr; // String배열타입인 tmpArr(배열빈공간)
    int[] tmpIdx; // int배열타입인 tmpIdx(인덱스빈공간)

    int[] success; // int 배열타입인  success(당첨자)

    int nameLength; // 룰렛 인스턴스의 int타입 인스턴스 변수(개별적속성) nameLength(names(배열)의 길이(순서번호))
    Boolean isRedundant; // 룰렛 인스턴스의 boolean타입 인스턴스 변수(개별적속성) isRedundant(중복) // 불린을 사용해 중복을 거른다는 뜻 같다.

    // 룰렛이라는 public(접근제한X) 메서드 생성
    public Roulette (String[] names) { // 메서드 선언부 (반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
                                       // 반환타입 = ????? / 메서드이름 = Roulette / 타입 = String배열 / 변수명 = names

        nameLength = names.length;     // nameLength는 names(배열)의 길이(순서번호)
        isRedundant = true;            // isRedundant가 참이어야한다.

        //객체 생성
        nameLists = new ArrayList<String>(); // String타입 ArrayList를 nameList안에 담기
        tmpArr = new String[nameLength]; // nameLength인 String배열을 tmpArr안에 담기
        tmpIdx = new int[nameLength]; // nameLength인 int배열을 tmpIdx안에 담기

        success = new int[3]; // 당첨자는 배열의 길이 3(개)=([0],[1],[2])

        int i = 0; // i는 0부터

        for (String name : names) { // 문자열 name = names이다? 콜론 해석 맞나요?
            tmpArr[i++] = name; // tmpArr배열의 변수 i는 1씩 증가, i에 name(names)담기
        }
    }

    // 체크더플리케이트(중복확인)라는 private(접근제한O) 메서드 생성
    private Boolean checkDuplicate (int idx) { // 메서드 선언부 (반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
                                               // 반환타입 = Boolean / 메서드이름 = checkDuplicate / 타입 = int / 변수명 = idx

    //  for (초기화 ; 조건식 ; 증감식)
        for (int i = 0; i < idx; i++) { // i는 0부터 시작, i는 idx보다 작고, i는 1씩 증가
            if (tmpIdx[i] == tmpIdx[idx]) { // 변수가 i인 tmpIdx배열(좌항)과 변수가 idx인 tmpIdx배열(우항)이 같은지 비교했을 때
                return true; // 참이면 증감식 진행
            }
        }

        return false; // 거짓이면 되돌아간다
    }

    // 셔플이라는 public(접근제한X) 메서드 생성
    public void shuffle () { // 메서드 선언부 (반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
                             // 반환타입 = void(입력OR출력없음,return안붙여도됨) / 메서드이름 = shuffle / 타입 = 지정x / 변수명 = 지정x

        int i = 0; // i는 0부터

        isRedundant = true; // isRedundant는 참이어야한다.??

        do {
            tmpIdx[i] = (int)(Math.random() * nameLength);
            // 변수가 i인 tmpIdx배열의 nameLength(names(배열)의 index)를 랜덤값으로 나오게한다.

            if (checkDuplicate(i)) {
                continue; // checkDuplicate(i)가 참이면 반복 계속
            }

            i++; // i를 1씩 증가

            if (i == nameLength) { // i(좌항)와 nameLength(우항)이 같은지 비교
                isRedundant = false; // isRedundant는 거짓
            }
        } while (isRedundant); // ???
    }

    // 체크석세스라는 public(접근제한X) 메서드 생성
    public void checkSuccess () { // 메서드 선언부 (반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
            // 반환타입 = void(입력OR출력없음,return안붙여도됨) / 메서드이름 = checkSuccess / 타입 = 지정x / 변수명 = 지정x

        int i = 0; // i는 0부터

        isRedundant = true; // isRedundant는 참이어야한다.

        do { // 변수가 i인 success배열의 nameLength(names(배열)의 index)를 랜덤값으로 나오게한다.
            success[i] = (int)(Math.random() * nameLength);

            if (checkDuplicate(i)) {
                continue; // checkDuplicate(i)가 참이면 반복 계속
            }

            i++; // i를 1씩 증가

            if (i == 3) { // i(좌항)와 3(우항)이 같은지 비교
                isRedundant = false; // isRedundant는 거짓
            }
        } while (isRedundant); // ???
    }

    // 프린트석세스어레이라는 public(접근제한X) 메서드 생성
    public void printSuccessArr () { // 메서드 선언부 (반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
        // 반환타입 = void(입력OR출력없음,return안붙여도됨) / 메서드이름 = printSuccessArr / 타입 = 지정x / 변수명 = 지정x

        for (int i = 0; i < 3; i++) { // i는 0부터 시작, i는 3보다 작고, i는 1씩 증가
            System.out.printf("success[%d] = %d\n", i, success[i]); //
        }
    }

    @Override // : 덮어쓰다, 상속받은 메서드의 내용을 변경

    // toString이라는 public(접근제한X) 메서드 생성
    public String toString() { // 메서드 선언부 (반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
                               // 반환타입 = String / 메서드이름 = toString / 타입 = 지정x / 변수명 = 지정x

        return "Roulette{" + "tmpIdx=" + Arrays.toString(tmpIdx) + '}';
        // 해석어떻게 하나요? 변수가 tmpIdx인 투스트링배열은 되돌아가라?
    }
}

public class Prob48 {
    public static void main(String[] args) { // 메인메서드
        String[] names = { // 변수가 names인 String타입배열
                "박세진", "김창욱", "김민규", "김중연", "문성호", // 배열의 요소(element) 나열
        // index   0        1        2        3       4
                "강병화", "최승현", "유종현", "한상우", "전승리",
        // index   5        6        7        8       9
                "이경환", "최준환", "김원석", "여인준", "이태양",
        // index   10      11       12       13       14
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
        // index   15      16       17       18       19
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
        // index   20      21       22       23       24
                "임익환", "안보미", "이상훈"
        // index   25      26       27
        };

        // 객체 생성
        Roulette r = new Roulette(names); // 변수가 names인 Roulette(위에 만들어놓은 메서드)을 r안에 담기?

        System.out.println(r); // = "Roulette{" + "tmpIdx=" + Arrays.toString(tmpIdx) + '}';
                               // toString메서드가 호출되는 이유가 뭔가요?
        // 출력결과 = Roulette{tmpIdx=[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]}

        r.shuffle(); // Roulette인스턴스의 메서드 shuffle()을 호출 - [배열의 인덱스]가 중복없이 랜덤값나오게 하는 기능

        System.out.println(r);  // = "Roulette{" + "tmpIdx=" + Arrays.toString(r) + '}';
        // 출력결과 = Roulette{tmpIdx=[24, 19, 5, 2, 23, 11, 15, 18, 1, 3, 27, 12, 4, 26, 25, 16, 14, 0, 21, 10, 17, 6, 22, 13, 20, 9, 7, 8]}


        r.checkSuccess(); // Roulette인스턴스의 메서드 checkSuccess()를 호출 - [배열의 변수이름]이 중복없이 3개의 랜덤값나오게 하는 기능
        r.printSuccessArr(); // Roulette인스턴스의 메서드 printSuccessArr()를 호출 - 변수 i인 당첨자를 3개 출력하는 기능
                             // System.out.printf("success[%d] = %d\n", i, success[i]);
        // 출력결과 = success[0] = 6
        //          success[1] = 27
        //          success[2] = 3
    }
}