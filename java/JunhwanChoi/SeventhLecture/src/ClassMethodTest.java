class Teacher
{
    int age;
    String name;
    String major;



//우선 제일 간단한 Getter, Setter
// 클래스 내부에  마우스 커서를  갖다놓고 알트+INSERT
// Getter & Setter 전부선택하고 OK

// 메서드를 만드는 방법
// 1.먼저 return 타입을 작성
// 2.메서드의 이름을 작성(용도에 맞게)
//   보통 Getter의 경우 값을 얻고자 할때( 즉 return 용도로 사용 )
//   Setter의 경우 값을 설정하고자 할때 사용
//   그 외에도 커스텀 메서드의 경우엔
//   자동 완성 기능으로 만들 수 없기 때문에 메서드 작성법에 대해 알 필요가 있다.
// 3. 소괄호 내부에 인자로 입력 받을 매개변수를 설정한다.
// 4. 중괄호 내부에 해당 메서드(기능)이 수행할 업무를 작성한다.

// 누군가가 age가 궁금해서 물어본다
// 이에 대한 답을 해준다면 Getter에 해당
// 클래스 작성할 때는 이니셜마다 대문자를 붙였다.
// 메서드는 시작은 소문자 그 이후부터의 이니셜은 대문자
// 소괄호 내부는 인자가 배치되는데 텅 비어 있는 것은 입자(입력)이 없다는 것이다.


    int getAge() {
        return age;
    }

    //회원가입시 집 주소 적으라고 나오는데 여기서 입력하는 값ㄱ들을 처리하는게 Setter에 해당
    // 특정한 값을 설정하는 목적으로 Setter가 사용된다.
    // 결론 : 값을 얻는 목적으로 사용하는 것이 Setter

    void setAge(int age){ //int age= 입력으로 들어온 age
        //this.age는 클래스 내부에 있는 age를 의미
        // age는 입력으로 들어온 age에 해당
        this.age= age;  // class 내부에있는 this.age를 인자로 받은 int age , 즉 40으로 저장하라는뜻 --> this.age= 40이됨
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name=name;
    }

    String getMajor(){
        return  major;
    }
    void setMajor(String major){
        this.major=major;
    }


}

public class ClassMethodTest {
    public static void main(String[] args) {

        Teacher t= new Teacher();

        // get = '얻겠다', set = '설정하겠다' 라고 생각하셈

        t.setAge(40);
        t.setMajor("Physics");
        t.setName("CHOIJUNHWAN");

        System.out.printf("%s는 %s를 전공하였고, %d세이다.",t.getName(),t.getMajor(),t.getAge());
    }
}
