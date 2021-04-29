import java.util.List;

public interface Services {
    List<Movie> getAllMovies();

    List<Movie> getAllMovieSpecificType(MovieType movieType);
}
