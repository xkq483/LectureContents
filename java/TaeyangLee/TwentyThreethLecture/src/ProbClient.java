import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class ProbClient {

        public static void main (String[]args) throws IOException {
            NetworkDiceGame ndg = new NetworkDiceGame();

            ndg.createClient();
        }

}