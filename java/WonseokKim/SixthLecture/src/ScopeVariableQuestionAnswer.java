public class ScopeVariableQuestionAnswer {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("안녕");
        }

        // i 변수는 for 문 내부에서만 사용할 수 있으므로 아래와 같이 사용이 불가하다!
        // System.out.println("i = " + i);

        int j;

        for (j = 0; j < 3; j++) {
            System.out.println("하이");
        }

        System.out.println("j = " + j);
    }
}
