public class h_Quiz10Challenge {
    //10. 관계 연산자 문제(Challenge - 질문 노트 포함)
    //1000개의 데이터가 있다.
    //여기서 C에 해당하는 데이터는 30개 있다.
    //F에 해당하는 데이터는 500개 있다.
    //B에 해당하는 데이터는 240개 있다.
    //A에 해당하는 데이터는 700개 있다.
    //D에 해당하는 데이터는 350개 있다.
    //C 혹은 F 둘 중 하나의 케이스를 판정하고자 한다.
    //어떻게 하면 가장 효율적으로 이 케이스들을 찾아낼 수 있을까 고민해보자!
    public static void main(String[] args) {

        int bigFrontCnt = 0, smallFrontCnt = 0;

        for(int i = 1; i <= 1000; i++) {
            if(((++bigFrontCnt != 0) && (i % 2 == 0)) || ((++bigFrontCnt != 0) && (i % 33 == 0))) {
                ;
            }
            if (((++smallFrontCnt != 0) && (i % 33 == 0 )) || ((++smallFrontCnt != 0) && (i % 2 == 0))) {
                ;
            }
        }
        System.out.println("큰놈이 앞에 있을 때: " + bigFrontCnt);
        System.out.println("작은놈이 앞에 있을 때: " + smallFrontCnt);

    }
}
