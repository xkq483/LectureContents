class RandomSalary {//클래스 RandomSalary는 메서드 역할로 커스텀할 수 있는 데이터 타입이 되며, new생성자를 통하여 호출된다.
    final int MAX = 10;          //------
    final float PERCENT = 0.01f; //     |--> 이것들은 RandomSalary의 필드(상태)고, 전역변수다. 전역변수는 값이 쭉 저장된다.
    int[] yearSalary;            //------

    public RandomSalary () {//public접근 제한자로 클래스를 하나 더 만들었다. 이것은 메서드1이다.
        yearSalary = new int[MAX];//yearSalary를 초기화했는데, int형의 배열값을 주었다. MAX는 10이다.

        for (int i = 0; i < MAX; i++) {//for문에서는 MAX가 10이니까 10번 돌아간다. 그 후 값을 배열yearSalary에 저장한다.
            yearSalary[i] = (int)(Math.random() * 1101 + 2400);//2400~3500이 랜덤으로 나온다.
        }
    }
    public void calcRandomSalary (int year) {//public접근 제한자로 클래스를 하나 더 만들었다. 이것은 메서드2다. 파라미터에 year를 주었다.
                                             //근데 year가 뭐지?
        float randIncRate;//float타입의 변수 randIncRate를 생성했다.

        for (int i = 0; i < year; i++) {//for문을 열어 year만큼 돌아간다. 그 후 randIncPate에 값이 저장된다.
            randIncRate = (float)(Math.random() * 20 + 1);//1~20이 랜덤으로 나온다.

            yearSalary[i] = (int)(yearSalary[i] * (1.0f + randIncRate * PERCENT));
        }// yearSalary[i] = (int)(yearSalary[i] + yearSalary[i] * randIncRate * PERCENT);
         //1.0f는 소숫점 나오게 한다. 근데 왜 얘가 +가 되어있을까? PERCENT는 뭐지? 함수같은데.
    }
    public void printSalary () {//public접근 제한자로 클래스를 하나 더 만들었다. 이것은 메서드3이다.
        for (int i = 0; i < MAX; i++) {//for문을 열어 MAX만큼 돌린다.
            System.out.println("연봉을 출력합니다: " + yearSalary[i]);//출력을 여기서 한다. getPrintSalary대신인가.
        }
    }
}

public class Prob43 {//Prob43이라는 메인메서드를 가진 클래스이다. 다른 클래스(메서드)들을 호출해서 빠르게 일처리하기 위한 클래스.
    public static void main(String[] args) {
        RandomSalary rs = new RandomSalary();//new RandomSalary라는 생성자를 통하여 RandomSalary라는 데이터 타입으로
                                             //rs라는 객체(인스턴스)를 생성하였다.

        rs.calcRandomSalary(10);//calcRandomSalary메서드(RandonSalary클래스 내부의) 안에 들어가서 입력값 10을 넣었다
                                     //그럼 for문을 통해 10번 돌아갈 것이다.
        rs.printSalary(); //printSalary(RandonSalary클래스 내부의)에는 출력 메서드가 있다. 앞전의 yearSalary변수를 가지고 와서
                          //출력할 것이다.
    }
}