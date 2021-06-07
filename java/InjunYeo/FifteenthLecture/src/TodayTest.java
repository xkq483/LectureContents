/*
ArrayList에 중복을 허용하여 랜덤숫자를 10개만든다.
랜덤 숫자의 범위는 10~12이다.
여기서 각각의 숫자들이 몇개씩 중복 되었는지 카운트 해보자
ArrayList.add(x):x를 현재 리스트에서 가장 마지막에 추가함
ex>0,1,4,8
ArrayList.add(77)
ex>0,1,4,8,77
ArrayList.add(idx,x)x를 idx인덱스 위치에 저장하고 기존에있던 정보를 뒤로  한칸씩 밀어버림
ex>0,1,4,7
ArrayList.add(2,77)
ex>0,1,77,4,8
 */

import java.util.ArrayList;

class randNum {
    final int SET_NUM = 10;
    ArrayList<Integer> nums;
    ArrayList<Integer>duplicateLists;

    final int RAND_RANGE = 3;
    randNum() {

        nums = new ArrayList<>();
        makeRandNum();

    }

    private void makeRandNum() {
        for (int i = 0; i < SET_NUM; i++) {
            nums.add((int) (Math.random() * 3 + 10));
        }
    }

    public void checkDuplication(){

        for(int num : nums){

        }
    }
}


public class TodayTest {
    public static void main(String[] args) {

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        ArrayList<Integer>arr = new ArrayList<Integer>();
        for(int i =0; i<10;i++){
           int num = (int)(Math.random()*3+10);
           arr.add(num);
        }

        for(int num : arr ){
            if(num ==10){
                cnt1+=1;
            }
            else if(num == 11){
                cnt2+=1;
            }
            else if(num == 12){
                cnt3+=1;
            }

        }
        System.out.println("10의 개수는 : "+ cnt1);
        System.out.println("11의 개수는 : "+cnt2);
        System.out.println("12의 개수는 : "+cnt3);
    }
}
