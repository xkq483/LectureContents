import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUrlTest {
    // Malform 이라는것이 악성 코드에 해당해서
    // 이상한 URL로 링크를 태워서 공격을 할 수 있기 때문에 그것에 대한 방어 조치라 보면 됨
    // www.daum.net, http://www.daum.net
    // URL을 반드시 후자로 줘야 합니다.
    // 이유는 www.daum.net 으로 하면 위와 같이 악성코드 공격이 가능함
    public static void main(String[] args) throws MalformedURLException {
                                                                     //1 네트워크에서는 먼저 throws MalformedURLException
        URL myURL = new URL("http://www.loanconsultant.or.kr/source/index.jsp?t=20191216");
                                                                     //2 URL이라는 클래스를 미리 만들어놓았다.
                                                                     //우리는 이용만하면 된다.
                                                                     //3 입력에는 url주소를 복붙하면 된다
                                                                     //4 Protocol: HTTP(웹 애플리케이션 전용 프로토콜입니다)
        System.out.println("Protocol = " + myURL.getProtocol());
        System.out.println("authority = " + myURL.getAuthority());
        System.out.println("host = " + myURL.getHost());
        System.out.println("port = " + myURL.getPort());
        System.out.println("path = " + myURL.getPath());
        System.out.println("query = " + myURL.getQuery());          //5 쿼리는 맨마지막의 값
        System.out.println("filename = " + myURL.getFile());
        System.out.println("ref = " + myURL.getRef());
    }
}