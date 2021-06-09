public class Quiz1for {
    public static void main(String[] args) {
        //1~10까지 춯력
       /* for (int i = 1; i <= 10; i++) {
            System.out.println(i); */ //내가 한거

        for (int i = 1; i < 11; i++) {
            //i는 11보다 작아야함=10까지 출력 그리고 1씩 증가
            System.out.printf("%3d", i);
            //3의 의미 = 3칸 띄우기
            //질문!!붙어 있으면 10인지 구별이 안되니까 공백 1칸을 추가로 확보한다.<<
            //위 부분이 이해가 안간다 공백 1칸을 추가로 확보한 부분이 어디있는지
            //모르겠다

            if (i % 5 == 0) { //5로 나눠지면 엔터,5배수 숫자 이후는 엔터적용
                System.out.println();


            }
        }
    }
}
