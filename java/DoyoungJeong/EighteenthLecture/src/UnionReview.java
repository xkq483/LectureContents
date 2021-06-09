import java.util.HashSet;

public class UnionReview {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        HashSet<String> name1 = new HashSet<String>();

        name.add("정도영");
        name.add("김진우");
        name.add("이종화");

        name1.add("김명수");
        name1.add("황철수");
        name1.add("정도영");

        HashSet<String> union = new HashSet<String>(name); //뒤 소괄호에 변수명을 적어서 값을 다른 세트에 넣을 수 있다.
        union.addAll(name1);
        //.addAll(); 합집합을 만드는 코드이다.
        System.out.println(union);
        //합집합을 만든다. 모두 합치지만 집합이기때문에 중복은 제거한다.

        HashSet<String> intersec = new HashSet<String>(name);
        intersec.retainAll(name1);
        //retainAll(); 교집합을 만든다.
        System.out.println(intersec);
        //두 그룹에서 겹치는 요소만 보여준다.

    }
}
