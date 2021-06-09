public class Quiz16 {
        public static void main(String[] args) {


            int num1 = 0;
            for (int i = 1; i <= 100; i++)  {
                //1으로 시작하고 100까지 조건. 1씩 더해서 함

                if (i % 11 == 0) //만약 나머지가 0이면
                    System.out.println("11배수 : " + i);
                    num1+=i; //0+i 빈곳에 i를 다 넣어주니까 합이 된다..!!
            }
            System.out.println("총 11배수의 합 = "+ num1);

        }


}