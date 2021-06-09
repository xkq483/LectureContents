import java.util.Scanner;

// Class / Method --------------------------------------------------------------------------------
// 클래스는 사용자가 직접 만들어서 커스텀 할 수 있는 데이터타입
class Person {
    int age;
    String name;
    String major;

    // Method를 만드는 방법
    // 1. 먼저 리턴(return) 타입을 작성
    // 2. 매서드의 이름을 용도에 맞게 작성
    // 3. 소괄호 내부에 인자로 입력 받을 매개변수를 설정
    // 4. 중괄호 내부에 해당 매서드(기능)이 수행할 업무를 작성

    // Getter는 값을 얻는 것
    int getAge(){
        return age;
        // age에 대한 값을 얻고싶으면 Getter에 해당
        // 소괄호 내부는 인자가 배치되는데 텅 비어 있는 것은 입력값이 없다는 것이다.
    }
    // Setter는 값을 설정하는 것
    void setAge(int age){
        this.age = age;
        // this.age는 클래스 내부에 있는 age를 의미한다.
        // age는 입력으로 들어온 age에 해당한다.
    }
    String getName() {
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getMajor(){
        return major;
    }
    void setMajor(String major){
        this.major = major;
    }
}

public class Review0517 {
    public static void main(String[] args) {
        Person p = new Person();
        // new ------------------------------------------------------------------------------
        // 위에서 class로 Person이란 데이터 타입을 만들었고 p라는 이름을 가진 변수 생성
        // new Person()을 통해 만든 공간은 데이터타입 Person에 해당하는 정보들을 저장할 수 있는 공간
        // => 만들어지는 위치는 Heap
        // new를 이용해서 공간을 만드는 방법
        // -데이터타입이 배열일 때: new 데이터타입 [배열]
        // -데이터타입이 클래스일 때: new 데이터타입 (인자)
        //------------------------------------------------------------------------------------

        p.age = 20;
        // '.' 은 공간 내부에 접근하겠다는 뜻 => p변수가 가지고 있는 공간 중 age에 21을 저장(대입)
        //------------------------------------------------------------------------------------


        // 클래스 내부의 값을 Setter로 설정(25,컴퓨터,멍청이)
        p.setAge(25);
        p.setMajor("컴퓨터");
        p.setName("멍청이");

        // 설정된 값을 Getter를 통해 얻음
        System.out.printf("%s의 나이는 %d살이고 %s를 전공하고 있다.\n",
                p.getName(), p.getAge(), p.getMajor());
        // p.name, p.age, p.major로 출력해도 정상출력 되지만 p.getName을 이용하기


// Array --------------------------------------------------------------------------------------------

        Scanner scan = new Scanner(System.in);
        System.out.print("학급에 학생이 몇 명 있습니까? ");

        int studentNum = scan.nextInt();

        int studentArr[] = new int[studentNum];
        // new ------------------------------------------------------------------------------
        // 메모리 생성 시에 new 사용
        // new를 이용해서 공간을 만드는 방법
        // -데이터타입이 배열일 때: new 데이터타입 [배열]
        // -데이터타입이 클래스일 때: new 데이터타입 (인자)
        //------------------------------------------------------------------------------------

        // stack
        // -괄호가 끝나면 사라짐
        // -정적변수로 할당된 값으로 개수가 고정 => int arr[] = { 1, 2, 3 }
        // -생성된 상태에서 프로그램 실행되므로 heap보다 빠름

        // Heap
        // -동적할당 되는 데이터를 관리하는 메모리
        // -프로그램이 끝날 때까지 사라지지 않음
        // -동적변수로 필요한 개수만큼 공간을 할당 => int arr[] = new int [30] (=>30개의 공간 할당)
        // -프로그램 실행 도중에 생성되므로 stack보다 느림

        // int studentArr[] = new int[studentNum] 란
        // Heap 공간에 int형 배열을 studentNum 개수만큼 만든다 라는 뜻

        for (int i = 0; i < studentNum; i++) {
            // studentNum 만큼 생성되니 해당 학생숫자에 맞게 80 ~ 100점의 랜덤한 점수를 가지도록 만듬
            studentArr[i] = (int)(Math.random() * 21) + 80;
            System.out.printf("studentArr[%d] = %d\n", i, studentArr[i]); }


// length -------------------------------------------------------------------------------------

        int arr1[] = { 2, 3, 4, 5, 6, 7 };

        System.out.println("arr1의 길이 = " + arr1.length);
        // length는 배열의 길이(개수)를 나타냄
        int dynamicArr[] = new int[30];
        // 30개일 때 인덱스는 0 ~ 30이 아니라 0 ~ 29라는 부분을 주의

        System.out.println("dynamicArr의 길이 = " + dynamicArr.length);


// 27. 피보나치수열 ------------------------------------------------------------------------------

        Scanner scan1 = new Scanner(System.in);

        System.out.println("n을 입력하면 피보나치수열의 n번째 항을 구합니다.");

        System.out.print("n 값을 입력하시오: ");
        int num = scan1.nextInt();

        int res = 0;

        if (num <= 0) { // 예외 처리 =>음수와 0값은 구할 수 없음
            System.out.println("0번째 항 혹은 음수 항은 존재하지 않습니다."); }
        else if (num < 3) { // 1, 2번째는 값이 1
            System.out.println("당신이 찾는 값은 1입니다."); }
        else { // 3이상일 때 결과값 구하기
            int first = 1, second = 1;
            // 첫 번째, 두 번째 숫자는 모두 1
            for (int i = 2; i < num; i++) { // = for (int i = 0; i < num - 2; i++)
                // -2 를 하는 이유는 시작할 때 first 값과 second 값 2개를 알고 시작했기 때문에 세번째 값부터 구함
                res = first + second;
                first = second;
                second = res;
            }

            System.out.println("결과는 = " + res);
            System.out.println("first = " + first);
        }



    }
}
