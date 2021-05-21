    class TestDice {
        int comDice;   //먼저 컴퓨터와 사람의 주사위의 변수를 지정한다
        int userDice;

        TestDice() {
            comDice = getRandomDice();  //comDice와 userDice에 랜덤한 주사위 값을 대입한다.
            userDice = getRandomDice();
        }

        private int getRandomDice() {
            return (int)(Math.random() * 6 + 1);  // 주사위 값을 반환하는 변수를 만든다
        }

        Boolean userWin() {  //사용자와 컴퓨터의 주사위 값을 정한다.
            System.out.printf("%d(컴퓨터) vs %d(사용자)\n", comDice, userDice);

            if (comDice > userDice) {
                return false;
            } else if (comDice < userDice) {
                return true;
            } else {
                System.out.println("무승부입니다.");
                return false;
            }
        }
    }

    public class Prob34 {
        public static void main(String[] args) {
            // 우리가 이전에 Random과 제어문을 활용해서 주사위 게임을 만들었던적이 있다.
            // 이 주사위 게임을 class 방식으로 다시 만들어보자!
            // 컴퓨터도 주사위를 굴리고 사용자도 주사위를 굴려서 누가 더 큰 숫자를 얻었는지 확인해보자!
            TestDice td = new TestDice();

            if (td.userWin()) { //생성자는 초기생성에 한정해서 Setter의 역할을 대신할 수 있다
                System.out.println("사용자가 승리하였습니다.");
            } else {
                System.out.println("컴퓨터도 못이겼다. 폐관수련이 답이다.");
            }
        }
    }