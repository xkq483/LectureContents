import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

// 서버 / 클라이언트의 개념은?
// 서비스는 ?? >> 내가 하기 힘드니까 돈 줄테니까 너가 해줘
// 서버 >> 서비스 제공자
// 클라이언트 >> 서비스 이용자
public class _1st_SocketServerEdu {
    public static void main(String[] args) {
                int port = Integer.parseInt("33333");

        try{
            ServerSocket servSock = new ServerSocket(port);
            // SOCKET >>
            // 전기 분야에서의 SOCKET에 전원 코드를 연결하면 전기 제품을 구동가능한 것과 마찬가지로
            // 프로그래밍 분야에서 SOCKET이란 다른 컴퓨터와 내 컴퓨터를 연결하는 통로 역할을 함.
            System.out.println("Server: Listening - " + port);

            while(true){
                Socket sock = servSock.accept();
                System.out.println("[" + sock.getInetAddress() + "] client connected");

                // 클아이언트를 향해 출력할 객체를 생성성
               OutputStream out = sock.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);

                writer.println(new Date().toString());
                // 누군가가 접속하면 접속 시간을 알려주는 서비스를 제공

                InputStream in = sock.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                System.out.println("msg: " + reader.readLine());

            }
        } catch (IOException e){
            System.out.println("Server Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

