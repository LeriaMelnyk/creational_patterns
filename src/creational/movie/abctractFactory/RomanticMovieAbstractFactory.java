package creational.movie.abctractFactory;

import creational.movie.factoryMethod.Movie;
import creational.movie.factoryMethod.RomanticMovie;

public class RomanticMovieAbstractFactory implements MovieAbstractFactory {

    public Movie createMovie() {
        return new RomanticMovie();
    }
}
