import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Review23_2 {
    public static void main(String[] args) {
        String hostname = "192.168.55.4";
        int port = 44444;

        for (int i = 0; i < 10; i++) {
            try {

                Socket sock = new Socket(hostname, port);

                OutputStream out = sock.getOutputStream();

                String str = "보내지긴 하나?";
                out.write(str.getBytes());


                InputStream in = sock.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));


                String number = reader.readLine();
                System.out.println(number);

                String string = reader.readLine();
                System.out.println(string);


            } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O Error: " + e.getMessage());
            }
        }
    }
}