package de.pqtriick.Kap4.K4_2;

public class Movie implements Comparable<Movie> {

    private String title;
    private int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return this.title + " " + this.releaseYear;
    }

    @Override
    public int compareTo(Movie o) {
        if (this.getReleaseYear() > o.getReleaseYear()) {
            return 1;
        } else if (this.getReleaseYear() == o.getReleaseYear()) {
               return 0;
        } else {
            return -1;
        }
    }
}
