import java.util.Scanner;

public class SwitchTest0601 {
    public static void main(String[] args) {

        System.out.println("저희 일본에 오신것을 환영합니다, 어디로 모실까요?");
        Boolean bom = true;
        Scanner scan = new Scanner(System.in);

        while(bom)
        {
            System.out.println("원하시는 도시를 선택해주세요 0.아무대도 안간다.1 도쿄 2 후쿠오카 3 오사카 4 진구네집");
            int num = scan.nextInt();
            switch(num)
            {
                case 0 :
                    System.out.println("그럼 다시 한국행비행기에 탑승하겠습니다.");
                    break;
                case 1 :
                    System.out.println("일본의 중심지 도쿄군요! 출발하겠습니다.");
                    break;
                case 2 :
                    System.out.println("후쿠오카는 볼거리가 정말많죠! 출발하겠습니다.");
                    break;
                case 3 :
                    System.out.println("한국인들이 제일많이 가는곳이죠! 출발하겠습니다");
                    break;
                case 4 :
                    System.out.println("도라에몽도 보러가볼까요? 출발하겠습니다!");
                    break;

            }
            break;
        }
// 이해를 돕기위해  한번만들어봤습니다.


    }
}
