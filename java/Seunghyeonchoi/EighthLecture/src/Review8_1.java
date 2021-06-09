class Contest   {
    //여기부터~
    int age;
    String name;
    //여기까지 데이터 저장 영역

    //이제 기능 설정 영역
    //생성자는 아래와 같이 여러 형식으로 구성할 수 있다.
    //이와 같이 이름이 같고 입력이 다른 케이스로 매서드를 사용하는 방식에 대해 함수 오버로딩이라고 한다.
    //입력의 개수를 가지고 판단하지 않으며 사용되는 입력에 데이터타입을 보고 판단함.

    Contest()   {
        System.out.println("안녕 나는 Contest()라고 해.");
    }
    Contest(int a)  {
        System.out.println("안녕 나는 Contest(int a) 이라고 해");
        age = a;
    }
    Contest(float a)    {
        System.out.println("안녕 나는 Contest(float a) 이라고 해");
    }
    Contest(int a, String n)    {
        System.out.println("안녕 나는 Contest(int a, String n) 이라고 해");
        age = a;
        name = n;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    // 기능 설정 영역 종료
}

class Dice  {
    int comDice;
    int userDice;

    int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    }
    Dice()  {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }

    Boolean userWin()   {
        System.out.printf("%d(컴퓨터) vs %d(사용자)\n", comDice, userDice);

        if (comDice > userDice) {
            return false;
        }else if (comDice < userDice) {
            return true;
        }else {
            System.out.println("무승부입니다.");
            return false;
        }
    }
}

public class Review8_1 {
    public static void main(String[] args) {
        Contest ct1 = new Contest();
        Contest ct2 = new Contest(10);
        Contest ct3 = new Contest(29, "hu");
        Contest ct4 = new Contest(3.3f);
        Contest ct5 = new Contest(40);

        //우리가 사용하는 모든 데이터는
        //메모리에 올라가야지만 사용할 수 있고 눈으로 볼 수 있다(메모리는 DRAM)
        //결국 객체라는 단어 자체는 메모리에 데이터를 올렸습니다의 추상화된 표현이라 볼 수 있다.

        // 여기서 사용하던 Setter는 어디로???
        // 결국 생성자는 객체를 처음 생성할 때 초기값을 설정해주는 역할을 수행한다.
        // 결론적으로 초기 생성에 한정하여
        //  초기 생성에 한정하여 Setter의 역할을 대신해줄 수 있다.

        System.out.printf("ct1 name = %s, age = %d\n", ct1.getName(), ct1.getAge());
        System.out.printf("ct2 name = %s, age = %d\n", ct2.getName(), ct2.getAge());
        System.out.printf("ct1 name = %s, age = %d\n", ct1.getName(), ct1.getAge());

        System.out.printf("ct3 name = %s, age = %d\n", ct3.getName(), ct3.getAge());
        System.out.printf("ct4 name = %s, age = %d\n", ct4.getName(), ct4.getAge());
        System.out.printf("ct5 name = %s, age = %d\n", ct5.getName(), ct5.getAge());

        Dice td = new Dice();

        if (td.userWin())   {
            System.out.println("사용자의 승리입니다.");
        }else {
            System.out.println("컴퓨터를 이기지 못했습니다.");
        }

    }
}
