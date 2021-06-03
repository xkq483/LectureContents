import java.util.HashSet;

public class SetNonDupliReview {
    public static void main(String[] args) {

        HashSet<Integer> num = new HashSet<Integer>();

        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10+1);
        }
        for(int arr : numArr) {
            System.out.print(arr + "\t");
            System.out.println();
            if(!num.add(arr)) {
                //num이라는 집합에 arr을 집어 넣을 때 해당 원소가 있어서 들어갈 수 없으면 false를 반환하고,
                //없어서 num이라는 집합에 들어갈 수 있으면 true를 반환한다.
                //겹치는 값이 있어서 false가 나올 때 앞에 !부정으로 false를 true로 바꿔주니
                //if가 참일 시 중복감지 내용이 프린트된다.
                System.out.println("중복이 감지되었습니다. 중복된 숫자는 : " + arr);
            }
        }
        System.out.println("겹치지 않고 들어간 숫자의 개수 즉, 집합안의 개수는 : " + num.size());
        //num은 집합이니 중복이 안돼 담긴 값들은 중복이 아닌 값들만 담긴다.

    }
}
