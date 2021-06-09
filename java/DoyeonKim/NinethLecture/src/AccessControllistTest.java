class ClassTset {
    private int num;
    //소중한 프라이버시에는 private를 붙인다-classtset관점

    public ClassTset(int num) {
        this.num = num;
    }
        //퍼블릭은 다 공개하는 정보 ex)광고, 배너 등등
        //
        public void setNum ( int num){
            this.num = num;
        }

        public int getNum () {
            return num;
        }
        //결론 private이 붙은 애들을 호출하고 싶으면 퍼블릭이 붙은 애들을 사용해서 호출하세요
        public void iCanCallYou () {
            youCantCallMe();
        }
        private void youCantCallMe () {
            System.out.println("넌 날 부를 수 없다.");
        }
    }

public class AccessControllistTest {
    public static void main(String[] args) {
        ClassTset ct = new ClassTset(5);
            System.out.println("입력된 정수는 = " + ct.getNum());


        // 이전까지만 해도 잘 되던 녀석이 갑자기 왜 안 되는 것인가 ?
        //ct.num = 10;이건 안됨
        // 어라 이상하네 ? 위에건 안되고 아래건 되네 ?
        // 어쨋든 고의로 코드를 집어넣는 것은 방어가 불가능하다.
        // 그러나 최소한 실수로 인한 사고를 방어해줄 수는 있다.
            ct.setNum(10);

            System.out.println("바뀐 정수는 = " + ct.getNum());

        ct.iCanCallYou();

        }

    }

