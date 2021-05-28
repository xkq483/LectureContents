/*
사람이름이들어있는 배열 입력받고 -> 그사람들에게 중복없이 추첨번호 부여-> 당첨번호 3개뽑은후(중복없이)-> 추첨번호 확인후 당첨자 확정
 */
/*
질문 1. 키와 밸류 값처럼 특별한 키에 맞춰 밸류값이 호출되는 자료구조가 자바에는 어떤게 있나요?
 */

import java.util.ArrayList;

class DrawGame{
    //당첨자 숫자
    final int PRIZE_NUM = 3;

    //
    ArrayList<String> people;
    String[] peopleGetNum;
    int[] getRandNum;
    int[] prizenum;

    int peopleCount;




    public DrawGame(String[] names){

        peopleCount = names.length;

        people = new ArrayList<>();
        for(int i=0;i< peopleCount;i++){
            people.add(names[i]);
        }

        peopleGetNum = new String[peopleCount];
        getRandNum = new int[peopleCount];
        prizenum = new int[PRIZE_NUM];
    }

    public void createRandNum(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            arr[i] = (int) (Math.random() * peopleCount);
            if (checkDuplication(arr,i)) {
                continue;
            }
            i++;

        }

    }

    private boolean checkDuplication(int[] arr,int idx){
        for(int i=0;i<idx;i++){
            if(arr[idx] == arr[i]){
                return true;
            }
        }
        return false;
    }

    public void makeNum(){
        createRandNum(getRandNum);
        createRandNum(prizenum);
    }

    public void makePeopleNum(){
        makeNum();
        for(int i=0;i<peopleCount;i++){
            peopleGetNum[getRandNum[i]] = people.get(i);
        }
        for(int i=0;i<peopleCount;i++){
            System.out.println(peopleGetNum[i]);
        }

    }

    public void prizeChecker(){
        System.out.printf("당첨번호는 %d, %d, %d 입니다\n",prizenum[0],prizenum[1],prizenum[2]);
        for(int i =0; i<PRIZE_NUM;i++){
            System.out.println("당첨자는 "+peopleGetNum[prizenum[i]]+"님 입니다. 축하합니다!");
        }
    }






}



public class TodayPractice {
    public static void main(String[] args) {
        String[] names = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };

        DrawGame d = new DrawGame(names);
        d.makePeopleNum();
        d.prizeChecker();

    }
}
