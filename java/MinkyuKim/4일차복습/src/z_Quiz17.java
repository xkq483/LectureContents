public class z_Quiz17 {
    //17. Math.random() 응용 문제
    //컴퓨터와 주사위 게임을 해보자!
    //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
    public static void main(String[] args) {
        int com1, com2;
        if((com1 > com2) || (com2 > com1)) {
        System.out.println((int)(Math.random() * 6 + 1));

        //com1과 com2에 주사위를 할당하는법을 잘 모르겠음.
            // 1) 변수 수치 설정 자체에 Math.random을 부여할수 있나?
            // int com1 = Math.random() * 6 + 1;
            // int com2 = Math.random() * 6 + 1;
            // 안되는 것 같음

            // ...


            if(com1 > com2) {
                System.out.printf("%d가 %d를 이겼다.\n", com1, com2);
            } else {
                System.out.printf("%d가 %d에게 졌다.", com1, com2);
            }
            // com1, com2를 숫자가 표기되게 나오는 것이 아닌 명칭으로 지정해야할 것 같음
            // if(com1 > com2) {
            // System.out.println("com1이 승리하였다.");
            // } else {
            // System.out.println("com2가 승리하였다.");
            // printf가 아닌 println으로?

            }
    }
}
