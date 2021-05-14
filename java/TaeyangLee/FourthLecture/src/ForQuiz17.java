public class ForQuiz17 {
    public static void main(String[] args)  {
       // 컴퓨터와 주사위 게임을 해보자!
       // 주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

        int human = 0;   //두번의 합을 담을 변수설정
        int com = 0;
        for(int i=0; i<2; i++){  //2회반복
           human += (int)(Math.random() * 6 + 1); 
           com += (int)(Math.random() * 6 + 1);

        }
        System.out.printf("human의 합은 : %d  com의 합은  : %d \n",human,com);
        if(human<com){
            System.out.println("com이 이겼습니다!");
        }
        else if(human>com) {
            System.out.println("human이 이겼습니다!");
        }
            else{
                System.out.println("비겼습니다");
            }
        }

    }

