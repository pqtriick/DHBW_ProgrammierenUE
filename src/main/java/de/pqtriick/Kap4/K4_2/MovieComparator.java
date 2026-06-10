package de.pqtriick.Kap4.K4_2;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie2> {
    @Override
    public int compare(Movie2 o1, Movie2 o2) {
        if (o1.getReleaseYear() > o2.getReleaseYear()) {
            return 1;
        } else if (o1.getReleaseYear() == o2.getReleaseYear()) {
            return 0;
        } else {
            return -1;
        }
    }
}
