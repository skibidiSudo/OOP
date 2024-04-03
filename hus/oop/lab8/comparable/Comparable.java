package hus.oop.lab8.comparable;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    /*@Override
    public int compareTo(Movie movie) {
        return Integer.compare(this.year, movie.year);
    }*/

    @Override
    public int compareTo(Movie movie) {
        return Double.compare(this.rating, movie.rating);
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

