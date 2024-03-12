import java.net.*;
import java.io.*;

public class Client {
    String Host;
    Socket soc;

    public Client(String phost) throws IOException {
        this.Host = phost;
    }

    public void getDate() throws IOException {
        soc = new Socket(Host, 13);
        BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(br.readLine());
        br.close();
        soc.close();
    }

    public static void main(String arg[]) throws IOException {
        Client ct = new Client(arg[0]);
        ct.getDate();
    }
}