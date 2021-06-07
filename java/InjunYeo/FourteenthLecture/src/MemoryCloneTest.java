/*
최종결론
객체는 메모리 자체를 전달하며
값은 메모리가 아닌 값을 전달한다.
 */



class CloneMemory{
    int[] arr;
    int num;

    public CloneMemory(){
        arr = new int[3];
        num = 3;

        for (int i=0;i<3;i++){
            arr[i] = (int)(Math.random()*6+1);
        }
    }

    public void reRandArr(){
        for(int i =0; i<3;i++){
            arr[i] = (int)(Math.random()*6+1);
        }
    }

    /*
    게터가 모두 클론임을 증명해보자
    일단게터로 배열값을 리턴받아 어딘가에 저장
    다음에 메서드를 사용해서 객체의 배열의 값을 변경한다
    리턴받아 저장했던 배열을 출력했을때 결과가 같으면 객체가 전달된것이고
    만약다른 결과가 도출된다면 복제였음을 알수있다.
    결론: 결국 객체에 대한 리턴이므로 메모리 정보가 전달됨.
     */


    public int[] getCloneArr(){
        return arr;
    }

    public int getNum(){
        return num;
    }


    public String toString(){
        return"arr[0]"+arr[0]+",arr[1]"+arr[1]+",arr[2] = "+arr[2];
    }


    public int reNum(){
        num = 7;
        return num;
    }

}


public class MemoryCloneTest {
    public static void main(String[] args) {
        CloneMemory cm = new CloneMemory();
        System.out.println(cm);
        int[] save = cm.getCloneArr();
        System.out.printf("save[0] = %d,save[1] = %d,save[2] = %d \n",save[0],save[1],save[2]);

        cm.reRandArr();
        System.out.println(cm);
        System.out.printf("save[0] = %d,save[1] = %d,save[2] = %d \n",save[0],save[1],save[2]);

        //자바에서 객체에 대한 접근은 모두 메모리를 제어하는 방식이 된다.

        int num = cm.getNum();

        System.out.println(num);
        cm.reNum();
        System.out.println(num);
        System.out.println(cm.reNum());

    }
}
