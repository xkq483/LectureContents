public class GetterSetter07 {
    int age;
    String name;
    String major;
    int getAge(){
        return age;

    }
    void setAge(int age){
        this.age = age;

    }
    String getName(){
        return name;

    }
    void setName(){
        this.name = name;
    }
    String getMajor(){
        return  major;
    }
    void setMajor(){
        this.major =major;
    }
    //특정한 값을 설정하는 목적으로 setter가 사용된다.
    // 회원가입시 집 주소 적으라고 나오는데 여기서 입력하는 값들을 처리하는게 setter에 해당한다.

    public static void main(String[] args) {
        GetterSetter07 t = new GetterSetter07();
// 매서드를 만드는 방법
        //1. 먼저 return 타입을 작성한다.
        // 2. 매서드의 이름을 작성한다(용도에 맞게)
        //  보통 getter의 경우 값을 얻고자 할떄 (즉 return 용도로 사용)
        // setter의 경우 값을 설정하고자 할때 사용한다.
        // 그외 커스텀 메서드의 경우엔
        // 자동 완성 기능으로 만들 수없기 때문에 메서드 작성법을 알필요가 있다.
        //3. 소괄호 내부에 인자로 입력 받을 매개변수를 설정한다.
        //4. 중괄호 내부에 해당 매서드(기능)이 수행 할 업무를 작성한다.

        //누군가가 age 가궁금해서 물어본다.
        // 이에대한 답을 해준다면, getter에 해당한다.




    }
}
