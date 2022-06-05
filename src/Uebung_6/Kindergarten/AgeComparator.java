package Uebung_6.Kindergarten;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind o1, Kind o2) {
        return o1.getAge()- o2.getAge();
    }

}
