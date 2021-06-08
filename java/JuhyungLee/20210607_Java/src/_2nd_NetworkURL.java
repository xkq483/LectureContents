import java.net.MalformedURLException;
import java.net.URL;

public class _2nd_NetworkURL {
    public static void main(String[] args) throws MalformedURLException {
        URL myURL = new URL("https://www.naver.com/");

        System.out.println("Protocol = " + myURL.getProtocol());
        System.out.println("authority = " + myURL.getAuthority());
        System.out.println("host = " + myURL.getHost());
        System.out.println("port = " + myURL.getPort());
        System.out.println("path= " + myURL.getPath());
    }
}
