package Uebung_6.Quack;

public class BadeEnte extends  Ente{

    protected double gewichtWasser;

    public BadeEnte(String name, double gewicht, double gewichtWasser, double gesamtGewicht) {
        super(name, gewicht);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public int getFullWeight() {
        return (int)Math.round(gewicht+gewichtWasser);
    }

    @Override
    public String makeNoise() {
        return "Kwa kwa plywam sobie";
    }

    public double getGewichtWasser() {
        return gewichtWasser;
    }

    public void setGewichtWasser(double gewichtWasser) {
        this.gewichtWasser = gewichtWasser;
    }




    @Override
    public String toString() {
        return "BadeEnte{" +
                "gewichtWasser=" + gewichtWasser +
                ", name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
