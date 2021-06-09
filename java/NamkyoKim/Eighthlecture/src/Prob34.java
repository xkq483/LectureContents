class  Computer{
int total_com;


    public int getTotal_com() {
        return total_com;
    }
    public void setTotal_com(int total_com) {
        this.total_com = total_com;
    }
}
class User{
int total_user;

    public int getTotal_user() {
        return total_user;
    }

    public void setTotal_user(int total_user) {
        this.total_user = total_user;
    }
}


public class Prob34 {
    public static void main(String[] args) {
        //우리가 이전에 Random과 제어문을 활용해서 주사위 게임을 만들었던적이 있다.
        //이 주사위 게임을 class 방식으로 다시 만들어보자!
        //(필요에 따라 커스텀 매서드를 만들어 사용하는것도 좋다)

        // 이건 수업중 혼자 문제 풀어본거였는데 틀렸다 ..
        //  머리는 이해를하는데 코드작성을 어떻게 풀어나갈지 잘모르겠다

        Computer com = new Computer();
        User user = new User() ;

        for (int i = 0; i < 1; i++) {
            System.out.println("사용자가 주사위를 굴립니다.");
          com.setTotal_com((int)(Math.random() * 6 + 1));
            user.setTotal_user((int)(Math.random() * 6 + 1));
            System.out.printf("현재 상황: %d(컴퓨터) vs %d(사용자)\n",
                    com.getTotal_com(), user.getTotal_user());
        }
        if (com.getTotal_com() > user.getTotal_user()) {
            System.out.printf("**컴퓨터 승! 점수는 %d(컴퓨터) vs %d(사용자)**\n",
                    com.getTotal_com(), user.getTotal_user());
        } else if (user.getTotal_user() > com.getTotal_com()) {
            System.out.printf("**사용자 승! 점수는 %d(컴퓨터) vs %d(사용자)**\n",
                    com.getTotal_com(), user.getTotal_user());
        } else {
            System.out.printf("**무승부! 점수는 %d(컴퓨터) vs %d(사용자)**\n",
                    com.getTotal_com(), user.getTotal_user());
        }
    }
}