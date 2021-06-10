import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class _1st_SocketClientEdu {
    // 접속 시간에 대한 정보를 획득하고자 하는 서비스 이용자
    public static void main(String[] args) {

        String hostname = "192.168.0.5"; //gitbash에서 ipconfig -all
        int port = 33333;
        // 포트의 역할: 서비스 번호  (PID랑 같은거 아님 주의)
        // 결국 어떤 서비스에 접근하기 위해서는 IP와 포트를 알아야 함.

        for (int i = 0; i < 10; i++) {
            try {
                // 클아이언트 자신의 socket을 생성
                // 생성할 때 나는 서버의 IP 주소(hostname)의 서비스(port)에 접속하고 싶다!
                // 라고 요청하면서 socket을 만든다.
                Socket sock = new Socket(hostname, port);
                OutputStream out = sock.getOutputStream();

                String str = "Hello Network Programming";

                out.write(str.getBytes());

                InputStream in = sock.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String time = reader.readLine();
                System.out.println(time);
            } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O Error: " + e.getMessage());
            }
        }
    }
}