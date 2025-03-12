package creational.movie.factoryMethod;

import creational.movie.factoryMethod.MovieCreator;

public class RomanticMovieCreator extends MovieCreator {
    public Movie createMovie() {return new RomanticMovie();}
}
