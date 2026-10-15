public class RichiestaCalcolo {
    private double num1;
    private String operatore;
    private double num2;

    public RichiestaCalcolo(String messaggio) {
        String[] parti = messaggio.split(" ");

        if (parti.length != 3) {
            throw new IllegalArgumentException("dati non validi");
        }

        num1 = Double.parseDouble(parti[0]);
        operatore = parti[1];
        num2 = Double.parseDouble(parti[2]);
    }

    public double getNum1() {
        return num1;
    }

    public String getOperatore() {
        return operatore;
    }

    public double getNum2() {
        return num2;
    }
}
