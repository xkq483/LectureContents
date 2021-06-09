import java.util.Scanner;

class loadman{
    //체력 설정하고 컴퓨터와 주사위로 게임 주사위 눈이 더블시 두배
    int com_Hp;
    int user_Hp;
    private int randNum;
    Scanner sc = new Scanner(System.in);
    int num;

    //생성자
    public loadman() {
        Emoji();
        Hp_Setting();
        LoadGame();
    }
    // 반복문
    public void LoadGame() {
        while (true) {
            if (com_Hp <= 0) {
                System.out.println("컴퓨터가 졌어요");
                break;
            } else if (user_Hp <= 0) {
                System.out.println("유저가 졌어요");
                break;
            } else {
                System.out.println("진행하려면 아무키나 입력 : ");
                String num = sc.nextLine();
                Com_Attack();
                System.out.println("진행하려면 아무키나 입력 : ");
                String num1 = sc.nextLine();
                User_Attack();
            }
        }

    }
    //컴퓨터 공격
    public void Com_Attack() {
        System.out.printf("컴퓨터의 공격턴 \n");
        int com_Attack1 = ranDom_num();
        int com_Attack2 = ranDom_num();
        System.out.printf("첫번째 숫    자 : %d , 두번쨰 숫자 : %d\n", com_Attack1,com_Attack2);
        if (com_Attack1 == com_Attack2) {
            System.out.println("*****데미지 두배***** : "+ (com_Attack1+com_Attack2)*2);
            user_Hp -= (com_Attack1 + com_Attack2) * 2;
            System.out.println("유저의 남은체력 : "+user_Hp);
        } else {
            user_Hp -= (com_Attack1+com_Attack2);
            System.out.println("유저의 남은체력 : "+user_Hp);
        }
        Motion_C();
    }
    //유저 공격
    public void User_Attack() {
        System.out.println("유저의 공격턴 ");
        int user_Attack1 = ranDom_num();
        int user_Attack2 = ranDom_num();
        System.out.printf("첫번째 숫자 : %d, 두번쨰 숫자 : %d\n", user_Attack1,user_Attack2);
        if (user_Attack1 == user_Attack2) {
            System.out.printf("*****데미지 두배***** : %d\n",(user_Attack1 + user_Attack2)*2);
            com_Hp -= (user_Attack1 + user_Attack2) * 2;
            System.out.println("컴퓨터의 남은체력 : "+com_Hp);
        } else {
            com_Hp -= (user_Attack1+user_Attack2);
            System.out.println("컴퓨터의 남은체력 : "+com_Hp);
        }
        Motion_U();
    }
    //체력 설정하기
    public void Hp_Setting() {
        System.out.println("컴퓨터 체력 설정하기 : ");
        com_Hp = sc.nextInt();
        System.out.println("사람 체력 설정하기 : ");
        user_Hp = sc.nextInt();
    }
    //랜덤 주사위
    int ranDom_num() {
        randNum = (int) (Math.random() * 6 + 1);
        return randNum;
    }

    public void Motion_C() {
        if (num == 1) {
            System.out.println("༼ຈل͜ຈ༽▬▬ι═══════ﺤ (Ծ؁Ծ);;;");
        } else if (num == 2) {
            System.out.println("༼ຈل͜ຈ༽▬▬ι═══════ﺤ (*ﾟ∀ﾟ);;;");
        } else {
            System.out.println("༼ຈل͜ຈ༽▬▬ι═══════ﺤ (^ ∀ ^);;;");
        }

    }

    public void Motion_U() {
        if (num == 1) {
            System.out.println("(Ծ؁Ծ)▬▬ι═══════ﺤ ༼⇀︿⇀༽;;;");
        } else if (num == 2) {
            System.out.println("(*ﾟ∀ﾟ)▬▬ι═══════ﺤ ༼⇀︿⇀༽;;;");
        } else {
            System.out.println("(* ∀ *)▬▬ι═══════ﺤ ༼⇀︿⇀༽;;;");
        }
    }
    public void Emoji() {
        System.out.println("=======================");
        char1();
        char2();
        char3();
        System.out.println("=======================");
        System.out.println("캐릭터를 선택해주세요 : ");
        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.print("당신의 캐릭터 \n");
                char1();
                break;
            case 2:
                System.out.print("당신의 캐릭터 \n");
                char2();
                break;
            case 3:
                System.out.print("당신의 캐릭터 \n");
                char3();;
                break;
        }
    }

    public void char1() {
        System.out.println("\t 1번 : (Ծ؁Ծ)");
    }
    public void char2() {
        System.out.println("\t 2번 : (*ﾟ∀ﾟ)" );
    }
    public void char3() {
        System.out.println("\t 3번 : (^ ∀ ^)" );
    }

}

public class RandomGame {
    public static void main(String[] args) {
        loadman lo = new loadman();

    }
}
