import java.util.List;

public interface ServiceProvided {
    List<Movie> getAllMovies();

    List<Movie> getAllMovieSpecificType(MovieType movieType);
}
