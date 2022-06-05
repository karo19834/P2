package Uebung_5.Figures;

public class Circle extends Figure{

    protected  double radius;

    @Override
    public double getPerimeter() {
        return  2*Math.PI *radius;
    }

    @Override
    public double getArea() {
        return  Math.PI * (radius*radius);
    }
}
