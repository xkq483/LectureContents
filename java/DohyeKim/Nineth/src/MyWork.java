class Homework{
    int num;
    void setNum(int num){
    this.num = num;}

    int getNum(){
    return num;
    }
        }
public class MyWork {
    public static void main(String[] args) {
        Homework work = new Homework();
        work.setNum(9);
        System.out.printf("%d 일차 숙제 연습해보자",work.getNum());
    }
}
