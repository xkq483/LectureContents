import java.util.Scanner;
//ㅅ
public class HomeWorkProb3 {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        int all1 = 0;
        int nice = 0;
        int nice2 = 0;
        int all2 = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("컴퓨터가 주사위대결을 신청하였습니다 주사위를 굴리시겠습니까? 예 1 아니오 2");
        int zz = scan.nextInt();
        if(zz == 1){for (int i = 1; i <= 1; i++) {
            int num = ((int) (Math.random() * 6 + 1));
            System.out.println("나의첫번쨰주사위의눈=" + num);
            sum += num;
        }
            System.out.println(" ");

            for (int i = 1; i <= 1; i++) {
                int num2 = ((int) (Math.random() * 6 + 1));
                System.out.println("나의두번째주사위의눈=" + num2);
                sum2 += num2;

            }
            System.out.println(" ");

            all1 = sum + sum2;
            System.out.println("나의첫번째랜덤한주사위값6개의 합은=" + sum);
            System.out.println("나의두번째랜덤한주사위값6개의 합은=" + sum2);
            System.out.println("내가 2번던졋을때 주사위 눈의총합은=" + all1);

            System.out.println(" ");

            for (int i = 1; i <= 1; i++) {
                int bom = ((int) (Math.random() * 6 + 1));
                System.out.println("컴퓨터의첫번쨰주사위의눈=" + bom);
                nice += bom;}
            System.out.println(" ");

            for (int i = 1; i <= 1; i++){
                int bom2 = ((int) (Math.random() * 6 + 1));
                System.out.println("컴퓨터의두번째주사위의눈=" + bom2);
                nice2 += bom2;}
            System.out.println(" ");

            all2 = nice + nice2;
            System.out.println("컴퓨터의첫번째랜덤한주사위값6개의 합은=" + nice);
            System.out.println("컴퓨터의두번째랜덤한주사위값6개의 합은=" + nice2);
            System.out.println("컴퓨터가 2번던졋을때 주사위 눈의총합은=" + all2);
            System.out.println(" ");
            System.out.println("컴퓨터vs나 그승부는?!!!");
            System.out.println(" ");

            if(all1>all2){
                System.out.println("내가 컴퓨터한테 이겼다!!");

            }
            else{
                System.out.println("내가 컴한테 졋다...");
            }

        }
        else{
            System.out.println("컴퓨터: 겁쟁이 같은녀석");
        }


            // 소소한게임을 만들어봤습니다.





    }
}