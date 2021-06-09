import java.util.HashSet;

public class Review {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        //HashSet으로 지정하는것과 그냥 Set로 지정하는것의 차이가 무엇인가요?
        hs.add("정도영");
        hs.add("정주영");
        hs.add("정호영");
        //hs.remove("정도영"); Arraylist와 같게 remove, clear 모두 가능하다!
        System.out.println(hs);
        //HashSet는 Arraylist와 비슷하나 더 빠르고, 수월하게 많은 데이터를
        //짧은 시간에 처리할 수 있다. 그러나 순서를 보장해주지 않는다!

        //HashSet는 명확히 배열이 아니라 Collection, 즉 집합이다!
        //HashSet는 배열보다 집합(SET)이라고 보는것이 정확하다.
        //집합이기때문에 순서를 딱히 고려하지 않고 중복을 허용하지 않는다!!

        //배열과 컬렉션의 구체적인 차이가 중복의 허용의 유무인것같다!

    }
}
