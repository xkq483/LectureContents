/*
뽑기 게임을 만들어 보자!
증벅ㅇ; 빌생하지 않게 랜덤한 배열에 사람이름을 무작위로 믹스
그리고 당첨자 번호를 3개 뽑도록 한다(중복x)
당첨된 사람의 이르을 출력하고 "당첨되셨습니다 ~ 축하합니다 출력

 */

import java.util.ArrayList;
import java.util.Arrays;

class Roulette{

    ArrayList<String> nameLists; //이름 집어넣을 어레이리스트
    String[] tmpArr;    //어레이 리스트에 넣은 이름을 복사할 배열
    String[] realChecker; //어레이 리스트에서 복사한 이름 배열을 섞은순서대로 이름을 재배치한배열
    int[] tmpIdx;   //섞은 숫자 넣을 배열

    int[] success;     //당첨점수 넣을것


    int nameLength; //학생인원수
    Boolean isRedudant; //while문 조건 변환

    /* 생성자 */
    public Roulette(String[] names ){
        nameLength= names.length;   //입력 어레이로 받은 학생수
        isRedudant= true;   //true로 초기화

        nameLists = new ArrayList<>();  //이름집어넣을 어레이리스트 생성
        tmpArr = new String[nameLength];  //?? 스트링배열 학생수만큼 생성
        tmpIdx = new int[nameLength];   //?? 숫자배열 학생수만큼 생성
        realChecker = new String[nameLength];

        success = new int[3];   //당첨점수 3으로 세팅
        int i =0;   //밑에 for문 돌 i

        for(String name : names){
            tmpArr[i++] = name; //스트링배열에 한명씩 학생이름 집어넣기 순서는 지금 들어온 순서랑같음
        }
    }

    /*복사 할지말지 확인 하는메소드*/
    private Boolean checkDuplicate(int idx){
        //입력값으로 idx번호 받음
        for(int i=0;i<idx;i++){ //for문을 idx범위만큼 실행
            if(tmpIdx[i]==tmpIdx[idx]){ //즉 범위내의 tmpIdx[i]가 일치하는수가있다면 true반환
                return true;
            }
        }
        //범위내의 tmpIdx[i]가 일치하는수가없다면 false반환
        return false;
    }

    /*섞는 메소드*/
    public void shuffle(){

        int i =0;   //int i 지정

        isRedudant = true;  //while문 제어조건

        do{
            tmpIdx[i] = (int)(Math.random()*nameLength); //tmpIdx[i]에 랜덤값 배정

            //복사확인 메소드 현재 i값을 입력값으로 줌 / 트루(즉 범위내 같은값이있으면 continue)
            if(checkDuplicate(i)){
                continue;
            }

            //범위내 같은값이 없어 내려왔다면 i++
            i++;

            //만약 i++ 한값이 학생수랑 같다면 while 제어조건 false
            if(i == nameLength){
                isRedudant = false;
            }

        }while(isRedudant);
    }
    /* 새로 추가한 메소드
    섞인번호(tmpIdx[i]) 를 새로운 당첨자 확인배열(realChecker)인덱스에 넣고
    그 대입값으로 사람들 이름이 순차적으로 들어가있는 배열(tmpArr[i])을 넣는다.
    */
    public void studentSetNum(){
        for(int i =0;i<nameLength;i++){
            realChecker[tmpIdx[i]] =tmpArr[i];
        }
        for(int i=0;i<nameLength;i++){
            System.out.println(realChecker[i]);
        }
    }
    /* 새로 추가한 메소드
    룰렛 세팅 제어 메소드
     */
    public void rouletteSet(){
        shuffle();
        studentSetNum();
    }

    /* 새로 추가한 메소드
    당첨숫자배열(success[])을 입력값으로 받아 당첨자확인배열(realChecker)의 인덱스에 순차적으로 넣어서 당첨자출력
    */

    private void winnerCheck(int[] success){
        for(int i=0 ; i<success.length;i++){
            System.out.println("당첨자는 "+realChecker[success[i]]+"축하합니다 !");
        }
    }
    /* 새로 추가한 메소드
    당첨확인 제어 메소드
    */
    public void winnerAnnounce(){
        checkSuccess();
        printSuccessArr();
        winnerCheck(success);
    }



    /*성공 확인 */
    public void checkSuccess(){


        int i  =0; // i 값 지정

        isRedudant = true;  //while 조건제어



        do{
            //위에랑 로직이 똑같음
            success[i] = (int)(Math.random()*nameLength);

            if(checkDuplicate(i)){
                continue;
            }

            i++;

            if(i == 3){
                isRedudant = false;
            }

        }while(isRedudant);

    }

    /*프린트 메서드 당첨번호를 알려줌 */
    public void printSuccessArr(){

        for(int i = 0; i<3; i++){
            System.out.printf("sucess[%d] = %d\n",i,success[i] );
        }
    }

    /*무언가의 정보 출력*/
    public String toString(){
        return "Roulette{"+"tmpIdx="+Arrays.toString(tmpIdx)+"}";
    }

}





public class TodayTest {
    public static void main(String[] args) {
        String[] names = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };

        //룰렛인스턴스 r을 만듬
        Roulette r = new Roulette(names);

        System.out.println(r);
        r.rouletteSet();
//        //셔플 발동
//        r.shuffle();
//        //셔플한후 부여받은 번호출력
//        System.out.println(r);
//        r.studentSetNum();


        r.winnerAnnounce();


    }







}
