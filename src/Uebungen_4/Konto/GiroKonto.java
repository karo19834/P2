package Uebungen_4.Konto;

public class GiroKonto extends Konto {

    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public double auszahlen(double wert) {

        if (kontostand - wert >= -limit) {
            kontostand -= wert;
            return wert;
        } else {
            kontostand = -limit;
            return kontostand + limit;
        }
    }
}
