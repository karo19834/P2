package Uebungen_4.Konto;

public class JugendGiroKonto extends GiroKonto {

    protected double buchungsLimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungsLimit) {
        super(inhaber, limit);
        this.buchungsLimit = buchungsLimit;
    }

    @Override
    public double auszahlen(double wert) {

        if (wert > buchungsLimit) {
            wert = buchungsLimit;
        }
        return super.auszahlen(wert);
    }
}
