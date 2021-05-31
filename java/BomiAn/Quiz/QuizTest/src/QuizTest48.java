//뽑기 게임을 만들어보자!
//아래와 같은 클래스룸 멤버들의 이름을 적어놓고 문제를 풀어보자!
//중복이 발생하지 않게 랜덤한 배열에 사람 이름을 무작위로 믹스한다.
//그리고 당첨자 번호를 3개 뽑도록 한다(마찬가지로 중복 x)
//당첨된 사람의 이름을 출력하고 "당첨되셨습니다. 누구 누구 누구 축하합니다 ^^" 를 출력하자!


// **********************************************************
// 중복을 제거하고 담첨자로서 이름 배열을 출력하고 상수를 final로 변수설정까지 마쳤습니다!
// 이름 배열 출력할 때 저는 for문을 이용해서 tmpArr[success[i]] 이런식으로 출력했는데 되더라고요
// 이렇게 해도 되는 건지 궁금합니다.

import java.util.ArrayList;
import java.util.Arrays;

class Roulette {
    final int MAX_NUMBER = 3;
    String[] tmpArr;
    int[] tmpIdx;
    int[] success;

    int nameLength;
    Boolean isRedundant;

    public Roulette (String[] names) {
        nameLength = names.length;
        isRedundant = true;

        tmpArr = new String[nameLength];
        tmpIdx = new int[nameLength];

        success = new int[MAX_NUMBER];

        int i = 0;

        for (String name : names) {
            tmpArr[i++] = name;
        }
    }

    private Boolean checkDuplicate (int idx, int[] randArr) {
        for (int i = 0; i < idx; i++) {
            if (randArr[i] == randArr[idx]) {
                return true;
            }
        }
        return false;
    }

    public void multiRemoveDuplicate(int[] randArr, int range) {
        int i = 0;

        isRedundant = true;

        do {
            randArr[i] = (int)(Math.random() * nameLength);

            if (checkDuplicate(i, randArr)) {
                continue;
            }

            i++;

            if (i == range) {
                isRedundant = false;
            }

        } while (isRedundant);
    }

    public void shuffle () {
        multiRemoveDuplicate(tmpIdx, nameLength);
    }

    public void checkSuccess () {
        multiRemoveDuplicate(success, MAX_NUMBER);
    }

    public void printSuccessArr () {
        for (int i = 0; i < 3; i++) {
            System.out.printf("success[%d] = %d\n", i, success[i]);
        }
    }

    public void printResult() throws InterruptedException {
        shuffle();
        checkSuccess();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.println( i + 1 + "번째 주인공~! "+tmpArr[tmpIdx[success[i]]] + "님 축하합니다. 당첨되셨습니다.^^ ");
        }

    }

    @Override
    public String toString() {
        return "Roulette{" +
                "tmpIdx=" + Arrays.toString(tmpIdx) +
                '}';
    }
}

public class QuizTest48 {
    public static void main(String[] args) throws InterruptedException {
        String[] names = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };

        Roulette r = new Roulette(names);

        System.out.println("두구두구두구~ 당첨자를 공개합니다~~!!!!");


        r.printResult();
    }
}

