package creational.movie.clonable;

public class CloneMovie {
    private final String title;

    public CloneMovie(String title) {
        this.title = title;
    }

    public CloneMovie(CloneMovie original) {
        this.title = original.title;
    }

    public void play() {
        System.out.println("Playing cloned movie " + title);
    }
}
