package de.pqtriick.Kap4.K4_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieApp2 {

    private Comparator<Movie2> movieComparator;
    private Comparator<Movie2> nameComparator;
    private List<Movie2> movies = new ArrayList<>();

    public MovieApp2() {
        this.movieComparator = new MovieComparator();
        this.nameComparator = new NameComparator();
        movies.add(new Movie2("Inception", 2010));
        movies.add(new Movie2("The Matrix", 1999));
        movies.add(new Movie2("Interstellar", 2014));
        movies.add(new Movie2("The Godfather", 1972));
        movies.add(new Movie2("Pulp Fiction", 1994));
        System.out.println("SORTIERT NACH JAHR:");
        Collections.sort(movies, movieComparator);
        for (Movie2 movie : movies) {
            System.out.println(movie.getReleaseYear() + " | " + movie.getTitle());
        }
        System.out.println("=========================");
        System.out.println("SORTIERT NACH TITEL:");
        Collections.sort(movies, nameComparator);
        for (Movie2 movie : movies) {
            System.out.println(movie.getTitle() + " | " + movie.getReleaseYear());
        }
    }

    public static void main(String[] args) {
        new MovieApp2();
    }
}
