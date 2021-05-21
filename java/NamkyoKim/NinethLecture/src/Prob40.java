import java.util.Scanner;

class Fibonacci {
    private int[] fibArr; // private접근제한자로 설정 하고 int [] 배열만들고 fibArr변수명 선언
    private Scanner scan; // private접근제한자로 설정 하고 Scanner scan으로 변수명선언
    private int lastElement; // 위와 같음.

    public Fibonacci () { // Fibonacci클래스의 생성자
        scan = new Scanner(System.in); // scan 변수 = new Scanner불러옴? 사용?

        System.out.print("몇 번째 피보나치 항을 구하겠습니까 ? : "); // 여기서 사용자가 입력하게 할구문 내용 출력안내

        lastElement = scan.nextInt(); // 사용자입력을 lastElement에 넣음

        fibArr = new int[lastElement]; // fibArr 배열에 new 생성자 사용해서 int[lastElement]
                                        // 배열에 사용자입력값(인덱스값?) 담기
    }       // 생성자 부분 끝

    public Boolean calcLastElem () { // public 모두 접근가능한 접근제한자 Boolean  참거짓을 표현하는 데이터타입?
                                    // calcLastElem 객체? 아닌가 ..?
        if (lastElement <= 0) {     // 사용자 입력값 (배열의 인덱스값) 이
            System.out.println("0 혹은 음수항은 없습니다.");  // 0보다 작거나 같을때 출력하는 구문
            return false;  // if문 조건이 충족 되었을때 false로 다음구문으로 넘어감
        } else if (lastElement < 3) { // 입력값이 3보다 작을때 피보나치수열은 첫번째 값과 두번째 값이
                                    // 동일하게 1이기 때문에
            System.out.println("당신이 찾고자 하는 피보나치 수열의 항은 1입니다.");// 이 부분 출력
            return false;   // 리턴값 false를 줘서 다음구문으로 >>이동
            }else {
            // 0번인덱스와 1번익덱스값이 1로 동일하기때문에 1로 초기화.
            fibArr[0] = 1;
            fibArr[1] = 1;

            for (int i = 2; i < lastElement; i++) { // 첫번째와 두번째 값은 1로 위 부분에서 출력했기때문에
                                            // i값을 2로 초기화후 i 가 입력값보다 작을때 루프하면서 i++ 1씩 증가
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
                // fibArr[i] <- i 값을 설정
                // 배열은 0부터 시작이라 만약 사용자가 3을 입력시
                // i가 2부터 루프하기때문에 fibArr[] = fibArr[2번인덱스인데 -2를해서 0번인덱스값 = 1]
                // + fibArr[2번인덱스의 -1을해서 1번인덱스값 = 1] 해서 ifbArr[2]로
                //  값은 3이됨 이렇게 피보나치 수열 값 구하는 공식이되고 숫자 무엇을 넣든
                // 그 인덱스값에 해당하는 값 출력
                // System.out.printf("fibArr[%d] = %d\n", i, fibArr[i]);
            }
        }
        return true; // 그렇게 마지막 리턴값을 true를 줘서 루프 끝 .
    }
    // 여기서 부터 클래스에서 선언한  LastElement , FibArr를 private로 선언해서
    // getter생성해야만 메인에서 값을 얻어올수 있기 때문????
    public int getLastElement() {
        return lastElement;
    }
    public int[] getFibArr() {
        return fibArr;
    }
    // 아래부분은 메인에서 좀더 수월하고 깔끔하게 코드작성할 필요가 있어 마지막 값을 LastFibArr로 불러오기위해 getter생성
    // 리턴값을 fibArr[lastElement -1]로 한이유는 배열은 0번방 부터 시작되게 때문에 -1로 0번인덱스부터 불러오기위해
    public int getLastFibArr() {
        return fibArr[lastElement - 1];
    }
}

// 1. 코드를 눈으로 보고 이해하기
// 2. 복사 붙여넣기를 통해서 일단 동작하게 만들기
// 3. 일부는 작성하고 일부는 복붙을 해서 동작하게 만들기
// 4. 직접 모든 코드를 작석하기
// 5. 소프트웨어 아키텍처 관점에서 프로그램을 설계하고 코딩함
public class Prob40 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(); // Fibonacci new 생성자로 불러오기 ??

        if (fib.calcLastElem()) {
            // 왜 if문으로 하셨는지 잘모르겠습니다 ! fib. 위에 Fibonacci를 fib로 변수명 지정했기때문에
            // fib. 접근한다는 뜻으로 calcLastElem불러옴
            System.out.printf("피보나치수열의 %d번째 항은 %d입니다.\n",
                    // 출력구문 여기서 쓰다가 왜 if문으로 작성했는지 짐작이감.
                    // 위에서 Boolean타입으로 if문을 마지막으로 썻는데 마지막에 리턴값이 true이기 때문에 이구문이
                    // 실행되고 만약 false 면 이구문 실행되지않게 하려 if문을 사용 한것같다 ..
                    fib.getLastElement(),//  사용자의 입력값이 몇번째 항을 구한다 이기때문에 fib.getLastElement작성
                    // 아래 케이스의 경우엔
                    // fib.getFibArr()가 얻어오는 것이 class Fibonacci에 있는 FibArr 배열 전체를 얻어온다.
                    // 그러므로 배열을 얻어오고 난 이후에 fib.getLastElement() - 1을 통해서
                    // index 9번 방에 접근하도록 만드는 코드라고 보면 되겠다.
                    // 치환 과정
                    // fib.getFibArr() ---> fibArr
                    // [fib.getLastElement() - 1] ---> [9]
                    // 그래서 fibArr[9]와 같은 결과를 얻는 것이다.
                    // fib.getFibArr()[fib.getLastElement() - 1]);
                    fib.getLastFibArr());
                // 이부분은  fib클래스내부에 getLastFibArr을 생성해서 그걸 불러오기위한 작성


        }
    }
}