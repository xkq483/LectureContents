/* import java.util.ArrayList;

class Roulette {
    ArrayList<String> nameLists;
    final int winner = 3;
    int[] randNum;

    String[] names = {
            "박세진", "김창욱", "김민규", "김중연", "문성호",
            "강병화", "최승현", "유종현", "한상우", "전승리",
            "이경환", "최준환", "김원석", "여인준", "이태양",
            "김윤영", "정도영", "황정아", "임초롱", "김남교",
            "이주형", "김도연", "최혜주", "김도혜", "고재권",
            "임익환", "안보미", "이상훈"};
    int nameLength;

    int[] threeWinner;

    public Roulette() {
        nameLists = new ArrayList<String>(names);

        nameLength = names.length;
        // 28개 생성


    }
    public String randNumber() {
        for (int i = 0; i < winner; i++) {
            randNum[i] = (int)(Math.random() * nameLength);
            // length에서 랜덤으로 세번을 뽑아라, randNum[i]는 결국 이름의 몇번째를 가르킴
            }
    }
    public void iae //중복문제 해결
    public int[] getRandNum() {
        return randNum;
    }
}
//뽑기 게임을 만들어보자!
//아래와 같은 클래스룸 멤버들의 이름을 적어놓고 문제를 풀어보자!
//
//String[] name = {
//    박세진, 김창욱, 김민규, 김중연, 문성호,
//    강병화, 최승현, 유종현, 한상우, 전승리,
//    이경환, 최준환, 김원석, 여인준, 이태양,
//    김윤영, 정도영, 황정아, 임초롱, 김남교,
//    이주형, 김도연, 최혜주, 김도혜, 고재권,
//    임익환, 안보미, 이상훈
//};
//
//중복이 발생하지 않게 랜덤한 배열에 사람 이름을 무작위로 믹스한다.
//그리고 당첨자 번호를 3개 뽑도록 한다(마찬가지로 중복 x)
//당첨된 사람의 이름을 출력하고 "당첨되셨습니다. 누구 누구 누구 축하합니다 ^^" 를 출력하자!

// 1. 클래스 생성
// 2. 변수 생성 ( 이름 배열, 당첨번호 3개(고정),
// 3. 생성자 (
// 4. 중재자(
// 5. 기능
//    - 랜덤 3명 뽑기 >> 문자열의 랜덤 n번째를 뽑는다 > 3번 뽑는다. 구현
//    - 몇번째의 변수값을 뽑는다.
//    - 뽑힌 변수값을 출력한다.(tostring)
public class c_Quiz48 {
    public static void main(String[] args) {
        String[] names = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };
        Roulette r = new Roulette(names);
        System.out.printf("당첨자는 %s", r.getRandNum());



    }
}
*/
