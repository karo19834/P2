package Uebung_6.Kindergarten;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind o1, Kind o2) {
        int zNameComarison=o1.getZname().compareTo(o2.getZname());
//        if (zNameComarison==0){
//            return o1.getVname().compareTo(o2.getVname());
//        }else{
//            return zNameComarison;
//        }
        return zNameComarison ==0 ? o1.getVname().compareTo(o2.getVname()) : zNameComarison;
    }
}
