package de.pqtriick.Kap4.K4_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieApp {

    private List<Movie> movies = new ArrayList<>();

    public MovieApp() {
        movies.add(new Movie("Inception", 2010));
        movies.add(new Movie("The Matrix", 1999));
        movies.add(new Movie("Interstellar", 2014));
        movies.add(new Movie("The Godfather", 1972));
        movies.add(new Movie("Pulp Fiction", 1994));

        System.out.println("SORTIERT:"); {
            Collections.sort(movies);
            for (Movie movie : movies) {
                System.out.println(movie.getReleaseYear() + " | " + movie.getTitle());
            }
        }
    }

    public static void main(String[] args) {
        new MovieApp();
    }
}
