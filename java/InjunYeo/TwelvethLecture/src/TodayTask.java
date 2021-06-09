import java.util.Scanner;

/*
종합문제 챌린지
아주 특수한 카지노에 왔다.
현재 내 수중엔 1000만원이 있다.
카지노에서 판돈을 걸 수 있고
베팅 비율은 Scanner를 통해 입력받는다.
상대방이 파산하면 이기는 게임이다.
주사위를 2개를 사용하는 게임이다.
숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
첫번째 주사위가 짝수가 나온다면 두 번째 주사위를 굴릴 수 있다.
두번째 주사위는 특수능력을 가지고 있는 주사위다.
숫자 1이 나오면 내주사위 값을 +3 할 수 있다.
숫자 3이 나오면 상대방 주사위 값을 -2지울수 있다.
숫자 4가 나오면 내 주사위값이 0이된다.
숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기한다.
(2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한다)

누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자
 */


/* 게임진행할 Character 클래스*/
class Character{

    private String name;
    private int money;
    private int dice1;  //첫번째 주사위값
    private int dice2;  //두번째 주사위값
    private int attackPoint;    //주사위 특수능력 공격포인트
    private int multiplePoint;  //주사위 특수능력 곱셈포인트
    private int totalPoint; //플레이어 최종점수

    public Character(String name){
        this.name = name;
        money = 1000;
    }

    /*게임마다 주사위 눈금과 최종점수 초기화 해주는 메소드*/
    private void diceInitialize(){
        dice1 = 0;
        dice2 = 0;
        totalPoint = 0;
    }

    /*첫번째 주사위 굴리는메소드*/
    public void rollingDiceOne(){
        //실행시마다 눈금,점수 초기화 메소드 먼저 실행
        diceInitialize();

        //첫번째 주사위 눈금 할당
        dice1 = (int)(Math.random()*6+1);
        System.out.println(name+"님의 첫 번째 주사위 값 : "+dice1);

        /* 첫번째 주사위 눈금이 짝수일시 두번째 주사위 굴리기 메소드 진입*/
        if (dice1 % 2 == 0){
            System.out.println("짝수가 나왔으니 두 번째 주사위를 굴립니다.");
            rollingDiceTwo();
        }
        /*모든 주사위 굴리기 행위가 끝난뒤 토탈포인트 할당*/
        totalPoint = dice1+dice2;
    }
    /*두번째 주사위(특수능력) 굴리는 메소드*/

    public void rollingDiceTwo(){

        dice2 = (int)(Math.random()*6+1);
        System.out.println(name+"님의 두번째 주사위 값 : "+dice2);

        //두번째 주사위 눈금에 따라 스위치문 실행
        switch (dice2){
            case 1 :
                //dice2에 처음 할당해봤으나 +3이되면서 case4를 실행해서 dice1에 할당함. break가 있는데 발생한건지 코드오류였던건지 확신이 안섬.
                System.out.println("1 이 나왔습니다. 점수가 3점 추가 됩니다.");
                dice1+=3;
                break;
            case 3 :
                //attackPoint 획득
                System.out.println("3 이 나왔습니다. 상대방플레이어 점수를 2점 깍습니다.");
                attackPoint = 2;
                break;
            case 4 :
                //모든주사위 0으로 초기화
                System.out.println("4 가 나왔습니다."+name+"님의 모든점수가 0 이 됩니다.");
                diceInitialize();
                break;
            case 6 :
                //multiplePoint획득득
                System.out.println("6 이 나왔습니다. 플레이어들의 모든 점수가 2배가 됩니다. ");
                multiplePoint =2;
        }
    }

    /* Getter/Setter 부분 */
    public String getName(){
        return name;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTotalPoint(){
        return totalPoint;
    }
    public void setTotalPoint(int totalPoint){
        this.totalPoint = totalPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public int getMultiplePoint() {
        return multiplePoint;
    }
}



public class TodayTask {
    /*
    베팅과 돈이0이 될때 false로 바뀌는 isTrue를 전역변수로 잡음 필수로 필요하다고 생각해서 전역변수로 잡은건데 아직 전역변수를 정확히
    어디서 사용해야할지 헷갈림
    */
    static int bettingPoint;
    static boolean isTrue = true;

    /*베팅금액을 키보드입력으로 받는 메소드 while문 반복에서 코드양을 줄일수 있을것같아 static 메소드로 만듬*/
    public static void bettingInput(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("베팅을 시작하겠습니다. 베팅 금액을 입력해주십시오 : ");
            bettingPoint = scan.nextInt();
            if(bettingPoint<1){
                System.out.println("베팅금액은 1만원 이하로 할 수 없습니다.");
                bettingPoint = 0;
            }
        }while(bettingPoint==0);


    }

    /*
    주사위 게임담당 메소드 플레이어들을 매개변수로 받고 주사위굴리기 메소드를 실행한다음 가지고있는 공격포인트나 곱하기포인트 여부에따라
    최종점수를 합산하는 역할을 함.
    질문1.작성하고보니 뭔가 코드가 많이 길어지고 중복되는느낌인데 혹시 더줄일수는 없을까요?
    */
    public static void playGame(Character c1,Character c2){
        c1.rollingDiceOne();
        c2.rollingDiceOne();

        /*주사위 눈금 정산부분*/
        //두번째 주사위 6이 동시에 나왔을경우 각각의 경우에 2배씩 총4배 적용되도록 코드를 작성.
        if(c1.getAttackPoint()!= 0){
            c2.setTotalPoint(c2.getTotalPoint()-c1.getAttackPoint());
        }
        else if(c2.getAttackPoint() != 0 ){
            c1.setTotalPoint(c1.getTotalPoint()-c2.getAttackPoint());
        }
        else if(c1.getMultiplePoint() !=0){
            c1.setTotalPoint(c1.getTotalPoint()*c1.getMultiplePoint());
            c2.setTotalPoint(c2.getTotalPoint()*c1.getMultiplePoint());
        }
        else if(c2.getMultiplePoint() != 0){
            c1.setTotalPoint(c1.getTotalPoint()*c2.getMultiplePoint());
            c2.setTotalPoint(c2.getTotalPoint()*c2.getMultiplePoint());
        }

        System.out.printf("%s 님의 총점 : %d\n",c1.getName(),c1.getTotalPoint());
        System.out.printf("%s 님의 총점 : %d\n",c2.getName(),c2.getTotalPoint());
    }

    /*
    베팅한 금액을 플레이어 별로 정산하는 메소드 정산할 플레이어들을 매개변수로 받는다.
    뭔가 코드가 계속 긴 느낌이다.
    */
    public static void calculateMoney(Character c1,Character c2){
        if(c1.getTotalPoint()>c2.getTotalPoint()){
            System.out.println(c1.getName()+"님의 승리."+bettingPoint+"만 원을 얻습니다.");
            System.out.println(c2.getName()+"님의 패배."+bettingPoint+"만 원을 잃습니다.");
            c1.setMoney(c1.getMoney()+bettingPoint);
            c2.setMoney(c2.getMoney()-bettingPoint);
        }
        else if(c2.getTotalPoint()>c1.getTotalPoint()){
            System.out.println(c2.getName()+"님의 승리."+bettingPoint+"만 원을 얻습니다.");
            System.out.println(c1.getName()+"님의 패배."+bettingPoint+"만 원을 잃습니다.");
            c2.setMoney(c2.getMoney()+bettingPoint);
            c1.setMoney(c1.getMoney()-bettingPoint);
        }
        else{
            System.out.println("무승부입니다. 이번베팅은 무효입니다.");
        }
        //남은돈 출력
        System.out.printf("현재 %s 님의 남은돈은 %d만 원입니다.\n",c1.getName(),c1.getMoney());
        System.out.printf("현재 %s 님의 남은돈은 %d만 원입니다.\n",c2.getName(),c2.getMoney());
    }


    public static void main(String[] args) {
        int gameCnt = 1; //게임횟수 알림

        /*플레이어 설정*/
        Character c1 = new Character("인준");
        Character c2 = new Character("컴퓨터");

        /*실제게임진행부분 반복문을 사용해서 두플레이어중 money가 0이된 플레이어가 있으면 isTrue값을 false로 주었다.*/
        while(isTrue){
            System.out.println();
            System.out.println("=================="+gameCnt+"번째 게임==================");

            bettingInput();
            playGame(c1,c2);
            calculateMoney(c1,c2);
            if(c1.getMoney() ==0 || c2.getMoney() ==0){
                isTrue = false;
            }
            gameCnt +=1;
        }


    }
}
