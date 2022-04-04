package LittleProgramms;

public class Bruch {

    private int numerator;
    private int denominator;
    private static int nrFraction=0;



    public Bruch( int numerator, int denominator){
        this.numerator= numerator;
        this.denominator = denominator;
        ++nrFraction;


    }

    public static int getNrFraction() {
        return nrFraction;
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public double toDezimal (){
        return (double)numerator/denominator;
    }
    public void print (){
        System.out.println( numerator + "/"+ denominator);
    }
    public Bruch multiplicate (Bruch b2 ){
         Bruch newBruch = new Bruch(numerator,denominator);
         newBruch.numerator *= b2.numerator;
         newBruch.denominator *= b2.denominator;

         return  newBruch;

    }

    public  Bruch multiplicate ( Bruch b2, Bruch b3) {
        Bruch newBruch = new Bruch(numerator,denominator);
        newBruch.numerator *= b2.numerator* b3.numerator;
        newBruch.denominator *= b2.denominator * b3.denominator;

        return newBruch;
    }

    public  Bruch add ( Bruch b2){
        Bruch newBruch = new Bruch(numerator,denominator);
        newBruch.denominator *= b2.denominator;
        newBruch.numerator *=  b2.denominator;
        newBruch.numerator += (b2.numerator*this.denominator);

        return  newBruch;

    }



}
