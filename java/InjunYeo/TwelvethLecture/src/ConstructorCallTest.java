
class Students{
    String name;
    int score;

    public Students(String names){
        score = (int)(Math.random()*40+61);
        this.name = name;

        }
    public String getName(){
    return name;
    }
    public  int getScore(){
    return score;
    }
}


class School{
    final  int MAX =3;
    final String[] names = {"준","인","여"};
    Students[] arr;

    public School(){
        arr = new Students[MAX];

        for(int i =0; i<MAX;i++){
            arr[i] = new Students(names[i]);
        }
    }

    public void  printStudentsInfo(){
        for(int i =0;i<MAX;i++){
            System.out.printf("학생 이름은 %s, 점수는 %d 입니다.\n",arr[i].getName(),arr[i].getScore());
        }
    }
}

public class ConstructorCallTest {
    public static void main(String[] args) {

    }
}
/*
생성자는 어디서든 생성이 가능하다.
 */
