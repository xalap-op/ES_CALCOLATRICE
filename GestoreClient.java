import java.io.*;
import java.net.*;

public class GestoreClient implements Runnable {
    private Socket socket;

    public GestoreClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String messaggio = in.readLine();
            System.out.println("Ricevuto: " + messaggio);

            String risposta;

            try {
                RichiestaCalcolo richiesta = new RichiestaCalcolo(messaggio);
                Calcolatrice calcolatrice = new Calcolatrice();
                risposta = calcolatrice.calcola(richiesta);
            } catch (Exception e) {
                risposta = "ERRORE: dati non validi";
            }

            out.println(risposta);
            System.out.println("Inviato: " + risposta);

        } catch (IOException e) {
            System.out.println("Errore nella comunicazione con il client.");
        }

        try {
            socket.close();
        } catch (IOException e) {
            System.out.println("Errore nella chiusura della connessione.");
        }
    }
}
