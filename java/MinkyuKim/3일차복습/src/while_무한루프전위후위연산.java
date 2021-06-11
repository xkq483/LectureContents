public class while_무한루프전위후위연산 {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("i++은 다음 라인에서 연산이 진행됩니다.");
        while(i++ < 10) {
            System.out.println(i);

            i = 0;
            while(++i < 10) {
                System.out.println(i);
            }
            System.out.println("난 0부터 출력하고 싶다면");
            i = 0;
            while(i < 10) {
                System.out.println(i++);
            }
        }
    }
    }

    // 하나의 클래스안에 2개 이상의 psvm(public static void main(String[] args))을 사용할 수 있는지 궁금합니다.