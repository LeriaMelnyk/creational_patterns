package creational.movie;

import creational.movie.abctractFactory.HorrorMovieAbstractFactory;
import creational.movie.abctractFactory.MovieAbstractFactory;
import creational.movie.abctractFactory.RomanticMovieAbstractFactory;
import creational.movie.builder.MovieBuilder;
import creational.movie.factoryMethod.HorrorMovieCreator;
import creational.movie.factoryMethod.Movie;
import creational.movie.factoryMethod.MovieCreator;
import creational.movie.factoryMethod.RomanticMovieCreator;



public class Main{
    public static void main(String[] args){
        SingletonMovie instanse1= SingletonMovie.getInstance();
        SingletonMovie instanse2= SingletonMovie.getInstance();
        System.out.println("Movies are the same " + (instanse1==instanse2));
        
        MovieCreator horror1= new HorrorMovieCreator();
        MovieCreator romantic1= new RomanticMovieCreator();
        
        horror1.createMovie().play();
        romantic1.createMovie().play();

        MovieAbstractFactory horror2= new HorrorMovieAbstractFactory();
        MovieAbstractFactory romantic2= new RomanticMovieAbstractFactory();
        horror2.createMovie().play();
        romantic2.createMovie().play();


        Movie customMovie1 = new MovieBuilder().setTitle("Inception").setGenre("Sci-Fi").build();
        Movie customMovie2 = new MovieBuilder().setTitle("Inception").setGenre("Action").build();
        customMovie1.play();
        customMovie2.play();




    }
}