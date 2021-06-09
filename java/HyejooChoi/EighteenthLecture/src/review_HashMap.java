// HashMap
// key와 value가 분리된다, 많은 양의 데이터가 저장될 때 유용, 검색에 최고성능

// name.put(key, value); : 값 추가
// name.remove(key); : key값으로만 요소삭제
// name.clear(); : 모든 값 삭제

// 출력 방법
// 1. println(name); : {}로 묶여 전체 출력
// 2. println(name.get(key)); 특정 key 값의 value 출력
// 3. entrySet() : Key와 Value의 값이 모두 필요한 경우 사용
// 4. keySet() : Key 값만 필요한 경우 사용

// HashMap 선언 :  Map<Key Value> name = new HashMap<>();
// key : 중복불가, value : 데이터의 중복된 값 사용가능
// 특정 데이터타입을 지켜줘야 하는 건 없다.
// 어떤 곳에서 사용? -> 가게에서 물건의 가격을 알고싶을 때 물건의 이름 검색하면 바로 가격이 나오게 할 수 있다 등등


import java.util.HashMap;
import java.util.Map;

class Student1 {
    int age;
    String name;

    public Student1 (int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class review_HashMap {
    public static void main(String[] args) {
        // 특별히 특정 데이터타입을 지켜줘야 하는 것은 없다.
        // 나는 "열쇠"를 키로 사용하고 "으아아앜!"을 값으로 쓸거야! 하면 쓰면 된다.
        Map<Integer, Student> st = new HashMap<Integer, Student>();

        // 앞에 오는 숫자는 인덱스가 아니다.
        // 단지 사물함을 여는데 필요한 열쇠일 뿐
        st.put(7, new Student(42, "Bob"));
        st.put(2, new Student(33, "Chris"));
        st.put(44, new Student(27, "Denis"));
        st.put(3, new Student(29, "David"));

        System.out.println(st);

        // key 2 삭제
        st.remove(2);
        System.out.println(st);

        // key값 3이 중복될 때 -> 마지막에 입력된 key값으로 대체됨
        st.put(3, new Student(77, "Jesica"));
        System.out.println(st);


        for (Map.Entry<Integer, Student> s : st.entrySet()) {
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        // 나는 "열쇠"를 키로 사용하고 "으아아앜!"을 값으로 쓸거야! 하면 쓰면 된다.
        Map<String, String> strMap = new HashMap<String, String>();

        strMap.put("열쇠", "으아아앜!");

        // HashMap을 사용할때는 이 방식이 변하지 않습니다.
        // 추상화의 연장선 관점에서 아래 사항을 준수하여 코딩하면 어떤 상황에서든 key, value 값을 얻을 수 있습니다.
        // Entry<키 데이터타입, 밸류 데이터타입> 형식은 지켜주세요.
        for (Map.Entry<String, String> map : strMap.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}


