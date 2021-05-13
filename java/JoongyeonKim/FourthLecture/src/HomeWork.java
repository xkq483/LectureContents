import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        // 15번 문제 for+if를 활용하여 1 ~ 100까지 숫자중 4의 배수만 출력해보자

        for (int i = 4; i <= 100; i += 4) {
            if (i % 4 == 0) {
                System.out.println("4의 배수는:" + i);
            }
        }

        // 16번 문제  for+if를 활용하여 1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!
        int sum = 0;

        for (int i =1; i <= 100; i++) {  //1부터 100까지 조건이 충족될 때 까지 더함
            if (i % 11 == 0) { //그리고 배수가 11인 i들을 걸러냄
                sum += i;  //11의 배수인 i를 전부 sum에 대입함   //여기까지 거친후에 증감식코드로 올라감
            }
        }
        System.out.println("11의 배수들의 합은:" + sum);  // for+if문 바깥에다가 배치하여 결과만 출력할 수 있게함
                                                       // (안에다가 배치하면 반복한 만큼 결과를 프린트함;;)

        //17번 문제 Math.random()를 활용하여 컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
        Scanner scan = new Scanner(System.in);
        System.out.print("키보드 자판을(숫자 빼고!) 눌러서 주사위를 굴려보세요!");
        //스캐너 변수 배운거 까먹을 것 같아서 사용함
        String dice=scan.nextLine();
             int num1, num2, num3, num4; // 먼저 4개의 주사위의 변수를 지정함
             
             

            num1=((int) (Math.random() * 6 + 1));   //((int) (Math.random() * 6 + 1))를 num1에 대입함
            Thread.sleep(500);   // 0.5초 간격으로 주사위가 굴려지게함 (밀리세컨드)
            System.out.printf("1번 주사위의 합산은:%d +", num1);  // print("1번 주사위의 합산은:"+num1);로 해도 똑같이 나옴


            num2=((int) (Math.random() * 6 + 1));
            Thread.sleep(500);
            System.out.printf("%2d\n", num2); //주사위 값의 간격을 2칸 띄움 


            
            num3=((int) (Math.random() * 6 + 1));
            Thread.sleep(500);
            System.out.printf("2번 주사위의 합산은:%d +", num3);

            num4=((int) (Math.random() * 6 + 1));
            Thread.sleep(500);
            System.out.printf("%2d\n", num4);

            if(num1+num2 > num3+num4) {  // 마지막으로 주사위를 2개씩 나누어서 더 큰 쪽이 이겼다는 문장이 나오게끔 만든다
                System.out.println("1번이 이겼습니다!");
            } else {
                System.out.println("2번이 이겼습니다!");
            }



    }
}
