public class Practice123 {
    public static void main(String[] args) {
        // 1번문제
        for (int i= 1; i <= 10; i++) {
            System.out.println(i+"출력");
        }
        // 2번문제
        for (int i = 1; i*3 <= 20; i++){
            System.out.println("3의 배수 출력"+ i*3);
        }
        // 3번문제
        for (int i = 0; i <= 30; i++) {
            if (i == 0) {
                System.out.println("잘못된값입니다."+i);
            } else if(i % 2 == 0) {
                System.out.println("짝수입니다"+i);
            } else {
                System.out.println("홀수입니다."+i);
            }
        }
    }
}
