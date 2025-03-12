package creational.movie;

public class SingletonMovie {
    private static SingletonMovie instance;
    private SingletonMovie(){}
    public static SingletonMovie getInstance(){
        if (instance==null){
            instance=new SingletonMovie();
        }
        return instance;
    }
}
