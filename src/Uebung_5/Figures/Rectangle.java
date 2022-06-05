package Uebung_5.Figures;

public class Rectangle extends Figure{

    protected double lenght;
    protected double width;

    @Override
    public double getPerimeter() {
        return  2*lenght+2*width;
    }

    @Override
    public double getArea() {
        return lenght*width;
    }
}
