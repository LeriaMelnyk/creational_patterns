package creational.movie.builder;

import creational.movie.factoryMethod.Movie;

public class CustomMovie implements Movie {
    private String title;
    private String genre;
    public CustomMovie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    public void play() { System.out.println("Playing movie: " + title + " (" + genre + ")"); }

}
