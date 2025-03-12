package creational.movie.clonable;

public class CloneMovie implements Cloneable{
    private String title;
    public CloneMovie(String title) {this.title = title;}
    public CloneMovie clon() {
        return new CloneMovie(this.title);
    }

    public void play(){
        System.out.println("Playing clon movie " + title);
    }

}
