import java.util.Scanner;

public class ChangeQuestionAnswerName {public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);

    int msum = 0;
    int psum = 0;

    System.out.println("주사위를 두 번 던져 총합이 높은 쪽이 승리하는 게임입니다.");
    for (int i = 1 ; i != 2; ) {

        int mydice1 = (int) (Math.random()*6 + 1);
        int mydice2 = (int) (Math.random()*6 + 1);
        // 오타 주의!
        System.out.println("당신의 첫 번째 주사위 결과는 "+mydice1);
        System.out.println("당신의 두 번째 주사위 결과는 "+mydice2);

        msum = mydice1 + mydice2;
        System.out.println("총 합은" + msum);
        Thread.sleep(300);

        int pcdice1 = (int) (Math.random()*6 + 1);
        int pcdice2 = (int) (Math.random()*6 + 1);
        System.out.println("컴퓨터의 첫 번째 주사위 결과는 "+pcdice1);
        System.out.println("컴퓨터의 두 번째 주사위 결과는 "+pcdice2);
        psum = pcdice1 + pcdice2;
        System.out.println("총 합은" + psum);
        Thread.sleep(300);

        if (msum > psum)  {
            System.out.println("당신의 승리입니다.");
        }else   {
            System.out.println("컴퓨터의 승리입니다.");
        }

        System.out.printf("한 번 더 하시겠으면 1, 종료는 2를 입력해주세요 : ");
        int a = scan.nextInt();
        if (a>1)    {
            i = 2;
        }


        // Q. 아마 다른 수강생들도 같은 질문을 하겠지만 결과값이 제대로 나오지 않는데
        //    어떻게 해야하나요?
        //    int형은 정수형으로 알고 있는데 값은 다르게 나옴
        //    그래서 내림 올림 등등을 쓰면 오히려 더 값이 더 튀어버림

    }
}
}
