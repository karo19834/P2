package Uebungen_4.Konto;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;

    }

    public void einzahlen(double wert){
        kontostand+=wert;
    }

    public double auszahlen(double wert){
        kontostand-=wert;
        return wert;
    }
    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
