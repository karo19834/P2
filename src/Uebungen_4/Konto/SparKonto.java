package Uebungen_4.Konto;

public class SparKonto extends Konto {

    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public double auszahlen(double wert) {

        if (kontostand - wert < 0) {
            double temp = kontostand;
            kontostand = 0;
            return temp;
        }
        return super.auszahlen(wert);
    }
}
