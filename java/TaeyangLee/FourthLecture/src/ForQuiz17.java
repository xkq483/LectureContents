public class ForQuiz17 {
    public static void main(String[] args)  {

        int h1 = 0;
        int h2 = 0;
        for(int i=0; i<2; i++){
           h1 += (int)(Math.random() * 6 + 1);
           h2 += (int)(Math.random() * 6 + 1);

        }
        System.out.printf("h1의 합은 : %d  h2의 합은  : %d \n",h1,h2);
        if(h1<h2){
            System.out.println("h2가 이겼습니다!");
        }
        else if(h1>h2) {
            System.out.println("h1가 이겼습니다!");
        }
            else{
                System.out.println("비겼습니다");
            }
        }

    }

