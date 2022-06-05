package Uebung_5.Getraenke;

public class SimplesGetraenk extends Getraenk{

    protected Fluessigkeit bestandteil;

    public SimplesGetraenk(String name) {
        super(name);
    }

    @Override
    public boolean brennt() {
        return bestandteil.getAlkoholProzent() > 0.3 ;
    }

    @Override
    int getAnzahlZutaten() {
        return 1;
    }

    @Override
    boolean beinhaltetAlkohol() {
        return bestandteil.getAlkoholProzent() >0;
    }

    @Override
    double mengeInMl() {
        return bestandteil.getMenge();
    }
}
