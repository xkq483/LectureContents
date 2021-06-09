public class _3rd_InterruptComment {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0 ; ; i ++){
            if (i % 2 ==0){
                System.out.println("안녕 난 짝수야");
            } else {
                System.out.println("하이 난 홀수야");
            }
            Thread.sleep(500);
        }
    }
}
// Interrupt:
//      >> 하드웨어 개발자들이 주로 사용하는 단어.
//      >> 보통 Java나 GUI 개발자들 혹은 App 개발자들은 Event라고 표현한다.
//      >> 결국 Event와 Interrupt는 동의어
// Event:
//      >> 기본적으로 Event라는 것은 최우선적으로 처리해야 하는 작업으로
//      >> 어떤 작업보다도 우선순위가 높은 것들을 말 한다.
//      >> 마찬가지로 위에서 Thread.sleep()을 하는 작업도 일종의 Event(Interrupt)에 해당한다
//      >> 따라서 이 작업이 시작되면 다른 모든 작업들을 제쳐두고 이것을 최우선적으로 처리하게 된다.
//      >> 물론 조금 더 정확한 것은 cpu의 동작과 Thread의 동작 과정에 대해 설명할 때 자세히 기술할 예정.

// 결국 Thread.sleep(500)이 가장 중요한 작업이므로
// 이 작업을 완료하기 전까지는 어떠한 작업도 수행하지 않는다는 뜻.
// 그래서 0.5(millis:500)초 동안은 무조건적인 대기를 하게 된다.

// throw에 대한 건 나중에 설명