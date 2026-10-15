public class Calcolatrice {

    public String calcola(RichiestaCalcolo richiesta) {
        double num1 = richiesta.getNum1();
        String operatore = richiesta.getOperatore();
        double num2 = richiesta.getNum2();

        if (operatore.equals("+")) {
            return "Risultato: " + (num1 + num2);
        } else if (operatore.equals("-")) {
            return "Risultato: " + (num1 - num2);
        } else if (operatore.equals("*")) {
            return "Risultato: " + (num1 * num2);
        } else if (operatore.equals("/")) {
            if (num2 == 0) {
                return "ERRORE: divisione per zero";
            }
            return "Risultato: " + (num1 / num2);
        } else {
            return "ERRORE: operatore non riconosciuto";
        }
    }
}
