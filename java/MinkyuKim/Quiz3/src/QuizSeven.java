// 7. while + Scanner 문제 : 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
public class QuizSeven {
    public static void main(String[] args) {
        System.out.println("1 ~ n 까지 숫자중 3의 배수를 찾아봅시다(n을 입력하세요): ");
        int loop = scan.nextInt();
        int i = 1;

        while (i <= loop) {
            if ( i % 3 == 0) {
                System.out.println("1 ~ " + loop + " Rkwl 3dml qotnfmf cnffurgkqslek : " + i);
            }

        }

    }
}