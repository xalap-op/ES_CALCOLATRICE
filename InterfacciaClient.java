import java.util.Scanner;

public class InterfacciaClient {

    public String chiediOperazione(Scanner tastiera) {
        System.out.print("Primo numero: ");
        String num1 = tastiera.next();

        System.out.print("Operatore (+ - * /): ");
        String operatore = tastiera.next();

        System.out.print("Secondo numero: ");
        String num2 = tastiera.next();

        return num1 + " " + operatore + " " + num2;
    }

    public void mostraRisposta(String risposta) {
        System.out.println("Risposta del server -> " + risposta);
    }
}

