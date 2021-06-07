class Fib {
    // 클래스로 작성해보려고 배열을 만들었습니다.
    int[] numArr;

    // 생성자를 만들었고
    public Fib () {
        // 여기서 배열을 사용하려고 하는데 오류가 나고 있습니다.
        // 오류가 왜 나는 걸까요 ?
        // 제가 작성한 코드는 아래와 같습니다.

        numArr[0] = 1;
        numArr[1] = 1;

        for (int i = 2; i < 10; i++) {
            numArr[i] = numArr[i - 2] + numArr[i - 1];
        }

        // 분명히 이전에는 잘 돌았던 코드 같은데 동작하지 않는 이유가 뭘까요 ?
    }
}

public class QuestionNotesSample {
    public static void main(String[] args) {
        // Quiz 40번을 풀고 있었는데
        // 우선 과거에 배웠던 형식으로 main 자체에 작성하는 것은 아래와 같이 작성하였습니다.
        // ~~~~~~~
        // ~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~

    }
}