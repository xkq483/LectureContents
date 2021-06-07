public class a_Quzi17 {
    //17. Math.random() 응용 문제
    //컴퓨터와 주사위 게임을 해보자!
    //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
    public static void main(String[] args) {
        System.out.println("컴퓨터가 주사위를 굴립니다.");

        int comdice1 = (int) (Math.random() * 6 + 1);
        int comdice2 = (int) (Math.random() * 6 + 1);

        System.out.println("사용자가 주사위를 굴립니다.");

        int userdice1 = (int) (Math.random() * 6 + 1);
        int userdice2 = (int) (Math.random() * 6 + 1);

        int comdices = comdice1 + comdice2;
        int userdices = userdice1 + userdice2;

        if (comdices > userdices) {
            System.out.printf("컴퓨터 승! 컴퓨터(%d) 유저(%d)\n", comdices, userdices);
        } else if(comdices < userdices) {
            System.out.printf("유저 승! 컴퓨터(%d) 유저(%d) \n", comdices, userdices);
        } else {
            System.out.println("무승부");
        }



    }
}
