package creational.movie.builder;

public class MovieBuilder {
        private String title;
        private String genre;
        public MovieBuilder setTitle(String title) { this.title = title; return this; }
        public MovieBuilder setGenre(String genre) { this.genre = genre; return this; }
        public CustomMovie build() { return new CustomMovie(title, genre); }
}
