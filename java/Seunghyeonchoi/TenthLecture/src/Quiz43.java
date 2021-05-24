import javax.swing.text.Style;
import java.util.Scanner;

class AnnualSalary  {
    int sal[] = new int[10]; //연봉을 입력할 배열 생성
    double raise[] = new double[10]; //마찬가지로 인상률 배열 생성
    double finalsal[] = new double[10];  //최종 연봉
    //String[] name; //사원 이름 입력받을 배열

    public AnnualSalary()  {
        for (int i = 0; i < 10; i++) {
            sal[i] = (int) (Math.random() * 1100 + 2400);
        }

        for (int i = 0; i < 10; i++) {
            double sum = 1;
            for (int d = 0; d < 10; d++) {
                sum *= (double) (Math.random() / 5 + 1);
                System.out.println("sum값은 : " + sum);
            }
            raise[i] = sum;
            finalsal[i] = raise[i] * sal[i];
        }

    }

    public int[] getSal()   {
        return sal;
    }
    public double[] getRaise()  {
        return raise;
    }
    public double[] getFinalsal()   {
        return finalsal;
    }

}

public class Quiz43 {
    public static void main(String[] args) {
        ////43. 클래스 배열 문제
        //랜덤 연봉 적용을 해보자
        //어떤 회사에 직원이 10명 있다.
        //10명의 이름은 적당히 지어주도록 한다.
        //이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
        //또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
        //10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
        //또한 연별로 평균 연봉값을 계산해보도록 한다.   -> 배열로 저장해두면 나중에 계산할 때 편하겠지?
        Scanner scan = new Scanner(System.in);
        String employeesNameArr[] = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("연봉을 구할 %d번째 회사원을 입력해주세요 : ", i + 1);
            employeesNameArr[i] = scan.nextLine();
        }

        AnnualSalary cs = new AnnualSalary();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%s 회사원의 시작 연봉은 %d이며 10년 후 연봉은 %d이다.\n", employeesNameArr[i], cs.getSal()[i], cs.getFinalsal()[i]);
        }
        //위에서 구한 sal, finalsal 값을 불러오질 못하겠습니다(오류)
        //getSal만 넣으면 연봉은 정상적으로 나오는데 getFinalsal까지 넣으면 오류가 뜹니다.

        //gg

    }
}
