import java.util.Scanner;

class ClassTest {
    private int num;
    // ? 프라이버시?

    public ClassTest(int num)   {
        //public의 뜻마냥 만천하에 공개하는 정보라는 뜻임
        // 누구나 볼 수 있음
        this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum()    {
        return num;
    }

    //결론 private 붙은 애들을 사용하고 싶으면 public 붙은 애들을 사용해라

    public void iCanCallYou()   {
        youCantCallMe();
    }
    private void youCantCallMe()    {
        System.out.println("넌 날 부를 수 없다.");
        //정말 안 뜨네 그럼 private가 아니라면?
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//ACL
    class ClassScore    {
        private int scores[];
        private double mean;
        private double variance;
        private double stdDeviation;

        public ClassScore(int studentsScoreArr[])   {
            int i = 0;
            scores = new int[studentsScoreArr.length];

            for (int studentsScore : studentsScoreArr)  {
                scores[i++] = studentsScore;
            }
        }
        public void calcAverage()   {
            int sum = 0;

            for (int i = 0; i < scores.length; i++) {
                sum += scores[i];
            }
            mean = (double) sum / (double) scores.length;
        }
        public void calcVariation() {
            int sum = 0;

            for (int i = 0; i < scores.length; i++) {
                sum += Math.pow((scores[i] - mean), 2); //Math.pow : 제곱함수
            }
            variance = (double) sum / (double)scores.length;
        }
        public void calcStdDeviation()  {
            stdDeviation = (double) Math.sqrt(variance);
        }

        public double getMean() {
            return mean;
        }
        public double getVariance() {
            return variance;
        }
        public double getStdDeviation() {
            return stdDeviation;
        }
    }


class DiceGame {
    private int comDice;
    private int userDice;

    public DiceGame () {
        comDice = getRandDice();
        userDice = getRandDice();
    }
    private int getRandDice () {
        return (int)(Math.random() * 6 + 1);
    }
    public void checkWinner () {
        if (comDice > userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) :: 컴퓨터 승\n", userDice, comDice);
        } else if (comDice < userDice) {
            System.out.printf("%d(사용자) vs %d(컴퓨터) :: 사용자 승\n", userDice, comDice);
        } else {
            System.out.printf("%d(사용자) vs %d(컴퓨터) :: 무승부\n", userDice, comDice);
        }
    }
}

class Fibonacci {
    private int[] fibArr;
    private Scanner scan;
    private int lastElement;

    public Fibonacci() {
        scan = new Scanner(System.in);
        System.out.print("구하고 싶은 피보나치 항은 몇 번째? ");
        lastElement = scan.nextInt();
        fibArr = new int[lastElement];
    }

    public Boolean calcLastElem() {
        if (lastElement <= 0) {
            System.out.println("0 or 음수항은 없습니다.");
            return false;
        } else if (lastElement < 3) {
            System.out.println("당신이 찾고자 하는 피보나치 수열의 항은 1입니다.");
            return false;
        } else {
            fibArr[0] = 1;
            fibArr[1] = 1;

            for (int i = 2; i < lastElement; i++) {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
                // System.out.printf("fibArr[%d] = %d\n", i, fibArr[i]);
            }
        }

        return true;
    }

    public int getLastElement() {
        return lastElement;
    }

    public int[] getFibArr() {
        return fibArr;
    }

    public int getLastFibArr() {
        return fibArr[lastElement - 1];
    }
}



public class Review9_1 {
    public static void main(String[] args) {
        ////AccessControlListTest
        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수는 = " + ct.getNum());

        //ct.setNum(10);

        //ct.num = 10;
        //->privat public 쓰는 이유? 최소한의 테러 방지

        System.out.println("바뀐 정수는 = " + ct.getNum());

        ////37. ACL 문제
        //기존에 Person 클래스 작성한 내용을 public, private을 적용하여 다시 프로그래밍해보자!

        Person A = new Person("프라이버시", 100);

        System.out.printf("이름 = %s, 나이 = %d\n", A.getName(), A.getAge());
        A.setName("이게 뭐지");
        System.out.printf("이름 = %s, 나이 = %d\n", A.getName(), A.getAge());


        ////AverageClassTest

        int studentsScoreArr[] = {100, 90, 80, 70, 60, 50, 40, 30};
        ClassScore cs = new ClassScore(studentsScoreArr);

        cs.calcAverage();
        cs.calcStdDeviation();
        cs.calcVariation();

        System.out.printf("우리반의 평균은 %.4f, 분산은%.3f, 표준편차는 %f\n", cs.getMean(), cs.getVariance(), cs.getStdDeviation());


        ////38. ACL 문제
        //평균, 분산, 표준편차를 계산하는 예제를 작성해봤다.
        //이 경우는 고정된 배열에 고정된 점수가 적용되어 있었다.
        //여태까지 배웠던 내용들을 총동원하여 키보드 입력을 통해 점수를 입력 받도록 만들자
        //또한 특정키를 입력하면 더 이상 점수 입력을 받지 않고
        //평균, 분산, 표준편차를 계산하도록 앞서 풀어본 예제를 업그레이드 해봅시다!

        // int studentsScoreArr[] = { 100, 92, 66, 77, 54, 89, 75, 60 };
        //        ClassScore cs = new ClassScore(studentsScoreArr);
        Scanner scan = new Scanner(System.in);

        int[] studentsScoreArr2 = new int[10];
        int code;

        while (true) {
            System.out.println("0누르면 기록, 1누르면 종료 ");

            code = scan.nextInt();

            if (code == 0) {
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%d번째 점수 입력 : ", i + 1);
                    studentsScoreArr2[i] = scan.nextInt();
                }
                ClassScore cs2 = new ClassScore(studentsScoreArr2);

                cs2.calcAverage();
                cs2.calcVariation();
                cs2.calcStdDeviation();

                System.out.printf("우리반의 평균은 %.4f, 분산 %.3f, 표준편차 %f\n",
                        cs2.getMean(), cs2.getVariance(), cs2.getStdDeviation());
            } else {
                System.out.println("프로그램 종료");
                break;
            }


        }

        ////39. ACL 문제
        //주사위 굴리기 문제를 ACL을 적용하여 풀어보자!

        DiceGame dg = new DiceGame();

        dg.checkWinner();


        ////40. ACL 문제
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
        //피보나치 수열의 n 번째 항을 구하는 프로그램을 클래스를 적용하여 풀이해보자!

        //공부방법
        //1. 코드를 눈으로 보고 이해
        //2. 일부는 작성, 일부는 복사해서 일단 동작하게 만들기
        //3. 모든 코드를 직접 작성
        //4. 소프트웨어 아키텍쳐 관점에서 프로그램을 설계하고 코딩하기

        Fibonacci fib = new Fibonacci();

        if (fib.calcLastElem()) {
            System.out.printf("피보나치 수열의 %d번째 항은 %d입니다.\n", fib.getLastElement(), fib.getLastFibArr());
        }

    }
}
