package Uebung_5.Getraenke;

public class LongDrink extends Getraenk{

    protected Fluessigkeit spirituose;
    protected Fluessigkeit filler;

    public LongDrink(String name) {
        super(name);
    }

    private double ileAlkoholu(){
        return spirituose.getMenge()* spirituose.getAlkoholProzent()+ filler.getAlkoholProzent()* filler.getMenge();
    }

    @Override
    public boolean brennt() {
        return ileAlkoholu()/mengeInMl()>0.3;
    }

    @Override
    int getAnzahlZutaten() {
        return 2;
    }

    @Override
    boolean beinhaltetAlkohol() {
        return ileAlkoholu()>0;
    }

    @Override
    double mengeInMl() {
        return spirituose.getMenge()+filler.getMenge();
    }
}
