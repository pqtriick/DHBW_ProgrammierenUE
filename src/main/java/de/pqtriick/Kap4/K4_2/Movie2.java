package de.pqtriick.Kap4.K4_2;

public class Movie2 {

    private String title;
    private int releaseYear;

    public Movie2(String title, int releaseYear) {
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
}
