import java.util.Scanner;

public class Quiz27 {
    public static void main(String[] args) {
        // 피보나치수열
        // 사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍
        System.out.println("사용자로부터 n을 입력받아 n 번째 피보나치 수열의 항을 구합니다.");

        Scanner scan = new Scanner(System.in);
        System.out.print("n값을 입력하시오: ");

        int num = scan.nextInt();
        int res = 0;
        //예외 처리 (음수와 0)
        if (num <= 0) {
            System.out.println("0번째 항 혹은 음수 항은 존재하지 않습니다");
        }else if (num < 3) { //0이 아니며 음수가 아니고 3미만이라면 1번째와 2번째 뿐
            //1번째와 2번째 값은 무조건적으로 1에 해ㅏㄷㅇ함
            System.out.println("당신이 찾는 값은 1 입니다.");
        } else {
            //위의 조건이 모두 만족되지 않는다는 것은 결론적으로 숫자 3보다 크다는것을 의미미            int first = 1, second = 1;
           int first = 1, second = 1; //first는 else 안에서만 살아있는 지역변수
           //-2를 한 이유는 시작할때 first값과 second값을 넣어주
           // for (int i = 0; i < num -2; i++) { //3번 돈다 루프를 두번 더돌면 3,5 항 5번째 항이 된다 그래서 2를 빼준

               for (int i =2; i < num; i++) { //이게 더 가독성좋음
                res = first + second; //두개를 더하면 res
                first = second; //대입 1
                second = res; //세컨드에는 res대입
            }
        }
        System.out.println("결과는 = " + res);

    }

    private static class scanner {
    }
}
//1 1 2 3 5 8 13 2...
//res는 result의 줄임말
//first  second  res
// 1     +   1 =  2       첫번째 루프에서 forst + second 까지의 상태
// 1         2    3       두번째 루프에서 forst + second 까지의 상태
// first = second; 니까 1넣고 second = res;니까 2됨 그리고 둘을 더해서 3이됨
// 2         3    5       세번째 루프에서 forst + second 까지의 상태
// 3         5    8       네번째 루프에서 forst + second 까지의 상태


//num이나 res 메인이라는 메소드 내에서의 지역변수
// (메인 이후 {중괄호와 }요 닫히는 중괄호 안에서의 지역변수

