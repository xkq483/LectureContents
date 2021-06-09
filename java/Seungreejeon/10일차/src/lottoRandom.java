import java.util.Arrays;
import java.util.Scanner;
//로또 번호는 총 4개입니다 중복값도 발생하며 범위는 1~9 입니다.
//메서드로 나눠서 작성

class lotto {
    private int[] com_lotto = new int[4];
    public int[] user_lotto = new int [4];
    private int cnt = 0;
    private int num;
    Scanner sc = new Scanner(System.in);

    //생성자
    lotto() {
        System.out.println("로또 번호는 총 4개입니다 중복값도 발생하며 범위는 1~9 입니다.");
    }

    //상품 메서드
    void prize() {
        for (int i = 0; i < user_lotto.length; i++) {
            if (user_lotto[i] == com_lotto[i]) {
                    cnt++;
            } else {}
        }
        switch (cnt) {
            case 0:
                System.out.println("꽝:");
                break;
            case 1:
                System.out.println("5만원");
                break;
            case 2:
                System.out.println("10만원");
                break;
            case 3:
                System.out.println("30만원");
                break;
            case 4:
                System.out.println("100만원!!");
                break;
        }

    }

    // 로또번호 추첨메서드
    void Com_lotto() {
        System.out.println("추첨 로또번호는 : ");
        for (int i = 0; i < com_lotto.length; i++) {
            com_lotto[i] = (int) (Math.random() * 9 + 1);
            System.out.printf(i+1 + "\t번째 번호는 = %d\n",com_lotto[i]);
        }
        System.out.println("이번 당첨 번호 입니다."+(Arrays.toString(com_lotto)));
    }

    //초기 번호 입력메서드
    void U_lottoChoose() {
        for (int i = 0; i < user_lotto.length; i++) {
            System.out.println("차례로 번호를 입력하세요");
            num = sc.nextInt();
            user_lotto[i] = num;
        }
        System.out.print("입력한번호 : ");
        for (int i = 0; i < user_lotto.length; i++) {
            System.out.printf("%d\t", user_lotto[i]);
        }
        System.out.println();
    }

    //번호 수정 질문 메서드
    void Lotto_while() {
        while (true) {
            System.out.println(Arrays.toString(user_lotto));
            System.out.println("번호를 수정하시겠습니까? (Y/N) : ");
            char Ans = sc.next().charAt(0);
            if (Ans == 'y' || Ans == 'Y') {
                Lotto_revise();
            } else if (Ans == 'n' || Ans == 'N') {
                System.out.println(Arrays.toString(user_lotto)+"당신의 번호입니다.");
                return;
            } else {
                System.out.println("정확한 값을 입력해주세요");
                continue;
            }
        }
    }
    //번호 수정 메서드
    void Lotto_revise() {
        while (true) {
            System.out.println("당신의 번호입니다.");
            System.out.println(Arrays.toString(user_lotto));
            System.out.print("바꿀 열의 번호 : ");
            int revise_row = sc.nextInt();
            if(revise_row > 0 )
            System.out.print("바꿀 번호 : ");
            int revise_num = sc.nextInt();
            user_lotto[revise_row-1] = revise_num;
            return;
        }
    }
}

public class lottoRandom {
    public static void main(String[] args) {
        lotto lo = new lotto();

        lo.U_lottoChoose();
        lo.Lotto_while();
        lo.Com_lotto();
        lo.prize();

    }
}
