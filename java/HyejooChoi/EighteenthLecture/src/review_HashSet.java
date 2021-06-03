// HashSet
// 특징 : 순서대로 저장되지 않음, 중복 값 허용하지 않음

// name.add(); : 값 추가
// name.remove(); : 값 삭제
// name.clear(); : 모든 값 삭제
// name.size(); : 데이터 크기
// name.contains(); : 값 포함 유무, boolean 타입
// name.isEmpty(); : 값 존재 유무, boolean 타입

// HashSet 선언 : HashSet<String> name = new HashSet<String>();



import java.util.HashSet;

public class review_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("소시지");
        set.add("HAM");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        set.add("HAM"); // 중복값 안나옴
        set.add("ham");

        System.out.println(set);

        // remove()
        set.remove("빵");
        System.out.println(set);
        
        // contains()
        System.out.println("contains() : " + set.contains("계란")); // 계란이 있으니까 true
        
        // isEmpty()
        System.out.println("isEmpty() : " + set.isEmpty()); // false

        // size()
        System.out.println("size() : " + set.size());

        // clear()
        set.clear();
        System.out.println(set);

        // clear하고 isEmpty
        System.out.println("isEmpty() : " + set.isEmpty()); // true

    }
}
/*
    질문 : contains()는 값의 포함유무, isEmpty()는 값의 존재 유무라고 나와있는데
    isEmpty()는 그냥 쓰면 false를 주고, clear()로 전체 값을 삭제해야지만 true가 나옵니다
    비교연산자중에 != 와 같은 역할인지 아니면 다른 이유가 있는건지 궁금합니다

 */