class Solution_1 {
    String name;

    Solution_1() {}
    Solution_1(String _name) {
        this.name = _name; //this는 클래스의 변수를 뜻한다. 매개변수와 헷갈리지않도록사용
    }

}

class Solution_2 {
    int value;
    String name;
    public Solution_2() {}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class ErrorPractice {
    public static void main(String[] args) {

        Solution_2 d2 = new Solution_2();
        d2.setName("이름");
        d2.setValue(500);

        System.out.printf("%s\n%d",d2.getName(),d2.getValue());
    }
}
