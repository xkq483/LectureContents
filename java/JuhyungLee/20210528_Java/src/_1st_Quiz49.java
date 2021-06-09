import java.util.ArrayList;
public class _1st_Quiz49 {
    public static void main(String[] args) {
        // ArrayList에 중복을 허용하여 랜덤 숫자 10개 생성.
        // 숫자의 범위는 10~12
        // 여기서 각각의 숫자들이 몇 개씩 중복되었는지 count.

        // ArrayList에 data type 적을 때는 class type으로 적어야됨. int > Integer
        ArrayList<Integer> number = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            //number.set(i, (int)(Math.random() * 3 + 10)); 이거는 왜 오류가 나지..?
            number.add((int)(Math.random() * 3 + 10));
        }
        for(int numberprint : number){
            System.out.println("잘 들어가나 확인용: " + numberprint);
        }
        System.out.println(number.indexOf(10));
    }
}


