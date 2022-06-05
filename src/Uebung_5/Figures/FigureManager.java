package Uebung_5.Figures;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    public ArrayList<Figure> figures = new ArrayList<>();

    public void add (Figure f){
        figures.add(f);
    }

    public double getMaxPerimeter(){
        double max=0;

        for ( Figure f: figures) {
            if (f.getPerimeter() > max ){
                max = f.getPerimeter();
            }
        }
        return max;
    }
    public double getAverageAreaSize(){
        double sum=0;
        if (figures.size()==0){
            return 0;
        }
        for (Figure f: figures) {
            sum += f.getArea();
        }
        return sum/figures.size();
    }
    public HashMap<String, Double> getAreaBySizeCategories(){
        HashMap<String, Double> mapa = new HashMap<>();
        mapa.put("Klein", (double)0);
        mapa.put("Mittel", 0d);
        mapa.put("Groß", 0.0);

        for (Figure f:figures) {
            if (f.getArea()<1000){
                mapa.put("Klein",f.getArea()+ mapa.get("Klein"));
            }else if (f.getArea() >=1000&& f.getArea() <5000){
                mapa.put("Mittel", f.getArea()+mapa.get("Mittel"));
            }else{
                mapa.put("Groß", f.getArea()+mapa.get("Groß"));
            }
        }
        return mapa;
    }
}
