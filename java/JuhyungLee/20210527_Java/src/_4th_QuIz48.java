import java.util.ArrayList;
public class _4th_QuIz48 {
    public static void main(String[] args) {
//        뽑기 게임
//        중복이 발생하지 않게 랜덤한 배열에 사람 이름을 무작위로 믹스한다.
//                그리고 당첨자 번호를 3개 뽑도록 한다(마찬가지로 중복 x)
//        당첨된 사람의 이름을 출력.
        String[] studentlist = {"박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"};
        ArrayList<String> lotto = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            int num = (int) (Math.random() * 28);  // 중복이 될 수 있음
            lotto.add(studentlist[num]);
        }
        for (String lottowinner : lotto) {
            System.out.println("당첨자는: " + lottowinner);
        }
    }
}