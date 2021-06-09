import java.util.ArrayList;

class ArrayListCnt {
    ArrayList<Integer> intLists;
    ArrayList<Integer> duplicateLists;

    public ArrayListCnt(){
        intLists = new ArrayList<Integer>();
        duplicateLists = new ArrayList<Integer>();

        for (int i=0; i<10; i++){
            intLists.add((int)(Math.random()*3+10));
        }

        for (int i=0; i<3; i++){
            duplicateLists.add(0);
        }
    }

    public void cntDuplicat(){

        for (int num : intLists){

            if (num == 10){
                duplicateLists.add(0, duplicateLists.get(10)+1);
                duplicateLists.remove(1);
            } else if (num== 11){
                duplicateLists.add(1, duplicateLists.get(11)+1);
                duplicateLists.remove(2);
            } else if(num==12){
                duplicateLists.add(2, duplicateLists.get(12)+1);
                duplicateLists.remove(3);
            }
        }
    }

    @Override
    public String toString() {
        return "ArrayListCnt{" +
                "intLists=" + intLists +
                ", duplicateLists=" + duplicateLists +
                '}';
    }
}

public class SelfTest49 {
    public static void main(String[] args) {
        ArrayListCnt alc = new ArrayListCnt();

        System.out.println(alc);

        alc.cntDuplicat();

        System.out.println(alc);
    }
}
