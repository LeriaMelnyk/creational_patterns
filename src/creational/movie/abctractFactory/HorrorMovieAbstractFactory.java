package creational.movie.abctractFactory;

import creational.movie.factoryMethod.HorrorMovie;
import creational.movie.factoryMethod.Movie;

public class HorrorMovieAbstractFactory implements MovieAbstractFactory {
    public Movie createMovie() {
        return new HorrorMovie();
    }
}
