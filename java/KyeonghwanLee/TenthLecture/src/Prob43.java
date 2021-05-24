/*

//랜덤 연봉 적용을 해보자
//어떤 회사에 직원이 10명 있다.
//10명의 이름은 적당히 지어주도록 한다.
//이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
//또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
//10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
//또한 연별로 평균 연봉값을 계산해보도록 한다.


class Salary {
    final int MAX = 10;

    float sum; // 합
    float mean; // 평균
    int randArr[]; // 연봉 랜덤 배열
    int saup;// 인상된 연봉

    public Salary() {
        sum=0;
        randArr = new int[MAX];//10명의 랜덤값 배열

        for (int i = 0; i < MAX; i++){
            randArr[i] = (int)(Math.random()* 1100 + 2400 );//2400~3500사이의 값 랜덤하게 출력
            saup = randArr[i]+(randArr[i]*((int)(Math.random()*19+1 )/100));// 인상된 연봉?? 맞는건가?

            // for 문안에 연봉과 인상률을 같이 적용해야되나?
            // 머릿속으로는 크게 어떤식으로 하는게 그려지나 직접 식으로 구현하는데 어려움이 많네요....

        }

    }

    }
    public void calcMean(){
        for(int i = 0; i< MAX; i++){
            sum =+ randArr[i];//랜덥값들의 합
        }
        //연별로 평균값을 구하는걸
        mean = sum/ (int)MAX;// 전체합 나누기 10명
        System.out.println("직원들의 평균 연봉은"+ mean "만원입니다." );


    }

    public int getNum() {
        return MAX;
    }

    public float getSum() {
        return sum;
    }

    public float getMean() {
        return mean;
    }

    public int[] getRandArr() {
        return randArr;
    }
}

public class Prob43 {
    public static void main(String[] args) {
        Salary sy[];

        int num = 10;
        sy = new Salary[num];

        float totalsum= 0;
        float totalNumber = 0;


    }
}
/*