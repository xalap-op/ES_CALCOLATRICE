import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);

        System.out.println("Server in ascolto sulla porta 12345...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connesso!");

            GestoreClient gestore = new GestoreClient(socket);

            // Crea un thread per gestire questo client senza bloccare il server.
            Thread thread = new Thread(gestore);

            // Avvia il thread: il suo metodo run() gestirà la comunicazione.
            thread.start();
        }
    }
}
