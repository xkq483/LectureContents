import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class _2nd_DiceServer {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");

        try{
            ServerSocket servSock = new ServerSocket(port);
            System.out.println("Server: Listening - " + port);

            while(true){
                Socket sock = servSock.accept();
                System.out.println("[" + sock.getInetAddress() + "] client connected");

                // 클아이언트를 향해 출력할 객체를 생성성
                OutputStream out = sock.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);

                InputStream in = sock.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));


            }
        } catch (IOException e){
            System.out.println("Server Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}