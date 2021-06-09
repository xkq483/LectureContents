import java.util.Scanner;

/* 내돈 1000만원,컴퓨터 1000만원, 배팅금, 주사위 1번, 1번이 짝일경우 발동될 신비한 2번,
이 필요하다. 일단 최소단위로 쪼개보자...
 */
class Casino{
    int myMoney;
    int compMoney;
    int comDice;
    int myDice;
    int comDice2;
    int myDice2;

    public Casino(){//시드머니 1000원 세팅
        myMoney = 1000;
        compMoney = 1000;

    }
    public static int inputBetting(){//배팅금을 넣는 매소드

        Scanner scan = new Scanner(System.in);

        boolean isTrue = false;
        int betting;

        do{
            System.out.println("배팅금을 입력하시오 : ");
            betting = scan.nextInt();
            if(betting > 1000){//천원보다 클경우
                System.out.println("1000보다 작은수를 입력하시오.");
                isTrue = true;
            }else if(betting < 1){//1원보다 작을경우
                System.out.println("1보다 큰 수를 입력하시오.");
                isTrue = true;
            }
        }while (isTrue);
        return betting;

    }
    public void comDice() {//컴주사위1번
        comDice = (int)(Math.random()*6+1);
    }
    public void myDice(){//내주사위1번
        myDice = (int)(Math.random()*6+1);
    }
    public void comDice2() {//컴주사위2번
        if (comDice % 2 == 0) {//짝수일 경우
            System.out.println("컴퓨터가 2번째 주사위를 굴린다.");
            comDice2 = (int) (Math.random() * 6 + 1);//한번더 굴려서
            switch (comDice2) {
                case 1:
                    comDice = comDice + 3;
                    break;
                case 2:
                    comDice = comDice + comDice2;
                    break;
                case 3:
                    comDice = comDice - 2;
                    break;
                case 4:
                    comDice = 0;
                    break;
                case 5:
                    comDice = comDice + comDice2;
                    break;
                case 6:
                    comDice *= 2;
                    myDice *= 2;
                    break;
            }
        }
    }
        public void myDice2() {//내주사위 2번
            if (myDice % 2 == 0) {
                System.out.println("내가 2번째 주사위를 굴립니다.");
                myDice2 = (int) (Math.random() * 6 + 1);
                switch (myDice2) {
                    case 1:
                        myDice = myDice + 3;
                        break;
                    case 2:
                        myDice = myDice + myDice2;
                        break;
                    case 3:
                        comDice = comDice - 2;
                        break;
                    case 4:
                        myDice = 0;
                        break;
                    case 5:
                        myDice = myDice + myDice2;
                        break;
                    case 6:
                        myDice *= 2;
                        comDice *= 2;
                        break;
                }
            }
        }
    //이제 여기다가 시드머니에서 배팅액을 까는 무언가를 만들어야 하는데.... main에서 해야하나???

    public int getComDice() {
        return comDice; //컴다이스 가져오기용
    }

    public int getMyDice() {
        return myDice; //내다이스 가져오기용
    }

    public int getMyMoney() {
        return myMoney;
    }

    public int getCompMoney() {
        return compMoney;
    }

}

public class Prob45 {
    public static void main(String[] args) {
        Casino ca = new Casino();

        while(ca.getMyMoney()==0){//이 부분에서 시드머니가 0이 될때까지 돌리고
         //   ca.getMyMoney()-  이 부분에서 시드머니 - 배팅액을 하고싶은데 왜 안되지?
        }
//으아 이까지 했는데 만든 도구들을 어떻게 풀어나갈지를 모르겠다...


    }
}
