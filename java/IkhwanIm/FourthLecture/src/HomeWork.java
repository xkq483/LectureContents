import java.util.Random;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
/*
        //for문은 변수선언; 조건; 증감값을 입력하면 된다.
        // 1~ 10까지의 수를 출력하고 싶다면
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }
        //조건부에 아무것도 없다면 무한루프가 된다.
        for(;;){
            System.out.println("무한");
        }

        //평균구하기
        // i 는 1이고 10까지 1씩 증가한다.
        //sum = sum +i 와 같은값이니
        // i = 1이 들어가서 sum = 1이되고
        // 다시 처음부터 시작하면 i=2가 들어가고
        // sum(1) + 2가되어 sum = 3
        // sum(3) + 3 ==> sum= 6
        // sum(6) + 4 ==> sum = 10 이런식이다.
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값: "+sum);
        //평균을 구하고 싶다면 sum에 10을 나눈다
        float avg = sum / 10.0f;
        //float avg 를 하고 10.0을 대입했는데 에러가 뜨길래
        //왜인가? 햇더니 10.0뒤에 f를 붙이는걸 깜빡했다.
        System.out.println("평균: "+avg);
        avg = sum/10;
        System.out.println("평균: "+avg);
        //10을 넣었을 때와 10.0f 를 넣었을 때
        // 값이 달라지는 이유??
        // 10을 대입하면 결과값이 int로 나오기에
        //소수점 자리가 버려지기 때문

        //랜덤
        // 랜덤을 출력할 때는 Math.random을 사용한다.
        //random에 커서를 올려 설명을 보면
        //0.0보다 같거나 크고 1.0보다 작다고 나와있다.
        //따라서 1~10까지의 수를 출력하고 싶다면
        //*10을 하여 0~10까지의 수가 나오게 하고
        //+1을 하여 0이 나오지 않게 한다.
        for(;;){
            System.out.println((int) (Math.random()*10+1));
        //궁금해서 int 자리에 float 를 넣었더니 소수점 값까지 표시된다.
        }

        //주사위
        for(;;){
            //주사위는 1~6까지 있으니까
            //*6을 하면 0~6까지 출력이되고
            //+1을하면 1~6까지가 된다.
            System.out.println((int)(Math.random()*6+1));
            //지연시간을 두고 싶다면??
            //Thread.sleep()을 하면된다.
            //sleep에 빨간줄이 뜨는데 마우스를 대면
            //exception을 추가한다는 문구가 뜬다
            //누르면 throws InterruptedException이 상단에 나오며
            //에러가 사라진다.
            //millis: 몇 밀리세컨동안 지연할건지 선택하는것 같다.
            //따라서 1000을 입력하면 1000밀리세컨이니까 1초가된다.
            Thread.sleep(1000);

        }


        //15번. 1~100까지 숫자중 4의 배수만 출력
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                for 문으로 i를 1~100까지  나오게 선언한다.
                        if문을 통해 i%4==0을 하여 4의 약수만 출력하도록 선언한다.
                그러면 4의 배수만 출력될것이다.
            }
        }


        //16번. 1~100까지 숫자중 11의 배수들의 합 구하기
        int sum = 0; //sum을 초기화
        for(int i = 1; i<=100; i++){
            if(i%11==0){
                sum +=i; //sum = sum+i
            }
        }
        System.out.println("합= "+sum);
        //for문 안으로 sout을 넣으면 sum의 값이
        //계속변하면서 출력되는데
        //for문 밖으로 sout을 빼면
        //최종 합인 sum값만 출력된다.
    */
        //17번. 주사위를 2번 굴려서 합산 눈금 숫자가
        //큰 사람이 이기는 게임
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < 2; i++) { //주사위를 두번 굴리기 위한 for문
            int num1 = (int) (Math.random() * 6 + 1);
            System.out.println("갑: " + num1);
            sum += num1;   //sum은 갑이 두번던진 값의 합
        } //for문을 끝내고 또하나의 for문을 열어서 두번 더 굴림
        for (int i = 0; i < 2; i++) {
            int num2 = (int) (Math.random() * 6 + 1);
            System.out.println("을: " + num2);
            sum2 += num2; //sum2는 을이 두번 던진 값의 합
        }
        System.out.print("갑의 합: " + sum);
        System.out.println(" 을의 합: " + sum2);  //각자의 합을 출력
        if (sum > sum2) {  //갑이 이길경우
            System.out.println("갑의 승리");
            if(sum<sum2) {
                System.out.println("을의 승리");
            }
        }else{
            System.out.println("비겼다.");
        }

    }

}
