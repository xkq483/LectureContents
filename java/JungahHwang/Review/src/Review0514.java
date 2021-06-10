import java.util.Scanner;

public class Review0514 {
    public static void main(String[] args) {

// 23번 문제 비트 변수 하나만 사용하기---------------------------------------------------------

        // int는 4바이트이므로 32비트에 해당하는 데이터를 저장할 수 있음
        // 우리가 testBit를 가지고 제어할 수 있는 비트의 개수는 32개이므로
        // 되도록이면 0번 비트부터 순차적으로 채워서 효율적으로 활용

        final int FIRST_BIAS = 5;
        // 5 ~ 10을 사용하고 있지만 비트는 0 ~ 5를 채워야하므로 5를 빼줌

        final int SECOND_BIAS = 1;
        // 7 ~ 10을 사용하고 있지만 비트는 6 ~ 9를 채워야하므로 1을 빼줌

        final int BIN = 1;
        int testBit = 0;
        int randNum;

        // 5 ~ 10 ---> 6개
        for (int i = 0; i < 6; i++) {
            // 실제 출력값은 5 ~ 10을 사용하되 비트 연산에서는 0 ~ 5를 사용
            randNum = (int)(Math.random() * 6 + 5);

            while ((testBit & (BIN << (randNum - FIRST_BIAS))) != 0) {
                // randNum에서 5를 빼준다
                randNum = (int)(Math.random() * 6 + 5); }
            System.out.printf("5 ~ 10 randNum = %d\n", randNum);
            testBit |= (BIN << (randNum - FIRST_BIAS)); }

        // 7 ~ 10 ---> 4개
        for (int i = 0; i < 4; i++) {
            // 실제 출력값은 7 ~ 10을 사용하되 비트 연산에서는 6 ~ 9를 사용
            randNum = (int)(Math.random() * 4 + 7);

            while ((testBit & (BIN << (randNum - SECOND_BIAS))) != 0) {
                // randNum에서 1을 빼준다
                randNum = (int)(Math.random() * 4 + 7); }
            System.out.printf("7 ~ 10 randNum = %d\n", randNum);
            testBit |= (BIN << (randNum - SECOND_BIAS)); }

        // 또 다른 예로 추첨(랜덤) 시스템을 돌렸다고 가정
        if ((testBit & (1 << 2)) != 0) {
            System.out.println("당첨을 축하드립니다! 당신이 뽑은 번호는 " + (2 + FIRST_BIAS)); }


// Switch------------------------------------------------------------------------------
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르십쇼 호갱님!");

        Boolean isTrue = true;
        // Boolean 이란 참, 거짓을 표현할 수 있는 데이터타

        Scanner scan = new Scanner(System.in);
        int num;
        while (isTrue) {
            System.out.print("숫자를 눌러 물건을 담으세요: ");
            num = scan.nextInt();
            // 입력된 키보드 값에 따라 case를 처리한다. (0번이 입력되면 case 0, 1번이 입력되면 case 1)

            switch (num) {
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false;
                    break;
                // break는 더 이상 밑으로 내려가지 않고 종료
                case 1:
                    System.out.println("비누를 장바구니에 담았습니다.");
                    break;
                case 2:
                    System.out.println("신발을 장바구니에 담았습니다.");
                    break;
                case 3:
                    System.out.println("에어팟을 장바구니에 담았습니다.");
                    break;
                default:
                    System.out.println("그런건 없습니다!");
                    break;
                // default는 case에 없는 값을 입력받았을 떄 나타낼 결과값
            }
        }

        System.out.print("문자열도 switch 처리가 되나요 ? 일단 입력해봅시다: ");
        Scanner scan1 = new Scanner(System.in);

        String str = scan1.nextLine();
        // 데이터 타입이 String이라면 입력값을 문장으로 받을 수 있다.
        // switch에 사용되는 데이터타입과 case에서 사용하는 데이터타입이 일치해야 한다.
        switch (str) {
            case "hi":
                System.out.println("안녕");
                break;
            default:
                System.out.println("으아앜");
                break;
        }

// Continue -----------------------------------------------------------------------------
        for(int i =0; i <10; i++){
            if (i % 2 == 0) {
                continue;
                // continue 를 만나면 아래쪽에 진행해야 하는 코드가 남아있더라도 for의 최상단으로 돌아감
                // 그러므로 짝수 일 때는 최상단으로 돌아가 출력되지 않고 홀수일떄만 출력됨
            }
            System.out.println("i = " + i); }


// Array ---------------------------------------------------------------------------------
        // Array 배열은 동일한 데이터 타입의 변수가 여러개 모일 때 사용해야한다.
        int arr[] = { 1, 2, 3, 4, 5};
        // = int num1 = 1, num2 = 2, num3 = 3...
        for (int i = 0; i < 5; i++){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);}

        // 배열을 만드는 방법
        // 1. stack에 할당하는 방법(지역변수)
        //  1-1. 배열의 데이터 타입을 적는다.
        //  1-2. 배열의 이름이 될 변수명을 적는다.
        //  1-3. 배열임을 알리기 위해 []을 변수 옆에 적어준다.
        //  1-4. 필요하다면 배열의 값들을 초기화한다. (이때 원소로 지정한 숫자에 따라 배열의 길이가 지정된다)

        // int arr[] = { 1, 2, 3, 4, 5 }; 는 아래와 같은 형식으로 저장된다.
        //      -------------------
        // arr | 1 | 2 | 3 | 4 | 5 |
        //      -------------------
        //      [0] [1] [2] [3] [4]
        // 배열의 인덱스(방) 번호는 0번부터 시작함에 주의해야한다.
        // 방 번호가 순차적으로 증가하기 떄문에 for나 while 등 반복문과의 혼합구성에 있어 좋다.


















    }}