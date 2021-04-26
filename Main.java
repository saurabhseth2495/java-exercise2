import java.util.*;

public class Main {
    public static List<Movie> movieList;

    public static void main(String[] args) {
        MovieView movieView = new MovieView();
        movieView.showMovieList();
        movieView.showSpecificMovieList(MovieType.BOLLYWOOD);
    }
}
