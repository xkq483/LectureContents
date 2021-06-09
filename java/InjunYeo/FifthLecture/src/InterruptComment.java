public class InterruptComment {
    public static void main(String[] args) throws InterruptedException {
        for(int i =0;;i++){
            if(i%2 ==0){
                System.out.println("안녕 난 짝수야");
            }
            else{
                System.out.println("하이 난 홀수야!");
            }
            Thread.sleep(500);
        }

    }
}

/*
Interrupt: 인터럽트란 무엇인가
사실 인터럽트라는 용어는 하드웨어 개발자들이 주로 사용하는 단어이다.
보통 자바나 GUI 개발자들 혹은 애플리케이션 개발자들은 이벤트라고 표현한다
결국 이벤트와 인터럽트는 동의어란 뜻이다
그렇다면 인터럽트말고 이벤트로 부르자

기본적으로 이벤트라는 것은 최우선적으로 처리해야 하는 작업으로 어떤작업보다도 우선순위가 높은 녀석들입니다.
마찬가지로 여기서 Thread.sleep()하는 작업도 일종의 이벤트(인터럽트)에 해당한다.
그러므로 이 작업이 시작되면 다른 모든 작업들을 제쳐두고 이것을 최우선적으로 처리하게 된다.
물론 조금 더 정확한 것은 CPU의 동작과 Thread의 동작 과정에 대해 설명할 때 자세히 기술하도록 하겠다.

결국 Thread.sleep()이 가장 중요한 작업이므로 이 작업을 완료하기 전까지는 어떠한 작업도 수행하지 않는다는 뜻이다
그래서 0.5초 동안은 무조건적인 대기를 하게 된다.
 */
