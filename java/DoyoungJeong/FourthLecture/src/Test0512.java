
public class Test0512 {
    public static void main(String[] args) {
        //문제11
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //문제12
        for (int i = 0; i < 20; i += 3) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //문제13
        for (int i = 1; i < 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "는 짝수입니다.");
            } else System.out.println(i + "는 홀수입니다.");
        }
        System.out.println();
        //문제15
        for(int i=1; i<=100; i++) {
            if(i % 4==0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        //문제16
        int sum=0;
        for(int i=1; i<=100; i++) {
            if(i % 11==0) {
                sum+=i;
                if(i>90) {
                    System.out.println("11의 배수 Sum Total : " + sum);   //그닥 어렵지 않을 문제라고 생각했지만 11의 배수가 다 더해지고 마지막 값만
                }                                                        //도출되어야 한다는 점에서 은근히 어려웠습니다.
            }                                                          //마지막 답 495만 프린트하는 더 간결한 if조건문이 있을것 같은데 잘 모르겠네요.
        }

    }
}

