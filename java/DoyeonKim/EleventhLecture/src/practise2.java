class RandomSalary3 {
   final float PERCENT = 0.01f; //상수값

   String name;
   int salary;

   public RandomSalary3 (String name) {
      this.name = name;
      salary = (int)(Math.random() * 1101 + 2400); // 2400~ 3500까지 랜덤 연봉 이름마다 지정
   }

public void calcRandomSalary (int year) {//기능마다 나눠준 코드
   float incRate = (int)(Math.random() * 20 + 1); //1~20% 랜덤 인상률

   salary = (int)(salary + salary * incRate * PERCENT); //연봉 계산
   }
   public void printRandomSalary () { //출력
      System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
   }

   public int getSalary() {
      return salary; //외부로 꺼내줌
   }
}


// 랜덤 연봉 적용을 해보자
// 어떤 회사에 직원이 10명 있다.
// 10명의 이름은 적당히 지어주도록 한다.
// 이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
// 또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
// 10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
// 또한 연별로 평균 연봉값을 계산해보도록 한다.

// 1. 랜덤 연봉 범위 2400 ~ 3500
// 2. 직원은 10명임 (고정 상수 10 사용)
// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점 (0.01 사용)
// 7. 각 연도별 평균값에 대한 정보가 필요함
public class practise2 {
   public static void main(String[] args) {
      String[] nameArr = { //이름 배열
              "강한별", "강한빛", "강경수", "임종수", "백종수",
              "최빛나", "최창수", "박창수", "김창수", "김명수"
      };

      int nameLen = nameArr.length; //10
      RandomSalary3[] st = new RandomSalary3[nameLen]; //호출해준다

      for (int i = 0; i < nameLen; i++) { //이름수 만큼 랜덤으로 연봉을 지정해준다
         st[i] = new RandomSalary3(nameArr[i]); //이름 하나하나에 넣어준다
      }

      for (int i = 0; i < 10; i++) { //여기서 해서 10년치 하는것?
         float sum = 0; //합산값 초기화

         for (int j = 0; j < nameLen; j++) { //1년치
            st[j].calcRandomSalary(10); //랜덤 인상률과 여기서 salary 연봉계산값을 해줌
            sum += st[j].getSalary(); //연봉들 합해주게됨
            st[j].printRandomSalary(); //현재 연봉 글 출력

         }
         System.out.println("올해 평균 연봉 =" + (sum / 10.f));
      }
   }
}
