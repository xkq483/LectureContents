public class ScopeVariableQuestionAnswer {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("안녕");
        }

        // i 변수는 for 문 내부에서만 사용할 수 있으므로 아래와 같이 사용이 불가하다!
        // System.out.println("i = " + i);

        int j = 0;  // 이렇게 for문 밖에서 변수를 지정해야 System.out.println("j = " + j); 까지 적용된다

        for ( j = 0; j < 3; j++) {   //여기에 있는 j변수는 아랫문장을 출력하기위한 톱니같은 느낌인 것같다
            System.out.println("하이");
        }

        System.out.println("j = " + j);
    }
}
