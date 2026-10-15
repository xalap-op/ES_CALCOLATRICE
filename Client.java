import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connesso al server!");

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Scanner tastiera = new Scanner(System.in);
        InterfacciaClient interfaccia = new InterfacciaClient();

        String operazione = interfaccia.chiediOperazione(tastiera);
        out.println(operazione);

        String risposta = in.readLine();
        interfaccia.mostraRisposta(risposta);

        socket.close();
        tastiera.close();
    }
}
