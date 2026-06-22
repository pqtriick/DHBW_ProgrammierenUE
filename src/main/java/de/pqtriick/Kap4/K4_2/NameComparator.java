package de.pqtriick.Kap4.K4_2;

import java.util.Comparator;

public class NameComparator implements Comparator<Movie2> {
    @Override
    public int compare(Movie2 o1, Movie2 o2) {




        return o1.getTitle().compareTo(o2.getTitle());
    }
}
