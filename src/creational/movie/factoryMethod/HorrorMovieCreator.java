package creational.movie.factoryMethod;

public class HorrorMovieCreator extends MovieCreator {
    public Movie createMovie() {return new HorrorMovie();}
}
