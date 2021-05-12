public class Test0512 {
    public static void main(String[] args) {
        //문제11
        for(int i=1; i<=10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //문제12
        for(int i=0; i<20; i+=3) {
            System.out.print(i + "\t");
        }
        //문제13
        for(int i=0; i<30; i++) {
            if(i%2==0) {
                System.out.println(i + "는 짝수입니다.");
            } else System.out.println(i + "는 홀수입니다.");
        }

    }
}
