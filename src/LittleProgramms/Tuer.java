package LittleProgramms;

public class Tuer {

    private int hoehe;
    private int breite;
    private Himmelsrichtung richtung;

    public Tuer(int hoehe, int breite, Himmelsrichtung richtung) {
        this.hoehe = hoehe;
        this.breite = breite;
        this.richtung = richtung;
    }

    public Himmelsrichtung getRichtung() {
        return richtung;
    }

    public void setRichtung(Himmelsrichtung richtung) {
        this.richtung = richtung;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    @Override
    public String toString() {
        return "Tuer{" +
                "hoehe=" + hoehe +
                ", breite=" + breite +
                ", richtung=" + richtung +
                '}';
    }
}
