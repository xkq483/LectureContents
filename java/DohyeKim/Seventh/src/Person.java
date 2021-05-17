class Person2 {
        int age;
        String name;
    }

    public class Person {
        public static void main(String[] args) {
            // 클래스는 사용자가 직접 만들 수 있는 데이터타입(커스텀 가능)
            // 변수를 만드는것과 동일하게 클래스를 사용해서 변수를 만들어보자!
            Person2 person = new Person2();

            // 새로운 개념 new를 통해 공간을 만드는 방법
            // 1. new 를 적는다.
            // 2. 데이터타입을 적는다.
            // 3. 만약 데이터타입이 배열이라면 대괄호를 열고 몇 개를 만들지 적는다.
            //    만약 데이터타입이 클래스라면 소괄호를 열고 닫은후 필요하다면 인자를 설정한다.
            //    (여기서 인자 다루는 방법은 아직 학습하지 않음)

            person.age = 21;
            person.name = "안녀엉";

            System.out.println("이 사람은 며짤 ? " + person.age);
            System.out.println("얘 이름은 뭐 ? " + person.name);
        }
    }



