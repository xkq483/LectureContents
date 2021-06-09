public class Prob17 {
    public static void main(String[] args) {
        //17
        //Math.random() 응용의 문제
        //컴퓨터와 주사위 게임을 해보자!
        // 주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
        int computer = 0;
        int man = 0;

        computer = (int)(Math.random() * 6) + 1;
        computer = computer + (int)(Math.random() * 6) + 1;
        System.out.println("컴퓨터 주사위의 합계는 " + computer) ;

        man = (int)(Math.random() * 6)+ 1;
        man = man + (int)(Math.random() * 6)+ 1;
        System.out.println("사람 주사위의 합계는 " + man) ;

        if(computer > man){
            System.out.println("컴퓨터가 승리");
        }
        else if(man > computer){
            System.out.println("사람이 승리");
        }
        else {
            System.out.println("무승부");
        }
    }
}
